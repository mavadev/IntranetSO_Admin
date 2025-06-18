/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Docente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class DocenteController {
    
     private final Connection conn;

    public DocenteController(DBConnection db) {
        this.conn = db.getConexion();
    }
      
    public boolean registerTeachers(Docente docente) {
        String sql = "INSERT INTO usuarios (nombreDocente, fechaDocente, dniDocente, correoDocente, celularDocente , departamentoDocente,provinciaDocente,distritoDocente ,ocupacion) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, docente.getNombDoc());
            stmt.setTime(2, docente.getFechaDoc());
            stmt.setString(3, docente.getDniDoc());
            stmt.setString(4, docente.getCorreoDoc());
            stmt.setString(5, docente.getCelDoc());
            stmt.setString(6, docente.getDepartamentoDoc());
            stmt.setString(7, docente.getProvinciaDoc());
            stmt.setString(8, docente.getDistritoDoc());
            stmt.setString(9, docente.getOcupacionDoc());

            stmt.executeUpdate();
            return true;
            } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
            }
        }
    
}
