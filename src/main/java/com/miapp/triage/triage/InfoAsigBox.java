package com.miapp.triage.triage;

import java.util.Date;

/**
 * Clase de la informacion del box.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class InfoAsigBox {
    /**Hora para el box*/
    private int hora;
    /**Fecha para el box*/
    private Date fecha;
    /**
     * crea nueva instancia info asig box
     * 
     * @param hora      hora
     * @param fecha     fecha
     */
    public InfoAsigBox(int hora, Date fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }
    /** Constructor por defecto de InfoAsigBox*/
    public InfoAsigBox(){
    }
    
    /**
     * Obtiene la hora 
     * 
     * @return hora
     */
    public int getHora() {
        return hora;
    }
    /**
     * Permite modificar la hora por una nueva
     * 
     * @param hora nuevo hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
    /**
     * Obtiene la fecha
     * 
     * @return fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * Permite modificar la fecha por una nueva
     * 
     * @param fecha nuevo fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
