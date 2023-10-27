
package com.miapp.triage.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Clase EstadisticasGUI
 * 
 * @author Fran
 */
public class EstadisticasGUI extends javax.swing.JDialog {

    /**
    * Constructor de la clase EstadisticasGUI.
    */
    public EstadisticasGUI() {
        super();
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Siguiente");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 91, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, -1));

        jTextField1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("                                             Ingresar fechas");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 270, 370, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Paciente/s que más consultaron en un rango de fechas ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 371, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Ingresar fechas y edades");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 371, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pacientes atendidos en un rango de fechas y edades dadas ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 371, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ingresar fechas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 371, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pacientes atendidos por un médico en un rango de fechas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 371, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESTADISTICAS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            EstadisticasONE estadisticas = new EstadisticasONE();
            estadisticas.setVisible(true);
            estadisticas.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(EstadisticasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       EstadisticasTWO estadisticas= new EstadisticasTWO();
       estadisticas.setVisible(true);
       estadisticas.setLocationRelativeTo(null);
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        men.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EstadisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstadisticasGUI dialog = new EstadisticasGUI();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**
    * boton utilizado en la interfaz
    */
    private javax.swing.JButton jButton1;
    /**
    * boton utilizado en la interfaz
    */
    private javax.swing.JButton jButton2;
    /**
    * boton utilizado en la interfaz
    */
    private javax.swing.JButton jButton3;
    /**
    * boton utilizado en la interfaz
    */
    private javax.swing.JButton jButton4;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel1;
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
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel1;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel2;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel3;
    /**
    * jtextfield utilizado en la interfaz
    */
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
