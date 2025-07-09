package com.intranet.models;

import java.time.LocalDate;

public class Docente extends Usuario{
    private String idDocente;
    
    private String nombres;
    private String apellidos;
    private LocalDate fecha;
    private String dni;
    private String celular;
    private String direccion;
    private String especialidad;

    // REGISTRO DOCENTE
    public Docente(
        String correo, 
        String contraseña, 
        String nombre, 
        String apellido, 
        String dni, 
        String celular, 
        String direccion, 
        String especialidad, 
        LocalDate fecha
    ) {
        super(correo, contraseña, "docente", "activo");
        this.nombres = nombre;
        this.apellidos = apellido;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.fecha = fecha;
    }
    
    // MOSTRAR DOCENTE COMPLETO
    public Docente(
        String email,
        String idDocente,
        String nombre, 
        String apellido, 
        String dni, 
        String celular, 
        String direccion, 
        String especialidad
    ) {
        super(email);
        this.idDocente = idDocente;
        this.nombres = nombre;
        this.apellidos = apellido;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
        this.especialidad = especialidad;
    }
    
    // MOSTRAR DOCENTE - LISTADO
    public Docente(
        String idDocente,
        String nombre, 
        String apellido, 
        String email,
        String especialidad
    ) {
        
        this.nombres = nombre;
        this.apellidos = apellido;
        this.especialidad = especialidad;
    }
    
        
    // ACTUALIZAR DOCENTE
    public Docente(
        String idDocente,
        String email,
        String password
    ) {
        super(email, password);
        this.idDocente = idDocente;
    }

    // Getters
    public String getIdDocente() {
        return idDocente;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public String getDni() {
        return dni;
    }
    public String getCelular() {
        return celular;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
