package com.intranet.controllers;

import com.intranet.db.DBConnection;
import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioController {
    private final Connection conn;

    public UsuarioController(DBConnection db) {
        this.conn = db.getConexion();
    }
}