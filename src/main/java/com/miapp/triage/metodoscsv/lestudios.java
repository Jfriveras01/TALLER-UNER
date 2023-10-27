/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Estudios;
import com.miapp.triage.triage.Medicos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * La clase lestudios se utiliza para gestionar estudios médicos
 * 
 * @author Fran
 */
public class lestudios {
    // Lista que almacena objetos de tipo "Estudios".
    ArrayList<Estudios> estudios;

    // Lista que almacena los nombres de médicos asociados a los estudios.
    private ArrayList<String> nombresMedicos = new ArrayList<>();

    /**
     * Agrega el nombre de un médico a la lista "nombresMedicos".
     *
     * @param nombreMedico El nombre del médico que se va a agregar.
     */
    public void agregarNombreMedico(String nombreMedico) {
        nombresMedicos.add(nombreMedico);
    }

    /**
     * Obtiene la lista de nombres de médicos asociados a los estudios.
     *
     * @return La lista de nombres de médicos.
     */
    public ArrayList<String> getNombresMedicos() {
        return nombresMedicos;
    }

    /**
     * Constructor que recibe una lista de "Estudios" y la almacena en la variable "estudios".
     *
     * @param estudios La lista de "Estudios" que se gestionará.
     */
    public lestudios(ArrayList<Estudios> estudios) {
        this.estudios = estudios;
    }

    /**
     * Constructor predeterminado que crea una lista de "Estudios" vacía al instanciar un objeto de esta clase.
     */
    public lestudios() {
        this.estudios = new ArrayList<Estudios>();
    }

    /**
     * Agrega un objeto "Estudios" a la lista.
     *
     * @param est El objeto "Estudios" que se va a agregar.
     */
    public void agregar(Estudios est) {
        estudios.add(est);
    }

    /**
     * Elimina un objeto "Estudios" de la lista.
     *
     * @param est El objeto "Estudios" que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(Estudios est) {
        if (estudios.contains(est)) {
            estudios.remove(est);
            return true;
        }
        return false;
    }
    
    /**
     * Lee datos de un archivo CSV y los convierte en objetos estudios que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
    public void leerArchivo(String archivo, String separador) throws IOException {
    BufferedReader br = null;
    Estudios est;

    try {
        br = new BufferedReader(new FileReader(archivo));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);

            if (campos.length >= 2) {
                est = new Estudios();
                est.setUniversidad((campos[0]));
                est.setFechatit(df.parse(campos[1]));

                // Obtener el nombre del médico si existe
                if (campos.length > 2) {
                    String nombreMedico = campos[2];
                    // Agregar el nombre del médico a la lista de nombres de médicos
                    nombresMedicos.add(nombreMedico);
                }

                this.agregar(est);
            } else {
                // Maneja el caso en el que la línea no contiene al menos dos campos
                System.err.println("La línea no contiene los campos necesarios: " + linea);
            }

            linea = br.readLine();
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            br.close();
        }
    }
}
    
    /**
     * Escribe los datos de los estudios en un archivo CSV.
     * @param archivo El archivo CSV en el que se escribirán los datos.
     * @param separador El carácter o cadena que se utilizará como separador en el archivo CSV.
     * @param append Indica si se anexarán los datos al archivo existente (true) o si se reemplazarán (false).
     */
    public void escribirArchivo(String archivo, String separador, boolean append) {
    FileWriter nuevo = null;
    PrintWriter pw = null;
    try {
        nuevo = new FileWriter(archivo, append); // Abre el archivo en modo anexar si append es true
        pw = new PrintWriter(nuevo);
    for (Estudios est : estudios) {
            String linea = est.getUniversidad() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(est.getFechatit()) + separador;

            // Obtener el objeto Medico asociado a la Especialidad
            Medicos medico = est.getMedicos();
            if (medico != null) {
                linea += medico.getNombre() + separador;
                // Si hay más propiedades del objeto Medico para escribir, agrégalas aquí
            } else {
                // Si no hay un médico asociado, coloca un valor por defecto o un separador
                linea += separador;
            }

            pw.println(linea);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (nuevo != null)
                nuevo.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
}

