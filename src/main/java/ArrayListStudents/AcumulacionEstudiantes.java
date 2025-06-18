/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayListStudents;

import com.intranet.models.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class AcumulacionEstudiantes {
    
    private ArrayList<Estudiante> listaEstudiante;
    public AcumulacionEstudiantes(){
        listaEstudiante=new ArrayList<>();
    }
    //metodos
    
    //agregar
    public void agregarEstudiante(Estudiante e){
        listaEstudiante.add(e);
    }
    //obtener
    public ArrayList<Estudiante> obtenerEstudiante(){
        return listaEstudiante;
    }
    //eliminar
    public void elimanrEstudiante(int indice){
        listaEstudiante.remove(indice);
    }



}
    
