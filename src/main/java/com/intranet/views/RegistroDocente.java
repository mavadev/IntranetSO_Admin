package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Docente;
import com.intranet.utils.Format;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Validador;
import java.time.LocalDate;

public class RegistroDocente extends javax.swing.JPanel {

    public RegistroDocente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnRegistrarDocente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del docente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(740, 380));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nro DNI:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));
        jPanel3.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 150, -1));

        jLabel5.setText("Fecha de Nacimiento:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 150, -1));

        jLabel6.setText("Nombres");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, -1));

        jLabel10.setText("Correo Personal:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, -1));

        jLabel11.setText("Teléfono Celular:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));
        jPanel3.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 150, -1));

        jLabel15.setText("Especialidad");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel3.add(txtEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 390, -1));

        btnRegistrarDocente.setBackground(new java.awt.Color(180, 0, 35));
        btnRegistrarDocente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarDocente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarDocente.setText("REGISTRAR DOCENTE");
        btnRegistrarDocente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnRegistrarDocente.setPreferredSize(new java.awt.Dimension(320, 40));
        btnRegistrarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDocenteActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegistrarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 280, 49));

        jLabel7.setText("Apellidos");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 160, -1));
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, -1));

        jLabel12.setText("Direccion");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("REGISTRO DE DOCENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

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

    private void btnRegistrarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDocenteActionPerformed
        // Obtener los datos
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String correo = txtCorreo.getText();
        String dni = txtDNI.getText();
        String direccion = txtDireccion.getText();
        String celular = txtCelular.getText();
        String especialidad = txtEspecialidad.getText();
        String fechaStr = txtFecha.getText();

        // Validacion de campos generales
        if (nombre.isEmpty() || fechaStr.isEmpty() ||  dni.isEmpty() ||  correo.isEmpty() ||
            celular.isEmpty() ||  especialidad.isEmpty()) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        }
        
        // Convertimos la fecha a LocalDate
        LocalDate fecha = Format.stringToLocalDate(fechaStr);

        // Validación de campos individuales
        String resultadoCorreo = Validador.esCorreoValido(correo);
        if (!resultadoCorreo.equals("OK")) {
            AlertUtils.showWarning(resultadoCorreo);
            return;
        }
        
        // Creamos el docente
        Docente docente = new Docente(correo, dni, nombre, apellido, dni, celular, direccion, especialidad, fecha);

        // Obtener resultado al registrar el docente
        boolean result = AppContext.getDocenteController().registerDocente(docente);

        // En caso no se registre correctamente
        if(result){
            AlertUtils.showSuccess("¡Docente registrado correctamente!");
            limpiarCampos();
            txtNombre.setText("");
        }
    }//GEN-LAST:event_btnRegistrarDocenteActionPerformed

    private void limpiarCampos(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtDNI.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtEspecialidad.setText("");
        txtFecha.setText("");
    } 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarDocente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
