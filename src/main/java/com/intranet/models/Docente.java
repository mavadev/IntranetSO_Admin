package com.intranet.models;

import java.sql.Time;
import java.time.LocalDate;

public class Docente extends Usuario{
    private int id;
    private String nombre, apellido, dni, celular, direccion, especialidad;
    private LocalDate fecha;

    public Docente(String nombre, String apellido, String dni, String celular, String direccion, String especialidad, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.fecha = fecha;
    }
    
    public Docente(int id, String nombre, String apellido, String dni, String celular, String direccion, String especialidad, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.fecha = fecha;
    }
    
    public Docente(String correo, String contraseña, String nombre, String apellido, String dni, String celular, String direccion, String especialidad, LocalDate fecha) {
        super(correo, contraseña, "docente", "activo");
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.celular = celular;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.fecha = fecha;
    }

    public int getId(){
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
