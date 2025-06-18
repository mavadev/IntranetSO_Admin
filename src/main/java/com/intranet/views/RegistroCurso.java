package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Curso;
import com.intranet.models.Docente;
import com.intranet.utils.AlertUtils;
import java.util.ArrayList;

public class RegistroCurso extends javax.swing.JPanel {

    public RegistroCurso() {
        initComponents();
        setearDatos();
    }

    public void setearDatos(){
        // Obtener los docentes
        ArrayList<Docente> listaDocentes = AppContext.getDocenteController().obtenerDocentes();
        
        // Poner los docentes en el combobox
        for (Docente docente : listaDocentes){
            cBoxDocentes.addItem(docente.getNombre());
        }
        
        // Setear los grados
        String[] grados = {"Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto"};
        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(grados));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRegistrarEstudiante = new javax.swing.JButton();
        cBoxDocentes = new javax.swing.JComboBox<>();
        cBoxGrado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre del curso");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel10.setText("Docente");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel15.setText("Descripción");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 210, 30));

        btnRegistrarEstudiante.setBackground(new java.awt.Color(180, 0, 35));
        btnRegistrarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante.setText("REGISTRAR CURSO");
        btnRegistrarEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnRegistrarEstudiante.setPreferredSize(new java.awt.Dimension(320, 40));
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 280, 49));

        jPanel3.add(cBoxDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 450, 30));

        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel3.add(cBoxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 200, 30));

        jLabel7.setText("Grado:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 450, 120));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 590, 450));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("REGISTRO DE CURSO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
        // Obtener valores de formulario
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        int docente_id = cBoxDocentes.getSelectedIndex()+1;
        int grado_id = cBoxGrado.getSelectedIndex()+1;

        // Validacion de campos generales
        if (nombre.isEmpty() || descripcion.isEmpty() || grado_id == 0 || docente_id == 0) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        }
        
        // Creamos el curso
        Curso curso = new Curso(nombre, descripcion, docente_id, grado_id);
        
        // Obtener resultado al registrar el curso
        boolean result = AppContext.getCursoController().registerCurso(curso);

        // En caso no se registre correctamente
        if(result){
            AlertUtils.showSuccess("¡Curso registrado correctamente!");
            limpiarCampos();
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarEstudianteActionPerformed

    private void limpiarCampos(){
        txtNombre.setText("");
        txtDescripcion.setText("");
        cBoxDocentes.setSelectedItem(0);
        cBoxGrado.setSelectedIndex(0);
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JComboBox<String> cBoxDocentes;
    private javax.swing.JComboBox<String> cBoxGrado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
