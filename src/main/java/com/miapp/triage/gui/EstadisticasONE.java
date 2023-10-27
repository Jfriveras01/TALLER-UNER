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
 * Clase EstadisticasONE
 * 
 * @author Fran
 */
public class EstadisticasONE extends javax.swing.JDialog {

    /**
    * Ruta del archivo "consultas.csv" utilizado en el programa.
    */
    String archivo= "src\\main\\java\\com\\miapp\\triage\\csv\\Consultas.csv";
    
    /**
    * Constructor de la clase EstadisticasONE.
    * @throws java.io.IOException exepcion 
    */
    public EstadisticasONE() throws IOException {
        super();
        initComponents();
        jComboBox1.removeAllItems();
        cargarMedicosDesdeArchivo(archivo);
    }
    
     
    /**
    * carga medicos desde un archivo
    * @param archivo archivo csv donde estan la informacion guardada
    * @return medicos
    */
    private void cargarMedicosDesdeArchivo(String archivo) throws IOException {
    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            
            if (datos.length == 6) {
            String nombreCompleto = datos[5]; 
            jComboBox1.addItem(nombreCompleto);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            br.close();
        }
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingresar fecha1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 126, 110, 34));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar fecha2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 135, 110, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 347, 90, -1));

        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 178, 120, -1));
        getContentPane().add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 178, 120, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESTADISTICAS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 15, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 70));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 490, 10));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 10, 340));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 10, 320));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 490, 10));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 90, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seleccionar Medico");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 116, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String fecha1 = jFormattedTextField2.getText();
    String fecha2 = jFormattedTextField3.getText();
    String medicoSeleccionado = jComboBox1.getSelectedItem().toString();
    
     if (fecha1.isEmpty() || fecha2.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes completar ambos campos de fecha.");
        return; // Sale del método si faltan datos
    }

    // Verifica que las fechas tengan el formato "dd/MM/yyyy"
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    sdf.setLenient(false); // Esto hará que el formato sea estricto
    
    Date fechauno=null;
    Date fechados=null;
    
    try {
        fechauno = sdf.parse(fecha1);
        fechados = sdf.parse(fecha2);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "El formato de fecha no es válido");
        return; // Sale del método si las fechas no tienen el formato correcto
    }
    
    int consultasEnRango = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");

                if (datos.length == 6) {
                    Date fechaConsulta = sdf.parse(datos[1]); 
                    String nombreMedico = datos[5];

                    // Compara la fecha y el nombre del médico
                    if (nombreMedico.equals(medicoSeleccionado) && fechaDentroDelRango(fechaConsulta, fechauno, fechados)) {
                        consultasEnRango++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(EstadisticasONE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(consultasEnRango==0){
             JOptionPane.showMessageDialog(this, "El medico seleccionado no tuvo consultas en el rango de fechas dadas");
        }else{
             JOptionPane.showMessageDialog(this, "El médico " + medicoSeleccionado + " tuvo " + consultasEnRango + " consultas en el rango de fechas especificado.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
    * compara fechas dentro de un rango
    * @param fechaConsulta fecha de la consulta
    * @param fechauno primer fecha ingresada
    * @param fechados segunda fecha ingresada
    * @return fechas
    */
    private boolean fechaDentroDelRango(Date fechaConsulta, Date fechauno, Date fechados) {
     return !fechaConsulta.before(fechauno) && !fechaConsulta.after(fechados);
}
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EstadisticasGUI estadisticas = new EstadisticasGUI();
        estadisticas.setVisible(true);
        estadisticas.setLocationRelativeTo(null);
        this.setVisible(false);;
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
            java.util.logging.Logger.getLogger(EstadisticasONE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstadisticasONE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstadisticasONE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstadisticasONE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EstadisticasONE dialog = null;
                try {
                    dialog = new EstadisticasONE();
                } catch (IOException ex) {
                    Logger.getLogger(EstadisticasONE.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    * jpanel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel1;
    /**
    * jpanel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel2;
    /**
    * jpanel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel3;
    /**
    * jpanel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel4;
    /**
    * jpanel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel5;
    /**
    * jpanel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
