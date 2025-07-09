package com.intranet.models;

public class Curso {
    private String idCursoBase;
    private String nombre;
    private String descripcion;
    private String idGrado;

    private String idCursoDictado;
    private String idDocente;
    private String idSeccion;
    private String idGradoSeccion;

    private String aula;
    private String horario;
    private String modalidad;
    private String color_hex;

    private int numGrado;
    
    // REGISTRO - CURSO BASE
    public Curso(String nombre, String descripcion, String idGrado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idGrado = idGrado;
    }
    
    // MOSTRAR CURSO - LISTA CURSOS BASE
    public Curso(String idCursoBase, String nombre, String descripcion, int numGrado) {
        this.idCursoBase = idCursoBase;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numGrado = numGrado;
    }   

    // ACTUALIZAR - CURSO DICTADO
    public Curso(String idCursoDictado, String idDocente, String aula, String horario, String modalidad) {
        this.idCursoDictado = idCursoDictado;
        this.idDocente = idDocente;
        this.aula = aula;
        this.horario = horario;
        this.modalidad = modalidad;
    }
    
    // Getters
    public String getIdCursoBase() {
        return idCursoBase;
    }
    public String getIdCursoDictado() {
        return idCursoDictado;
    }
    public String getIdDocente() {
        return idDocente;
    }
    public String getIdGrado() {
        return idGrado;
    }
    public String getIdSeccion() {
        return idSeccion;
    }
    public String getIdGradoSeccion() {
        return idGradoSeccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getAula() {
        return aula;
    }
    public String getHorario() {
        return horario;
    }
    public String getModalidad() {
        return modalidad;
    }
    public String getColor_hex() {
        return color_hex;
    }
    public int getNumGrado() {
        return numGrado;
    }
}
