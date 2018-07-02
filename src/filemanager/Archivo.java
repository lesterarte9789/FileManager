/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author MerryGoRound
 */
public class Archivo extends javax.swing.JFrame {

    public Archivo() {

        initComponents();
        this.setLocationRelativeTo(this);
        //btn_cruzar.setEnabled(false);
        //se mueve al directorio adondese encuentran los archivos
        refreshModel();
        if (cmbarchivosDisponibles.getItemCount() == 0) {
            btnEliminar.setEnabled(false);

        }

    }

    public void refreshModel() {
        File path = new File("tables");
        String[] listaArchivos = path.list();
        this.cmbarchivosDisponibles.removeAllItems();
        for (String listaArchivo : listaArchivos) {
            this.cmbarchivosDisponibles.addItem(listaArchivo);
        }
        if (this.cmbarchivosDisponibles.getItemCount() == 0) {
            this.cmbarchivosDisponibles.setEnabled(false);
        } else {
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

        jd_Cruzar = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        cb_file1 = new javax.swing.JComboBox<>();
        cb_file2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cruzar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCampos = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jb_primaryKey = new javax.swing.JButton();
        txt_crossedfile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        jb_cruzar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jd_Cruzar.setBackground(new java.awt.Color(204, 255, 204));
        jd_Cruzar.setForeground(new java.awt.Color(204, 255, 204));
        jd_Cruzar.setModal(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Cruzar Archivos");

        cb_file1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_file1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_file1ActionPerformed(evt);
            }
        });

        cb_file2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Archivo 2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Archivo 1");

