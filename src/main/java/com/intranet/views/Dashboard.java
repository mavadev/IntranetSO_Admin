package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Curso;
import com.intranet.models.Docente;
import com.intranet.models.Estudiante;
import java.util.ArrayList;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        obtenerDatosDashboard();
    }
    
    private void obtenerDatosDashboard(){
        // Obtenemos los cursos de la DB
        ArrayList<Curso> cursos = AppContext.getCursoController().obtenerCursos();
        
        // Obtenemos los docentes de la DB
        ArrayList<Docente> docentes = AppContext.getDocenteController().obtenerDocentes();

        // Obtenemos los grados de la DB
        ArrayList<Estudiante> estudiantes = AppContext.getEstudianteController().obtenerEstudiantes();

        // Seteamos los valores a los labels
        txtCantCursos.setText(cursos.size()+ " curso(s)");
        txtCantDocentes.setText(docentes.size()+ " docente(s)");
        txtCantEstudiantes.setText(estudiantes.size()+ " estudiante(s)");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BuscarCursoAdmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Profesor7 = new javax.swing.JLabel();
        Profesor20 = new javax.swing.JLabel();
        Profesor21 = new javax.swing.JLabel();
        Profesor22 = new javax.swing.JLabel();
        Profesor23 = new javax.swing.JLabel();
        Profesor24 = new javax.swing.JLabel();
        Profesor25 = new javax.swing.JLabel();
        Profesor26 = new javax.swing.JLabel();
        Profesor27 = new javax.swing.JLabel();
        Profesor28 = new javax.swing.JLabel();
        btnvermas = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        Profesor4 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        profesorncurso2 = new javax.swing.JLabel();
        Profesor3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        curso3 = new javax.swing.JLabel();
        curso2 = new javax.swing.JLabel();
        Profesor1 = new javax.swing.JLabel();
        profesorncurso3 = new javax.swing.JLabel();
        Profesor2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        profesorncurso = new javax.swing.JLabel();
        Profesor15 = new javax.swing.JLabel();
        curso1 = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iconprofe4 = new javax.swing.JLabel();
        iconprofe1 = new javax.swing.JLabel();
        iconprofe2 = new javax.swing.JLabel();
        iconprofe3 = new javax.swing.JLabel();
        txtCantDocentes = new javax.swing.JLabel();
        txtCantCursos = new javax.swing.JLabel();
        txtCantEstudiantes = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1054, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N

        jTextField1.setText("Busca tus cursos");
        jTextField1.setBorder(null);

        BuscarCursoAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Estudiantes");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Profesor7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor7.setText("Matematica");

        Profesor20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor20.setText("1er Grado:");

        Profesor21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor21.setText("Docente: Juan Pablo ");

        Profesor22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor22.setText("20 estudiantes");

        Profesor23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor23.setText("2do Grado:");

        Profesor24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor24.setText("Docente: Juan Pablo ");

        Profesor25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor25.setText("20 estudiantes");

        Profesor26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor26.setText("3er Grado:");

        Profesor27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor27.setText("Docente: Juan Pablo ");

        Profesor28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Profesor28.setText("20 estudiantes");

        btnvermas.setText("Ver más");

        btneditar.setText("Editar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Profesor21, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor22, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor23, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor24, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor25, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor26, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor27, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Profesor28, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Profesor7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btneditar)
                .addGap(18, 18, 18)
                .addComponent(btnvermas)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Profesor7)
                .addGap(36, 36, 36)
                .addComponent(Profesor20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesor21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesor22)
                .addGap(43, 43, 43)
                .addComponent(Profesor23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesor24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesor25)
                .addGap(42, 42, 42)
                .addComponent(Profesor26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesor27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Profesor28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvermas)
                    .addComponent(btneditar))
                .addGap(15, 15, 15))
        );

        Profesor4.setText("Juan Pablo Lopez Torres");

        d2.setText("Breve descripción del ");

        profesorncurso2.setText("Juan Pablo Lopez Torres");

        Profesor3.setText("Juan Pablo Lopez Torres");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Docentes");

        curso3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        curso3.setText("Geometria");

        curso2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        curso2.setText("Comunicación");

        Profesor1.setText("Juan Pablo Lopez Torres");

        profesorncurso3.setText("Juan Pablo Lopez Torres");

        Profesor2.setText("Juan Pablo Lopez Torres");

        d3.setText("Breve descripción del ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Cursos");

        profesorncurso.setText("Juan Pablo Lopez Torres");

        Profesor15.setText("Juan Pablo Lopez Torres");

        curso1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        curso1.setText("Matematica");

        d1.setText("Breve descripción del ");

        iconprofe4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenprofesor.png"))); // NOI18N

        iconprofe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenprofesor.png"))); // NOI18N

        iconprofe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenprofesor.png"))); // NOI18N

        iconprofe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenprofesor.png"))); // NOI18N

        txtCantDocentes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCantDocentes.setText("20 docentes");

        txtCantCursos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCantCursos.setText("20 cursos");

        txtCantEstudiantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCantEstudiantes.setText("20 estudiantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(344, 344, 344)
                        .addComponent(jLabel1))
                    .addComponent(BuscarCursoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(txtCantDocentes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(iconprofe1)
                        .addGap(45, 45, 45)
                        .addComponent(iconprofe2)
                        .addGap(55, 55, 55)
                        .addComponent(iconprofe3)
                        .addGap(55, 55, 55)
                        .addComponent(iconprofe4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Profesor1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Profesor2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(Profesor3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(Profesor4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61)
                        .addComponent(txtCantCursos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(curso1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(curso2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(curso3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Profesor15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profesorncurso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(125, 125, 125)
                        .addComponent(profesorncurso2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(profesorncurso3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(txtCantEstudiantes))
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarCursoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantDocentes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconprofe1)
                    .addComponent(iconprofe2)
                    .addComponent(iconprofe3)
                    .addComponent(iconprofe4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profesor1)
                    .addComponent(Profesor2)
                    .addComponent(Profesor3)
                    .addComponent(Profesor4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantCursos))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(curso1)
                    .addComponent(curso2)
                    .addComponent(curso3))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(d1)
                    .addComponent(d2)
                    .addComponent(d3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profesor15)
                    .addComponent(profesorncurso)
                    .addComponent(profesorncurso2)
                    .addComponent(profesorncurso3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(txtCantEstudiantes)
                .addGap(86, 86, 86))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarCursoAdmin;
    private javax.swing.JLabel Profesor1;
    private javax.swing.JLabel Profesor15;
    private javax.swing.JLabel Profesor2;
    private javax.swing.JLabel Profesor20;
    private javax.swing.JLabel Profesor21;
    private javax.swing.JLabel Profesor22;
    private javax.swing.JLabel Profesor23;
    private javax.swing.JLabel Profesor24;
    private javax.swing.JLabel Profesor25;
    private javax.swing.JLabel Profesor26;
    private javax.swing.JLabel Profesor27;
    private javax.swing.JLabel Profesor28;
    private javax.swing.JLabel Profesor3;
    private javax.swing.JLabel Profesor4;
    private javax.swing.JLabel Profesor7;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnvermas;
    private javax.swing.JLabel curso1;
    private javax.swing.JLabel curso2;
    private javax.swing.JLabel curso3;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel iconprofe1;
    private javax.swing.JLabel iconprofe2;
    private javax.swing.JLabel iconprofe3;
    private javax.swing.JLabel iconprofe4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel profesorncurso;
    private javax.swing.JLabel profesorncurso2;
    private javax.swing.JLabel profesorncurso3;
    private javax.swing.JLabel txtCantCursos;
    private javax.swing.JLabel txtCantDocentes;
    private javax.swing.JLabel txtCantEstudiantes;
    // End of variables declaration//GEN-END:variables
}
