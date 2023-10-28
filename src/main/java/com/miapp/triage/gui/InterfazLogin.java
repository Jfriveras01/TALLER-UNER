/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.miapp.triage.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Clase InterfazLogin 
 * 
 * @author usuario
 */
public class InterfazLogin extends javax.swing.JFrame {
    
    /**
    * Ruta del archivo "usuarios.csv" utilizado en el programa.
    */
    String archivo= "src\\main\\java\\com\\miapp\\triage\\csv\\usuarios.csv";
    /**
     * Creates new form InterfazLogin
     */
    public InterfazLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        PanelIzq = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Superior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        treinta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        sombraTreinta = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setForeground(new java.awt.Color(0, 255, 204));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIzq.setBackground(new java.awt.Color(0, 204, 204));
        PanelIzq.setForeground(new java.awt.Color(255, 255, 255));
        PanelIzq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INICIAR SESION");
        PanelIzq.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 195, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USUARIO");
        PanelIzq.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 83, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRASEÑA");
        PanelIzq.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 178, -1, -1));

        jTextField1.setText("Ingrese su nombre de usuario");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        PanelIzq.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        PanelIzq.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 124, 170, 20));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        PanelIzq.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 215, 170, 20));
        PanelIzq.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 108, 63, 10));
        PanelIzq.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 199, 98, 10));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelIzq.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 295, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelIzq.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 295, -1, -1));

        Fondo.add(PanelIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 410));

        Superior.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO DE SALUD");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout SuperiorLayout = new javax.swing.GroupLayout(Superior);
        Superior.setLayout(SuperiorLayout);
        SuperiorLayout.setHorizontalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperiorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(SuperiorLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SuperiorLayout.setVerticalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuperiorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 90));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 10, 410));

        treinta.setBackground(new java.awt.Color(255, 51, 153));
        treinta.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 80)); // NOI18N
        treinta.setForeground(new java.awt.Color(255, 51, 153));
        treinta.setText("30 ");
        treinta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Fondo.add(treinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("#TuSaludEstaPrimero");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 200, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 255));
        jLabel7.setText("Años creciendo");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 170, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 204));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 180, 10));
        Fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 10));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("•\tCardiología   •\tReuma   •\tNefrología ");
        Fondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 200, 20));

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("•\tRadiología   •Oncología   •Oftalmología ");
        Fondo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("•Pediatría   •Nefrología    •Ginecología ");
        Fondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Monseñor Tavella 1424. Concordia. CP(3200). | Entre Ríos");
        Fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 260, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 160, -1));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 255));
        jLabel14.setText("con vos");
        Fondo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 130, 20));

        sombraTreinta.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 80)); // NOI18N
        sombraTreinta.setForeground(new java.awt.Color(255, 153, 204));
        sombraTreinta.setText("30");
        Fondo.add(sombraTreinta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, -1));

        jSeparator5.setForeground(new java.awt.Color(255, 102, 204));
        Fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField2.getText().isEmpty() || jPasswordField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Los campos Usuario y Contraseña son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Sale de la función si falta algún campo obligatorio
        }
        
        String user= jTextField2.getText();
        String contra = String.valueOf(jPasswordField1.getPassword());
        
         try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String lineaUsuarios;

            while ((lineaUsuarios = br.readLine()) != null) {
                String[] datosUsuario = lineaUsuarios.split(";");
                if (datosUsuario.length >= 3) {
                    String rol = datosUsuario[0];
                    String username = datosUsuario[1];
                    String password = datosUsuario[2];

                    if (username.equals(user) && password.equals(contra)) {
                        // Abre el menú correspondiente según el rol
                        if (rol.equals("Medico")) {
                            MenuDos men = new MenuDos();
                            men.setVisible(true);
                            men.setLocationRelativeTo(null);
                            this.setVisible(false);
                        }
                        if (rol.equals("Administrador")) {
                            MenuTres menu = new MenuTres();
                            menu.setVisible(true);
                            menu.setLocationRelativeTo(null);
                            this.setVisible(false);
                        }
                        if (rol.equals("Funcionario")) {
                            MenuUno menu = new MenuUno();
                            menu.setVisible(true);
                            menu.setLocationRelativeTo(null);
                            this.setVisible(false);
                        }
                        
                        this.setVisible(false); // Cierra la ventana de inicio de sesión
                        br.close();
                        return;
                    }
                }
            }

            br.close();
            // Usuario o contraseña incorrectos
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
         

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel Fondo;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel PanelIzq;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel Superior;
    /**
    * boton utilizado en la interfaz
    */
    private javax.swing.JButton jButton1;
    /**
    * boton utilizado en la interfaz
    */
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel6;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel7;
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
    * jpasswordfield utilizado en la interfaz
    */
    private javax.swing.JPasswordField jPasswordField1;
    /**
    * separador utilizado en la interfaz
    */
    private javax.swing.JSeparator jSeparator1;
    /**
    * separador utilizado en la interfaz
    */
    private javax.swing.JSeparator jSeparator2;
    /**
    * separador utilizado en la interfaz
    */
    private javax.swing.JSeparator jSeparator3;
    /**
    * separador utilizado en la interfaz
    */
    private javax.swing.JSeparator jSeparator4;
    /**
    * separador utilizado en la interfaz
    */
    private javax.swing.JSeparator jSeparator5;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField1;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField2;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel sombraTreinta;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel treinta;
    // End of variables declaration//GEN-END:variables
}
