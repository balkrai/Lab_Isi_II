/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


import java.awt.Dimension;
import modelo.Camping;
import modelo.Trabajador;

/**
 *
 * @author ramon
 */
public class Vista11 extends javax.swing.JFrame {
    private transient Camping c;
    /**
     * Creates new form Ventana8
     */
    public Vista11(Camping c) {
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
        PiscinaActividad_Vista11 = new javax.swing.JButton();
        FrontonActividad_Vista11 = new javax.swing.JButton();
        JuegoActividad_Vista11 = new javax.swing.JButton();
        Aceptar_Vista11 = new javax.swing.JButton();
        Cancelar_Vista11 = new javax.swing.JButton();

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

        PiscinaActividad_Vista11.setBackground(new java.awt.Color(0, 51, 255));
        PiscinaActividad_Vista11.setForeground(new java.awt.Color(255, 255, 255));
        PiscinaActividad_Vista11.setText("Actividad de piscina");
        PiscinaActividad_Vista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiscinaActividad_Vista11ActionPerformed(evt);
            }
        });

        FrontonActividad_Vista11.setBackground(new java.awt.Color(0, 51, 255));
        FrontonActividad_Vista11.setForeground(new java.awt.Color(255, 255, 255));
        FrontonActividad_Vista11.setText("Actividad frontón");
        FrontonActividad_Vista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrontonActividad_Vista11ActionPerformed(evt);
            }
        });

        JuegoActividad_Vista11.setBackground(new java.awt.Color(0, 51, 255));
        JuegoActividad_Vista11.setForeground(new java.awt.Color(255, 255, 255));
        JuegoActividad_Vista11.setText("Actividad de juego de mesa");
        JuegoActividad_Vista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuegoActividad_Vista11ActionPerformed(evt);
            }
        });

        Aceptar_Vista11.setBackground(new java.awt.Color(0, 51, 255));
        Aceptar_Vista11.setForeground(new java.awt.Color(255, 255, 255));
        Aceptar_Vista11.setText("Aceptar");
        Aceptar_Vista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Aceptar_Vista11ActionPerformed(evt);
            }
        });

        Cancelar_Vista11.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar_Vista11.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar_Vista11.setText("Cancelar");
        Cancelar_Vista11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_Vista11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cancelar_Vista11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Aceptar_Vista11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JuegoActividad_Vista11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PiscinaActividad_Vista11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FrontonActividad_Vista11, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(PiscinaActividad_Vista11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FrontonActividad_Vista11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JuegoActividad_Vista11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar_Vista11)
                    .addComponent(Cancelar_Vista11))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void PiscinaActividad_Vista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiscinaActividad_Vista11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PiscinaActividad_Vista11ActionPerformed

    private void FrontonActividad_Vista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrontonActividad_Vista11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FrontonActividad_Vista11ActionPerformed

    private void JuegoActividad_Vista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuegoActividad_Vista11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JuegoActividad_Vista11ActionPerformed

    private void Aceptar_Vista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Aceptar_Vista11ActionPerformed
        Vista_9 v9 = new Vista_9(c);
        v9.show();
        this.dispose();
    }//GEN-LAST:event_Aceptar_Vista11ActionPerformed

    private void Cancelar_Vista11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_Vista11ActionPerformed
        // TODO add your handling code here:
        Vista10 v10 = new Vista10(c);
        v10.show();
        this.dispose();
    }//GEN-LAST:event_Cancelar_Vista11ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista_11().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar_Vista11;
    private javax.swing.JButton Cancelar_Vista11;
    private javax.swing.JButton FrontonActividad_Vista11;
    private javax.swing.JButton JuegoActividad_Vista11;
    private javax.swing.JButton PiscinaActividad_Vista11;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}
