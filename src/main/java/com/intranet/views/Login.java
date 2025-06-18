package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Administrador;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Validador;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background8 = new javax.swing.JPanel();
        form8 = new javax.swing.JPanel();
        title8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        fields8 = new javax.swing.JPanel();
        correo8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        contraseña8 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        img = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sistema de Administración");

        background8.setLayout(new java.awt.GridLayout(1, 0));

        title8.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel34.setText("Ingrese al sistema de administración ");
        title8.add(jLabel34, java.awt.BorderLayout.CENTER);

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel35.setText("Iniciar Sesión");
        title8.add(jLabel35, java.awt.BorderLayout.PAGE_START);

        jPanel9.setLayout(new java.awt.BorderLayout(0, 10));

        fields8.setLayout(new java.awt.BorderLayout(0, 20));

        correo8.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel36.setText("Correo electrónico");
        correo8.add(jLabel36, java.awt.BorderLayout.PAGE_START);

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setToolTipText("Ingresa tu correo");
        txtCorreo.setPreferredSize(new java.awt.Dimension(360, 47));
        correo8.add(txtCorreo, java.awt.BorderLayout.PAGE_END);

        fields8.add(correo8, java.awt.BorderLayout.PAGE_START);

        contraseña8.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel37.setText("Contraseña");
        contraseña8.add(jLabel37, java.awt.BorderLayout.CENTER);

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContraseña.setPreferredSize(new java.awt.Dimension(361, 47));
        contraseña8.add(txtContraseña, java.awt.BorderLayout.PAGE_END);

        fields8.add(contraseña8, java.awt.BorderLayout.CENTER);

        jPanel9.add(fields8, java.awt.BorderLayout.PAGE_START);

        btnIngresar.setBackground(new java.awt.Color(113, 0, 4));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setPreferredSize(new java.awt.Dimension(361, 49));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel9.add(btnIngresar, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout form8Layout = new javax.swing.GroupLayout(form8);
        form8.setLayout(form8Layout);
        form8Layout.setHorizontalGroup(
            form8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, form8Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addGroup(form8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        form8Layout.setVerticalGroup(
            form8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(form8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background8.add(form8);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_login.png"))); // NOI18N

        javax.swing.GroupLayout imgLayout = new javax.swing.GroupLayout(img);
        img.setLayout(imgLayout);
        imgLayout.setHorizontalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        imgLayout.setVerticalGroup(
            imgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background8.add(img);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background8, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1296, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // Obtener valores de formulario
        String correo = txtCorreo.getText();
        String password = new String(txtContraseña.getPassword());

        // Validacion de campos generales
        if (correo.isEmpty() || password.isEmpty()) {
            AlertUtils.showWarning("Todos los campos son obligatorios");
            return;
        }

        // Validación de campos individuales
        String resultadoCorreo = Validador.esCorreoValido(correo);
        if (!resultadoCorreo.equals("OK")) {
            AlertUtils.showWarning(resultadoCorreo);
            return;
        }
        boolean passwordValido = Validador.esPasswordValido(password);
        if (!passwordValido) {
            AlertUtils.showWarning("Debe ser un password válido");
            return;
        }

        // Obtener resultado de autenticar usuario
        Administrador admin = AppContext.getAdministradorController().login(correo, password);

        // En caso encuentre el administrador
        if(admin != null){
            AlertUtils.showSuccess("Bienvenido "+admin.getNombre()+"!");

            new Layout().setVisible(true);
            this.setVisible(false);
        }
        else {
            AlertUtils.showMessage("Credenciales incorrectas");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background8;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel contraseña8;
    private javax.swing.JPanel correo8;
    private javax.swing.JPanel fields8;
    private javax.swing.JPanel form8;
    private javax.swing.JPanel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel title8;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
