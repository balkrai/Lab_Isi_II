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
public class Vista_8 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana8
     */
    public Vista_8() {
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
        nombreTienda1 = new javax.swing.JTextField();
        nombreTienda2 = new javax.swing.JTextField();
        jbAceptar = new javax.swing.JButton();
        nombreTienda4 = new javax.swing.JTextField();
        nombreTienda3 = new javax.swing.JTextField();
        m2_tienda1 = new javax.swing.JTextField();
        m2_tienda2 = new javax.swing.JTextField();
        m2_tienda3 = new javax.swing.JTextField();
        m2_tienda4 = new javax.swing.JTextField();

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

        nombreTienda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTienda2ActionPerformed(evt);
            }
        });

        jbAceptar.setBackground(new java.awt.Color(51, 102, 255));
        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        nombreTienda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTienda4ActionPerformed(evt);
            }
        });

        nombreTienda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTienda3ActionPerformed(evt);
            }
        });

        m2_tienda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2_tienda1ActionPerformed(evt);
            }
        });

        m2_tienda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2_tienda2ActionPerformed(evt);
            }
        });

        m2_tienda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2_tienda3ActionPerformed(evt);
            }
        });

        m2_tienda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2_tienda4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTienda1)
                    .addComponent(nombreTienda2)
                    .addComponent(nombreTienda3)
                    .addComponent(nombreTienda4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(m2_tienda4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jbAceptar)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTienda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTienda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2_tienda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbAceptar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        Vista_2 vista_2 = new Vista_2();
        setVisible(false);
        vista_2.setSize(412, 700);
        vista_2.setPreferredSize(new Dimension(412, 800));
        vista_2.setVisible(true);
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void nombreTienda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTienda2ActionPerformed
            

    }//GEN-LAST:event_nombreTienda2ActionPerformed

    private void nombreTienda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTienda4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTienda4ActionPerformed

    private void nombreTienda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTienda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTienda3ActionPerformed

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void m2_tienda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2_tienda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2_tienda1ActionPerformed

    private void m2_tienda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2_tienda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2_tienda2ActionPerformed

    private void m2_tienda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2_tienda3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2_tienda3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void m2_tienda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2_tienda4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2_tienda4ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_8().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptar;
    private javax.swing.JTextField m2_tienda1;
    private javax.swing.JTextField m2_tienda2;
    private javax.swing.JTextField m2_tienda3;
    private javax.swing.JTextField m2_tienda4;
    private javax.swing.JTextField nombreTienda1;
    private javax.swing.JTextField nombreTienda2;
    private javax.swing.JTextField nombreTienda3;
    private javax.swing.JTextField nombreTienda4;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}
