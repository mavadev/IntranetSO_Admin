
package com.intranet.controllers;

public class Curso {
    String nombre, grado, docente, sede, descripcion, imagen, icono1, icono2;

    public Curso(String nombre, String grado, String docente, String sede, String descripcion, String imagen, String icono1, String icono2) {
        this.nombre = nombre;
        this.grado = grado;
        this.docente = docente;
        this.sede = sede;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.icono1 = icono1;
        this.icono2 = icono2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIcono1() {
        return icono1;
    }

    public void setIcono1(String icono1) {
        this.icono1 = icono1;
    }

    public String getIcono2() {
        return icono2;
    }

    public void setIcono2(String icono2) {
        this.icono2 = icono2;
    }
    
}
