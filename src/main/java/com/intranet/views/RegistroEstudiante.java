package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Apoderado;
import com.intranet.models.Estudiante;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Format;
import com.intranet.utils.Validador;
import java.time.LocalDate;

public class RegistroEstudiante extends javax.swing.JPanel {

    public RegistroEstudiante() {
        initComponents();
        setearGradosSecciones();
    }

    public void setearGradosSecciones(){
        // Setear los grados
        String[] grados = {"Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto"};
        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(grados));
        
        // Setear los grados
        String[] secciones = {"A", "B", "C", "D"};
        cBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(secciones));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        cBoxGrado = new javax.swing.JComboBox<>();
        cBoxSeccion = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreApoderado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCelularApoderado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDNIApoderado = new javax.swing.JTextField();
        txtApellidoApoderado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarEstudiante = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("REGISTRO DE ESTUDANTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 269, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del estudiante", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Fecha de Nacimiento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 180, -1));

        jLabel6.setText("Nombres");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, -1));

        jLabel7.setText("Grado:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel10.setText("Correo Personal:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, 270, 30));

        jLabel15.setText("Dirección:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 360, 30));

        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel3.add(cBoxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 130, 30));

        cBoxSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Seleccione una opción---", "1", "2", "3" }));
        jPanel3.add(cBoxSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 130, 30));

        jLabel9.setText("Seccion");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 200, -1));

        jLabel17.setText("Apellidos");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));
        jPanel3.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 270, 30));

        jLabel3.setText("Nro DNI:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 290));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del apoderado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(670, 121));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombres");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel2.add(txtNombreApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, -1));

        jLabel12.setText("Teléfono Celular:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));
        jPanel2.add(txtCelularApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 150, -1));

        jLabel16.setText("Nro DNI:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));
        jPanel2.add(txtDNIApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 130, -1));
        jPanel2.add(txtApellidoApoderado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 160, -1));

        jLabel4.setText("Apellidos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 740, -1));

        btnRegistrarEstudiante.setBackground(new java.awt.Color(180, 0, 35));
        btnRegistrarEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante.setText("REGISTRAR ESTUDIANTE");
        btnRegistrarEstudiante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnRegistrarEstudiante.setPreferredSize(new java.awt.Dimension(320, 40));
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 280, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
        // Obtener datos de Apoderado
        String nombreApoderado = txtNombreApoderado.getText();
        String apellidoApoderado = txtApellidoApoderado.getText();
        String celularApoderado = txtCelularApoderado.getText();
        String dniApoderado = txtDNIApoderado.getText();

        // Validar valores de apoderado
        if (nombreApoderado.isEmpty() || apellidoApoderado.isEmpty() || celularApoderado.isEmpty() || dniApoderado.isEmpty()) {
            AlertUtils.showWarning("Todos los campos del apoderado son obligatorios");
            return;
        }

        // Registrar Apoderado
        Apoderado apoderado = AppContext.getApoderadoController().registerApoderado(new Apoderado(nombreApoderado, apellidoApoderado, celularApoderado, dniApoderado));
        
        // Obtener datos de Estudiante
        String correoEstudiante = txtCorreo.getText();

        String nombreEstudiante = txtNombre.getText();
        String apellidoEstudiante = txtApellido.getText();
        String fechaStr = txtFecha.getText();
        String dniEstudiante = txtDNI.getText();
        String direccion = txtDireccion.getText();
        int grado_id = cBoxGrado.getSelectedIndex()+1;
        int seccion_id = cBoxSeccion.getSelectedIndex()+1;

        // Validacion de campos generales
        if (correoEstudiante.isEmpty() || nombreEstudiante.isEmpty() || apellidoEstudiante.isEmpty() || fechaStr.isEmpty() ||  dniEstudiante.isEmpty() ||
            direccion.isEmpty() ||  grado_id == 0 || seccion_id == 0) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        }
        
        // Validación de campos individuales
        String resultadoCorreo = Validador.esCorreoValido(correoEstudiante);
        if (!resultadoCorreo.equals("OK")) {
            AlertUtils.showWarning(resultadoCorreo);
            return;
        }
        
        // Parseo de string a fecha
        LocalDate fecha = Format.stringToLocalDate(fechaStr);

        // Registrar Estudiante
        String contraseña = dniEstudiante;
        Estudiante estudiante = new Estudiante(correoEstudiante, contraseña, nombreEstudiante, apellidoEstudiante, fecha, dniEstudiante, direccion, grado_id, seccion_id);
        
        boolean result = AppContext.getEstudianteController().registerStudent(estudiante, apoderado.getId());
        
        if(result){
            AlertUtils.showSuccess("¡Estudiante registrado correctamente!");
            limpiarCampos();
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnRegistrarEstudianteActionPerformed

    private void limpiarCampos(){
        txtNombreApoderado.setText("");
        txtApellidoApoderado.setText("");
        txtCelularApoderado.setText("");
        txtDNIApoderado.setText("");
        txtCorreo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFecha.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        cBoxGrado.setSelectedIndex(0);
        cBoxSeccion.setSelectedIndex(0);
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JComboBox<String> cBoxGrado;
    private javax.swing.JComboBox<String> cBoxSeccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoApoderado;
    private javax.swing.JTextField txtCelularApoderado;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDNIApoderado;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreApoderado;
    // End of variables declaration//GEN-END:variables
}
