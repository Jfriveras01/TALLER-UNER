/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.metodoscsv;

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
 * La clase lmedicos se utiliza para gestionar medicos
 * 
 * @author Fran
 */
public class lmedicos {
    // El valor del último ID asignado a un médico.
    private int ultimoId = 0;

    // Lista que almacena objetos de tipo Medicos.
    ArrayList<Medicos> medicos;

    /**
     * Constructor que recibe una lista de Medicos y la almacena en la variable medicos.
     *
     * @param Medicos medicos
     */
    public lmedicos(ArrayList<Medicos> Medicos) {
        this.medicos = medicos;
    }
    
    /**
     * devuelve medicos
     *
     * @return medicos 
     */
    public ArrayList<Medicos> getMedicos() {
        return medicos;
    }
      
    /**
     * Constructor predeterminado que crea una lista de Medicos vacía al instanciar un objeto de esta clase.
     */
    public lmedicos() {
        this.medicos = new ArrayList<Medicos>();
    }

    /**
     * Agrega un objeto Medicos a la lista y le asigna un ID único.
     *
     * @param medi El objeto Medicos que se va a agregar.
     */
    public void agregar(Medicos medi) {
        ultimoId++;
        medi.setId(ultimoId);
        medicos.add(medi);
    }

    /**
     * Elimina un objeto Medicos de la lista.
     *
     * @param medi El objeto Medicos que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(Medicos medi) {
        if (medicos.contains(medi)) {
            medicos.remove(medi);
            return true;
        }
        return false;
    }

    /**
     * Elimina un objeto Medicos de la lista mediante su ID.
     *
     * @param id El ID del Medicos que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(int id) {
        for (Medicos medi : medicos) {
            if (medi.getId() == id) {
                medicos.remove(medi);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Lee datos de un archivo CSV y los convierte en objetos medicos que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Medicos medi; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                medi = new Medicos(); 
                
                medi.setId(Integer.parseInt(campos[0]));
                medi.setNombre(campos[1]);
                medi.setApellido (campos[2]);
                medi.setFechaNac (df.parse(campos[3]));
                medi.setDomicilio(campos[4]);
                medi.setDNI(Long.parseLong(campos[5]));                
                medi.setTelfijo(Long.parseLong(campos[6]));
                medi.setTelcelular(Long.parseLong(campos[7]));
                medi.setEstcivil(campos[8]);
                medi.setCorreo(campos[9]);
                medi.setMatricula(Integer.parseInt(campos[10]));
                
                this.agregar(medi);                
                linea = br.readLine();
            }            
        } catch (Exception e) {
         
        } finally {
            if (null!=br) {
                br.close();
            }
        }
    } 
    
    /**
     * Escribe los datos de los medicos en un archivo CSV.
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
        for (Medicos medi : medicos) {
            String linea = medi.getId() + separador;
            linea += medi.getNombre() + separador;
            linea += medi.getApellido() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(medi.getFechaNac()) + separador;
            linea += medi.getDomicilio() + separador;
            linea += medi.getDNI() + separador;
            linea += medi.getTelfijo() + separador;
            linea += medi.getTelcelular() + separador;
            linea += medi.getEstcivil() + separador;
            linea += medi.getCorreo() + separador;
            linea += medi.getMatricula();

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
