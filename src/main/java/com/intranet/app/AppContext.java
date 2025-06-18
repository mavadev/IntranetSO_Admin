package com.intranet.app;

import com.intranet.db.DBConnection;
import com.intranet.controllers.AdministradorController;
import com.intranet.controllers.ApoderadoController;
import com.intranet.controllers.CursoController;
import com.intranet.controllers.DocenteController;
import com.intranet.controllers.EstudianteController;

public class AppContext {
    private static DBConnection dbConnection;
    
    private static CursoController cursoController;
    private static ApoderadoController apoderadoController;
    private static DocenteController docenteController;
    private static EstudianteController estudianteController;
    private static AdministradorController administradorController;

    public static void initialize() {
        dbConnection = DBConnection.getInstancia();
        
        apoderadoController = new ApoderadoController(dbConnection);
        cursoController = new CursoController(dbConnection);
        docenteController = new DocenteController(dbConnection);
        estudianteController = new EstudianteController(dbConnection);
        administradorController = new AdministradorController(dbConnection);
    }

    public static ApoderadoController getApoderadoController() {
        return apoderadoController;
    }
    
    public static CursoController getCursoController() {
        return cursoController;
    }
    
    public static DocenteController getDocenteController() {
        return docenteController;
    }

    public static EstudianteController getEstudianteController() {
        return estudianteController;
    }

    public static AdministradorController getAdministradorController() {
        return administradorController;
    }


}