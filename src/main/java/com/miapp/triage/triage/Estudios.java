package com.miapp.triage.triage;
import java.util.Date;

/**
 * Clase de los estudios del medico.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Estudios {
    
    /**fecha del titulo*/
    private Date Fechatit;
    /**Universidad del medico*/
    private String Universidad;
    /**Medico vinculado a los estudios*/
    private Medicos medicos;
    
    /**
     * crea nueva instancia estudios
     * 
     * @param Fechatit      Fecha del titulo
     * @param Universidad   Universidad de los estudios
     * @param medicos       Medico que cuenta con los estudios
     */
    public Estudios(Date Fechatit, String Universidad, Medicos medicos) {
        this.Fechatit = Fechatit;
        this.Universidad = Universidad;
        this.medicos = medicos;
    }
    
    
/**
     * Constructor default para la clase estudios.
     */
    public Estudios(){

    }

    //GETTERS Y SETTERS

    /**
     * Obtiene la fecha del titulo  del medico
     * 
     * @return  fecha del titulo
     */
    public Date getFechatit() {
        return Fechatit;
    }
    /**
     * Permite modificar la fecha por una nueva
     * 
     * @param Fechatit nueva fecha titulo
     */
    public void setFechatit(Date Fechatit) {
        this.Fechatit = Fechatit;
    }
    /**
     * Obtiene la univerisdad del medico
     * 
     * @return universidad del titulo
     */
    public String getUniversidad() {
        return Universidad;
    }
    /**
     * Permite modificar la universidad por una nueva
     * 
     * @param Universidad nueva universidad
     */
    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }
    /**
     * Obtiene el  medico 
     * 
     * @return medico del titulo
     */
    public Medicos getMedicos() {
        return medicos;
    }
    /**
     * Permite modificar el medico por uno nuevo
     * 
     * @param medico nuevo medico
     */
    public void setMedicos(Medicos medico) {
        this.medicos = medico;
    }

 
    
    
}
