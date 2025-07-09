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
    
    public boolean registrarCursoBase(Curso curso) {
        // CONSULTA PARA OBTENER SI EXISTE UN CURSO EN ESE GRADO
        String queryFindCourse = 
                  "SELECT * FROM CursoBase "
                + "WHERE nombre = ? AND id_grado = ?";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryFindCourse)) {
            sttm.setString(1, curso.getNombre());
            sttm.setString(2, curso.getIdGrado());
            
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showWarning("Ya existe un curso creado para este grado.");
                return false;
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener el curso: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener el curso");
            return false;
        }
        
        // CONSULTA PARA INSERTAR EL CURSO BASE
        String queryInsertCourse = 
            "EXEC RegistrarCursoBaseConDictados "
            + "@nombre = ?, "
            + "@descripcion = ?, "
            + "@id_grado = ?;";

        try (PreparedStatement stmt = conn.prepareStatement(queryInsertCourse)) {
            stmt.setString(1, curso.getNombre());
            stmt.setString(2, curso.getDescripcion());
            stmt.setString(3, curso.getIdGrado());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al registrar el curso: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al registrar el curso");
            return false;
        }
        
        return true;
    }
    
    public boolean actualizarCursoDictado(Curso curso) {
        // ACTUALIZAR DATOS DEL CURSO DICTADO
        String queryUpdateCourse = 
            "EXEC ActualizarCursoDictado "
            + "@id_curso_dictado = ?,"
            + "@id_docente = ?, "
            + "@aula = ?, "
            + "@horario = ?, "
            + "@modalidad = ?;";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryUpdateCourse)) {
            sttm.setString(1, curso.getIdCursoDictado());
            sttm.setString(2, curso.getIdDocente());
            sttm.setString(3, curso.getAula());
            sttm.setString(4, curso.getHorario());
            sttm.setString(5, curso.getModalidad());
            
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showMessage("Curso actualizado/asignado correctamente.");
                return false;
            } 
        } catch (SQLException e) {
            System.out.println("Error al actualzar un curso asignado: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al actualzar un curso asignado");
            return false;
        }
        
        return true;
    }

    
    public ArrayList<Curso> obtenerCursosPorGrado(String grado_id){
        // Establecer la consulta a la DB por grado
        String query = 
            "SELECT "
            + "c.id_curso AS id_curso,"
            + "c.nombre, "
            + "c.descripcion, "
            + "g.numero_grado AS num_grado"
            + "FROM CursoBase c"
            + "JOIN Grado g ON g.id_grado = c.id_grado";
        
        if(!grado_id.isEmpty()){
            query += " WHERE c.id_grado = " + grado_id;
        }
        
        // Obtenemos los cursos
        ArrayList<Curso> listaCursos = new ArrayList<Curso>();

        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();
            
            while (rs.next()) {
                Curso curso = new Curso(
                    rs.getString("id_curso"),
                    rs.getString("nombre"),
                    rs.getString("descripcion"),
                    rs.getInt("num_grado")
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

    public boolean eliminarCursoPorID(String id_curso){
        String queryExiste = "DELETE FROM CursoBase WHERE id_curso_base = ?";
        
        try (PreparedStatement sttm = conn.prepareStatement(queryExiste)) {
            sttm.setString(1, id_curso);
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                AlertUtils.showSuccess("Se eliminó correctamente el curso");
                return true;
            } 
        } catch (SQLException e) {
            System.out.println("Error al eliminar el curso: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al eliminar el curso");
            return false;
        }
        return false;
    }
}