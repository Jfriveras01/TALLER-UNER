package com.miapp.triage.triage;

import java.util.Date;

/**
 * Clase de consulta.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Consulta  {

    /**El numero de identificacion de la consulta */
    private int id_consulta;
    /**Fecha de la consulta */
    private Date Fecha;
    /**Hora de la consulta */
    private String Hora;
    /**Diagnostico de la consulta */
    private String Diagnostico;
    /**Lugar de la consulta */
    private String Lugar;
    /**Diagnostico clinico de la consulta */
    private String DiagClinico;
    /**Box de atencion asignado */
    private BoxAtencion boxAtencion;
    /**Paciente de la consulta */
    private Paciente consul;
    /**Medico de la consulta*/
    private Medicos medico;
    /**Puntuacion del triage */
    private Triage triage;

    /**
     * crea nueva instancia consulta
     * 
     * @param id_consul     identificador de la consulta
     * @param fecha         fecha de la consulta
     * @param hora          hora de la consulta
     * @param diagnostico   diagnostico de la consulta
     * @param lugar         lugar de la consulta
     * @param diagClinico   diagnostico clinico de la consulta
     * @param boxatencion   box de atencion asignado
     * @param consu         paciente de la consulta
     * @param triag         puntuacion del triage realizado
     * @param medic         medico de la consulta
     */
    public Consulta(int id_consul,Date fecha, String hora, String diagnostico, String lugar, String diagClinico, BoxAtencion boxatencion, Paciente consu, Triage triag, Medicos medic) {
        id_consulta = id_consul;
        Fecha = fecha;
        Hora = hora;
        Diagnostico = diagnostico;
        Lugar = lugar;
        DiagClinico = diagClinico;
        boxAtencion = boxatencion;
        consul = consu;
        triage = triag;
        medico = medic;
    }
    /**
     * Constructor default para la clase consulta.
     */
    public Consulta(){

    }

    //GETTERS Y SETTERS

    /**
     * Obtiene el id de la consulta
     * 
     * @return id_consulta
     */
    public int getId_consulta() {
        return id_consulta;
    }
    /**
     * Permite modificar la id de la consulta por una nueva
     * 
     * @param id_consulta nuevo id de consulta
     */
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    /**
     *  Obtiene la fecha de las consulta
     * 
     * @return  fecha de consulta 
     */
    public Date getFecha() {
        return Fecha;
    }
    /**
     * Permite modificar la fecha de la consulta por una nueva
     * 
     * @param fecha  nueva fecha
     */
    public void setFecha(Date fecha) {
        Fecha = fecha;
    }
    /**
     * Obtiene la hora de la consulta
     * 
     * @return  hora de la consulta 
     */
    public String getHora() {
        return Hora;
    }
    /**
     * Permite modificar la hora de la consulta por una nueva
     * 
     * @param hora nueva hora
     */
    public void setHora(String hora) {
        Hora = hora;
    }
    /**
     * Obtiene el diagnotico 
     * 
     * @return  diagnostico de la consulta 
     */
    public String getDiagnostico() {
        return Diagnostico;
    }
    /**
     * Permite modificar el diagnostico por uno nuevo
     * 
     * @param diagnostico nuevo dignostico 
     */
    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }
    /**
     * Obtiene el lugar de la consulta
     * 
     * @return  lugar de la consulta 
     */
    public String getLugar() {
        return Lugar;
    }
    /**
     * Permite modificar el lugar por uno nuevo
     * 
     * @param lugar nuevo lugar
     */
    public void setLugar(String lugar) {
        Lugar = lugar;
    }
    /**
     * Obtiene el diagnostico clinico de la consulta
     * 
     * @return  Diagnostico clinico de la consulta 
     */
    public String getDiagClinico() {
        return DiagClinico;
    }
    /**
     * Permite modificar el diagnostico clinico por uno nuevo
     * 
     * @param diagClinico nuevo diagnostico clinico
     */
    public void setDiagClinico(String diagClinico) {
        DiagClinico = diagClinico;
    }
    /**
     * Obtiene el box de atencion de la consulta
     * 
     * @return el box de atencion asignado
     */
    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }
    /**
     * Permite modificar el box de atencion por uno nuevo
     * 
     * @param boxAtencion nuevo box de atencion
     */
    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }
    /**
     * Obtiene el paciente de la consulta
     * 
     * @return el paciente de la consulta
     */
    public Paciente getConsul() {
        return consul;
    }
    /**
     * Permite modificar el paciente de la consulta por uno nuevo
     * 
     * @param consul  nuevo paciente
     */
    public void setConsul(Paciente consul) {
        this.consul = consul;
    }
    /**
     * Obtiene la puntuacion de triage de la consulta
     * 
     * @return puntuacion del triage
     */
    public Triage getTriage() {
        return triage;
    }
    /**
     * Permite modificar la puntuacion del triage por una nueva
     * 
     * @param triage nuevo triage
     */
    public void setTriage(Triage triage) {
        this.triage = triage;
    }
    /**
     * Obtiene el medico de la consulta
     * 
     * @return medico de la consulta
     */
    public Medicos getMedico() {
        return medico;
    }
    /**
     * Permite modificar el medico de la consulta por uno nuevo
     * 
     * @param medico nuevo medico
     */
    public void setMedico(Medicos medico) {
        this.medico = medico;
    }
}
