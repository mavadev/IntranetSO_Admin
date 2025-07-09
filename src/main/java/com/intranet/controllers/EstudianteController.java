package com.intranet.controllers;
import com.intranet.utils.AlertUtils;
import com.intranet.db.DBConnection;

import com.intranet.models.Apoderado;
import com.intranet.models.Estudiante;

import java.sql.Connection;
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
        
    public boolean registrarEstudiante(Apoderado apoderado, Estudiante estudiante, String idGrado, String idSeccion) {
        // Consulta procedural para registro del estudiante
        String queryUser = 
                "EXEC RegistrarEstudianteConApoderado "
                    + "@email = ?, @password = ?, "
                    + "@nombres_apo = ?, "
                    + "@apellidos_apo = ?, "
                    + "@celular_apo = ?, "
                    + "@dni_apo = ?, "
                    + "@nombres_est = ?, "
                    + "@apellidos_est = ?, "
                    + "@fecha_nacimiento = ?, "
                    + "@dni_est = ?, "
                    + "@direccion_est = ?, "
                    + "@id_grado = ?, "
                    + "@id_seccion = ?;";

        try (PreparedStatement stmt = conn.prepareStatement(queryUser, Statement.RETURN_GENERATED_KEYS)) {
            // Datos de Usuario
            stmt.setString(1, estudiante.getEmail());
            stmt.setString(2, estudiante.getPassword());
            // Datos de Apoderado
            stmt.setString(3, apoderado.getNombres());
            stmt.setString(4, apoderado.getApellidos());
            stmt.setString(5, apoderado.getCelular());
            stmt.setString(6, apoderado.getDni());
            // Datos de Estudiante
            stmt.setString(7, estudiante.getNombres());
            stmt.setString(8, estudiante.getApellidos());
            stmt.setDate  (9, java.sql.Date.valueOf(estudiante.getFechaNacimiento()));
            stmt.setString(10, estudiante.getDni());
            stmt.setString(11, estudiante.getDireccion());
            // Datos de Grado y Seccion
            stmt.setString(12, idGrado);
            stmt.setString(13, idSeccion);
            
            // Ejecutamos la consulta
            stmt.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al registrar el estudiante: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al registrar el estudiante");
            return false;
        }
        return true; // Registro exitoso
    }
    
    public Estudiante obtenerEstudiantePorID(String id_estudiante){
        // Obtenemos el estudiante por ID
        String queryFindStudent = 
            "SELECT "
            + "u.email, "
            + "e.id_estudiante, "
            + "e.nombres, "
            + "e.apellidos, "
            + "e.direccion, "
            + "e.dni, "
            + "g.numero_grado AS num_grado, "
            + "FROM Estudiante e "
            + "JOIN Usuario u ON e.id_usuario = u.id_usuario "
            + "JOIN Grado_Seccion gs ON gs.id_grado_seccion = e.id_grado_seccion "
            + "JOIN Grado g ON g.id_grado = gs.id_grado "
            + "WHERE e.id_estudiante = ?;";

        try (PreparedStatement sttm = conn.prepareStatement(queryFindStudent)) {
            sttm.setString(1, id_estudiante);
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                    rs.getString("email"),
                    rs.getString("id_estudiante"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("dni"),
                    rs.getString("direccion"),
                    rs.getInt("num_grado")
                );
                
                return estudiante;
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener el estudiante: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener el estudiante");
        }
        return null;
    }
    
    public ArrayList<Estudiante> obtenerEstudiantesPorGrado(String grado_id){
        // Obtenemos los estudiantes
        String query = 
            "SELECT DISTINCT"
                + "e.id_estudiante,"
                + "e.nombres,"
                + "e.apellidos,"
                + "u.email,"
                + "gs.id_grado,"
                + "gs.id_seccion"
            + "FROM Estudiante e"
            + "JOIN Usuario u ON e.id_usuario = u.id_usuario"
            + "JOIN Grado_Seccion gs ON gs.id_grado_seccion = e.id_grado_seccion";
        
        if(!grado_id.isEmpty()){
            query += " WHERE gs.id_grado = " + grado_id;
        }
        
        // Creamos la lista de estudiantes
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();

            // Añadir cada estudiante obtenido a la lista
            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                    rs.getString("id_estudiante"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("email"),
                    rs.getInt("num_grado"),
                    rs.getString("letra_seccion")
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
    
    public boolean actualizarEstudiantePorID(String id_estudiante, String correo, String hashedPassword){
        String queryEliminar = 
            "EXEC ActualizarCredencialesEstudiante "
            + "@id_estudiante = ?, "
            + "@nuevo_email = ?, "
            + "@nueva_password = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryEliminar)) {
            sttm.setString(1, id_estudiante);
            sttm.setString(2, correo);
            sttm.setString(3, hashedPassword);

            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showSuccess("Se actualizo correctamente el estudiante");
                return true;
            } 
        } catch (SQLException e) {
            System.out.println("Error al actualizar el estudiante: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al actualizar el estudiante");
            return false;
        }
        return false;
    }
    
    public boolean eliminarEstudiantePorID(String id_estudiante){
        String queryEliminar = "EXEC EliminarEstudianteConApoderado @id_estudiante = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryEliminar)) {
            sttm.setString(1, id_estudiante);
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showSuccess("Se eliminó correctamente el estudiante");
                return true;
            } 
        } catch (SQLException e) {
            System.out.println("Error al eliminar el estudiante: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al eliminar el estudiante");
            return false;
        }
        return false;
    }
}
