package com.miapp.triage.gui;
import com.miapp.triage.metodoscsv.lpacientes;
import com.miapp.triage.metodoscsv.ltriage;
import com.miapp.triage.triage.Medicos;
import com.miapp.triage.triage.Paciente;
import com.miapp.triage.triage.Triage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * Clase TriageGUI
 * 
 * @author Fran
 */
public class TriageGUI extends javax.swing.JFrame {

    /**
    * instancia de ltriage
    */
    private ltriage gestorTriage;
    /**
    * instancia de listaesperatriage
    */
    ListaesperaTriage listaesperaTriage = new ListaesperaTriage();
    
    /**
     * Ruta del archivo "medicos.csv" utilizado en el programa.
     */
    String archivo2 = "src\\main\\java\\com\\miapp\\triage\\csv\\medicos.csv";
    
    /**
    * Ruta del archivo "triage.csv" utilizado en el programa.
    */
    String archivo3 = "src\\main\\java\\com\\miapp\\triage\\csv\\triage.csv";
    
    
    /**
    * crea instancia de clase TriageGUI
    * 
    */
    public TriageGUI() {
        initComponents();
         try {
            cargarMedicoDesdeArchivo(archivo2);
            gestorTriage = new ltriage();
            new lpacientes();
            
            List<String> dniList = listaesperaTriage.obtenerDniDesdeTabla();
            for (String dni : dniList) {
                jComboBox5.addItem(dni);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Respiracion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 199, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pulso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 236, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Estado Mental");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Conciencia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 304, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dolor de pecho");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 338, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Lesiones Graves");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 378, -1, 10));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Edad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 406, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fiebre");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Vomitos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 474, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Dolor abdominal");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 508, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Signos de Shock");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 542, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Lesiones leves");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 576, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Sangrado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 610, -1, -1));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 32, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Moderada", "Grave" }));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 196, 219, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Anormal" }));
        jComboBox2.setBorder(null);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 230, 219, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Confusion leve", "Confusion Grave" }));
        jComboBox3.setBorder(null);
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 264, 219, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consciente y alerta", "Perdida de conciencia" }));
        jComboBox4.setBorder(null);
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 298, 219, -1));

        jComboBox8.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox8.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Presente" }));
        jComboBox8.setBorder(null);
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 332, 219, -1));

        jComboBox9.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox9.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Presentes" }));
        jComboBox9.setBorder(null);
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 366, 219, -1));

        jComboBox10.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adulto", "Niño o anciano" }));
        jComboBox10.setBorder(null);
        getContentPane().add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 400, 219, -1));

        jComboBox11.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox11.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin fiebre", "Fiebre moderada", "Fiebre alta" }));
        jComboBox11.setBorder(null);
        getContentPane().add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 434, 219, -1));

        jComboBox12.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox12.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin vómitos", "Vómitos moderados", "Vómitos intesos" }));
        jComboBox12.setBorder(null);
        getContentPane().add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 468, 219, -1));

        jComboBox13.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox13.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Dolor moderado", "Dolor severo" }));
        jComboBox13.setBorder(null);
        getContentPane().add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 502, 219, -1));

        jComboBox14.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox14.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "presentes" }));
        jComboBox14.setBorder(null);
        getContentPane().add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 536, 219, -1));

        jComboBox15.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox15.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presentes", "Presentes" }));
        jComboBox15.setBorder(null);
        getContentPane().add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 570, 219, -1));

        jComboBox16.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox16.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Sangrado moderado", "Sangrado intenso" }));
        jComboBox16.setBorder(null);
        getContentPane().add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 604, 219, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 657, -1, -1));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox5.setBorder(null);
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 162, 219, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Dni paciente triage");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 165, -1, -1));

        jComboBox6.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox6.setBorder(null);
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 128, 219, -1));

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Medico triage");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 131, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(60, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TRIAGE");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 80));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setFont(new java.awt.Font("Roboto Black", 1,12));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Fecha Triage");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 610));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Agregar ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 640, -1, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 10, 610));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 400, 10));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 10, 610));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 420, 10));

        jFormattedTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuDos pacinuev = new MenuDos();
        pacinuev.setVisible(true);
        pacinuev.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String fecha = jFormattedTextField3.getText();
       

        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debes agregar una fecha.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        Date fechau=null;
        

        try {
            fechau = sdf.parse(fecha);
            String PuntuacionRespiracion = (String) jComboBox1.getSelectedItem();
        String PuntuacionPulso = (String) jComboBox2.getSelectedItem();
        String PuntuacionEstMental = (String) jComboBox3.getSelectedItem();
        String PuntuacionConciencia= (String) jComboBox4.getSelectedItem();
        String PuntuacionDolResp= (String) jComboBox8.getSelectedItem();
        String PuntuacionLesGraves= (String) jComboBox9.getSelectedItem();
        String PuntuacionEdad= (String) jComboBox10.getSelectedItem();
        String PuntuacionFiebre= (String) jComboBox11.getSelectedItem();
        String PuntuacionVomitos= (String) jComboBox12.getSelectedItem();
        String PuntuacionDolAbdominal= (String) jComboBox13.getSelectedItem();
        String PuntuacionSignosShock= (String) jComboBox14.getSelectedItem();
        String PuntuacionLesLeves= (String) jComboBox15.getSelectedItem();
        String PuntuacionSangrado= (String) jComboBox16.getSelectedItem();
        
        
        Triage triage = new Triage(); 
        triage.setFecha(fechau);
        triage.calcularPuntuacion(
        PuntuacionRespiracion, PuntuacionPulso, PuntuacionEstMental, PuntuacionConciencia,
        PuntuacionDolResp, PuntuacionLesGraves, PuntuacionEdad, PuntuacionFiebre,
        PuntuacionVomitos, PuntuacionDolAbdominal, PuntuacionSignosShock,
        PuntuacionLesLeves, PuntuacionSangrado);

        int puntuacion = triage.getpuntuacion();
               
        //////
        
        triage.calcularTipoUrgencia(puntuacion);
        String tipoUrgen = triage.calcularTipoUrgencia(puntuacion);
        triage.setTipourgencia(tipoUrgen);
        
        triage.calcularColor(puntuacion);
        String colorUrgencia = triage.calcularColor(puntuacion);
        triage.setColorAsignado(colorUrgencia);
        
        triage.calcularTiempoEspera(puntuacion);
        String tiempoEspe = triage.calcularTiempoEspera(puntuacion);
        triage.setTiempoespera(tiempoEspe);
        
        long DniSeleccionado = Long.parseLong(jComboBox5.getSelectedItem().toString());
        Paciente paci = new Paciente();
        paci.setDNI(DniSeleccionado);
        triage.setPaciente(paci);
        
        
        String medicoSeleccionado = (jComboBox6.getSelectedItem().toString());
        Medicos medico = new Medicos();
        medico.setNombre(medicoSeleccionado);
        triage.setMedico(medico);
        
        triage.setpuntuacion(puntuacion);
        gestorTriage.agregar(triage);
        gestorTriage.escribirArchivo(archivo3,";", true);

        JOptionPane.showMessageDialog(this, "La puntuacion del triage es: " + puntuacion);
        volverAtras();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "El formato de fecha no es válido");
        }
        
        
        
        /////
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed
    
    /**
    * metodo para volver atras
    * 
    */
    private void volverAtras() {
    TriagemenuGUI pacinuev = new TriagemenuGUI();
    pacinuev.setVisible(true);
    pacinuev.setLocationRelativeTo(null);
    this.setVisible(false);
}
    
    /**
    * carga medicos desde un archivo
    * @param archivo2 archivo donde esta la informacion
    * @return medicos
    */
    private void cargarMedicoDesdeArchivo(String archivo2) throws IOException {
    BufferedReader br = null;
    try {
        br = new BufferedReader(new FileReader(archivo2));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            
            if (datos.length >= 2) {
                String nombre = datos[1];
                String apellido = datos[2];
                
               
                String nombreCompleto = nombre + " " + apellido; 

                jComboBox6.addItem(nombreCompleto);
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
     
     /**
     * metodo main
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(TriageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriageGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriageGUI().setVisible(true);
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
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox10;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox11;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox12;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox13;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox14;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox15;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox16;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox2;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox3;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox4;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox5;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox6;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox8;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox9;
    /**
    * jformattedtextfiedl utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField3;
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
    private javax.swing.JLabel jLabel15;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel16;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel17;
    /**
    * label utilizado en la interfaz
    */
    private javax.swing.JLabel jLabel18;
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
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel7;
    /**
    * panel utilizado en la interfaz
    */
    private javax.swing.JPanel jPanel8;
    
    // End of variables declaration//GEN-END:variables
}
