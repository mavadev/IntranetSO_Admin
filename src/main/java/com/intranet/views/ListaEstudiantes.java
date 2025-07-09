package com.intranet.views;

import com.intranet.app.AppContext;
import com.intranet.models.Estudiante;
import com.intranet.utils.AlertUtils;
import com.intranet.utils.Format;
import com.intranet.utils.OpcionCombo;
import com.intranet.utils.PasswordUtils;
import com.intranet.utils.Validador;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaEstudiantes extends javax.swing.JPanel {
    DefaultTableModel modeloEstudiantes = new DefaultTableModel();
    
    public ListaEstudiantes() {
        initComponents();
        configurarTabla();
        listarEstudiantes("");
        
        modalEditar.setVisible(false);
    }
    
    private void configurarTabla(){
        // Modelo de tabla para mostrar cursos
        modeloEstudiantes.addColumn("ID");
        modeloEstudiantes.addColumn("Nombre Completo");
        modeloEstudiantes.addColumn("Correo Electrónico");
        modeloEstudiantes.addColumn("Grado");
        modeloEstudiantes.addColumn("Seccion");

        // Seteamos el modelo a la tabla:
        tablaEstudiantes.setModel(modeloEstudiantes);
    }

    private void listarEstudiantes(String id_grado){
        // Obtener la lista de docentes
        ArrayList<Estudiante> listaEstudiantes = 
            AppContext.getEstudianteController().obtenerEstudiantesPorGrado(id_grado); 

        // Limpiar la tabla
        modeloEstudiantes.setRowCount(0);

        // Insertar cada curso como fila
        for (Estudiante estudiante : listaEstudiantes) {
            Object[] fila = {
                estudiante.getIdEstudiante(),
                estudiante.getNombres() + " " + estudiante.getApellidos(),
                estudiante.getEmail(),
                Format.numGradoToStrGrado(estudiante.getNumeroGrado()),
                estudiante.getLetraSeccion()
            };
            modeloEstudiantes.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modalEditar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblEditarNombreCompleto = new javax.swing.JLabel();
        lblIdDocente = new javax.swing.JLabel();
        txtEditarNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCerrarModal = new javax.swing.JButton();
        btnEditarDatos = new javax.swing.JButton();
        lblEditarGrado = new javax.swing.JLabel();
        txtEditarApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtEditarIDEstudiante = new javax.swing.JTextField();
        txtEditarDNI = new javax.swing.JTextField();
        txtEditarDireccion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEditarCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEditarPassword = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtEditarGrado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cBoxGrado = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modalEditar.setEnabled(false);
        modalEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_default_avatar.png"))); // NOI18N
        modalEditar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblEditarNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEditarNombreCompleto.setText("Gianmarco Chistama");
        modalEditar.add(lblEditarNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        lblIdDocente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdDocente.setText("0000");
        modalEditar.add(lblIdDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 100, -1));

        txtEditarNombre.setEnabled(false);
        modalEditar.add(txtEditarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 130, 30));

        jLabel6.setText("Nombres");
        modalEditar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        btnCerrarModal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCerrarModal.setText("X");
        btnCerrarModal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarModalActionPerformed(evt);
            }
        });
        modalEditar.add(btnCerrarModal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 41));

        btnEditarDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarDatos.setText("ACTUALIZAR DATOS");
        btnEditarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarDatosActionPerformed(evt);
            }
        });
        modalEditar.add(btnEditarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 220, 41));

        lblEditarGrado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEditarGrado.setText("1er Grado");
        modalEditar.add(lblEditarGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        txtEditarApellidos.setEnabled(false);
        modalEditar.add(txtEditarApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 30));

        jLabel8.setText("Apellidos");
        modalEditar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel9.setText("ID de Estudiante");
        modalEditar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel10.setText("DNI");
        modalEditar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        txtEditarIDEstudiante.setEnabled(false);
        modalEditar.add(txtEditarIDEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 130, 30));

        txtEditarDNI.setEnabled(false);
        modalEditar.add(txtEditarDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 130, 30));

        txtEditarDireccion.setEnabled(false);
        modalEditar.add(txtEditarDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, 30));

        jLabel12.setText("Direccion");
        modalEditar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));
        modalEditar.add(txtEditarCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 130, 30));

        jLabel13.setText("Correo");
        modalEditar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        modalEditar.add(txtEditarPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 130, 30));

        jLabel14.setText("Nueva Contrarseña");
        modalEditar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        txtEditarGrado.setEnabled(false);
        modalEditar.add(txtEditarGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 30));

        jLabel11.setText("Grado");
        modalEditar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        add(modalEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 0, 340, 660));

        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaEstudiantes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 94, 753, 499));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Mostrar por Grado:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 36, -1, -1));

        cBoxGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Todos --", "1er  Grado", "2do Grado", "3er  Grado", "4to  Grado", "5to  Grado", "6to  Grado" }));
        cBoxGrado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxGradoItemStateChanged(evt);
            }
        });
        add(cBoxGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 35, 129, 33));

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 137, 145, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Acciones");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 94, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 196, 145, 41));
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxGradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxGradoItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
            // Obtenemos los estudiantes por grado
            obtenerEstudiantesPorGradoActual();
        }
    }//GEN-LAST:event_cBoxGradoItemStateChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
         // Asignar datos
        int fila = tablaEstudiantes.getSelectedRow();

        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }
        
        // Obtener el ID del registro (primera columna)
        String id_docente = tablaEstudiantes.getValueAt(fila, 0).toString();


        // Llamar a tu método de eliminación en base de datos
        Estudiante estudiante = AppContext.getEstudianteController().obtenerEstudiantePorID(id_docente);
        if(estudiante == null) return;
        
        String grado = Format.numGradoToStrGrado(estudiante.getNumeroGrado());
        
        // Asignar datos a la edicion
        lblEditarNombreCompleto.setText(estudiante.getNombres() + " " + estudiante.getApellidos());
        lblEditarGrado.setText(grado);
        txtEditarIDEstudiante.setText(estudiante.getIdEstudiante());
        txtEditarGrado.setText(grado);
        txtEditarNombre.setText(estudiante.getNombres());
        txtEditarApellidos.setText(estudiante.getApellidos());
        txtEditarDireccion.setText(estudiante.getDireccion());
        txtEditarDNI.setText(estudiante.getDni());
        txtEditarCorreo.setText(estudiante.getEmail());
        
        modalEditar.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtenemos la fila seleccionada
        int fila = tablaEstudiantes.getSelectedRow();

        if (fila == -1) {
            AlertUtils.showWarning("Debes seleccionar un registro de la tabla");
            return;
        }

        // Obtener el ID del registro (primera columna)
        String id_curso = tablaEstudiantes.getValueAt(fila, 0).toString();

        // Confirmacion del usuario
        boolean confirmacion =
        AlertUtils.showConfirm("¿Estás seguro de que deseas eliminar el estudiante con ID: " + id_curso + "?");

        if (confirmacion) {
            // Llamar a tu método de eliminación en base de datos
            boolean seElimino = AppContext.getEstudianteController().eliminarEstudiantePorID(id_curso);

            if (seElimino) {
                JOptionPane.showMessageDialog(this, "Curso eliminado correctamente.");

                // Volvemos a obtener los datos para la actual tabla
                obtenerEstudiantesPorGradoActual();
            } else {
                AlertUtils.showError("Error al eliminar el curso.");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCerrarModalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarModalActionPerformed
        modalEditar.setVisible(false);
    }//GEN-LAST:event_btnCerrarModalActionPerformed

    private void btnEditarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarDatosActionPerformed
        // Obtener los datos
        String idEstudiante = txtEditarIDEstudiante.getText();
        String correo = txtEditarCorreo.getText();
        String nuevoPassword = txtEditarPassword.getText();

        // Validacion de campos generales
        if (idEstudiante.isEmpty() || correo.isEmpty() || nuevoPassword.isEmpty()) {
            AlertUtils.showWarning("Se necesita los nuevos datos para actualizar");
            return;
        }

        // Validación de campos individuales
        String resultadoCorreo = Validador.esCorreoValido(correo);
        if (!resultadoCorreo.equals("OK")) {
            AlertUtils.showWarning(resultadoCorreo);
            return;
        }

        // Hashear password
        String hashedPassword = PasswordUtils.hashPassword(nuevoPassword);

        // Obtener resultado al registrar el docente
        boolean result =
        AppContext.getEstudianteController().actualizarEstudiantePorID(idEstudiante, correo, hashedPassword);

        // En caso no se registre correctamente
        if(result){
            AlertUtils.showSuccess("¡Credenciales actualizadas correctamente!");
            modalEditar.setVisible(false);
        }
    }//GEN-LAST:event_btnEditarDatosActionPerformed

    private void obtenerEstudiantesPorGradoActual(){
        OpcionCombo gradoSeleccionado = (OpcionCombo) cBoxGrado.getSelectedItem();
        String id_grado = gradoSeleccionado.getId();

        // Obtenemos los datos para el grado
        listarEstudiantes(id_grado);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarModal;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarDatos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cBoxGrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEditarGrado;
    private javax.swing.JLabel lblEditarNombreCompleto;
    private javax.swing.JLabel lblIdDocente;
    private javax.swing.JPanel modalEditar;
    private javax.swing.JTable tablaEstudiantes;
    private javax.swing.JTextField txtEditarApellidos;
    private javax.swing.JTextField txtEditarCorreo;
    private javax.swing.JTextField txtEditarDNI;
    private javax.swing.JTextField txtEditarDireccion;
    private javax.swing.JTextField txtEditarGrado;
    private javax.swing.JTextField txtEditarIDEstudiante;
    private javax.swing.JTextField txtEditarNombre;
    private javax.swing.JTextField txtEditarPassword;
    // End of variables declaration//GEN-END:variables
}
