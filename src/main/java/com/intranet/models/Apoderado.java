package com.intranet.models;

public class Apoderado{
    private int id;
    private String nombre, apellido, celular, dni;

    public Apoderado(String nombre, String apellido, String celular, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
    }
    
    public Apoderado(int id, String nombre, String apellido, String celular, String dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
    }

    public int getId() {
        return id;
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
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}
