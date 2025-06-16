package com.intranet.models;

import java.time.LocalDateTime;

public class Usuario {
    private int id;
    private String nombre, apellido, correo, contraseña, rol;
    private LocalDateTime creado_en;

    // CONSTRUCTOR CON ID (Mostrar)
    public Usuario(int id, String nombre, String apellido, String correo, String contraseña, String rol, LocalDateTime creado_en) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.creado_en = creado_en;
    }
    
    // CONSTRUCTOR SIN ID (Creación)
    public Usuario(String nombre, String apellido, String correo, String contraseña, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }
    
    // GETTERS Y SETTERS
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public LocalDateTime getCreado_en() {
        return creado_en;
    }
    public void setCreado_en(LocalDateTime creado_en) {
        this.creado_en = creado_en;
    }

}
