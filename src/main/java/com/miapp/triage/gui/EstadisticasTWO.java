
package com.miapp.triage.gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 * Clase EstadisticasTWO
 * 
 * @author Fran
 */
public class EstadisticasTWO extends javax.swing.JDialog {
    
    /**
    * Ruta del archivo "pacientes.csv" utilizado en el programa.
    */
    String archivoPacientes = "src\\main\\java\\com\\miapp\\triage\\csv\\pacientes.csv";
    /**
    * Ruta del archivo "consultas.csv" utilizado en el programa.
    */
    String archivoConsultas = "src\\main\\java\\com\\miapp\\triage\\csv\\Consultas.csv";
    
    /**
    * Constructor de la clase EstadisticasTWO.
    */
    public EstadisticasTWO() {
        super();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("        Fecha1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 95, 25));

        jFormattedTextField1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 139, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("           Edad1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 93, 25));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 95, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Siguiente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 95, -1));

        jFormattedTextField5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        getContentPane().add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 139, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ESTADISTICAS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 80));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 490, 10));

        jFormattedTextField2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 139, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("       Edad2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 95, -1));

        jFormattedTextField3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jPanel1.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 140, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("         Fecha2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 95, 25));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 10, 360));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 10, 360));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 490, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EstadisticasGUI estadisticas = new EstadisticasGUI();
        estadisticas.setVisible(true);
        estadisticas.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String fecha1 = jFormattedTextField1.getText();
        String fecha2 = jFormattedTextField3.getText();
        int edad1 = Integer.parseInt(jFormattedTextField5.getText());
        int edad2 = Integer.parseInt(jFormattedTextField2.getText());

        // Verifica que todos los campos estén completos
        if (fecha1.isEmpty() || fecha2.isEmpty() || edad1<0 || edad2<0) {
            JOptionPane.showMessageDialog(this, "Debes completar todos los campos.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Esto hará que el formato sea estricto
    
        Date fechauno = null;
        Date fechados = null;
        try {
            fechauno = sdf.parse(fecha1);
             fechados = sdf.parse(fecha2);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "El formato de fecha no es válido");
             return; // Sale del método si las fechas no tienen el formato correcto
        }


        int pacientesAtendidos = 0;

        try (BufferedReader brPacientes = new BufferedReader(new FileReader(archivoPacientes));
             BufferedReader brConsultas = new BufferedReader(new FileReader(archivoConsultas))) {
            String lineaPaciente;
            String lineaConsulta;

            while ((lineaPaciente = brPacientes.readLine()) != null && (lineaConsulta = brConsultas.readLine()) != null) {
                String[] datosPaciente = lineaPaciente.split(";");
                String[] datosConsulta = lineaConsulta.split(";");

                if (datosPaciente.length >= 4 && datosConsulta.length >= 3) {  
                    String fechaNacimientoPaciente = datosPaciente[3];
                    Date fechaNacimiento = sdf.parse(fechaNacimientoPaciente);

               
                    int edadPaciente = calcularEdad(fechaNacimiento);
                    Date fechaConsulta = sdf.parse(datosConsulta[1]);
                    if (fechaDentroDelRango(fechaConsulta, fechauno, fechados) && edadDentroDelRango(edadPaciente,edad1,edad2)) {
                            pacientesAtendidos++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(EstadisticasTWO.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (pacientesAtendidos==0){
             JOptionPane.showMessageDialog(this, "No hay pacientes atendidos en el rango de fechas y edades dadas ");
        } else{
             JOptionPane.showMessageDialog(this, "Cantidad de pacientes atendidos en el rango de fechas y edad: " + pacientesAtendidos);
        }
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed
    
    /**
    * calcula la edad segun fecha nacieminto
    * @param fechaNacimiento fecha de nacimiento 
    * @return edad
    */
    private int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }
    
    /**
    * compara fechas dentro de un rango
    * @param fechaConsulta fecha de la consulta
    * @param fechauno primer fecha ingresada
    * @param fechados segunda fecha ingresada
    * @return fecha
    */
    private boolean fechaDentroDelRango(Date fechaConsulta, Date fechauno, Date fechados) {
        return !fechaConsulta.before(fechauno) && !fechaConsulta.after(fechados);
}
    /**
    * compara si la edad esta dentro del rango
    * @param edad edad 
    * @param edad1 primer edad ingresada
    * @param edad2 segunda edad ingresada
    * @return edad
    */
    private boolean edadDentroDelRango(int edad,int edad1, int edad2){
        return edad>=edad1 && edad<= edad2;
    }
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
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasTWO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstadisticasTWO dialog = new EstadisticasTWO();
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
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel5;
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
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel4;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel5;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
