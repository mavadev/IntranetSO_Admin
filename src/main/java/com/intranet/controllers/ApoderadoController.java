package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Apoderado;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApoderadoController {
    private final Connection conn;

    public ApoderadoController(DBConnection db) {
        this.conn = db.getConexion();
    }
    
    public Apoderado registerApoderado(Apoderado apoderado) {
        String queryUser = "INSERT INTO Apoderado (nombres, apellidos, celular, dni) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(queryUser, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, apoderado.getNombre());
            stmt.setString(2, apoderado.getApellido());
            stmt.setString(3, apoderado.getCelular());
            stmt.setString(4, apoderado.getDni());

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                 if (rs.next()) {
                    return new Apoderado(
                        rs.getInt(1),
                        apoderado.getNombre(),
                        apoderado.getApellido(),
                        apoderado.getCelular(),
                        apoderado.getDni()
                    );
                }
            } else {
                AlertUtils.showWarning("Credenciales incorrectas");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error al registrar apoderado: " + e.getMessage());
            AlertUtils.showWarning("Hubo un error al insertar el apoderado");
            return null;
        }
        return null;
    }
}