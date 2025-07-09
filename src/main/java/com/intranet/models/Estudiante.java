package com.intranet.models;
import java.time.LocalDate;

public class Estudiante extends Usuario {    
    private String idEstudiante;
    private String idUsuario;
    private String idApoderado;
    private String idGradoSeccion;

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;
    private String direccion;

    private int numeroGrado;
    private String letraSeccion;

    // REGISTRAR ESTUDIANTE
    public Estudiante(
        String correo, 
        String contraseña, 
        String nombres, 
        String apellidos, 
        LocalDate fechaNacimiento, 
        String dni, 
        String direccion            
    ) {
        super(correo, contraseña, "estudiante", "activo");
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.direccion = direccion;
    }
    
    // MOSTRAR ESTUDIANTE COMPLETO
    public Estudiante(
        String correo,
        String idEstudiante,
        String nombres, 
        String apellidos, 
        String dni, 
        String direccion,
        int numGrado
    ) {
        super(correo);
        this.idEstudiante = idEstudiante;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroGrado = numGrado;
    }
    
    // MOSTRAR ESTUDIANTE - LISTADO
    public Estudiante(
        String idEstudiante,
            
        String nombres, 
        String apellidos, 
        String email,
        
        int numGrado,
        String letraSeccion
    ) {
        super(email);
        this.idEstudiante = idEstudiante;
        
        this.nombres = nombres;
        this.apellidos = apellidos;
        
        this.numeroGrado = numGrado;
        this.letraSeccion = letraSeccion;
    }

    // Getters
    public String getIdEstudiante() {
        return idEstudiante;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
    public String getIdApoderado() {
        return idApoderado;
    }
    public String getIdGradoSeccion() {
        return idGradoSeccion;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getDni() {
        return dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getNumeroGrado() {
        return numeroGrado;
    }
    public String getLetraSeccion() {
        return letraSeccion;
    }
}
