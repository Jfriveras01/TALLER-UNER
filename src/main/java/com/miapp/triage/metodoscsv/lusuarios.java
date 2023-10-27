package com.miapp.triage.metodoscsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.miapp.triage.triage.Usuarios;

/**
 * La clase lusuarios se utiliza para gestionar los usuarios
 * 
 * @author Fran
 */
public class lusuarios {
    // Lista que almacena objetos de tipo Usuarios.
    ArrayList<Usuarios> usuarios;
    
    /**
     * Constructor que recibe una lista de Usuarios y la almacena en la variable usuarios.
     *
     * @param usuario La lista de Usuarios que se gestionará.
     */
    public lusuarios(ArrayList<Usuarios> usuario){
        this.usuarios = usuario;
    }
    
    /**
     * Constructor predeterminado que crea una lista de Usuarios vacía al instanciar un objeto de esta clase.
     */
    public lusuarios(){
        this.usuarios = new ArrayList<Usuarios>();
    }
    
    /**
     * Agrega un objeto Usuarios a la lista.
     *
     * @param usuario El objeto Usuarios que se va a agregar.
     */
    public void agregar (Usuarios usuario){
        usuarios.add(usuario);
    }
    
    /**
     * Elimina un objeto Usuarios de la lista.
     *
     * @param usuario El objeto Usuarios que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar (Usuarios usuario){
        if(usuarios.contains(usuario)){
            usuarios.remove(usuario);
            return true;
        }
        return false;
    }
    
    /**
     * Elimina un objeto "Usuarios" de la lista mediante su nombre de usuario.
     *
     * @param username El nombre de usuario del "Usuarios" que se va a eliminar.
     * @return true si el objeto se eliminó exitosamente, false si no se encontró en la lista.
     */
    public boolean eliminar (String username){
        for (Usuarios usuario : usuarios){
            if(usuario.getUsername().equals(username)){
                usuarios.remove(usuario);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Lee datos de un archivo CSV y los convierte en objetos usurios que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
    public void leerArchivo (String archivo, String separador) throws IOException {
        BufferedReader br = null;
        Usuarios usuario;       
        try {         
            br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();            
            while (null!=linea) {
                String [] campos = linea.split(separador);               
                usuario = new Usuarios();                 
                usuario.setRol(campos[0]);
                usuario.setUsername(campos[1]);
                usuario.setPassword (campos[2]);
                this.agregar(usuario);                
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
     * Escribe los datos de los usuarios en un archivo CSV.
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
        for (Usuarios usuario : usuarios) {
            String linea = usuario.getRol() + separador;
            linea += usuario.getUsername() + separador;
            linea += usuario.getPassword() + separador;
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