/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Registro;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private static VentanaPrincipal mainPrincipal = null;//parte principal del patron sigleton
    /**
     * Creates new form VentanaPrincipal
     */
    
    Registro registro = new Registro();
    
    private VentanaPrincipal() {
        initComponents();
        this.setVisible(true);
    }
    
    /**
     * Patron singleton de la ventana principal
     * @return retorna una instancia de la VentanaPrincipal si es que no existe
     */
    public static VentanaPrincipal getInstance(){
        if(mainPrincipal==null){
            mainPrincipal = new VentanaPrincipal();
        }
        return mainPrincipal;
    }
    
    public void mostrarRegistro(){
        String[] columnas = new String[]{"Codigo","Rut","Nombre","Apellido","Celular","Email","Sueldo","Est. Civil","Departamento"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        modelo.setDataVector(registro.listarTodo(), columnas);
        jTRegistro.setModel(modelo);
    }
    
    public void mostrarRegistroDepartamento(String depto){
        String[] columnas = new String[]{"Codigo","Rut","Nombre","Apellido","Celular","Email","Sueldo","Est. Civil","Departamento"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        modelo.setDataVector(registro.listarByDepto(depto), columnas);
        jTRegistro.setModel(modelo);
    }
    
    public void mostrarBusqueda(String cod){
        String[] columnas = new String[]{"Codigo","Rut","Nombre","Apellido","Celular","Email","Sueldo","Est. Civil","Departamento"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        modelo.setDataVector(registro.listarByCodigo(cod), columnas);
        jTRegistro.setModel(modelo);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMIMostrarTodo = new javax.swing.JMenuItem();
        jMenuFiltrar = new javax.swing.JMenu();
        jMRedes = new javax.swing.JMenuItem();
        jMInformatica = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRegistro = new javax.swing.JTable();
        jBAgregar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBElim120 = new javax.swing.JButton();
        jBSueldo10 = new javax.swing.JButton();
        jTFBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMAgregarDepto = new javax.swing.JMenuItem();
        jMCerrar = new javax.swing.JMenuItem();

        jMIMostrarTodo.setText("Mostrar todo");
        jMIMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMostrarTodoActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMIMostrarTodo);

        jMenuFiltrar.setText("Filtrar");

        jMRedes.setText("Redes");
        jMRedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMRedesActionPerformed(evt);
            }
        });
        jMenuFiltrar.add(jMRedes);

        jMInformatica.setText("Informatica");
        jMInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInformaticaActionPerformed(evt);
            }
        });
        jMenuFiltrar.add(jMInformatica);

        jPopupMenu1.add(jMenuFiltrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jTRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Rut", "Nombre", "Apellido", "Celular", "Email", "Sueldo Bruto", "Estado Civil", "Departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTRegistro.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jTRegistro);

        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Add_User_Male_48px.png"))); // NOI18N
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Registration_48px.png"))); // NOI18N
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Denied_48px.png"))); // NOI18N
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBElim120.setText("Borrar:Sueldo=120");
        jBElim120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElim120ActionPerformed(evt);
            }
        });

        jBSueldo10.setText("Actualizar:Sueldos+10%");
        jBSueldo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSueldo10ActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Find_User_Male_48px.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jBAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jBModificar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBSueldo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBElim120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBEliminar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBSueldo10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBElim120))
                            .addComponent(jBModificar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBBuscar)
                                .addComponent(jBAgregar)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        jMAgregarDepto.setText("Agregar Departamento");
        jMenu1.add(jMAgregarDepto);

        jMCerrar.setText("Cerrar");
        jMCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMCerrar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        AgregarEmpleado.getInstance();
        AgregarEmpleado.getInstance().setVisible(true);
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String codMod = JOptionPane.showInputDialog(null,"Ingrese codigo a Modificar");
        ModificarEmpleado.getInstance(registro.getEmpleado(codMod));
        
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jMCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCerrarActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jMCerrarActionPerformed

    private void jBElim120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElim120ActionPerformed
        registro.eliminarBySueldo("120000");
        mostrarRegistro();
    }//GEN-LAST:event_jBElim120ActionPerformed

    private void jBSueldo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSueldo10ActionPerformed
        registro.modificarTodosSueldos("10");
        mostrarRegistro();
    }//GEN-LAST:event_jBSueldo10ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        mostrarRegistro();
    }//GEN-LAST:event_formWindowActivated

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        String buscado = "";
        buscado = jTFBuscar.getText();
        if(buscado.equals("")){
            mostrarRegistro();
        }else{
            mostrarBusqueda(buscado);
        }
        jTFBuscar.setText("");
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        String codE = JOptionPane.showInputDialog(null, "Ingrese el Codigo a Eliminar");
        
        if (registro.eliminarByCodigo(codE)){
            registro.eliminarByCodigo(codE);
            JOptionPane.showMessageDialog(null, "Eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Codigo no Encontrado");
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jMIMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMostrarTodoActionPerformed
        mostrarRegistro();
    }//GEN-LAST:event_jMIMostrarTodoActionPerformed

    private void jMRedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMRedesActionPerformed
        mostrarRegistroDepartamento("Redes");
    }//GEN-LAST:event_jMRedesActionPerformed

    private void jMInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInformaticaActionPerformed
        mostrarRegistroDepartamento("Informatica");
    }//GEN-LAST:event_jMInformaticaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBElim120;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSueldo10;
    private javax.swing.JMenuItem jMAgregarDepto;
    private javax.swing.JMenuItem jMCerrar;
    private javax.swing.JMenuItem jMIMostrarTodo;
    private javax.swing.JMenuItem jMInformatica;
    private javax.swing.JMenuItem jMRedes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTable jTRegistro;
    // End of variables declaration//GEN-END:variables
}
