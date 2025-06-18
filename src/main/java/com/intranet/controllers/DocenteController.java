package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Docente;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DocenteController {
    
     private final Connection conn;

    public DocenteController(DBConnection db) {
        this.conn = db.getConexion();
    }

    public boolean registerDocente(Docente docente) {
        int user_id = -1;
        String queryUser = "INSERT INTO Usuario (email, password, rol) VALUES (?, ?, 'docente');";

        try (PreparedStatement stmt = conn.prepareStatement(queryUser, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, docente.getEmail());
            stmt.setString(2, docente.getPassword());

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if(rs.next()){
                    user_id = rs.getInt(1);
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
        System.out.print("USER_ID: "+user_id);

        String queryTeacher2 = "INSERT INTO Docente (usuario_id, nombres, apellidos, fecha_nacimiento, dni, celular, direccion, especialidad ) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt2 = conn.prepareStatement(queryTeacher2)){
            stmt2.setInt(1, user_id);
            stmt2.setString(2, docente.getNombre());
            stmt2.setString(3, docente.getApellido());
            stmt2.setDate(4, Date.valueOf(docente.getFecha()));
            stmt2.setString(5, docente.getDni());
            stmt2.setString(6, docente.getDni());
            stmt2.setString(7, docente.getDireccion());
            stmt2.setString(8, docente.getEspecialidad());

            stmt2.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al insertar el docente");
            return false;
        }
        
        return true;
    }
    
    public ArrayList<Docente> obtenerDocentes(){
        // Obtenemos los docentes
        String query = "SELECT * FROM Docente";
        ArrayList<Docente> listaDocentes = new ArrayList<Docente>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Docente docente = new Docente(
                    rs.getInt("id_docente"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("dni"),
                    rs.getString("celular"),
                    rs.getString("direccion"),
                    rs.getString("especialidad"),
                    rs.getDate("fecha_nacimiento").toLocalDate()
                );
                
                listaDocentes.add(docente);
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener los docentes: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener los docentes");
            return null;
        }
        return listaDocentes;
    }
}