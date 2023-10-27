package com.miapp.triage.triage;
import java.util.List;

/**
 * Clase del Box de Atencion.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

/**
 * Esta clase representa un "Box de Atención" en un entorno médico.
 */
public class BoxAtencion {
    /** Identificador del box de atención. */
    private int id_box;

    /** Estado en el que se encuentra el box (disponible u ocupado). */
    private boolean Estado;

    /** Listado de médicos asignados al box. */
    private List<Medicos> Medicos;

    /** Lista de consultas realizadas en el box. */
    private List<Consulta> Consulta;

    /** Paciente en espera para ser atendido en el box. */
    private Paciente paciente;

    /**
     * Constructor para la clase BoxAtencion.
     *
     * @param id       Identificador del box.
     * @param estado   Estado del box (true si está ocupado, false si está disponible).
     * @param medicos  Lista de médicos asignados al box.
     * @param consulta Lista de consultas generadas en el box.
     * @param paciente Paciente en espera para ser atendido.
     */
    public BoxAtencion(int id, boolean estado, List<Medicos> medicos, List<Consulta> consulta, Paciente paciente) {
        this.id_box = id;
        Estado = estado;
        Medicos = medicos;
        Consulta = consulta;
        this.paciente = paciente;
    }

    /**
     * Constructor default para la clase boxatencion.
     */
    public BoxAtencion() {
    }

    // GETTERS Y SETTERS

    /**
     * Obtiene el identificador del box.
     *
     * @return Identificador del box.
     */
    public int getId_box() {
        return id_box;
    }

    /**
     * Permite modificar el identificador del box.
     *
     * @param ID Nuevo identificador del box.
     */
    public void setId_box(int ID) {
        this.id_box = ID;
    }

    /**
     * Obtiene el estado del box (disponible u ocupado).
     *
     * @return true si el box está ocupado, false si está disponible.
     */
    public boolean isEstado() {
        return Estado;
    }

    /**
     * Permite modificar el estado del box.
     *
     * @param estado Nuevo estado del box (true si está ocupado, false si está disponible).
     */
    public void setEstado(boolean estado) {
        Estado = estado;
    }

    /**
     * Obtiene la lista de médicos asignados al box.
     *
     * @return Lista de médicos asignados al box.
     */
    public List<Medicos> getMedicos() {
        return Medicos;
    }

    /**
     * Permite modificar la lista de médicos asignados al box.
     *
     * @param medicos Nueva lista de médicos asignados al box.
     */
    public void setMedicos(List<Medicos> medicos) {
        Medicos = medicos;
    }

    /**
     * Obtiene la lista de consultas realizadas en el box.
     *
     * @return Lista de consultas realizadas en el box.
     */
    public List<Consulta> getConsulta() {
        return Consulta;
    }

    /**
     * Permite modificar la lista de consultas realizadas en el box.
     *
     * @param consulta Nueva lista de consultas realizadas en el box.
     */
    public void setConsulta(List<Consulta> consulta) {
        Consulta = consulta;
    }

    /**
     * Obtiene el paciente en espera para ser atendido en el box.
     *
     * @return Paciente en espera.
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Permite modificar el paciente en espera en el box.
     *
     * @param paciente Nuevo paciente en espera.
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Verifica si el estado del box está ocupado.
     *
     * @return true si el box está ocupado, false si está disponible.
     */
    public boolean estaOcupado() {
        return Estado;
    }
}

