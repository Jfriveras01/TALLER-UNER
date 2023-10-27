package com.miapp.triage.metodoscsv;
import com.miapp.triage.triage.Triage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.miapp.triage.triage.Medicos;
import com.miapp.triage.triage.Paciente;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * La clase ltriage se utiliza para gestionar los triages
 * 
 * @author Fran
 */
public class ltriage {
    // El valor del último ID asignado a un triage.
    private static int ultimoId = 0;
    
    // Lista que almacena objetos de tipo "Triage".
    ArrayList<Triage> triage;
    
    // Lista que almacena nombres de médicos asociados a los triages.
    ArrayList<String> nombresMedico = new ArrayList<>();
    
    // Lista que almacena DNI de pacientes asociados a los triages.
    ArrayList<Long> DniPaciente = new ArrayList<>();

    /**
     * Constructor que recibe una lista de "Triage" y la almacena en la variable "triage".
     *
     * @param triage La lista de "Triage" que se gestionará.
     */
    public ltriage(ArrayList<Triage> triage) {
        this.triage = triage;
    }

    /**
     * Constructor predeterminado que crea una lista de "Triage" vacía al instanciar un objeto de esta clase.
     */
    public ltriage() {
        this.triage = new ArrayList<Triage>();
    }

    /**
     * Obtiene la lista de triages almacenados en la clase.
     *
     * @return La lista de objetos "Triage" que se gestionan en la clase.
     */
    public ArrayList<Triage> getTriages() {
        return triage;
    }
    
    /**
     * Agrega un nombre de médico a la lista de nombres de médicos.
     *
     * @param nombreMedico El nombre del médico que se va a agregar.
     */
    public void agregarNombreMedico(String nombreMedico) {
        nombresMedico.add(nombreMedico);
    }
    
    /**
     * Obtiene la lista de nombres de médicos asociados a los triages.
     *
     * @return La lista de nombres de médicos.
     */
    public ArrayList<String> getNombresMedicos() {
        return nombresMedico;
    }
    
    /**
     * Agrega un DNI de paciente a la lista de DNI de pacientes.
     *
     * @param dniPacientes El DNI del paciente que se va a agregar.
     */
    public void agregarDniPaciente(long dniPacientes) {
        DniPaciente.add(dniPacientes);
    }
    
    /**
     * Obtiene la lista de DNI de pacientes asociados a los triages.
     *
     * @return La lista de DNI de pacientes.
     */
    public ArrayList<Long> getDniPaciente() {
        return DniPaciente;
    }
    
    /**
     * Agrega un objeto "Triage" a la lista y le asigna un ID único.
     *
     * @param tria El objeto "Triage" que se va a agregar.
     */
    public void agregar(Triage tria) {
        ultimoId++; // Incrementa el ID de manera única
        tria.setId_triage(ultimoId);
        triage.add(tria);
    }

    /**
     * Elimina un objeto "Triage" de la lista.
     *
     * @param tria El objeto "Triage" que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(Triage tria) {
        if (triage.contains(tria)) {
            triage.remove(tria);
            return true;
        }
        return false;
    }

    /**
     * Elimina un objeto "Triage" de la lista mediante su ID.
     *
     * @param id El ID del "Triage" que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(int id) {
        for (Triage tria : triage){
            if(tria.getId_triage() == id){
                triage.remove(tria);
                return true;
            }
        }
        return false;
    }
    
   /**
     * Lee datos de un archivo CSV y los convierte en objetos triage que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
   public void leerArchivo(String archivo, String separador) throws IOException {
    BufferedReader br = null;
    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    try {
        br = new BufferedReader(new FileReader(archivo));
        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);

            if (campos.length >= 4) { // Asegúrate de que haya al menos 4 campos
                Triage triage = new Triage();
                triage.setId_triage(Integer.parseInt(campos[0]));
                triage.setTipourgencia(campos[1]);
                triage.setColorAsignado(campos[2]);
                triage.setTiempoespera(campos[3]);
                triage.setpuntuacion(Integer.parseInt(campos[4]));
                String nombreMedico = campos[5];
                nombresMedico.add(nombreMedico);
                Long DniPacientes = Long.parseLong(campos[6]);
                DniPaciente.add(DniPacientes);
                triage.setFecha(df.parse(campos[7]));

                this.agregar(triage);
            } else {
                
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
     * Escribe los datos de los triage en un archivo CSV.
     * @param archivo El archivo CSV en el que se escribirán los datos.
     * @param separador El carácter o cadena que se utilizará como separador en el archivo CSV.
     * @param append Indica si se anexarán los datos al archivo existente (true) o si se reemplazarán (false).
     */
    public void escribirArchivo (String archivo, String separador, boolean append) {        
        FileWriter nuevo = null;
        PrintWriter pw = null;
    try {
        nuevo = new FileWriter(archivo, append); 
        pw = new PrintWriter(nuevo);
        for (Triage tria: triage) {

            String linea = tria.getId_triage() + separador;
            linea += tria.getTipourgencia() + separador;
            linea += tria.getColorAsignado() + separador;
            linea += tria.getTiempoespera() + separador;
            linea += tria.getpuntuacion() + separador;
            
            Medicos medico = tria.getMedico();
            if (medico != null) {
                linea += medico.getNombre() + separador;
            } else {
                linea +=null;
            }
            
            Paciente paci = tria.getPaciente();
            if(paci != null){
                linea += paci.getDNI() + separador;
            }
            
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(tria.getFecha()) ;

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
    
    
 
  
