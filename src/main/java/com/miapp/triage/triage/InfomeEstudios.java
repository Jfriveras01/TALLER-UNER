package com.miapp.triage.triage;

import java.util.Date;

/**
 * Clase de Informe de Estudios del paciente.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class InfomeEstudios {

    /**identificador del informe*/
    private int id_informe;
    /**tipo de estudio*/
    private String TipoEstudio;
    /**Fecha del estudio*/
    private Date FechaEstudio;
    /**Informe realizado*/
    private String InformeRealizado;
    /** paciente del estudio*/
    private Paciente paciente;

    /**
     * crea nueva instancia informe estudios
     * 
     * @param id_info           identificador del informe
     * @param tipoEstudio       tipo del estudio
     * @param fechaEstudio      fecha del estudio
     * @param informeRealizado  informe realizado
     * @param paciente          paciente del estudio
     */
    public InfomeEstudios(int id_info, String tipoEstudio, Date fechaEstudio, String informeRealizado, Paciente paciente) {
        id_informe = id_info;
        TipoEstudio = tipoEstudio;
        FechaEstudio = fechaEstudio;
        InformeRealizado = informeRealizado;
        this.paciente = paciente;
    }
    
    /**
     * Constructor default para la clase informe estudios.
     */
    public InfomeEstudios(){

    }

    //GETTERS Y SETTERS
    /**
     * Obtiene el identificador del informe
     * 
     * @return id del informe
     */
    public int getId_informe() {
        return id_informe;
    }
    /**
     * Permite modificar el id del informe por uno nuevo
     * 
     * @param id_informe nuevo id informe
     */
    public void setId_informe(int id_informe) {
        this.id_informe = id_informe;
    }
    /**
     * Obtiene el tipo de estudio
     * 
     * @return el tipo de estudio
     */
    public String getTipoEstudio() {
        return TipoEstudio;
    }
    /**
     * Permite modificar el tipo de estudio por uno nuevo
     * 
     * @param tipoEstudio nuevo tipo estudio
     */
    public void setTipoEstudio(String tipoEstudio) {
        TipoEstudio = tipoEstudio;
    }
    /**
     * Obtiene la fecha de estudio 
     * 
     * @return fecha del estudio
     */
    public Date getFechaEstudio() {
        return FechaEstudio;
    }
    /**
     * Permite modificar la fecha del estudio por una nueva
     * 
     * @param fechaEstudio nuevo fecha estudio
     */
    public void setFechaEstudio(Date fechaEstudio) {
        FechaEstudio = fechaEstudio;
    }
    /**
     * Obtiene el informe realizado
     * 
     * @return el informe realizado
     */
    public String getInformeRealizado() {
        return InformeRealizado;
    }
    /**
     * Permite modificar el informe realizado por uno nuevo
     * 
     * @param informeRealizado nuevo informe realizado
     */
    public void setInformeRealizado(String informeRealizado) {
        InformeRealizado = informeRealizado;
    }
    /**
     * Obtiene el paciente al que se le hizo el estudio
     * 
     * @return el paciente del estudio
     */
    public Paciente getInforme() {
        return paciente;
    }
    /**
     * Permite modificar el paciente del estudio por uno nuevo
     * 
     * @param informe nuevo informe
     */
    public void setInforme(Paciente informe) {
        this.paciente = informe;
    }

   

}
