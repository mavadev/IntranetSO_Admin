package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Curso;
import com.intranet.models.Docente;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.OpcionCombo;

import java.util.ArrayList;

public class RegistroCurso extends javax.swing.JPanel {

    public RegistroCurso() {
        initComponents();
        setearDatos();
    }

    public void setearDatos(){
        // Setear los grados
        cBoxGrado.addItem(new OpcionCombo("G0001", "1er Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0002", "2do Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0003", "3er Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0004", "4er Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0005", "5do Grado"));
        cBoxGrado.addItem(new OpcionCombo("G0006", "6er Grado"));
        
        // Obtener los cursos
        ArrayList<Curso> listaCursos = AppContext.getCursoController().obtenerCursosPorGrado("");
        for (Curso curso : listaCursos){
            cBoxCursos.addItem(new OpcionCombo(curso.getIdGrado(), curso.getNombre()));
        }

        // Obtener los docentes
        ArrayList<Docente> listaDocentes = AppContext.getDocenteController().obtenerDocentes();
        for (Docente docente : listaDocentes){
            cBoxDocentes.addItem(new OpcionCombo(docente.getIdDocente(), docente.getNombres()));
        }
        
        // Setear los grados
        cBoxSecciones.addItem(new OpcionCombo("S0001", "A"));
        cBoxSecciones.addItem(new OpcionCombo("S0002", "B"));
        cBoxSecciones.addItem(new OpcionCombo("S0003", "C"));
        cBoxSecciones.addItem(new OpcionCombo("S0004", "D"));
        
        // Setear las modalidades
        cBoxModalidad.addItem(new OpcionCombo("presencial", "Presencial"));
        cBoxModalidad.addItem(new OpcionCombo("virtual", "Virtual"));
        cBoxModalidad.addItem(new OpcionCombo("mixto", "Mixto"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cBoxGrado = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btnRegistrarCurso = new javax.swing.JButton();
        txtNombreCurso = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cBoxCursos = new javax.swing.JComboBox();
        btnAsignarCurso = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cBoxDocentes = new javax.swing.JComboBox();
        cBoxModalidad = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtAulaCurso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHorarioCurso = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cBoxSecciones = new javax.swing.JComboBox();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Registro del Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre del curso");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel15.setText("Descripción");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel3.add(cBoxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 160, 40));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 120));

        jLabel8.setText("Grado:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        btnRegistrarCurso.setBackground(new java.awt.Color(180, 0, 35));
        btnRegistrarCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCurso.setText("REGISTRAR CURSO");
        btnRegistrarCurso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnRegistrarCurso.setPreferredSize(new java.awt.Dimension(320, 40));
        btnRegistrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCursoActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 390, 49));
        jPanel3.add(txtNombreCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 460, 590));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Asignación de Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Cursos a asignar:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        cBoxCursos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel4.add(cBoxCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 380, 40));

        btnAsignarCurso.setBackground(new java.awt.Color(180, 0, 35));
        btnAsignarCurso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAsignarCurso.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarCurso.setText("ACTUALIZAR CURSO");
        btnAsignarCurso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnAsignarCurso.setPreferredSize(new java.awt.Dimension(320, 40));
        btnAsignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarCursoActionPerformed(evt);
            }
        });
        jPanel4.add(btnAsignarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 390, 49));

        jLabel11.setText("Docente a asignar:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel12.setText("Modalidad:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        cBoxDocentes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel4.add(cBoxDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 380, 40));

        cBoxModalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel4.add(cBoxModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 180, 40));

        jLabel13.setText("Sección:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        jPanel4.add(txtAulaCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 180, 40));

        jLabel14.setText("Aula:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));
        jPanel4.add(txtHorarioCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 180, 40));

        jLabel16.setText("Horario:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        cBoxSecciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        cBoxSecciones.setEnabled(false);
        jPanel4.add(cBoxSecciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 480, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCursoActionPerformed
        // Obtener datos del curso
        String nombre = txtNombreCurso.getText();
        String descripcion = txtDescripcion.getText();
        OpcionCombo gradoSeleccionado = (OpcionCombo) cBoxGrado.getSelectedItem();
        String id_grado = gradoSeleccionado.getId();

        // Validacion de campos generales
        if (nombre.isEmpty() || descripcion.isEmpty()) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        }
        
        // Creamos el curso
        Curso curso = new Curso(nombre, descripcion, id_grado);
        
        // Obtener resultado al registrar el curso
        boolean seRegistro = AppContext.getCursoController().registrarCursoBase(curso);

        // En caso se registre correctamente
        if(seRegistro){
            AlertUtils.showSuccess("Curso registrado correctamente");
            limpiarCampos();
            txtNombreCurso.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarCursoActionPerformed

    private void btnAsignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarCursoActionPerformed

        // Obtener datos del curso
        OpcionCombo cursoSeleccionado = (OpcionCombo) cBoxCursos.getSelectedItem();
        OpcionCombo docenteSeleccionado = (OpcionCombo) cBoxDocentes.getSelectedItem();
        OpcionCombo modalidadSeleccionado = (OpcionCombo) cBoxModalidad.getSelectedItem();
        String id_curso_dictado = cursoSeleccionado.getId();
        String id_docente = docenteSeleccionado.getId();
        String modalidad = modalidadSeleccionado.getId();
        
        String aula = txtAulaCurso.getText();
        String horario = txtHorarioCurso.getText();

        // Validacion de campos generales
        if (aula.isEmpty() || horario.isEmpty()) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        }
        
        // Creamos el curso
        Curso curso = new Curso(id_curso_dictado, id_docente, aula, horario, modalidad);
        
        // Obtener resultado al registrar el curso
        boolean result = AppContext.getCursoController().actualizarCursoDictado(curso);

        // En caso se registre correctamente
        if(result){
            AlertUtils.showSuccess("Curso asignado correctamente");
            limpiarCampos();
        }
    }//GEN-LAST:event_btnAsignarCursoActionPerformed

    private void limpiarCampos(){
        txtNombreCurso.setText("");
        txtDescripcion.setText("");
        cBoxDocentes.setSelectedItem(0);
        cBoxGrado.setSelectedIndex(0);
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarCurso;
    private javax.swing.JButton btnRegistrarCurso;
    private javax.swing.JComboBox cBoxCursos;
    private javax.swing.JComboBox cBoxDocentes;
    private javax.swing.JComboBox cBoxGrado;
    private javax.swing.JComboBox cBoxModalidad;
    private javax.swing.JComboBox cBoxSecciones;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAulaCurso;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtHorarioCurso;
    private javax.swing.JTextField txtNombreCurso;
    // End of variables declaration//GEN-END:variables
}
