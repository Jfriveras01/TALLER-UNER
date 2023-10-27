package com.miapp.triage.metodoscsv;

import com.miapp.triage.triage.Especialidad;
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
 * La clase lespecialidad se utiliza para gestionar especialidades médicas,
 *
 * @author Fran
 */
public class lespecialidad {
    // Cada instancia de `lespecialidad` tiene un código único asignado automáticamente.
    private int Cod = 0;

    // Esta lista almacena objetos de tipo "Especialidad".
    ArrayList<Especialidad> especialidad;

    // Esta lista almacena los nombres de médicos asociados a las especialidades.
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
     * Obtiene la lista de nombres de médicos asociados a las especialidades.
     *
     * @return La lista de nombres de médicos.
     */
    public ArrayList<String> getNombresMedicos() {
        return nombresMedicos;
    }

    /**
     * Constructor que recibe una lista de "Especialidad" y la almacena en la variable "especialidad".
     *
     * @param especialidad La lista de Especialidad que se gestionará.
     */
    public lespecialidad(ArrayList<Especialidad> especialidad) {
        this.especialidad = especialidad;
        this.nombresMedicos = new ArrayList<>();
    }

    /**
     * Constructor predeterminado que crea una lista de "Especialidad" vacía al instanciar un objeto de esta clase.
     */
    public lespecialidad() {
        this.especialidad = new ArrayList<Especialidad>();
    }

    /**
     * Agrega una Especialidad a la lista y le asigna un código único.
     *
     * @param espe La Especialidad que se va a agregar.
     */
    public void agregar(Especialidad espe) {
        Cod++;
        espe.setCod(Cod);
        especialidad.add(espe);
    }

    /**
     * Elimina una Especialidad de la lista.
     *
     * @param espe La Especialidad que se va a eliminar.
     * @return true si la Especialidad se eliminó, false si no se encontró en la lista.
     */
    public boolean eliminar(Especialidad espe) {
        if (especialidad.contains(espe)) {
            especialidad.remove(espe);
            return true;
        }
        return false;
    }

    /**
     * Elimina una Especialidad de la lista mediante su código.
     *
     * @param cod El código de la "Especialidad" que se va a eliminar.
     * @return true si la Especialidad se eliminó false si no se encontró en la lista.
     */
    public boolean eliminar(int cod) {
        for (Especialidad espe : especialidad) {
            if (espe.getCod() == cod) {
                especialidad.remove(espe);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Lee datos de un archivo CSV y los convierte en objetos especialidades que se agregan a la lista.
     * @param archivo El archivo CSV a leer.
     * @param separador El carácter o cadena que se utiliza como separador en el archivo CSV.
     * @throws IOException Si hay un error de E/S al leer el archivo.
     */
   public void leerArchivo(String archivo, String separador) throws IOException {
    BufferedReader br = null;
    Especialidad espe;

    try {
        br = new BufferedReader(new FileReader(archivo));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String linea = br.readLine();

        while (linea != null) {
            String[] campos = linea.split(separador);

            // Verifica si la línea contiene al menos dos campos
            if (campos.length >= 2) {
                espe = new Especialidad();
                espe.setCod(Integer.parseInt(campos[0]));
                espe.setNombre(campos[1]);

                // Obtener el nombre del médico si existe
                if (campos.length > 2) {
                    String nombreMedico = campos[2];
                    // Agregar el nombre del médico a la lista de nombres de médicos
                    nombresMedicos.add(nombreMedico);
                }

                this.agregar(espe);
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
     * Escribe los datos de las especialidades en un archivo CSV.
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
        for (Especialidad espe : especialidad) {
            String linea = espe.getCod() + separador;
            linea += espe.getNombre() + separador;

            // Obtener el objeto Medico asociado a la Especialidad
            Medicos medico = espe.getMedicos();
            if (medico != null) {
                linea += medico.getNombre() + separador;
                // Si hay más propiedades del objeto Medico para escribir, agrégalas aquí
            } else {
                linea +=null;
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
