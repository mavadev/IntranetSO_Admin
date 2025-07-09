package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Administrador;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.PasswordUtils;
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
        
        // OBTENER USUARIO POR CORREO
        String queryUsuario = 
            "SELECT id_usuario, password FROM Usuario "
            + "WHERE email = ? AND rol = 'administrador';";
        
        // OBTENER ADMINISTRADOR POR ID_USUARIO
        String queryAdministrador = 
            "SELECT nombres, apellidos FROM Administrador "
            + "WHERE id_usuario = ?;";

        try (PreparedStatement sttm = conn.prepareStatement(queryUsuario)) {
            sttm.setString(1, correo);
            ResultSet rs = sttm.executeQuery();
            
            if (!rs.next()) {
                AlertUtils.showWarning("Correo no registrado como administrador");
                return null;
            } 
            
            // Datos de usuario
            String hashedPasswordDB = rs.getString("password");
            String id_usuario = rs.getString("id_usuario");

            // No coincide las contraseñas
            if (!PasswordUtils.checkPassword(contraseña, hashedPasswordDB)) {
                AlertUtils.showWarning("Contraseña incorrecta");
                return null;
            }
            
            // Obtener datos de administrador
            try (PreparedStatement sttmAdmin  = conn.prepareStatement(queryAdministrador)) {
                sttm.setString(1, id_usuario);
                ResultSet rsAdmin = sttmAdmin.executeQuery();

                if (rsAdmin.next()) {
                    return new Administrador(
                        rs.getString("nombres"),
                        rs.getString("apellidos")
                    );
                } else {
                    AlertUtils.showWarning("No se encontró al administrador");
                }
                
            } 
                
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al iniciar sesión");
            return null;
        }
        
        return null;
    }
}