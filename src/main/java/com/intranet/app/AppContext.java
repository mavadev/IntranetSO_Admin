package com.intranet.app;

import com.intranet.controllers.UsuarioController;
import com.intranet.db.DBConnection;

public class AppContext {
    private static DBConnection dbConnection;
    private static UsuarioController usuarioController;

    public static void initialize() {
        dbConnection = DBConnection.getInstancia();
        usuarioController = new UsuarioController(dbConnection);
    }

    public static UsuarioController getUsuarioController() {
        return usuarioController;
    }
}