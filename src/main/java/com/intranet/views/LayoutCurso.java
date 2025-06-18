package com.intranet.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class LayoutCurso extends javax.swing.JPanel {

    public LayoutCurso() {
        initComponents();
        RegistroCurso registroPanel = new RegistroCurso();
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

        btnCrearCurso = new javax.swing.JButton();
        btnListarCursos = new javax.swing.JButton();
        contentCurso = new javax.swing.JPanel();

        btnCrearCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearCurso.setText("Crear Curso");
        btnCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCursoActionPerformed(evt);
            }
        });

        btnListarCursos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListarCursos.setText("Lista de Cursos");
        btnListarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCursosActionPerformed(evt);
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
                        .addComponent(btnCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed
        RegistroCurso registroPanel = new RegistroCurso();
        ShowPanel(registroPanel);
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnListarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCursosActionPerformed
        ListaCursos listaPanel = new ListaCursos();
        ShowPanel(listaPanel);
    }//GEN-LAST:event_btnListarCursosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnListarCursos;
    private javax.swing.JPanel contentCurso;
    // End of variables declaration//GEN-END:variables
}
