/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.models;

import java.sql.Time;
import java.time.LocalDate;

public class Estudiante {
    
    //Estudiante
    private int grado;
    private String nombEstu,dniEstu,correoEstu,celEstu,fijoEstu,departamentoEstu,provinciaEstu,distritoEstu,direccionEstu,nomApode,celApode,dniApode;
    private Time fechaEstu;

    public Estudiante(int grado, String nombEstu, String dniEstu, String correoEstu, String celEstu, String fijoEstu, String departamentoEstu, String provinciaEstu, String distritoEstu, String direccionEstu, String nomApode, String celApode, Time fechaEstu, String dniApode) {
        this.grado = grado;
        this.nombEstu = nombEstu;
        this.dniEstu = dniEstu;
        this.correoEstu = correoEstu;
        this.celEstu = celEstu;
        this.fijoEstu = fijoEstu;
        this.departamentoEstu = departamentoEstu;
        this.provinciaEstu = provinciaEstu;
        this.distritoEstu = distritoEstu;
        this.direccionEstu = direccionEstu;
        this.nomApode = nomApode;
        this.celApode = celApode;
        this.fechaEstu = fechaEstu;
        this.dniApode=dniApode;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getNombEstu() {
        return nombEstu;
    }

    public void setNombEstu(String nombEstu) {
        this.nombEstu = nombEstu;
    }

    public String getDniEstu() {
        return dniEstu;
    }

    public void setDniEstu(String dniEstu) {
        this.dniEstu = dniEstu;
    }

    public String getCorreoEstu() {
        return correoEstu;
    }

    public void setCorreoEstu(String correoEstu) {
        this.correoEstu = correoEstu;
    }

    public String getCelEstu() {
        return celEstu;
    }

    public void setCelEstu(String celEstu) {
        this.celEstu = celEstu;
    }

    public String getFijoEstu() {
        return fijoEstu;
    }

    public void setFijoEstu(String fijoEstu) {
        this.fijoEstu = fijoEstu;
    }

    public String getDepartamentoEstu() {
        return departamentoEstu;
    }

    public void setDepartamentoEstu(String departamentoEstu) {
        this.departamentoEstu = departamentoEstu;
    }

    public String getProvinciaEstu() {
        return provinciaEstu;
    }

    public void setProvinciaEstu(String provinciaEstu) {
        this.provinciaEstu = provinciaEstu;
    }

    public String getDistritoEstu() {
        return distritoEstu;
    }

    public void setDistritoEstu(String distritoEstu) {
        this.distritoEstu = distritoEstu;
    }

    public String getDireccionEstu() {
        return direccionEstu;
    }

    public void setDireccionEstu(String direccionEstu) {
        this.direccionEstu = direccionEstu;
    }

    public String getNomApode() {
        return nomApode;
    }

    public void setNomApode(String nomApode) {
        this.nomApode = nomApode;
    }

    public String getCelApode() {
        return celApode;
    }

    public void setCelApode(String celApode) {
        this.celApode = celApode;
    }

    public Time getFechaEstu() {
        return fechaEstu;
    }

    public void setFechaEstu(Time fechaEstu) {
        this.fechaEstu = fechaEstu;
    }
    public String getdniApode(){
        return dniApode;
        
    }
    public void setdniApode (String dniApode){
        this.dniApode= dniApode;
    }

     
    
}
