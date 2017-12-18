/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Helper;
import Controlador.Registro;
import Modelo.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class ModificarEmpleado extends javax.swing.JFrame {
    private static ModificarEmpleado ventana = null;
    /**
     * Creates new form ModificarEmpleado
     */
    
    Registro registro = new Registro();
    
    private ModificarEmpleado(Empleado empleado) {
        initComponents();
        setVisible(true);
        int indexCiv = 0;
        if (empleado.getEstCivil().equalsIgnoreCase("c")){
            indexCiv = 1;
        }
        if (empleado.getEstCivil().equalsIgnoreCase("s")){
            indexCiv = 2;
        }
        if (empleado.getEstCivil().equalsIgnoreCase("v")){
            indexCiv = 3;
        }
        
        jTFCodigo.setText(String.valueOf(empleado.getCodigo()));
        jTFRut.setText(empleado.getRut());
        jTFNombre.setText(empleado.getNombre());
        jTFApellido.setText(empleado.getApellido());
        jTFCelular.setText(String.valueOf(empleado.getCelular()));
        jTFEmail.setText(empleado.getEmail());
        jTFSueldo.setText(String.valueOf(empleado.getSueldoBruto()));
        jCBEstCivil.setSelectedIndex(indexCiv);
        jCBDepartamento.setSelectedItem(empleado.getNomDepto());
        jTFCodigo.setEditable(false);
    }
    
    public static ModificarEmpleado getInstance(Empleado empleado){
        if(ventana==null){
            ventana = new ModificarEmpleado(empleado);
        }
        return ventana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBCancelar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFRut = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFCelular = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jTFSueldo = new javax.swing.JTextField();
        jCBEstCivil = new javax.swing.JComboBox<>();
        jCBDepartamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Cancel_48px_1.png"))); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Ok_48px_2.png"))); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jBCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBModificar)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Codigo");

        jLabel2.setText("Rut");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Celular");

        jLabel6.setText("E-Mail");

        jLabel7.setText("Sueldo");

        jLabel8.setText("Estado civil");

        jLabel9.setText("Departamento");

        jCBEstCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion", "Casado", "Soltero", "Viudo" }));

        jCBDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion", "Finanzas", "Redes", "Informatica", "Administracion", "Bienestar" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFRut, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                    .addComponent(jTFCodigo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBEstCivil, 0, 223, Short.MAX_VALUE)
                                    .addComponent(jCBDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCBEstCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCBDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
        ventana = null;
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String estadoCivil = "", nomDepto = "";
        if (jCBEstCivil.getItemAt(jCBEstCivil.getSelectedIndex()).equalsIgnoreCase("elija una opcion")) {
            estadoCivil = "";
        } else {
            estadoCivil = jCBEstCivil.getItemAt(jCBEstCivil.getSelectedIndex()).substring(0, 1);
        }

        if (jCBDepartamento.getItemAt(jCBDepartamento.getSelectedIndex()).equalsIgnoreCase("elija una opcion")) {
            nomDepto = "";
        } else {
            nomDepto = jCBDepartamento.getItemAt(jCBDepartamento.getSelectedIndex());
        }

        Helper.limpiar();
        Helper.validaInt("Codigo", jTFCodigo.getText(), 1, 99, true);
        Helper.validaString("Rut", jTFRut.getText(), 3, 9, true);
        Helper.validaString("Nombre", jTFNombre.getText(), 3, 50, true);
        Helper.validaString("Apellido", jTFApellido.getText(), 3, 50, true);
        Helper.validaInt("Celular", jTFCelular.getText(), 100000000, 999999999, true);
        Helper.validaString("Email", jTFEmail.getText(), 6, 50, true);
        Helper.validaInt("Sueldo", jTFSueldo.getText(), 1, 5000000, true);
        Helper.validaString("Estado Civil", estadoCivil, 1, 2, true);
        Helper.validaString("Departamento", nomDepto, 3, 30, true);

        if (Helper.verificaciones()) {
            Empleado empleado = new Empleado();
            empleado.setCodigo(Integer.parseInt(jTFCodigo.getText()));
            empleado.setRut(jTFRut.getText());
            empleado.setNombre(jTFNombre.getText());
            empleado.setApellido(jTFApellido.getText());
            empleado.setCelular(Integer.parseInt(jTFCelular.getText()));
            empleado.setEmail(jTFEmail.getText());
            empleado.setSueldoBruto(Integer.parseInt(jTFSueldo.getText()));
            empleado.setEstCivil(estadoCivil);
            empleado.setNomDepto(nomDepto);
            if (registro.modificarEmpleado(empleado, jTFCodigo.getText())) {
                JOptionPane.showMessageDialog(this, "Empleado Modificado");
            } else {
                JOptionPane.showMessageDialog(this, "No agregado - Error: codigo duplicado ");

            }
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox<String> jCBDepartamento;
    private javax.swing.JComboBox<String> jCBEstCivil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCelular;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFRut;
    private javax.swing.JTextField jTFSueldo;
    // End of variables declaration//GEN-END:variables
}
