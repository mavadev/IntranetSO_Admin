package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Apoderado;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ApoderadoController {
    private final Connection conn;

    public ApoderadoController(DBConnection db) {
        this.conn = db.getConexion();
    }
    
    public Apoderado buscarPorDni(String dniApoderado) {
        // Obtenemos el apoderado por DNI
        String query = "SELECT * FROM Apoderado WHERE id_apoderado = " + dniApoderado;
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                Apoderado apoderado = new Apoderado(
                    rs.getString("id_apoderado"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("celular"),
                    rs.getString("dni")
                );
                return apoderado;
            } 
        } catch (SQLException e) {
            System.out.println("Error al obtener el apoderado por DNI: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al obtener el apoderado por DNI");
            return null;
        }
        return null;
    }
}