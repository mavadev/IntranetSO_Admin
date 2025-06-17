/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.models;

import java.sql.Time;
import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Docente {
    
    
    private String nombDoc,dniDoc,correoDoc,celDoc,departamentoDoc,provinciaDoc,distritoDoc,ocupacionDoc;
    private Time fechaDoc;

    public Docente(String nombDoc, String dniDoc, String correoDoc, String celDoc, String departamentoDoc, String provinciaDoc, String distritoDoc, String ocupacionDoc, Time fechaDoc) {
        this.nombDoc = nombDoc;
        this.dniDoc = dniDoc;
        this.correoDoc = correoDoc;
        this.celDoc = celDoc;
        this.departamentoDoc = departamentoDoc;
        this.provinciaDoc = provinciaDoc;
        this.distritoDoc = distritoDoc;
        this.ocupacionDoc = ocupacionDoc;
        this.fechaDoc = fechaDoc;
    }

    public String getNombDoc() {
        return nombDoc;
    }

    public void setNombDoc(String nombDoc) {
        this.nombDoc = nombDoc;
    }

    public String getDniDoc() {
        return dniDoc;
    }

    public void setDniDoc(String dniDoc) {
        this.dniDoc = dniDoc;
    }

    public String getCorreoDoc() {
        return correoDoc;
    }

    public void setCorreoDoc(String correoDoc) {
        this.correoDoc = correoDoc;
    }

    public String getCelDoc() {
        return celDoc;
    }

    public void setCelDoc(String celDoc) {
        this.celDoc = celDoc;
    }

    public String getDepartamentoDoc() {
        return departamentoDoc;
    }

    public void setDepartamentoDoc(String departamentoDoc) {
        this.departamentoDoc = departamentoDoc;
    }

    public String getProvinciaDoc() {
        return provinciaDoc;
    }

    public void setProvinciaDoc(String provinciaDoc) {
        this.provinciaDoc = provinciaDoc;
    }

    public String getDistritoDoc() {
        return distritoDoc;
    }

    public void setDistritoDoc(String distritoDoc) {
        this.distritoDoc = distritoDoc;
    }

    public String getOcupacionDoc() {
        return ocupacionDoc;
    }

    public void setOcupacionDoc(String ocupacionDoc) {
        this.ocupacionDoc = ocupacionDoc;
    }

    public Time getFechaDoc() {
        return fechaDoc;
    }

    public void setFechaDoc(Time fechaDoc) {
        this.fechaDoc = fechaDoc;
    }
    
    
    
}
