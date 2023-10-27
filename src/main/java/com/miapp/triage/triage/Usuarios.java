package com.miapp.triage.triage;

/**
 * Clase de Usuarios
 * 
 * @author Ramiro Borgo
 * @author Martin Bourlot
 * @author Fabian Brites
 * @author Juan Fracisco Riveras
 * @author Nicolas Ornetti
 * @version 1.0
 */

public class Usuarios  {
    /** Rol del usuario*/
    private String rol;
    /** Nombre del usuario*/
    private String username;
    /** Contraseña del usuario*/
    private String password;

    /** Constructor por defecto de Usuarios*/
    public Usuarios(){
        
    }

    /**
     * Crea una nueva instancia de Usuarios
     * @param username   Usuario
     * @param password   COntraseña
     * @param rol        Rol
     */
    public Usuarios(String username, String password, String rol) {
        this.username = username;
        this.password = password;
        this.rol= rol;
    }

    /** Retorna el ro
     * @return rol 
     */
    public String getRol() {
        return rol;
    }
    /**
     * Permite modificar el rol del usuario
     * @param rol nuevo rol
     */
    public void setRol(String rol) {
        this.rol = rol;
    }
    /**
     * Retorna el usuario
     * @return username
     */
    public String getUsername() {
        return username;
    }
    /**
     * Permite modificar el usuario
     * @param username  nuevo username
     */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
     * Retorna la contraseña de usuario
     * @return password
     */
    public String getPassword() {
        return password;
    }
    /**
     * Permite modificar la contraseña del usuario
     * @param password nueva password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
