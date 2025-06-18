package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Docente;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ListaDocentes extends javax.swing.JPanel {
    DefaultTableModel modeloDocentes = new DefaultTableModel();
    
    public ListaDocentes() {
        initComponents();
        configurarTabla();
        listarDocentes();
    }
    
    private void configurarTabla(){
        // Modelo de tabla para mostrar cursos
        modeloDocentes.addColumn("ID");
        modeloDocentes.addColumn("Nombres");
        modeloDocentes.addColumn("Apellidos");
        modeloDocentes.addColumn("DNI");
        modeloDocentes.addColumn("Especialidad");

        // Seteamos el modelo a la tabla:
        tablaDocentes.setModel(modeloDocentes);
    }

    private void listarDocentes(){
        // Obtener la lista de docentes
        ArrayList<Docente> listaDocentes = AppContext.getDocenteController().obtenerDocentes(); 

        // Limpiar la tabla
        modeloDocentes.setRowCount(0);

        // Insertar cada curso como fila
        for (Docente docente : listaDocentes) {
            Object[] fila = {
                docente.getId(),
                docente.getNombre(),
                docente.getApellido(),
                docente.getDni(),
                docente.getEspecialidad()
            };
            modeloDocentes.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocentes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tablaDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaDocentes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LISTA DE DOCENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDocentes;
    // End of variables declaration//GEN-END:variables
}
