package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Curso;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CursoController {
    private final Connection conn;

    public CursoController(DBConnection db) {
        this.conn = db.getConexion();
    }
    
    public boolean registerCurso(Curso curso) {
        String queryExiste = "SELECT * FROM Curso WHERE nombre = ? AND grado_id = ?";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryExiste)) {
            sttm.setString(1, curso.getNombre());
            sttm.setInt(2, curso.getGradoId());
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showWarning("Ya existe un curso registrado en el grado");
                return false;
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener el curso: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener el curso");
            return false;
        }
        
        String queryCurso = "INSERT INTO Curso (nombre, descripcion, docente_id, grado_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(queryCurso)) {
            stmt.setString(1, curso.getNombre());
            stmt.setString(2, curso.getDescripcion());
            stmt.setInt(3, curso.getDocenteId());
            stmt.setInt(4, curso.getGradoId());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar el curso: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al registrar el curso");
            return false;
        }
    }
    
    public ArrayList<Curso> obtenerCursos(){
        // Obtenemos los cursos
        String query = "SELECT * FROM Curso";
       ArrayList<Curso> listaCursos = new ArrayList<Curso>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Curso curso = new Curso(
                    rs.getInt("id_curso"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("docente_id"),
                    rs.getInt("grado_id")
                );
                
                listaCursos.add(curso);
            } 
            
        } catch (SQLException e) {
            System.out.println("Error al obtener los cursos: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los cursos");
            return null;
        }
        return listaCursos;
    }
}