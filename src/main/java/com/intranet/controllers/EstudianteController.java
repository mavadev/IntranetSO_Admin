/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class EstudianteController {
     private final Connection conn;

    public EstudianteController(DBConnection db) {
        this.conn = db.getConexion();
    }
        
            public boolean registerStudents(Estudiante estudiante) {
        String sql = "INSERT INTO usuarios (nombreEstudiante, fechaEstudiante, dniEstudiante, correoEstudiante, celularEstudiante, fijo , departamentoEstudiante,provinciaEstudiante,distritoEstudiante,direccion,grado, nombreApoderado , celularApoderado, dniApoderado) VALUES ( ?, ?, ?, ?, , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, estudiante.getNombEstu());
            stmt.setTime(2, estudiante.getFechaEstu());
            stmt.setString(3, estudiante.getDniEstu());
            stmt.setString(4, estudiante.getCorreoEstu());
            stmt.setString(5, estudiante.getCelEstu());
            stmt.setString(6, estudiante.getFijoEstu());
            stmt.setString(7, estudiante.getDepartamentoEstu());
            stmt.setString(8, estudiante.getProvinciaEstu());
            stmt.setString(9, estudiante.getDistritoEstu());
            stmt.setString(11, estudiante.getDireccionEstu());
            stmt.setInt(12, estudiante.getGrado());
            stmt.setString(13, estudiante.getNomApode());
            stmt.setString(14, estudiante.getCelApode());
            stmt.setString(15, estudiante.getdniApode());

            stmt.executeUpdate();
            return true;
            } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
            }
        }
}
