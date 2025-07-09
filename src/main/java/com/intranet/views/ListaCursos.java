package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Curso;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Format;
import com.intranet.utils.OpcionCombo;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaCursos extends javax.swing.JPanel {
    DefaultTableModel modeloCursos = new DefaultTableModel();
    
    public ListaCursos() {
        initComponents();
        setearDatos();
        configurarTabla();
        listarCursos("");
    }
    
    private void setearDatos(){
        cBoxGrado.addItem(new OpcionCombo("G0001", "1er Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0002", "2do Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0003", "3er Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0004", "4er Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0005", "5do Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0006", "6er Grado"));
    }
    
    private void configurarTabla(){
        // Modelo de tabla para mostrar cursos
        modeloCursos.addColumn("ID");
        modeloCursos.addColumn("Nombre del Curso");
        modeloCursos.addColumn("Descripción");
        modeloCursos.addColumn("Grado");

        // Seteamos el modelo a la tabla:
        tablaCursos.setModel(modeloCursos);
    }

    private void listarCursos(String id_grado){
        // Obtener la lista de cursos
        ArrayList<Curso> listaCursos = AppContext.getCursoController().obtenerCursosPorGrado(id_grado); 

        // Limpiar la tabla
        modeloCursos.setRowCount(0);

        // Insertar cada curso como fila
        for (Curso curso : listaCursos) {
            Object[] fila = {
                curso.getIdCursoBase(),
                curso.getNombre(),
                curso.getDescripcion(),
                Format.numGradoToStrGrado(curso.getNumGrado()),
            };
            modeloCursos.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursos = new javax.swing.JTable();
        cBoxGrado = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        tablaCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCursos);

        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Todos --", "1er  Grado", "2do Grado", "3er  Grado", "4to  Grado", "5to  Grado", "6to  Grado" }));
        cBoxGrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxGradoItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mostrar por Grado:");

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Acciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cBoxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxGradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxGradoItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
            obtenerCursosPorGradoActual();
        }
    }//GEN-LAST:event_cBoxGradoItemStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtenemos la fila seleccionada
        int fila = tablaCursos.getSelectedRow();

        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }

        // Obtener el ID del registro (primera columna)
        String id_curso = tablaCursos.getValueAt(fila, 0).toString();

        // Confirmacion del usuario
        boolean confirmacion =
        AlertUtils.showConfirm("¿Estás seguro de que deseas eliminar el curso con ID: " + id_curso + "?");

        if (confirmacion) {
            // Llamar a tu método de eliminación en base de datos
            boolean seElimino = AppContext.getCursoController().eliminarCursoPorID(id_curso);

            if (seElimino) {
                JOptionPane.showMessageDialog(this, "Curso eliminado correctamente.");

                // Volvemos a obtener los datos para la actual tabla
                obtenerCursosPorGradoActual();
            } else {
                AlertUtils.showError("Error al eliminar el curso.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void obtenerCursosPorGradoActual(){
        OpcionCombo gradoSeleccionado = (OpcionCombo) cBoxGrado.getSelectedItem();
        String id_grado = gradoSeleccionado.getId();

        // Obtenemos los datos para el grado
        listarCursos(id_grado);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox cBoxGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCursos;
    // End of variables declaration//GEN-END:variables
}
