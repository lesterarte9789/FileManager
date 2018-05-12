/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author MerryGoRound
 */
public class Archivo extends javax.swing.JFrame {

    
    public Archivo() {
        
        
        initComponents();
        this.setLocationRelativeTo(this);
        //se mueve al directorio adondese encuentran los archivos
        refreshModel();
    }
    
    public void refreshModel(){
        File path = new File("tables");
        String[] listaArchivos = path.list();
        this.cmbarchivosDisponibles.removeAllItems();
        for (String listaArchivo : listaArchivos) {
            this.cmbarchivosDisponibles.addItem(listaArchivo);
        }
        if(this.cmbarchivosDisponibles.getItemCount() == 0){
            this.cmbarchivosDisponibles.setEnabled(false);
        }else{
            this.cmbarchivosDisponibles.setEnabled(true);
        }    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        txtnuevoArchivo = new javax.swing.JTextField();
        btnnuevoArchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbarchivosDisponibles = new javax.swing.JComboBox<>();
        lblSeleccionarArchivoBorrar = new javax.swing.JLabel();
        lblSeleccionarArchivoBorrar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("principal"); // NOI18N

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtnuevoArchivo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtnuevoArchivo.setEnabled(false);
        txtnuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnuevoArchivoActionPerformed(evt);
            }
        });
        txtnuevoArchivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnuevoArchivoKeyReleased(evt);
            }
        });

        btnnuevoArchivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnuevoArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/nuevo.png"))); // NOI18N
        btnnuevoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoArchivoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ARCHIVOS DISPONIBLES");

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/delete.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NUEVO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("BORRAR");

        cmbarchivosDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbarchivosDisponiblesActionPerformed(evt);
            }
        });

        lblSeleccionarArchivoBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSeleccionarArchivoBorrar.setForeground(new java.awt.Color(255, 51, 51));
        lblSeleccionarArchivoBorrar.setText("Parar Borrar seleccione");
        lblSeleccionarArchivoBorrar.setToolTipText("");

        lblSeleccionarArchivoBorrar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSeleccionarArchivoBorrar1.setForeground(new java.awt.Color(255, 51, 51));
        lblSeleccionarArchivoBorrar1.setText("un Archivo");
        lblSeleccionarArchivoBorrar1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbarchivosDisponibles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeleccionarArchivoBorrar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(lblSeleccionarArchivoBorrar1)))))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnnuevoArchivo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtnuevoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(279, 279, 279)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(310, 310, 310))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnnuevoArchivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbarchivosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(lblSeleccionarArchivoBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSeleccionarArchivoBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(txtnuevoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoArchivoActionPerformed
        this.btnEliminar.setEnabled(false);
        this.txtnuevoArchivo.setEnabled(true);
        this.btnnuevoArchivo.setEnabled(false);
        
    }//GEN-LAST:event_btnnuevoArchivoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        File temporalNuevo = new File("tables\\"+this.txtnuevoArchivo.getText() + ".txt");
        
        if(temporalNuevo.exists()){
            JOptionPane.showMessageDialog(null,"El archivo ya existe!!");
            this.txtnuevoArchivo.setText("");
            this.txtnuevoArchivo.setEnabled(false);
            this.btnAceptar.setEnabled(false);
            this.btnnuevoArchivo.setEnabled(true);
            this.btnEliminar.setEnabled(true);
        }else{
            try {
                FileWriter guardarArchivo = new FileWriter(temporalNuevo);
                guardarArchivo.close();
            }catch (Exception e) {
               }
            JOptionPane.showMessageDialog(null,"Archivo Agregado Exitosamente");
            
            refreshModel();
            this.txtnuevoArchivo.setText("");
            this.txtnuevoArchivo.setEnabled(false);
            this.btnAceptar.setEnabled(false);
            this.btnnuevoArchivo.setEnabled(true);
            this.btnEliminar.setEnabled(true);
            
        }   
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtnuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnuevoArchivoActionPerformed
        
    }//GEN-LAST:event_txtnuevoArchivoActionPerformed

    private void txtnuevoArchivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuevoArchivoKeyReleased
        this.btnAceptar.setEnabled(this.txtnuevoArchivo.getText().length()!=0);
    }//GEN-LAST:event_txtnuevoArchivoKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar "
                + "el archivo seleccionado?","ELIMINAR ARCHIVO!!!!",
                JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            //File borrarArchivo = new File(this.cmbarchivosDisponibles.getiv);
            
            File aEliminar = new File("tables\\"+(String)this.cmbarchivosDisponibles.getSelectedItem());
            if(aEliminar.delete()){
                refreshModel();
                JOptionPane.showMessageDialog(null, "Archivo Eliminado Exitosamente!!");                
            }else{
                JOptionPane.showMessageDialog(null, "Oops! ha surgido un error al momento"
                        + "de borar el archivo"); 
            }  
            
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbarchivosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbarchivosDisponiblesActionPerformed
       
    }//GEN-LAST:event_cmbarchivosDisponiblesActionPerformed

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
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivo().setVisible(true);
            }
        });
                
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnnuevoArchivo;
    private javax.swing.JComboBox<String> cmbarchivosDisponibles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSeleccionarArchivoBorrar;
    private javax.swing.JLabel lblSeleccionarArchivoBorrar1;
    private javax.swing.JTextField txtnuevoArchivo;
    // End of variables declaration//GEN-END:variables
    
}
