package com.intranet.models;

public class Curso {
    private int id, docenteId, gradoId;
    private String nombre, descripcion;

    public Curso(int id, String nombre, String descripcion, int docenteId, int gradoId) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.docenteId = docenteId;
        this.gradoId = gradoId;
    }
    
    public Curso(String nombre, String descripcion, int docenteId, int gradoId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.docenteId = docenteId;
        this.gradoId = gradoId;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDocenteId() {
        return docenteId;
    }

    public void setDocenteId(int docenteId) {
        this.docenteId = docenteId;
    }

    public int getGradoId() {
        return gradoId;
    }

    public void setGradoId(int gradoId) {
        this.gradoId = gradoId;
    }

}
