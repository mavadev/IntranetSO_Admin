package com.intranet.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Layout extends javax.swing.JFrame {

    public Layout() {
        initComponents();
        Dashboard dashboardPanel = new Dashboard();
        ShowPanel(dashboardPanel);
    }
    
    public void ShowPanel(JPanel panel) {
        panel.setSize(1054, 720);
        panel.setLocation(0,0);

        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        content = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnPrincipal = new javax.swing.JButton();
        btnEstudiantes = new javax.swing.JButton();
        btnDocentes = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Administración");
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1054, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sidebar.setBackground(new java.awt.Color(5, 51, 74));
        sidebar.setPreferredSize(new java.awt.Dimension(220, 720));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_logo.png"))); // NOI18N
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, -1));

        btnLogout.setBackground(new java.awt.Color(5, 51, 74));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_logout.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesión");
        btnLogout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(5, 51, 74)));
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLogout.setIconTextGap(10);
        btnLogout.setOpaque(true);
        btnLogout.setPreferredSize(new java.awt.Dimension(220, 50));
        sidebar.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, -1, -1));

        btnPrincipal.setBackground(new java.awt.Color(5, 51, 74));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_home.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(5, 51, 74)));
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnPrincipal.setIconTextGap(10);
        btnPrincipal.setOpaque(true);
        btnPrincipal.setPreferredSize(new java.awt.Dimension(220, 50));
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        sidebar.add(btnPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        btnEstudiantes.setBackground(new java.awt.Color(5, 51, 74));
        btnEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_user.png"))); // NOI18N
        btnEstudiantes.setText("Estudiantes");
        btnEstudiantes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(5, 51, 74)));
        btnEstudiantes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEstudiantes.setIconTextGap(10);
        btnEstudiantes.setOpaque(true);
        btnEstudiantes.setPreferredSize(new java.awt.Dimension(220, 50));
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });
        sidebar.add(btnEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        btnDocentes.setBackground(new java.awt.Color(5, 51, 74));
        btnDocentes.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnDocentes.setForeground(new java.awt.Color(255, 255, 255));
        btnDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_user.png"))); // NOI18N
        btnDocentes.setText("Docentes");
        btnDocentes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(5, 51, 74)));
        btnDocentes.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDocentes.setIconTextGap(10);
        btnDocentes.setOpaque(true);
        btnDocentes.setPreferredSize(new java.awt.Dimension(220, 50));
        btnDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocentesActionPerformed(evt);
            }
        });
        sidebar.add(btnDocentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        btnCursos.setBackground(new java.awt.Color(5, 51, 74));
        btnCursos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnCursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_courses.png"))); // NOI18N
        btnCursos.setText("Cursos");
        btnCursos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 30, 1, 1, new java.awt.Color(5, 51, 74)));
        btnCursos.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnCursos.setIconTextGap(10);
        btnCursos.setOpaque(true);
        btnCursos.setPreferredSize(new java.awt.Dimension(220, 50));
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });
        sidebar.add(btnCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1296, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        Dashboard dashboardPanel = new Dashboard();
        ShowPanel(dashboardPanel);
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        LayoutEstudiante estudiantePanel = new LayoutEstudiante();
        ShowPanel(estudiantePanel);
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void btnDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocentesActionPerformed
        LayoutDocente docentePanel = new LayoutDocente();
        ShowPanel(docentePanel);
    }//GEN-LAST:event_btnDocentesActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        LayoutCurso cursoPanel = new LayoutCurso();
        ShowPanel(cursoPanel);
    }//GEN-LAST:event_btnCursosActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnDocentes;
    private javax.swing.JButton btnEstudiantes;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
