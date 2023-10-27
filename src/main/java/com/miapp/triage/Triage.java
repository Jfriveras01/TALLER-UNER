package com.miapp.triage;
import java.io.IOException;
import java.text.ParseException;
import com.miapp.triage.metodoscsv.lpacientes;
import com.miapp.triage.metodoscsv.ltriage;
import com.miapp.triage.gui.InterfazLogin;

/**
 * Constructor predeterminado de la clase Triage.
 * Este constructor se proporciona automáticamente
 */
public class Triage {
    
    
    /**
     * Constructor default para la clase triage.
     */
    public Triage() {
    }
    
    /**
     * Punto de entrada principal del programa Triage.
     * Este método se ejecuta al iniciar la aplicación y maneja la lógica principal.
     * @param args Los argumentos de línea de comandos pasados al programa.
     * @throws IOException Si hay un error de E/S.
     * @throws ParseException Si ocurre un error al analizar argumentos.
     */
    public static void main(String[] args) throws IOException, ParseException {
       

        InterfazLogin log = new InterfazLogin();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        String archivo = "src\\main\\java\\com\\miapp\\triage\\csv\\pacientes.csv";
                
        lpacientes listapaci = new lpacientes();
        
        listapaci.leerArchivo(archivo, ";");
        
        listapaci.escribirArchivo(archivo, ";", false);
        listapaci.eliminar(1);
        
        
        ltriage listita= new ltriage();
        String archivo2= "src\\main\\java\\com\\miapp\\triage\\csv\\triage.csv";
       
        listita.leerArchivo(archivo2, ";");
    
       }   
}