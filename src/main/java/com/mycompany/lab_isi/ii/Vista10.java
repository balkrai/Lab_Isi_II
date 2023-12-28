/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


import javax.swing.JOptionPane;
import modelo.Camping;
import modelo.Trabajador;

/**
 *
 * @author ramon
 */
public class Vista10 extends javax.swing.JFrame {
    private Camping c;
    /**
     * Creates new form Ventana8
     */
    public Vista10(Camping c) {
        initComponents();
        this.c = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfUsuario1 = new javax.swing.JTextField();
        tfContraseña3 = new javax.swing.JTextField();
        tfContraseña7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FechaCrearActividadVista10 = new com.toedter.calendar.JDateChooser();
        HoraFinCrearActividadVista10 = new javax.swing.JTextField();
        AceptarVista10 = new javax.swing.JButton();
        CancelarVista10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        HoraInicioCrearActividadVista10 = new javax.swing.JTextField();

        tfContraseña3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContraseña3ActionPerformed(evt);
            }
        });

        tfContraseña7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContraseña7ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hora inicio:");

        jLabel2.setText("Fecha:");

        HoraFinCrearActividadVista10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraFinCrearActividadVista10ActionPerformed(evt);
            }
        });

        AceptarVista10.setBackground(new java.awt.Color(0, 51, 255));
        AceptarVista10.setForeground(new java.awt.Color(255, 255, 255));
        AceptarVista10.setText("Aceptar");
        AceptarVista10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarVista10ActionPerformed(evt);
            }
        });

        CancelarVista10.setBackground(new java.awt.Color(0, 51, 255));
        CancelarVista10.setForeground(new java.awt.Color(255, 255, 255));
        CancelarVista10.setText("Cancelar");
        CancelarVista10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarVista10ActionPerformed(evt);
            }
        });

        jLabel3.setText("Hora fin:");

        HoraInicioCrearActividadVista10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraInicioCrearActividadVista10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(CancelarVista10)
                .addGap(50, 50, 50)
                .addComponent(AceptarVista10)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HoraInicioCrearActividadVista10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaCrearActividadVista10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoraFinCrearActividadVista10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HoraInicioCrearActividadVista10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(HoraFinCrearActividadVista10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FechaCrearActividadVista10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarVista10)
                    .addComponent(CancelarVista10))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void AceptarVista10ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Vista11 v11 = new Vista11(c);
        v11.show();
        this.dispose();
    }                                              

    private void CancelarVista10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarVista10ActionPerformed
        // TODO add your handling code here:
        Vista_9 v9 = new Vista_9(c);
        v9.show();
        this.dispose();
    }//GEN-LAST:event_CancelarVista10ActionPerformed

    private void HoraFinCrearActividadVista10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraFinCrearActividadVista10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraFinCrearActividadVista10ActionPerformed

    private void HoraInicioCrearActividadVista10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraInicioCrearActividadVista10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraInicioCrearActividadVista10ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista_10().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarVista10;
    private javax.swing.JButton CancelarVista10;
    private com.toedter.calendar.JDateChooser FechaCrearActividadVista10;
    private javax.swing.JTextField HoraFinCrearActividadVista10;
    private javax.swing.JTextField HoraInicioCrearActividadVista10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}