/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author ramon
 */
public class Vista_16 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana8
     */
    public Vista_16() {
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

        tfUsuario1 = new javax.swing.JTextField();
        tfContraseña3 = new javax.swing.JTextField();
        tfContraseña7 = new javax.swing.JTextField();
        Cancelar_Vista16 = new javax.swing.JButton();
        Aceptar_Vista16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NumParticipantes_Vista16 = new javax.swing.JTextField();

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

        Cancelar_Vista16.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar_Vista16.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar_Vista16.setText("Cancelar");
        Cancelar_Vista16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_Vista16ActionPerformed(evt);
            }
        });

        Aceptar_Vista16.setBackground(new java.awt.Color(0, 51, 255));
        Aceptar_Vista16.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar_Vista16.setText("Aceptar");
        Aceptar_Vista16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar_Vista16ActionPerformed(evt);
            }
        });

        jLabel1.setText("Participantes:");

        NumParticipantes_Vista16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumParticipantes_Vista16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(NumParticipantes_Vista16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cancelar_Vista16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Aceptar_Vista16)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NumParticipantes_Vista16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancelar_Vista16)
                    .addComponent(Aceptar_Vista16))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void NumParticipantes_Vista16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumParticipantes_Vista16ActionPerformed
        // TODO add your handling code here:
        Vista_13 v13 = new Vista_13();
        v13.show();
    }//GEN-LAST:event_NumParticipantes_Vista16ActionPerformed

    private void Aceptar_Vista16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar_Vista16ActionPerformed
        // TODO add your handling code here:
        Vista_13 v13 = new Vista_13();
        v13.show();
        this.dispose();
    }//GEN-LAST:event_Aceptar_Vista16ActionPerformed

    private void Cancelar_Vista16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_Vista16ActionPerformed
        // TODO add your handling code here:
        Vista_13 v13 = new Vista_13();
        v13.show();
        this.dispose();
    }//GEN-LAST:event_Cancelar_Vista16ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_16().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar_Vista16;
    private javax.swing.JButton Cancelar_Vista16;
    private javax.swing.JTextField NumParticipantes_Vista16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}