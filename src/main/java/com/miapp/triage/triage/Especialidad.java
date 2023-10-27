package com.miapp.triage.triage;

/**
 * Clase de la especialidad.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Especialidad {

    /**Nombre de la especialidad*/
    private String nombre;
    /**Codigo de la especialidad*/
    private int Cod;
    /**Medico vinculado a la especialidad*/
    private Medicos medico;
    /**
     * crea nueva instancia especialidad
     * 
     * @param nombre        Nombre de la especialidad
     * @param cod           Codigo de la especialidad
     * @param medico        Medico vinculado a la especialidad
     */
    public Especialidad(String nombre, int cod, Medicos medico) {
        this.nombre = nombre;
        this.Cod = cod;
        this.medico = medico;
    }

    /**
     * Constructor default para la clase especialidad.
     */
    public Especialidad(){

    }

    //GETTERS Y SETTERS
    /**
     * Obtiene el nombre de la especialidad
     * 
     * @return nombre de la especialidad
     */
    public String getNombre() {

        return nombre;
    }
    /**
     * Permite modificar el nombre de la especialidad por uno nuevo
     * 
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
    /**
     * Obtiene el codigo de la especialidad
     * 
     * @return codigo de la especialidad
     */
    public int getCod() {

        return Cod;
    }
    /**
     * Permite modificar el codigo por uno nuevo
     * 
     * @param cod nuevo codigo
     */
    public void setCod(int cod) {

        Cod = cod;
    }
    /**
     * Obtiene el medico especializado
     * 
     * @return medico especializado
     */
    public Medicos getMedicos() {
        return medico;
    }
    /**
     * Permite modificar el medico con la especialidad por uno nuevo
     * 
     * @param medico nuevo medico
     */
    public void setMedicos(Medicos medico) {
        this.medico = medico;
    }
}
