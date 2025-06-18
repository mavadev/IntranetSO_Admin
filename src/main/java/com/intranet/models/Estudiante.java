package com.intranet.models;
import java.time.LocalDate;

public class Estudiante extends Usuario {
    
    //Estudiante
    private int id, grado, seccion;
    private String nombre,apellido, dni, direccion;
    private LocalDate fechaNacimiento;

    public Estudiante(int id, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String direccion, int grado, int seccion ) {
        this.id = id;
        this.grado = grado;
        this.seccion = seccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public Estudiante(String nombre, String apellido, LocalDate fechaNacimiento, String dni, String direccion, int grado, int seccion ) {
        this.grado = grado;
        this.seccion = seccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estudiante(String correo, String contraseña, String nombre, String apellido, LocalDate fechaNacimiento, String dni, String direccion, int grado, int seccion) {
        super(correo, contraseña, "estudiante", "activo");
        this.grado = grado;
        this.seccion = seccion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId(){
        return id;
    }
    
    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