        btn_cruzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/mix_icon-icons.com_67962.png"))); // NOI18N
        btn_cruzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cruzarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jListCampos);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Campos Formados");

        jb_primaryKey.setText("Seleccionar Primary Key");
        jb_primaryKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_primaryKeyActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Nombre de nuevo archivo");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/modificarCampo.png"))); // NOI18N
        jButton1.setText("Guardar");

        javax.swing.GroupLayout jd_CruzarLayout = new javax.swing.GroupLayout(jd_Cruzar.getContentPane());
        jd_Cruzar.getContentPane().setLayout(jd_CruzarLayout);
        jd_CruzarLayout.setHorizontalGroup(
            jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CruzarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(132, 132, 132))
                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                        .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_file1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_CruzarLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jb_primaryKey))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CruzarLayout.createSequentialGroup()
                                    .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cb_file2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                    .addContainerGap())
                                .addGroup(jd_CruzarLayout.createSequentialGroup()
                                    .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_cruzar))
                                    .addGap(29, 29, 29)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_CruzarLayout.createSequentialGroup()
                                .addComponent(txt_crossedfile, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jd_CruzarLayout.createSequentialGroup()
                .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel5))
                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_CruzarLayout.setVerticalGroup(
            jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CruzarLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(23, 23, 23)
                .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_file1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_file2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CruzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_primaryKey)
                        .addContainerGap())
                    .addGroup(jd_CruzarLayout.createSequentialGroup()
                        .addComponent(btn_cruzar)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txt_crossedfile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))))
        );

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
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnuevoArchivoKeyPressed(evt);
            }
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

        jb_cruzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/mix_icon-icons.com_67962.png"))); // NOI18N
        jb_cruzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cruzarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CRUZAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbarchivosDisponibles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(lblSeleccionarArchivoBorrar1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblSeleccionarArchivoBorrar)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnnuevoArchivo)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_cruzar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtnuevoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(310, 310, 310))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnuevoArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnnuevoArchivo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbarchivosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(lblSeleccionarArchivoBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSeleccionarArchivoBorrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jb_cruzar)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoArchivoActionPerformed
        this.btnEliminar.setEnabled(false);
        this.txtnuevoArchivo.setEnabled(true);
        this.btnnuevoArchivo.setEnabled(false);

    }//GEN-LAST:event_btnnuevoArchivoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        File temporalNuevo = new File("tables\\" + this.txtnuevoArchivo.getText() + ".txt");

        if (temporalNuevo.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo ya existe!!");
            this.txtnuevoArchivo.setText("");
            this.txtnuevoArchivo.setEnabled(false);
            this.btnAceptar.setEnabled(false);
            this.btnnuevoArchivo.setEnabled(true);
            this.btnEliminar.setEnabled(true);
        } else {
            try {
                FileWriter guardarArchivo = new FileWriter(temporalNuevo);
                guardarArchivo.close();
            } catch (Exception e) {
            }
            JOptionPane.showMessageDialog(null, "Archivo Agregado Exitosamente");

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
        this.btnAceptar.setEnabled(this.txtnuevoArchivo.getText().length() != 0);
    }//GEN-LAST:event_txtnuevoArchivoKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar "
                + "el archivo seleccionado?", "ELIMINAR ARCHIVO!!!!",
                JOptionPane.YES_NO_OPTION);
        if (opcion == 0) {
            //File borrarArchivo = new File(this.cmbarchivosDisponibles.getiv);

            File aEliminar = new File("tables\\" + (String) this.cmbarchivosDisponibles.getSelectedItem());
            if (aEliminar.delete()) {
                refreshModel();
                JOptionPane.showMessageDialog(null, "Archivo Eliminado Exitosamente!!");
            } else {
                JOptionPane.showMessageDialog(null, "Oops! ha surgido un error al momento"
                        + "de borrar el archivo");
            }

        }
        if (cmbarchivosDisponibles.getItemCount() == 0) {
            btnEliminar.setEnabled(false);
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cmbarchivosDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbarchivosDisponiblesActionPerformed

    }//GEN-LAST:event_cmbarchivosDisponiblesActionPerformed

    private void txtnuevoArchivoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuevoArchivoKeyPressed
        if (txtnuevoArchivo.getText().length() > 20) {
            JOptionPane.showMessageDialog(null, "Nombre de Archivo demasiado Largo");
            txtnuevoArchivo.setText("");
            txtnuevoArchivo.requestFocus();
        }
    }//GEN-LAST:event_txtnuevoArchivoKeyPressed

    private void jb_cruzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cruzarActionPerformed
        File path = new File("tables");
        String[] listaArchivos = path.list();
        this.cb_file1.removeAllItems();
        this.cb_file2.removeAllItems();
        for (String listaArchivo : listaArchivos) {
            this.cb_file1.addItem(listaArchivo);
        }
        for (String listaArchivo : listaArchivos) {
            this.cb_file2.addItem(listaArchivo);
        }
        jd_Cruzar.setModal(true);
        jd_Cruzar.pack();
        jd_Cruzar.setLocationRelativeTo(this);
        jd_Cruzar.setVisible(true);
    }//GEN-LAST:event_jb_cruzarActionPerformed

    private void cb_file1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_file1ActionPerformed

    }//GEN-LAST:event_cb_file1ActionPerformed

    private void btn_cruzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cruzarActionPerformed
        DefaultListModel modeloLista = new DefaultListModel();
        if (cb_file1.getSelectedItem().equals(cb_file2.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "No se puede cruzar el mismo archivo\n"
                    + "Seleccione uno diferente");

        } else {
            archivoSeleccionado = (String) cb_file1.getSelectedItem();
            File archivo = new File("tables\\" + archivoSeleccionado);
            try {
                cargarCampos(archivo);
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (fieldStructure listaCampo : listaCampos) {
                modeloLista.addElement(listaCampo.getFieldName());
            }

            archivoSeleccionado = (String) cb_file2.getSelectedItem();
            archivo = new File("tables\\" + archivoSeleccionado);
            try {
                cargarCampos(archivo);
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (fieldStructure listaCampo : listaCampos) {
                if (modeloLista.contains(listaCampo.getFieldName())) {
                } else {
                    modeloLista.addElement(listaCampo.getFieldName());
                }
            }
            jListCampos.setModel(modeloLista);
        }
    }//GEN-LAST:event_btn_cruzarActionPerformed

    private void jb_primaryKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_primaryKeyActionPerformed
        DefaultListModel modeloLista = new DefaultListModel();
        ArrayList<fieldStructure> campos = new ArrayList<>();
        int pos = jListCampos.getSelectedIndex();
        modeloLista = (DefaultListModel) jListCampos.getModel();
        System.out.println(modeloLista.size());

        archivoSeleccionado = (String) cb_file1.getSelectedItem();
        File archivo = new File("tables\\" + archivoSeleccionado);
        try {
            cargarCampos(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (fieldStructure listaCampo : listaCampos) {
            if (listaCampo.isPrimarykey()) {
                campos.add(new fieldStructure(true, listaCampo.getFieldName(), listaCampo.getDataType(), listaCampo.getSizeField()));
            } else {
                campos.add(new fieldStructure(false, listaCampo.getFieldName(), listaCampo.getDataType(), listaCampo.getSizeField()));
            }
        }

        archivoSeleccionado = (String) cb_file2.getSelectedItem();
        archivo = new File("tables\\" + archivoSeleccionado);
        try {
            cargarCampos(archivo);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (fieldStructure listaCampo : listaCampos) {
            campos.add(new fieldStructure(false, listaCampo.getFieldName(), listaCampo.getDataType(), listaCampo.getSizeField()));
        }

        try {
            FileReader fr = new FileReader("tables//" + txt_crossedfile.getText());
            if (fr.read() != -1) {
                JOptionPane.showMessageDialog(null, "El archivo ya existe y esta cruzado");
            } else {
                FileWriter fw = new FileWriter("tables//"
                        + txt_crossedfile.toString());
                String cadenaGuardar = "";
                for (fieldStructure campo : campos) {
                    cadenaGuardar += campo.isPrimarykey()
                            + "|" + campo.getFieldName() + "|" + campo.getDataType() + "|"
                            + campo.getSizeField() + "\n";
                }
                fw.write(cadenaGuardar + "#\n-1|0\n&\n");
                fw.close();
                JOptionPane.showMessageDialog(null, "Estructura de Campos Agregada correctamente");
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(JCampos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jb_primaryKeyActionPerformed
    public void cargarCampos(File archivo) throws IOException {
        listaCampos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                bytesMetaCampos += linea.length() + 2;
                if (linea.equals("#")) {
                    break;
                } else {
                    String lineCampos[] = linea.split("\\|");
                    listaCampos.add(new fieldStructure(Boolean.valueOf(lineCampos[0]), lineCampos[1], lineCampos[2],
                            Integer.valueOf(lineCampos[3])));
                }
            }
        }
    }

    public void archivoCruzado() {
        ArrayList<fieldStructure> newCampos;

    }

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
    private javax.swing.JButton btn_cruzar;
    private javax.swing.JButton btnnuevoArchivo;
    private javax.swing.JComboBox<String> cb_file1;
    private javax.swing.JComboBox<String> cb_file2;
    private javax.swing.JComboBox<String> cmbarchivosDisponibles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListCampos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_cruzar;
    private javax.swing.JButton jb_primaryKey;
    private javax.swing.JDialog jd_Cruzar;
    private javax.swing.JLabel lblSeleccionarArchivoBorrar;
    private javax.swing.JLabel lblSeleccionarArchivoBorrar1;
    private javax.swing.JTextField txt_crossedfile;
    private javax.swing.JTextField txtnuevoArchivo;
    // End of variables declaration//GEN-END:variables
    ArrayList<fieldStructure> listaCampos = null;
    int bytesMetaCampos = 0;
    private int postLectura = 0;
    private int sizeLectura = 700;
    private String archivoSeleccionado;
}
