/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Camping;
import modelo.Trabajador;

/**
 *
 * @author ramon
 */
public class Vista_9 extends javax.swing.JFrame {
    private Camping c;
    /**
     * Creates new form Ventana8
     */
    public Vista_9(Camping c) {
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
        CrearActividad_Vista9 = new javax.swing.JButton();
        Descuento_Vista9 = new javax.swing.JButton();
        RegCliente_Vista9 = new javax.swing.JButton();
        ConsHistorial_Vista9 = new javax.swing.JButton();
        GestActividad_Vista9 = new javax.swing.JButton();
        cancelar_Vista9 = new javax.swing.JButton();

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

        CrearActividad_Vista9.setBackground(new java.awt.Color(0, 51, 255));
        CrearActividad_Vista9.setForeground(new java.awt.Color(255, 255, 255));
        CrearActividad_Vista9.setText("Crear actividad");
        CrearActividad_Vista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActividad_Vista9ActionPerformed(evt);
            }
        });

        Descuento_Vista9.setBackground(new java.awt.Color(0, 51, 255));
        Descuento_Vista9.setForeground(new java.awt.Color(255, 255, 255));
        Descuento_Vista9.setText("Establecer descuento");
        Descuento_Vista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descuento_Vista9ActionPerformed(evt);
            }
        });

        RegCliente_Vista9.setBackground(new java.awt.Color(0, 51, 255));
        RegCliente_Vista9.setForeground(new java.awt.Color(255, 255, 255));
        RegCliente_Vista9.setText("Registrar cliente sin reserva");
        RegCliente_Vista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegCliente_Vista9ActionPerformed(evt);
            }
        });

        ConsHistorial_Vista9.setBackground(new java.awt.Color(0, 51, 255));
        ConsHistorial_Vista9.setForeground(new java.awt.Color(255, 255, 255));
        ConsHistorial_Vista9.setText("Consultar historial");
        ConsHistorial_Vista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsHistorial_Vista9ActionPerformed(evt);
            }
        });

        GestActividad_Vista9.setBackground(new java.awt.Color(0, 51, 255));
        GestActividad_Vista9.setForeground(new java.awt.Color(255, 255, 255));
        GestActividad_Vista9.setText("Gestionar actividad");
        GestActividad_Vista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestActividad_Vista9ActionPerformed(evt);
            }
        });

        cancelar_Vista9.setBackground(new java.awt.Color(0, 51, 255));
        cancelar_Vista9.setForeground(new java.awt.Color(255, 255, 255));
        cancelar_Vista9.setText("Cancelar");
        cancelar_Vista9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_Vista9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CrearActividad_Vista9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Descuento_Vista9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RegCliente_Vista9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ConsHistorial_Vista9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GestActividad_Vista9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelar_Vista9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Descuento_Vista9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegCliente_Vista9)
                .addGap(12, 12, 12)
                .addComponent(ConsHistorial_Vista9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CrearActividad_Vista9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GestActividad_Vista9)
                .addGap(12, 12, 12)
                .addComponent(cancelar_Vista9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void CrearActividad_Vista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActividad_Vista9ActionPerformed
        //ALTA_VUELO_9b ventana_9b = new ALTA_VUELO_9b(this.controlador,this);
        //setVisible(false);
        //ventana_9b.setSize(412, 700);
        //ventana_9b.setPreferredSize(new Dimension(412, 800));
        //ventana_9b.setVisible(true);
        Vista10 v10 = new Vista10(c);
        v10.show();
        this.dispose();
    }//GEN-LAST:event_CrearActividad_Vista9ActionPerformed

    private void Descuento_Vista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descuento_Vista9ActionPerformed
        // TODO add your handling code here:
        Vista_17 v17 = new Vista_17(c);
        v17.show();
        this.dispose();
    }//GEN-LAST:event_Descuento_Vista9ActionPerformed

    private void ConsHistorial_Vista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsHistorial_Vista9ActionPerformed
        // TODO add your handling code here:
        Vista_18 v18 = new Vista_18(c);
        v18.show();
        this.dispose();
    }//GEN-LAST:event_ConsHistorial_Vista9ActionPerformed

    private void GestActividad_Vista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestActividad_Vista9ActionPerformed
        // TODO add your handling code here:
        Vista_12 v12 = new Vista_12(c);
        v12.show();
        this.dispose();
    }//GEN-LAST:event_GestActividad_Vista9ActionPerformed

    private void cancelar_Vista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_Vista9ActionPerformed
        // TODO add your handling code here:
        Vista_1 v1 = new Vista_1();
        v1.show();
        this.dispose();
    }//GEN-LAST:event_cancelar_Vista9ActionPerformed

    private void RegCliente_Vista9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegCliente_Vista9ActionPerformed
        // TODO add your handling code here:
        /*Vista_20 v20 = new Vista_20(c);
        v20.show();
        this.dispose();*/
    }//GEN-LAST:event_RegCliente_Vista9ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista_9().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsHistorial_Vista9;
    private javax.swing.JButton CrearActividad_Vista9;
    private javax.swing.JButton Descuento_Vista9;
    private javax.swing.JButton GestActividad_Vista9;
    private javax.swing.JButton RegCliente_Vista9;
    private javax.swing.JButton cancelar_Vista9;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}
