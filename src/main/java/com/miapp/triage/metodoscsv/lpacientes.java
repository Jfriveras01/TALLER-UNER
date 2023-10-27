package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Paciente;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



/**
 * La clase lpacientes se utiliza para gestionar pacientes
 * 
 * @author Fran
 */
public class lpacientes {
    // El valor del último ID asignado a un paciente.
    private int ultimoId = 0;

    // Lista que almacena objetos de tipo Paciente.
    ArrayList<Paciente> pacientes;

    /**
     * Constructor que recibe una lista de Paciente y la almacena en la variable pacientes.
     *
     * @param pacientes La lista de Paciente que se gestionará.
     */
    public lpacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    /**
     * Obtiene la lista de pacientes almacenados en la clase.
     *
     * @return La lista de objetos Paciente que se gestionan en la clase.
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    /**
     * Constructor predeterminado que crea una lista de Paciente vacía al instanciar un objeto de esta clase.
     */
    public lpacientes() {
        this.pacientes = new ArrayList<Paciente>();
    }

    /**
     * Agrega un objeto Paciente a la lista y le asigna un ID único.
     *
     * @param paci El objeto Paciente que se va a agregar.
     */
    public void agregar(Paciente paci) {
        ultimoId++;
        paci.setId(ultimoId);
        pacientes.add(paci);
    }

    /**
     * Elimina un objeto Paciente de la lista.
     *
     * @param paci El objeto Paciente que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(Paciente paci) {
        if (pacientes.contains(paci)) {
            pacientes.remove(paci);
            return true;
        }
        return false;
    }

    /**
     * Elimina un objeto Paciente de la lista mediante su ID.
     *
     * @param id El ID del Paciente que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(int id) {
        for (Paciente paci : pacientes) {
            if (paci.getId() == id) {
                pacientes.remove(paci);
                return true;
            }
        }
        return false;
    }

    /**
     * Lee datos de un archivo CSV y los convierte en objetos paciente que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Paciente paci; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                paci = new Paciente(); 
                
                paci.setId(Integer.parseInt(campos[0]));
                paci.setNombre(campos[1]);
                paci.setApellido (campos[2]);
                paci.setFechaNac (df.parse(campos[3]));
                paci.setDomicilio(campos[4]);
                paci.setDNI(Long.parseLong(campos[5]));                
                paci.setTelfijo(Long.parseLong(campos[6]));
                paci.setTelcelular(Long.parseLong(campos[7]));
                paci.setEstcivil(campos[8]);
                paci.setCorreo(campos[9]);
                paci.setMotivo(campos[10]);
               
                this.agregar(paci);                
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
     * Escribe los datos de los pacientes en un archivo CSV.
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
        for (Paciente paci : pacientes) {
            String linea = paci.getId() + separador;
            linea += paci.getNombre() + separador;
            linea += paci.getApellido() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(paci.getFechaNac()) + separador;
            linea += paci.getDomicilio() + separador;
            linea += paci.getDNI() + separador;
            linea += paci.getTelfijo() + separador;
            linea += paci.getTelcelular() + separador;
            linea += paci.getEstcivil() + separador;
            linea += paci.getCorreo() + separador;
            linea += paci.getMotivo();

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