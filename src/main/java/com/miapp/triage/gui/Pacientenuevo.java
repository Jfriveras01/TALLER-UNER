/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.miapp.triage.gui;
import com.miapp.triage.metodoscsv.lpacientes;
import com.miapp.triage.triage.Paciente;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase Pacientenuevo
 * 
 * @author Fran
 */
public class Pacientenuevo extends javax.swing.JFrame {

    /**
     * instancia lpaciente 
     */
    public lpacientes gestorPacientes;
    
    /**
    * Ruta del archivo "pacientes.csv" utilizado en el programa.
    */
    String archivo = "src\\main\\java\\com\\miapp\\triage\\csv\\pacientes.csv";
    
 
  /**
    * crea instancia de clase Paciente nuevo
    *
    */
    public Pacientenuevo() {
        initComponents();
        gestorPacientes = new lpacientes();
         try {
            gestorPacientes.leerArchivo(archivo, ";");
        } catch (IOException ex) {
            Logger.getLogger(Pacientenuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
         jFormattedTextField3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                buscarPacientePorDNI();
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombres");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 104, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 98, 139, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellidos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 144, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha Nacimiento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 184, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 138, 139, -1));

        jFormattedTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextField2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 178, 139, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Documento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 64, -1, -1));

        jFormattedTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 58, 139, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono Fijo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 264, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Telefono Celular");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 304, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estado Civil");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 344, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Persona de contacto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 384, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Correo Electronico");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 421, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 378, 139, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 418, 139, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero/a", "Casado/a", "Divorciado/a" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 338, 139, -1));

        jFormattedTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jFormattedTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 258, 139, -1));

        jFormattedTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFormattedTextField6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 298, 139, -1));

        jToggleButton1.setBackground(new java.awt.Color(153, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("Agregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 515, -1, -1));

        jToggleButton2.setBackground(new java.awt.Color(153, 255, 255));
        jToggleButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setText("Cancelar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 515, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Domicilio");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 224, -1, -1));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 218, 139, -1));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 458, 139, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Motivo consulta");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 461, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel11.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("AGREGAR PACIENTE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel11)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jFormattedTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField5ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        men.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       
        // Validación de campos obligatorios
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jFormattedTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos Nombres, Apellidos y Fecha de Nacimiento son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Date fechaNac = null;

        Paciente nuevaPersona = new Paciente();
        nuevaPersona.setNombre(jTextField1.getText());
        nuevaPersona.setApellido(jTextField2.getText());
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            fechaNac = dateFormat.parse(jFormattedTextField2.getText());
            nuevaPersona.setFechaNac(fechaNac);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        nuevaPersona.setDNI(Long.parseLong(jFormattedTextField3.getText()));
        nuevaPersona.setDomicilio(jTextField5.getText());
        nuevaPersona.setTelfijo(Long.parseLong(jFormattedTextField5.getText()));
        nuevaPersona.setTelcelular(Long.parseLong(jFormattedTextField6.getText()));
        nuevaPersona.setEstcivil(jComboBox1.getSelectedItem().toString());
        nuevaPersona.setCorreo(jTextField4.getText());
        nuevaPersona.setMotivo(jTextField6.getText());
        gestorPacientes.agregar(nuevaPersona);
        gestorPacientes.escribirArchivo(archivo, ";", false);
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField2.setText("");
        jTextField5.setText("");
        jFormattedTextField3.setText("");
        jFormattedTextField5.setText("");
        jFormattedTextField6.setText("");
        jComboBox1.setSelectedIndex(0);
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField6.setText("");
        
        JOptionPane.showMessageDialog(this, "Paciente agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    
    /**
    * busca paciente segun dni
    *
    * @return pacientes
    */
    private void buscarPacientePorDNI() {
        
        if (jFormattedTextField3.getText().isEmpty()) {
            return;
        }
        
        String dniText = jFormattedTextField3.getText(); 
        long dni = Long.parseLong(dniText);
        


        Paciente pacienteExistente = null;
        for (Paciente paciente : gestorPacientes.getPacientes()) {
            if (paciente.getDNI() == dni) {
                pacienteExistente = paciente;
                break;
            }
        }

        if (pacienteExistente != null) {
            jTextField1.setText(pacienteExistente.getNombre());
            jTextField2.setText(pacienteExistente.getApellido());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            jFormattedTextField2.setValue(pacienteExistente.getFechaNac());
            jTextField5.setText(pacienteExistente.getDomicilio());
            jFormattedTextField5.setValue(pacienteExistente.getTelfijo());
            jFormattedTextField6.setValue(pacienteExistente.getTelcelular());
            jComboBox1.setSelectedItem(pacienteExistente.getEstcivil());
            jTextField4.setText(pacienteExistente.getCorreo());
            jTextField6.setText(pacienteExistente.getMotivo());

        }
    }
    
    {
      
    }    
   
    {
        
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    
    /**
     * metodo main
     * 
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
            java.util.logging.Logger.getLogger(Pacientenuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientenuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientenuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientenuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientenuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox1;
    /**
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField1;
    /**
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField2;
    /**
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField3;
    /**
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField5;
    /**
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField6;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel1;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel10;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel11;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel12;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel13;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel2;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel3;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel4;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel5;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel6;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel7;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel8;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel9;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel1;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel2;
    /**
    * jscrollpanel utilizado en la interfaz
    */
    private javax.swing.JScrollPane jScrollPane1;
    /**
    * textarea utilizado en la interfaz
    */
    private javax.swing.JTextArea jTextArea1;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField1;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField2;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField3;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField4;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField5;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField6;
    /**
    * jtogglebuton utilizado en la interfaz
    */
    private javax.swing.JToggleButton jToggleButton1;
    /**
    * jtogglebuton utilizado en la interfaz
    */
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
