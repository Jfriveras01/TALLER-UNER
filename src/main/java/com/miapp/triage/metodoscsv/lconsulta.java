/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.BoxAtencion;
import com.miapp.triage.triage.Consulta;
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
 *
 * @author Fran
 */
/**
 * Esta clase, lconsulta, se encarga de gestionar una lista de objetos Consulta
 * 
 * @author Fran
 */
public class lconsulta {

    // Lista de objetos de tipo Consulta
    ArrayList<Consulta> consulta;

    // Listas adicionales para almacenar nombres de médicos, DNI de pacientes y números de boxes de atención
    private ArrayList<String> nombresMedicos = new ArrayList<>();
    private ArrayList<String> dniPacientes = new ArrayList<>();
    private ArrayList<String> numBox = new ArrayList<>();

    /**
     * Constructor que recibe una lista de objetos Consulta.
     * @param consulta La lista de Consultas 
     */
    public lconsulta(ArrayList<Consulta> consulta) {
        this.consulta = consulta;
    }

    /**
     * Constructor predeterminado que crea una lista de Consultas vacía.
     */
    public lconsulta() {
        this.consulta = new ArrayList<Consulta>();
    }

    /**
     * Agrega una Consulta a la lista.
     * @param est La Consulta que se va a agregar.
     */
    public void agregar(Consulta est) {
        consulta.add(est);
    }

    /**
     * Elimina una Consulta de la lista.
     * @param con La Consulta que se va a eliminar.
     * @return true si la Consulta se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(Consulta con) {
        if (consulta.contains(con)) {
            consulta.remove(con);
            return true;
        }
        return false;
    }

    /**
     * Agrega un número de box de atención a la lista.
     * @param numeBox El número de box que se va a agregar.
     */
    public void agregarNumBox(String numeBox) {
        numBox.add(numeBox);
    }

    /**
     * Obtiene la lista de números de box de atención.
     * @return La lista de números de box de atención.
     */
    public ArrayList<String> getNumBox() {
        return numBox;
    }

    /**
     * Agrega el DNI de un paciente a la lista.
     * @param dniPaciente El DNI del paciente que se va a agregar.
     */
    public void agregarDniPaciente(String dniPaciente) {
        dniPacientes.add(dniPaciente);
    }

    /**
     * Obtiene la lista de DNI de pacientes.
     * @return La lista de DNI de pacientes.
     */
    public ArrayList<String> getDniPaciente() {
        return dniPacientes;
    }

    /**
     * Agrega el nombre de un médico a la lista.
     * @param nombreMedico El nombre del médico que se va a agregar.
     */
    public void agregarNombreMedico(String nombreMedico) {
        nombresMedicos.add(nombreMedico);
    }

    /**
     * Obtiene la lista de nombres de médicos.
     * @return La lista de nombres de médicos.
     */
    public ArrayList<String> getNombresMedicos() {
        return nombresMedicos;
    }

    /**
     * Lee datos de un archivo CSV y los convierte en objetos Consulta que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
    public void leerArchivo(String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Consulta con;

        try {
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

            String linea = br.readLine();

            while (linea != null) {
                String[] campos = linea.split(separador);

                if (campos.length >= 2) {
                    con = new Consulta();

                    String dniPaciente = campos[0];
                    dniPacientes.add(dniPaciente);

                    con.setFecha(df.parse(campos[1]));
                    con.setHora(campos[2]);
                    con.setLugar(campos[3]);

                    String numeBox = campos[4];
                    numBox.add(numeBox);

                    String nombreMedico = campos[5];
                    nombresMedicos.add(nombreMedico);

                    con.setDiagnostico(campos[6]);
                    con.setDiagClinico(campos[7]);

                    this.agregar(con);
                } else {
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
     * Escribe los datos de las Consultas en un archivo CSV.
     * @param archivo El archivo CSV en el que se escribirán los datos.
     * @param separador El carácter o cadena que se utilizará como separador en el archivo CSV.
     * @param append Indica si se anexarán los datos al archivo existente (true) o si se reemplazarán (false).
     */
    public void escribirArchivo(String archivo, String separador, boolean append) {
        FileWriter nuevo = null;
        PrintWriter pw = null;
        try {
            nuevo = new FileWriter(archivo, append);
            pw = new PrintWriter(nuevo);

            // Para cada "Consulta" en la lista, se escribe una línea en el archivo CSV.
            for (Consulta con : consulta) {
                String linea = con.getConsul().getDNI() + separador;
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                linea += df.format(con.getFecha()) + separador;
                linea += con.getHora() + separador;
                linea += con.getLugar() + separador;
                linea += con.getDiagnostico() + separador;
                linea += con.getDiagClinico() + separador;

                BoxAtencion boxAtencion = con.getBoxAtencion();
                if (boxAtencion != null) {
                    linea += boxAtencion.getId_box() + separador;
                }

                // Se obtiene el objeto "Medicos" asociado a la "Consulta".
                Medicos medico = con.getMedico();
                if (medico != null) {
                    linea += medico.getNombre();
                    // Si hay más propiedades del objeto "Medicos" para escribir, se pueden agregar aquí.
                }

                // Se escribe la línea en el archivo.
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