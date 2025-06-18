package com.intranet.views;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class LayoutDocente extends javax.swing.JPanel {

    public LayoutDocente() {
        initComponents();
        RegistroDocente registroPanel = new RegistroDocente();
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

        btnCrearDocente = new javax.swing.JButton();
        btnListarDocentes = new javax.swing.JButton();
        contentCurso = new javax.swing.JPanel();

        btnCrearDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearDocente.setText("Crear Docente");
        btnCrearDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearDocenteActionPerformed(evt);
            }
        });

        btnListarDocentes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListarDocentes.setText("Lista de Docentes");
        btnListarDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDocentesActionPerformed(evt);
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
                        .addComponent(btnCrearDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearDocenteActionPerformed
        RegistroDocente registroPanel = new RegistroDocente();
        ShowPanel(registroPanel);
    }//GEN-LAST:event_btnCrearDocenteActionPerformed

    private void btnListarDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDocentesActionPerformed
        ListaDocentes listaPanel = new ListaDocentes();
        ShowPanel(listaPanel);
    }//GEN-LAST:event_btnListarDocentesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearDocente;
    private javax.swing.JButton btnListarDocentes;
    private javax.swing.JPanel contentCurso;
    // End of variables declaration//GEN-END:variables
}
