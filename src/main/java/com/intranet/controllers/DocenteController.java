package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Docente;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DocenteController {
    
     private final Connection conn;

    public DocenteController(DBConnection db) {
        this.conn = db.getConexion();
    }

    public boolean registrarDocente(Docente docente) {
        String queryRegistro = 
            "EXEC RegistrarDocente "
            + "@email = ?, "
            + "@password = ?, "
            + "@nombres = ?, "
            + "@apellidos = ?, "
            + "@fecha_nacimiento = ?, "
            + "@dni = ?, "
            + "@celular = ?, "
            + "@direccion = ?, "
            + "@especialidad = ?;";

        try (PreparedStatement stmt2 = conn.prepareStatement(queryRegistro)){
            stmt2.setString(1, docente.getEmail());
            stmt2.setString(2, docente.getPassword());
            stmt2.setString(3, docente.getNombres());
            stmt2.setString(4, docente.getApellidos());
            stmt2.setDate(5, Date.valueOf(docente.getFecha()));
            stmt2.setString(6, docente.getDni());
            stmt2.setString(7, docente.getCelular());
            stmt2.setString(8, docente.getDireccion());
            stmt2.setString(9, docente.getEspecialidad());

            stmt2.executeQuery();
        } catch (Exception e) {
            System.out.println("Error al insertar el docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al insertar el docente");
            return false;
        }
        
        return true;
    }
    
    public ArrayList<Docente> obtenerDocentes(){
        // Obtenemos los docentes
        String query = 
            "SELECT "
            + "d.id_docente, "
            + "d.nombres, "
            + "d.apellidos, "
            + "u.email, "
            + "d.especialidad "
            + "FROM Docente d "
            + "JOIN Usuario u ON d.id_usuario = u.id_usuario;";
        
        ArrayList<Docente> listaDocentes = new ArrayList<Docente>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Docente docente = new Docente(
                    rs.getString("id_docente"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("email"),
                    rs.getString("especialidad")
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
        
    public Docente obtenerDocentePorID(String id_docente){
        // Obtenemos el docente por ID
        String query = 
            "SELECT "
            + "u.email, "
            + "d.id_docente, "
            + "d.nombres, "
            + "d.apellidos, "
            + "d.dni, "
            + "d.celular, "
            + "d.direccion, "
            + "d.especialidad "
            + "FROM Docente d "
            + "JOIN Usuario u ON d.id_usuario = u.id_usuario "
            + "WHERE d.id_docente = ?;";
        

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, id_docente);
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Docente docente = new Docente(
                    rs.getString("id_docente"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("email"),
                    rs.getString("especialidad")
                );
                
                return docente;
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener el docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener el docente");
        }
        return null;
    }

    public boolean actualizarDocentePorID(String id_docente, String correo, String hashedPassword){
        String queryEliminar = 
            "EXEC ActualizarCredencialesDocente "
            + "@id_docente = ?, "
            + "@nuevo_email = ?, "
            + "@nueva_password = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryEliminar)) {
            sttm.setString(1, id_docente);
            sttm.setString(2, correo);
            sttm.setString(3, hashedPassword);

            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showSuccess("Se actualizo correctamente el docente");
                return true;
            } 
        } catch (SQLException e) {
            System.out.println("Error al actualizar el docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al actualizar el docente");
            return false;
        }
        return false;
    }

    public boolean eliminarDocentePorID(String id_docente){
        String queryEliminar = "EXEC EliminarDocenteConActualizacion @id_docente = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryEliminar)) {
            sttm.setString(1, id_docente);
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showSuccess("Se eliminó correctamente el docente");
                return true;
            } 
        } catch (SQLException e) {
            System.out.println("Error al eliminar el docente: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al eliminar el docente");
            return false;
        }
        return false;
    }
}