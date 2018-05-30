/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lesterarte
 */
public class JRegistros extends javax.swing.JFrame {

    /**
     * Creates new form JRegistros
     */
    public JRegistros() {
        initComponents();
        this.setSize(900,600);
        this.setLocationRelativeTo(this);
        this.setTitle("REGISTROS");
        seleccionarArchivo();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCrearRegistro = new javax.swing.JButton();
        btnModificarRegistro = new javax.swing.JButton();
        btnBorrarRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JPanelTabla = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/crearCamp.png"))); // NOI18N
        btnCrearRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 52, 90, 83));

        btnModificarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/modificarCampo.png"))); // NOI18N
        btnModificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 167, 90, 83));

        btnBorrarRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/borrar formato.png"))); // NOI18N
        btnBorrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 277, 90, 83));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Agregar registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Modificar Registro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 256, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Eliminar Registro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 366, -1, -1));

        javax.swing.GroupLayout JPanelTablaLayout = new javax.swing.GroupLayout(JPanelTabla);
        JPanelTabla.setLayout(JPanelTablaLayout);
        JPanelTablaLayout.setHorizontalGroup(
            JPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        JPanelTablaLayout.setVerticalGroup(
            JPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(JPanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 640, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRegistroActionPerformed
      /*  this.txtNombresCampos.setEnabled(true);
        this.txtNombresCampos.requestFocus();
        this.btnModificarRegistro.setEnabled(false);
        this.btnBorrarRegistro.setEnabled(false);
        this.btnCrearRegistro.setEnabled(false);
        btnGuardarRegistro.setEnabled(false);*/
    }//GEN-LAST:event_btnCrearRegistroActionPerformed

    private void btnModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegistroActionPerformed
      /*  if(cmbCamposDisponibles.getSelectedItem().equals("ID")){
            JOptionPane.showMessageDialog(null,"el Campo: " + cmbCamposDisponibles.getSelectedItem()+
                " no puede ser Modificado");
        }else{
            this.txtNombresCampos.setEnabled(true);
            this.btnModificarRegistro.setEnabled(false);
            this.btnBorrarRegistro.setEnabled(false);
            this.btnCrearRegistro.setEnabled(false);

            //agregar valores del campo seleccionado al Campo
            txtNombresCampos.setText(listaCampos.get(cmbCamposDisponibles.getSelectedIndex()).getFieldName());
            listaCampos.remove(cmbCamposDisponibles.getSelectedIndex());
            camposDisponibles();
            txtNombresCampos.setEnabled(true);
            cmbLlaveSecundaria.setEnabled(true);
            cmbTipoDato.setEnabled(true);
            txtNombresCampos.requestFocus();
        }*/
    }//GEN-LAST:event_btnModificarRegistroActionPerformed

    private void btnBorrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroActionPerformed
        
    }//GEN-LAST:event_btnBorrarRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(JRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JRegistros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JRegistros().setVisible(true);
            }
        });
    }
    public void seleccionarArchivo(){
        File path = new File("tables");
        String[] listaArchivos = path.list();
        JComboBox cmbJOptionPane = new JComboBox(listaArchivos);
        JOptionPane.showMessageDialog( null, cmbJOptionPane, "Mostrar Datos Archivo", JOptionPane.QUESTION_MESSAGE);
          
    }
    public void crearTabla(){
        DefaultTableModel crearTabla = new DefaultTableModel();        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelTabla;
    private javax.swing.JButton btnBorrarRegistro;
    private javax.swing.JButton btnCrearRegistro;
    private javax.swing.JButton btnModificarRegistro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
    private JTable tabla;
}
