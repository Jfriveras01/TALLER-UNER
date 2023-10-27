package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Funcionario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



/**
 *La clase lfuncionarios se utiliza para gestionar funcionarios 
 * @author Fran
 */
public class lfuncionarios {
    // El valor del último ID asignado a un funcionario.
    private int ultimoId = 0;

    // Lista que almacena objetos de tipo Funcionario.
    ArrayList<Funcionario> funcionario;

    /**
     * Constructor que recibe una lista de Funcionario y la almacena en la variable funcionario.
     *
     * @param funcionario La lista de Funcionario que se gestionará.
     */
    public lfuncionarios(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
    /**
     * Constructor predeterminado que crea una lista de Funcionario vacía al instanciar un objeto de esta clase.
     */
    public lfuncionarios() {
        this.funcionario = new ArrayList<Funcionario>();
    }
    
    /**
     * devuelve funcionarios
     * 
     * @return funcionario
     */
    public ArrayList<Funcionario> getFuncionarios() {
            return funcionario;
        }
    
    /**
     * Agrega un objeto Funcionario a la lista y le asigna un ID único.
     *
     * @param func El objeto Funcionario que se va a agregar.
     */
    public void agregar(Funcionario func) {
        ultimoId++;
        func.setId(ultimoId);
        funcionario.add(func);
    }

    /**
     * Elimina un objeto Funcionario de la lista.
     *
     * @param func El objeto Funcionario que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(Funcionario func) {
        if (funcionario.contains(func)) {
            funcionario.remove(func);
            return true;
        }
        return false;
    }

    /**
     * Elimina un objeto Funcionario de la lista mediante su ID.
     *
     * @param id El ID del Funcionario que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar(int id) {
        for (Funcionario func : funcionario) {
            if (func.getId() == id) {
                funcionario.remove(func);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Lee datos de un archivo CSV y los convierte en objetos funcionarios que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Funcionario func; 
      
        try {         
            br = new BufferedReader(new FileReader(archivo));
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            String linea = br.readLine();
            
            while (null!=linea) {
                String [] campos = linea.split(separador);
                
                func = new Funcionario(); 
                
                func.setId(Integer.parseInt(campos[0]));
                func.setNombre(campos[1]);
                func.setApellido (campos[2]);
                func.setFechaNac (df.parse(campos[3]));
                func.setDomicilio(campos[4]);
                func.setDNI(Long.parseLong(campos[5]));                
                func.setTelfijo(Long.parseLong(campos[6]));
                func.setTelcelular(Long.parseLong(campos[7]));
                func.setEstcivil(campos[8]);
                func.setCorreo(campos[9]);
                func.setSector((campos[10]));
                
                this.agregar(func);                
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
     * Escribe los datos de los funcioarios en un archivo CSV.
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
        for (Funcionario func : funcionario) {
            String linea = func.getId() + separador;
            linea += func.getNombre() + separador;
            linea += func.getApellido() + separador;
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            linea += df.format(func.getFechaNac()) + separador;
            linea += func.getDomicilio() + separador;
            linea += func.getDNI() + separador;
            linea += func.getTelfijo() + separador;
            linea += func.getTelcelular() + separador;
            linea += func.getEstcivil() + separador;
            linea += func.getCorreo() + separador;
            linea += func.getSector();

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

