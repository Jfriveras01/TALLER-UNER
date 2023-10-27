package com.miapp.triage.triage;

import java.util.Date;

/**
 * Clase de Persona.
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Persona  {
    /** Número de identificación de persona*/
    private int id;
    /** Nombre de la persona*/
    private String nombre;
    /** Apellido de persona*/
    private String apellido;
    /** Fecha de nacimiento*/
    private Date FechaNac;
    /** Domicilio de persona*/
    private String domicilio;
    /** Número de DNI*/
    private long DNI;
    /** Teléfono fijo de persona*/
    private long Telfijo;
    /** Teléfono celular*/
    private long Telcelular;
    /** Estado civil*/
    private String Estcivil;
    /** Correo electrónico*/
    private String correo;

    /**
     * Crea una nueva instancia de persona
     * @param id        Identificador de persona
     * @param nombre    Nombre de persona
     * @param apellido  Apellido de persona
     * @param FechaNac  Fecha de nacimiento
     * @param domicilio Domicilio
     * @param DNI       Número de documento
     * @param Telfijo   Teléfono fijo
     * @param Telcelular Teléfono celular
     * @param Estcivil  Estado civil de persona
     * @param correo    Correo electrónico de persona
     */
    public Persona(int id, String nombre, String apellido, Date FechaNac, String domicilio, long DNI, long Telfijo, long Telcelular, String Estcivil, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaNac = FechaNac;
        this.domicilio = domicilio;
        this.DNI = DNI;
        this.Telfijo = Telfijo;
        this.Telcelular = Telcelular;
        this.Estcivil = Estcivil;
        this.correo = correo;
    }

    
    
    /** Constructor por defecto de Persona*/
    public Persona(){

    }

    //GETTERS Y SETTERS
    /** Retorna el identificador de person
     * @return id*/
    public int getId() {
        return id;
    }
    /**
     * Permite modificar el identificador de persona
     * @param id nuevo id
     */
    public void setId(int id) {
        this.id = id;
    }
    /** Retorna el nombre de person
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Permite modificar el nombre de persona
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /** Retorna el apellido de person
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Permite modificar el apellido de persona
     * @param apellido nuevo apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /** Retorna la fecha de nacimiento de person
     * @return fecha nacimiento
     */
    public Date getFechaNac() {
        return FechaNac;
    }
    /**
     * Permite modificar la fecha de nacimiento de persona
     * @param FechaNac nueva fecha nacimiento
     */
    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }
    /** Retorna el domicilio de person
     * @return domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }
    /**
     * Permite modificar el domicilio de persona
     * @param domicilio nuevo domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    /** Retorna el número de documento de person
     * @return dni
     */
    public long getDNI() {
        return DNI;
    }
    /**
     * Permite modificar el número de documento de persona
     * @param DNI nuevo dni
     */
    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    /** Retorna el número de teléfono fijo de person
     * @return telefono fijo
     */
    public long getTelfijo() {
        return Telfijo;
    }
    /**
     * Permite modificar el número de teléfono fijo de persona
     * @param Telfijo nuevo telefono fijo
     */
    public void setTelfijo(long Telfijo) {
        this.Telfijo = Telfijo;
    }
    /** Retorna el número de teléfono celular de person
     * @return telefono celular
     */
    public long getTelcelular() {
        return Telcelular;
    }
    /**
     * Permite modificar el número de teléfono celular de persona
     * @param Telcelular nuevo telofono celular
     */
    public void setTelcelular(long Telcelular) {
        this.Telcelular = Telcelular;
    }
    /** Retorna el estado civil de person
     * @return estado civil
     */
    public String getEstcivil() {
        return Estcivil;
    }
    /**
     * Permite modificar el estado civil de persona
     * @param Estcivil nuevo estado civil
     */
    public void setEstcivil(String Estcivil) {
        this.Estcivil = Estcivil;
    }
    /** Retorna la dirección de correo electrónico de person
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Permite modificar el correo electrónico de persona
     * @param correo nuevo correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    /**
     * Convierte todos los atributos de persona en formato String
     * @return Representación en String de los atributos de Persona
     */
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", FechaNac=" + FechaNac + ", DNI=" + DNI + ", Telfijo=" + Telfijo + ", Telcelular=" + Telcelular + ", Estcivil=" + Estcivil + ", correo=" + correo + '}';
    }

    
    

}
