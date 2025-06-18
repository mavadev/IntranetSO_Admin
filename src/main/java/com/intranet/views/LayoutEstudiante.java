package com.intranet.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class LayoutEstudiante extends javax.swing.JPanel {

    public LayoutEstudiante() {
        initComponents();
        RegistroEstudiante registroPanel = new RegistroEstudiante();
        ShowPanel(registroPanel);
    }

    public void ShowPanel(JPanel panel) {
        panel.setSize(1003, 625);
        panel.setLocation(0,0);

        contentCurso.removeAll();
        contentCurso.add(panel, BorderLayout.CENTER);
        contentCurso.revalidate();
        contentCurso.repaint();
    } 

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearEstudiante = new javax.swing.JButton();
        btnListarEstudiantes = new javax.swing.JButton();
        contentCurso = new javax.swing.JPanel();

        btnCrearEstudiante.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearEstudiante.setText("Crear Estudiante");
        btnCrearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEstudianteActionPerformed(evt);
            }
        });

        btnListarEstudiantes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListarEstudiantes.setText("Lista de Estudiante");
        btnListarEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEstudiantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentCursoLayout = new javax.swing.GroupLayout(contentCurso);
        contentCurso.setLayout(contentCursoLayout);
        contentCursoLayout.setHorizontalGroup(
            contentCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        contentCursoLayout.setVerticalGroup(
            contentCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEstudianteActionPerformed
        RegistroEstudiante registroPanel = new RegistroEstudiante();
        ShowPanel(registroPanel);
    }//GEN-LAST:event_btnCrearEstudianteActionPerformed

    private void btnListarEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEstudiantesActionPerformed
        ListaEstudiantes listaPanel = new ListaEstudiantes();
        ShowPanel(listaPanel);
    }//GEN-LAST:event_btnListarEstudiantesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearEstudiante;
    private javax.swing.JButton btnListarEstudiantes;
    private javax.swing.JPanel contentCurso;
    // End of variables declaration//GEN-END:variables
}
