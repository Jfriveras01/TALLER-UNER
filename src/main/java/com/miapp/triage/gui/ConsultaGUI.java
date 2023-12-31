/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.miapp.triage.gui;

import com.miapp.triage.metodoscsv.lconsulta;
import com.miapp.triage.triage.BoxAtencion;
import com.miapp.triage.triage.Consulta;
import com.miapp.triage.triage.Medicos;
import com.miapp.triage.triage.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Clase ConsultaGUI
 * 
 * @author Fran
 */
public class ConsultaGUI extends javax.swing.JFrame {

   /**
     * crea instancia listaespera
     */
    ListaEspera listaespera = new ListaEspera();
    /**
     * variable para manejar la instancia de lconsulta
     */
    public lconsulta gestorConsulta;
    /**
    * Ruta del archivo "medicos.csv" utilizado en el programa.
    */
    String archivo2 = "src\\main\\java\\com\\miapp\\triage\\csv\\medicos.csv";
    /**
    * Ruta del archivo "consultas.csv" utilizado en el programa.
    */
    String archivo3 = "src\\main\\java\\com\\miapp\\triage\\csv\\Consultas.csv";
    
    /**
    * Constructor de la clase ConsultaGUI.
    */
    public ConsultaGUI() {
    initComponents();
    try {
        gestorConsulta = new lconsulta();
        jTextField1.setEditable(false);
        cargarMedicoDesdeArchivo(archivo2);
        Historialclinica historial = new Historialclinica();
        List<String> dniList = listaespera.obtenerDniDesdeTabla();
            for (String dni : dniList) {
                jComboBox2.addItem(dni);
            }
        
        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarPuntuacionPaciente();
                

            }
        });
    } catch (IOException ex) {
        Logger.getLogger(ConsultaGUI.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DNI Paciente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setBorder(null);
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 124, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jFormattedTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFormattedTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextField1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 123, -1));

        jFormattedTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jFormattedTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jFormattedTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jPanel1.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 123, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consultorio", "Emergencia", "Internaciones" }));
        jComboBox3.setBorder(null);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 123, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox4.setBorder(null);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 123, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 123, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 123, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 123, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSULTA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 70));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 70, 540, 10));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Hora");

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Lugar");

        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Box");

        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Medico");

        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Puntuacion Triage");

        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Motivo Consulta");

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Diagnostico Clinico");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7)
                        .addComponent(jLabel3)
                        .addComponent(jLabel10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 470));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 20, 470));

        jButton5.setBackground(new java.awt.Color(153, 255, 255));
        jButton5.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Agendar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Diagnostico Clinico");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 123, -1));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Historia Clinca");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 473, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // Validación de campos obligatorios
        Date fechaturno = null;

        if (jFormattedTextField1.getText().isEmpty() || jComboBox2.getSelectedItem() == null || jFormattedTextField2.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Los campos DNI Paciente, Fecha y Hora son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Sale de la función si falta algún campo obligatorio
    }

    Consulta con = new Consulta();

    long DniSeleccionado = Long.parseLong(jComboBox2.getSelectedItem().toString());
    Paciente paci = new Paciente();
    paci.setDNI(DniSeleccionado);
    con.setConsul(paci);

    try {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        fechaturno = dateFormat.parse(jFormattedTextField1.getText()); // Asigna el valor parseado a la variable fecha
        con.setFecha(fechaturno);
    } catch (ParseException e) {
        // Manejar cualquier error de conversión de fecha aquí
        e.printStackTrace();
    }

    
    String horaCompleta = jFormattedTextField2.getText();
    String[] partes = horaCompleta.split(":");

    if (partes.length == 2) {
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        int horaEntera = horas * 100 + minutos;

        // Convierte la hora entera en formato "HH:mm"
        String horaFormateada = String.format("%02d:%02d", horas, minutos);
        con.setHora(horaFormateada);
    } else {
        JOptionPane.showMessageDialog(this, "Formato de hora incorrecto, use HH:mm", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    con.setLugar(jComboBox3.getSelectedItem().toString());
    
    
    String boxSeleccionadoStr = (String) jComboBox4.getSelectedItem();
    if (boxSeleccionadoStr != null) {
    int boxSeleccionado = Integer.parseInt(boxSeleccionadoStr);
    BoxAtencion box = new BoxAtencion();
    box.setId_box(boxSeleccionado);
    con.setBoxAtencion(box);
} else {
    JOptionPane.showMessageDialog(this, "Debes seleccionar un número de box", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}
    
    String medicoSeleccionado = (jComboBox1.getSelectedItem().toString());
    Medicos medico = new Medicos();
    medico.setNombre(medicoSeleccionado);
    con.setMedico(medico);
    
    con.setDiagnostico(jTextField3.getText());
    con.setDiagClinico(jTextField2.getText());
    gestorConsulta.agregar(con);
    gestorConsulta.escribirArchivo(archivo3, ";", true);
    jFormattedTextField1.setText("");
    jFormattedTextField2.setText("");
    jTextField3.setText("");
    jTextField1.setText("");
    jTextField2.setText("");
    jComboBox1.setSelectedIndex(-1); // Deselecciona el elemento del JComboBox

    ////////////

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * Carga la puntuacion del paciente
    *
    * @return puntuacion
    */
    private void cargarPuntuacionPaciente() {
        String pacienteSeleccionado = jComboBox2.getSelectedItem().toString();
        String puntu = cargarPuntuacion(pacienteSeleccionado);
        String diagpaci = cargarDiagnostico(pacienteSeleccionado);
        jTextField3.setText(diagpaci);
        jTextField1.setText(puntu);
        
        jTextField1.setEditable(false);
        jTextField3.setEditable(false);
    }
       
    /**
    * carga la puntuacion
    * @param pacienteSeleccionado paciente seleccionado
    * @return puntuacion
    */
       private String cargarPuntuacion(String pacienteSeleccionado) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\miapp\\triage\\csv\\triage.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length > 5) {
                    String dni = datos[6];
                    if (dni.equals(pacienteSeleccionado)) {
                        return datos[4]; 
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Si el médico no se encuentra, devuelve un mensaje o una cadena vacía
        return "Información no encontrada";
    }
       
        /**
        * carga el diagnostico
        * @param pacienteSeleccionado paciente seleccionado
        * @return diagnostico
        */
        private String cargarDiagnostico (String pacienteSeleccionado) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\miapp\\triage\\csv\\pacientes.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length > 5) {
                    String dni = datos[5];
                    if (dni.equals(pacienteSeleccionado)) {
                        return datos[10]; 
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Si el médico no se encuentra, devuelve un mensaje o una cadena vacía
        return "Información no encontrada";
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MenuDos men = new MenuDos();
        men.setVisible(true);
        men.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // Obtiene el DNI del paciente seleccionado
        String dniSeleccionado = (String) jComboBox2.getSelectedItem();

        // Crea una instancia de Historialclinica
        Historialclinica historiaClinica = new Historialclinica();

        // Carga y muestra los datos de la historia clínica para el paciente seleccionado
        historiaClinica.cargarDatosPaciente(dniSeleccionado);

        // Muestra la ventana de Historia clínica
        historiaClinica.setVisible(true);
        historiaClinica.setLocationRelativeTo(this);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    
    
    /**
    * carga los medicos desde un archivo
    * @param archivo2 archivo donde esta guardada la informacion 
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
                    // Agregar el nombre completo al ComboBox
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
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaGUI().setVisible(true);
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
    private javax.swing.JButton jButton5;
    /**
    * jcombobox utilizado en la interfaz
    */
    private javax.swing.JComboBox<String> jComboBox1;
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
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField1;
    /**
    * jformattedtextfield utilizado en la interfaz
    */
    private javax.swing.JFormattedTextField jFormattedTextField2;
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
    // End of variables declaration//GEN-END:variables
}
