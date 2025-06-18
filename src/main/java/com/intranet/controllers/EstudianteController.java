package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Estudiante;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EstudianteController {
     private final Connection conn;

    public EstudianteController(DBConnection db) {
        this.conn = db.getConexion();
    }
        
    public boolean registerStudent(Estudiante estudiante, int apoderado_id) {
        int user_id = -1;
        String queryUser = "INSERT INTO Usuario (email, password, rol) VALUES (?, ?, 'estudiante');";

        try (PreparedStatement stmt = conn.prepareStatement(queryUser, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, estudiante.getEmail());
            stmt.setString(2, estudiante.getPassword());

            int filasUser = stmt.executeUpdate();
            if (filasUser > 0) {
                ResultSet rsUser = stmt.getGeneratedKeys();
                if(rsUser.next()){
                    user_id = rsUser.getInt(1);
                }
            } else {
                AlertUtils.showWarning("Credenciales incorrectas");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al insertar el usuario");
            return false;
        }
        
        if (user_id == -1) {
            AlertUtils.showWarning("No se obtuvo el ID del usuario insertado.");
            return false;
        }
        
        String queryStudent = "INSERT INTO Estudiante (usuario_id, nombres, apellidos, fecha_nacimiento, dni, direccion, grado_id, seccion_id, apoderado_id ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement stmt2 = conn.prepareStatement(queryStudent)){
            stmt2.setInt(1, user_id);
            stmt2.setString(2, estudiante.getNombre());
            stmt2.setString(3, estudiante.getApellido());
            stmt2.setDate(4, Date.valueOf(estudiante.getFechaNacimiento()));
            stmt2.setString(5, estudiante.getDni());
            stmt2.setString(6, estudiante.getDireccion());
            stmt2.setInt(7, estudiante.getGrado());
            stmt2.setInt(8, estudiante.getSeccion());
            stmt2.setInt(9, apoderado_id);

            stmt2.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar el estudiante: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al insertar el estudiante");
            return false;
        }
        
        return true;
    }
    
    public ArrayList<Estudiante> obtenerEstudiantes(){
        // Obtenemos los estudiantes
        String query = "SELECT * FROM Estudiante";
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                    rs.getInt("id_estudiante"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getDate("fecha_nacimiento").toLocalDate(),
                    rs.getString("dni"),
                    rs.getString("direccion"),
                    rs.getInt("grado_id"),
                    rs.getInt("seccion_id")
                );

                listaEstudiantes.add(estudiante);
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener los estudiantes: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los estudiantes");
            return null;
        }
        return listaEstudiantes;
    }
}
