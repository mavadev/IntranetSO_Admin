package com.intranet.views;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import com.intranet.app.AppContext;
import com.intranet.models.Usuario;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Validador;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginView extends JFrame {

    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fields = new javax.swing.JPanel();
        correo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        contraseña = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        img = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Autenticación de Usuario");
        setPreferredSize(new java.awt.Dimension(100, 100));

        background.setLayout(new java.awt.GridLayout(1, 0));

        title.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Ingrese al sistema de administración ");
        title.add(jLabel3, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Iniciar Sesión");
        title.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout(0, 10));

        fields.setLayout(new java.awt.BorderLayout(0, 20));

        correo.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Correo electrónico");
        correo.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        txtCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCorreo.setToolTipText("Ingresa tu correo");
        txtCorreo.setPreferredSize(new java.awt.Dimension(360, 47));
        correo.add(txtCorreo, java.awt.BorderLayout.PAGE_END);

        fields.add(correo, java.awt.BorderLayout.PAGE_START);

        contraseña.setLayout(new java.awt.BorderLayout(0, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Contraseña");
        contraseña.add(jLabel4, java.awt.BorderLayout.CENTER);

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContraseña.setPreferredSize(new java.awt.Dimension(361, 47));
        contraseña.add(txtContraseña, java.awt.BorderLayout.PAGE_END);

        fields.add(contraseña, java.awt.BorderLayout.CENTER);

        jPanel1.add(fields, java.awt.BorderLayout.PAGE_START);

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
        jPanel1.add(btnIngresar, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(form);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin.png"))); // NOI18N

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
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        background.add(img);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1096, 729));
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
        String resultadoContraseña = Validador.esPasswordSegura(password);
        if (!resultadoContraseña.equals("OK")) {
            AlertUtils.showWarning(resultadoContraseña);
            return;
        }

        // Obtener resultado de autenticar usuario
        Usuario usuario = AppContext.getUsuarioController().login(correo, password);

        // En caso encuentre el usuario
        if(usuario != null){
            AlertUtils.showSuccess("Bienvenido "+usuario.getNombre()+"!");
            new DashboardAdmin().setVisible(true);
            this.setVisible(false);
        } 
        // Si no encuentra el usuario
        else {
            AlertUtils.showMessage("Credenciales incorrectas");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    public static void main(String args[]) throws UnsupportedLookAndFeelException {        
        UIManager.setLookAndFeel( new FlatMacLightLaf());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPanel contraseña;
    private javax.swing.JPanel correo;
    private javax.swing.JPanel fields;
    private javax.swing.JPanel form;
    private javax.swing.JPanel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel title;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
