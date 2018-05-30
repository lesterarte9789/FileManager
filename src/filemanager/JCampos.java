
package filemanager;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JCampos extends javax.swing.JFrame {

    ArrayList <fieldStructure> listaCampos = new ArrayList <fieldStructure>(); 
    public JCampos() {
        initComponents();
        this.setLocationRelativeTo(this);
        archivosDisponibles();
        listaCampos.add(new fieldStructure(false, "ID", "Numero",3));
        camposDisponibles();
        limpiarCampos();
    }
    
     public void archivosDisponibles(){
        File path = new File("tables");
        String[] listaArchivos = path.list();
        this.cmbArchivosDisponibles.removeAllItems();
        for (String listaArchivo : listaArchivos) {
            this.cmbArchivosDisponibles.addItem(listaArchivo);
        }  
    }
     
    public void camposDisponibles(){
        cmbCamposDisponibles.removeAllItems();
        listaCampos.forEach((listaCampo) -> {
            this.cmbCamposDisponibles.addItem(listaCampo.getFieldName());
        });
    }
    public boolean existKey(){
        for (fieldStructure listaCampo : listaCampos) {
            if (listaCampo.isPrimarykey()){
                return true;
            }
        }
        return false;
        
    }
    
    public int indexCampo(String campo){
        for (int i = 0; i <10; i++) {
            
            if (campo.equals(listaCampos.get(i).getFieldName())){
                return i;
            }
        }
        return -1;            
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrearCampo = new javax.swing.JButton();
        btnModificarCampo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbArchivosDisponibles = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbCamposDisponibles = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNombresCampos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbLlavePrimaria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbTipoDato = new javax.swing.JComboBox<>();
        btnCrearMeta = new javax.swing.JButton();
        btnGuardarCampo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbSizeField = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CAMPOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Crear");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Eliminar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Modificar");

        btnCrearCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/crearCamp.png"))); // NOI18N
        btnCrearCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCampoActionPerformed(evt);
            }
        });

        btnModificarCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/modificarCampo.png"))); // NOI18N
        btnModificarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCampoActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/borrar formato.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Campos Disponibles:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Archivos Disponibles: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre Campo:");

        txtNombresCampos.setEnabled(false);
        txtNombresCampos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombresCamposFocusLost(evt);
            }
        });
        txtNombresCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresCamposActionPerformed(evt);
            }
        });
        txtNombresCampos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresCamposKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Llave Primaria");

        cmbLlavePrimaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbLlavePrimaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        cmbLlavePrimaria.setEnabled(false);
        cmbLlavePrimaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlavePrimariaActionPerformed(evt);
            }
        });
        cmbLlavePrimaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbLlavePrimariaKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Tipo de Dato:");

        cmbTipoDato.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbTipoDato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Texto", "Numero", "Moneda", "Fecha", "Telefono", "Hora" }));
        cmbTipoDato.setEnabled(false);
        cmbTipoDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDatoActionPerformed(evt);
            }
        });

        btnCrearMeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCrearMeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/filemanager/Icons/crear meta.png"))); // NOI18N
        btnCrearMeta.setEnabled(false);
        btnCrearMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMetaActionPerformed(evt);
            }
        });

        btnGuardarCampo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardarCampo.setText("Guardar Campo");
        btnGuardarCampo.setEnabled(false);
        btnGuardarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCampoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Guardar Campos ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tamaño de campo:");

        cmbSizeField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbSizeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "20", "23", "25", "30", "35", "40", "45", "50" }));
        cmbSizeField.setEnabled(false);
        cmbSizeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSizeFieldActionPerformed(evt);
            }
        });
        cmbSizeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbSizeFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel4))
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCrearCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbArchivosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel6))
                                    .addComponent(btnModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel5))
                                            .addComponent(cmbCamposDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCrearMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10))
                                            .addComponent(btnGuardarCampo))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombresCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbLlavePrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbTipoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCrearCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombresCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbLlavePrimaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbArchivosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCamposDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCrearMeta, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCampoActionPerformed
        if(cmbCamposDisponibles.getSelectedItem().equals("ID")){
            JOptionPane.showMessageDialog(null,"el Campo: " + cmbCamposDisponibles.getSelectedItem()+
                    " no puede ser Modificado");            
        }else{            
            this.txtNombresCampos.setEnabled(true);
            this.btnModificarCampo.setEnabled(false);
            this.btnBorrar.setEnabled(false);
            this.btnCrearCampo.setEnabled(false);
            cmbSizeField.setEnabled(true);
            
            //agregar valores del campo seleccionado al Campo
            txtNombresCampos.setText(listaCampos.get(cmbCamposDisponibles.getSelectedIndex()).getFieldName());
            if (listaCampos.get(cmbCamposDisponibles.getSelectedIndex()).isPrimarykey()) {
                cmbLlavePrimaria.setSelectedIndex(0);
            }else{
                cmbLlavePrimaria.setSelectedIndex(1); 
            }
            cmbTipoDato.setSelectedItem(listaCampos.get(cmbCamposDisponibles.getSelectedIndex()).getDataType());
            cmbSizeField.setSelectedItem(Integer.toString(listaCampos.get(cmbCamposDisponibles.getSelectedIndex()).getSizeField()));
            
            System.out.println(listaCampos.get(cmbCamposDisponibles.getSelectedIndex()).getSizeField());
            listaCampos.remove(cmbCamposDisponibles.getSelectedIndex());
            camposDisponibles();
            txtNombresCampos.setEnabled(true);
            cmbLlavePrimaria.setEnabled(true);
            cmbTipoDato.setEnabled(true);
            txtNombresCampos.requestFocus();     
        }   
    }//GEN-LAST:event_btnModificarCampoActionPerformed

    private void btnCrearMetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMetaActionPerformed
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta Seguro que quiere Guardar "
                + "los Campos en el archivo Seleccionado?","ELIMINAR ARCHIVO!!!!",
                JOptionPane.YES_NO_OPTION);
        if(opcion == 0){
            try {
                FileReader fr = new FileReader("tables//"+(String)cmbArchivosDisponibles.getSelectedItem());
                    if(fr.read() != -1){
                        JOptionPane.showMessageDialog(null, "El archivo Ya tiene una estructura de "
                                + "campos creada. NO SE PUEDE MODIFICAR SU ESTRUCTURA.");
                    }else{
                        FileWriter fw = new FileWriter("tables//"+
                                (String)cmbArchivosDisponibles.getSelectedItem());
                        String cadenaGuardar =""; 
                        for (fieldStructure listaCampo : listaCampos) {
                            cadenaGuardar+=listaCampo.isPrimarykey()+
                                    "|"+listaCampo.getFieldName()+"|"+listaCampo.getDataType()+"|"+
                                    listaCampo.getSizeField()+"\n";
                        }
                        fw.write(cadenaGuardar+"#\n");
                        fw.close();
                        JOptionPane.showMessageDialog(null, "Estructura de Campos Agregada correctamente");
                    }
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(JCampos.class.getName()).log(Level.SEVERE, null, ex);
            }
        btnCrearMeta.setEnabled(false);
        }
    }//GEN-LAST:event_btnCrearMetaActionPerformed

    private void btnGuardarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCampoActionPerformed
        
        if(existKey() && cmbLlavePrimaria.getSelectedItem().equals("Si")){
            JOptionPane.showMessageDialog(null, "Solo puede Existir una Llave Primaria");
        }else{
            boolean primaryKey=false;
            String name=this.txtNombresCampos.getText();
            if (cmbLlavePrimaria.getSelectedItem().equals("Si")) {
                primaryKey=true;
            }
            int size = Integer.valueOf((String)cmbSizeField.getSelectedItem());
            String dataType=(String) cmbTipoDato.getSelectedItem();
            listaCampos.add(new fieldStructure(primaryKey, name, dataType,size));
            camposDisponibles();
            this.txtNombresCampos.setText("");
            btnBorrar.setEnabled(true);
            btnCrearCampo.setEnabled(true);
            btnModificarCampo.setEnabled(true);
            cmbLlavePrimaria.setEnabled(false);
            cmbTipoDato.setEnabled(false);
            txtNombresCampos.setEnabled(false);
            btnGuardarCampo.setEnabled(false);
            btnCrearCampo.requestFocus();
            btnCrearMeta.setEnabled(true);
            cmbSizeField.setEnabled(false);
            limpiarCampos();
        }
        
        
        
    }//GEN-LAST:event_btnGuardarCampoActionPerformed

    private void btnCrearCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCampoActionPerformed
        btnBorrar.setEnabled(false);
        btnCrearCampo.setEnabled(true);
        btnCrearMeta.setEnabled(false);
        btnModificarCampo.setEnabled(false);
        txtNombresCampos.setEnabled(true);
        cmbSizeField.setEnabled(true);
        cmbLlavePrimaria.setEnabled(true);
        cmbTipoDato.setEnabled(true);
        txtNombresCampos.requestFocus();
        
    }//GEN-LAST:event_btnCrearCampoActionPerformed

    private void txtNombresCamposFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombresCamposFocusLost
        if(this.txtNombresCampos.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Este campo no puede estar vacio");
            this.txtNombresCampos.requestFocus();
        } else if (fieldnameExists(this.txtNombresCampos.getText())) {
            JOptionPane.showMessageDialog(null,"Este campo ya existe");
            this.txtNombresCampos.requestFocus();
            this.txtNombresCampos.setText("");
        }else{
            this.cmbLlavePrimaria.requestFocus();
            
        } 
        
    }//GEN-LAST:event_txtNombresCamposFocusLost

    private void txtNombresCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresCamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresCamposActionPerformed

    private void cmbLlavePrimariaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbLlavePrimariaKeyPressed
        
    }//GEN-LAST:event_cmbLlavePrimariaKeyPressed

    private void cmbLlavePrimariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlavePrimariaActionPerformed
        cmbTipoDato.requestFocus();
    }//GEN-LAST:event_cmbLlavePrimariaActionPerformed

    private void txtNombresCamposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresCamposKeyPressed
        
        if(txtNombresCampos.getText().length()>20){
            JOptionPane.showMessageDialog(null,"Nombre de Campo demaciado Largo");
            txtNombresCampos.setText("");
            txtNombresCampos.requestFocus();    
        }
    }//GEN-LAST:event_txtNombresCamposKeyPressed

    private void cmbTipoDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDatoActionPerformed
        cmbSizeField.requestFocus();
    }//GEN-LAST:event_cmbTipoDatoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        if(cmbCamposDisponibles.getSelectedItem().equals("ID")){
            JOptionPane.showMessageDialog(null,"el Campo: " + cmbCamposDisponibles.getSelectedItem()+
                    " no puede ser Eliminado");            
        }else{
            int opcion = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar "
                + "el Campo seleccionado?","ELIMINAR CAMPO!!!!",
                JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                listaCampos.remove(cmbCamposDisponibles.getSelectedIndex());
                JOptionPane.showMessageDialog(null, "Campo Eliminado con exito!");
                camposDisponibles();
            }                
        }
        if(cmbCamposDisponibles.getItemCount()==1){
            btnCrearMeta.setEnabled(false);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cmbSizeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSizeFieldActionPerformed
        btnGuardarCampo.setEnabled(true);
        btnGuardarCampo.requestFocus();
    }//GEN-LAST:event_cmbSizeFieldActionPerformed

    private void cmbSizeFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbSizeFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSizeFieldKeyPressed
    
    public boolean fieldnameExists(String name){
        for (int i = 0; i < listaCampos.size(); i++) {
            if (listaCampos.get(i).getFieldName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public void limpiarCampos(){
        txtNombresCampos.setText("");
        cmbLlavePrimaria.setSelectedIndex(-1);
        cmbTipoDato.setSelectedIndex(-1);
        cmbSizeField.setSelectedIndex(-1);
        btnGuardarCampo.setEnabled(false);
    }
    public void guardarMeta(){
        String DatosGuardar ="";
        for (fieldStructure listaCampo : listaCampos) {
           DatosGuardar += listaCampo.isPrimarykey()+"|"+listaCampo.getFieldName()+
                   "|"+listaCampo.getDataType()+"/n";
            System.out.println(DatosGuardar);
        }
        
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
            java.util.logging.Logger.getLogger(JCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCampos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCampos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrearCampo;
    private javax.swing.JButton btnCrearMeta;
    private javax.swing.JButton btnGuardarCampo;
    private javax.swing.JButton btnModificarCampo;
    private javax.swing.JComboBox<String> cmbArchivosDisponibles;
    private javax.swing.JComboBox<String> cmbCamposDisponibles;
    private javax.swing.JComboBox<String> cmbLlavePrimaria;
    private javax.swing.JComboBox<String> cmbSizeField;
    private javax.swing.JComboBox<String> cmbTipoDato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombresCampos;
    // End of variables declaration//GEN-END:variables
}
