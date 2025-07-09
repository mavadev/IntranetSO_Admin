package com.intranet.models;

public class Apoderado{
    private String idApoderado;
    private String nombres;
    private String apellidos;
    private String celular;
    private String dni;

    // REGISTRO DE APODERADO
    public Apoderado(String nombres, String apellidos, String celular, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.dni = dni;
    }
    
    // DATOS DE APODERADO
    public Apoderado(String idApoderado, String nombres, String apellidos, String celular, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.celular = celular;
        this.dni = dni;
    }

    // Getters
    public String getIdApoderado() {
        return idApoderado;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getCelular() {
        return celular;
    }
    public String getDni() {
        return dni;
    }
}
