 package com.intranet.models;

public class Usuario {
    private String idUsuario;
    private String email;
    private String password;
    private String rol;
    private String estado;

    public Usuario() {
    }


    // CONSTRUCTOR SIN ID (Creación)
    public Usuario(String correo, String contraseña, String rol, String estado) {
        this.email = correo;
        this.password = contraseña;
        this.rol = rol;
        this.estado = estado;
    }
    
    // CONSTRUCTOR SIN ID (Creación)
    public Usuario(String correo) {
        this.email = correo;
    }
    // CONSTRUCTOR SIN ID (Creación)
    public Usuario(String correo, String password) {
        this.email = correo;
        this.password = password;
    }
    
    
    // GETTERS Y SETTERS
    public String getIdUsuario() {
        return idUsuario;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getRol() {
        return rol;
    }
    public String isEstado() {
        return estado;
    }
}
