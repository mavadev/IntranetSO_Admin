package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Administrador;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorController {
    private final Connection conn;

    public AdministradorController(DBConnection db) {
        this.conn = db.getConexion();
    }
    
    public Administrador login(String correo, String contraseña) {
        // Obtenemos usuario que cumpla con las credenciales
        String query = "SELECT * FROM Administrador WHERE usuario_id = (SELECT id_usuario FROM Usuario WHERE email = ? AND password = ? AND rol = 'administrador');";
        
        try (PreparedStatement sttm = conn.prepareStatement(query)) {
            sttm.setString(1, correo);
            sttm.setString(2, contraseña);
            ResultSet rs = sttm.executeQuery();
            
            if (rs.next()) {
                return new Administrador(
                    rs.getString("nombres"),
                    rs.getString("apellidos")
                );
            } 
        } catch (SQLException e) {
            System.out.println("Error al hacer login: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al iniciar sesión");
            return null;
        }
        return null;
    }
}