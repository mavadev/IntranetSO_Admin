 package com.intranet.models;

import java.time.LocalDateTime;

public class Usuario {
    private int id;
    private String email, password, rol;
    private String estado;

    public Usuario() {
    }
    
    // CONSTRUCTOR CON ID (Mostrar)
    public Usuario(int id, String correo, String contraseña, String rol, String estado) {
        this.id = id;
        this.email = correo;
        this.password = contraseña;
        this.rol = rol;
        this.estado = estado;
    }
    
    // CONSTRUCTOR SIN ID (Creación)
    public Usuario(String correo, String contraseña, String rol, String estado) {
        this.email = correo;
        this.password = contraseña;
        this.rol = rol;
        this.estado = estado;
    }
    
    // GETTERS Y SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
