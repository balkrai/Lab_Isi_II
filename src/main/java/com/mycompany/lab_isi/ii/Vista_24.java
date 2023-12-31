/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import modelo.Camping;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Actividad;
import modelo.Cliente;

/**
 *
 * @author ramon
 */
public class Vista_24 extends javax.swing.JFrame {
    private Camping c;
    private Cliente clog;
    /**
     * Creates new form Ventana8
     */
    public Vista_24(Camping c, Cliente clog) {
        initComponents();
        this.c = c;
        this.clog = clog;
        DefaultListModel<Actividad> modelo = new DefaultListModel<>();
        ListaActividades_Vista24.setModel(modelo);
        ArrayList<Actividad> actividades = c.getActividades();
        for(int i = 0; i < actividades.size(); ++i)
        {
            modelo.addElement(actividades.get(i));
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

        tfUsuario1 = new javax.swing.JTextField();
        tfContraseña3 = new javax.swing.JTextField();
        tfContraseña7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaActividades_Vista24 = new javax.swing.JList<>();
        Seleccionar_Vista24 = new javax.swing.JButton();
        Atras_Vista24 = new javax.swing.JButton();

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

        jScrollPane1.setViewportView(ListaActividades_Vista24);

        Seleccionar_Vista24.setBackground(new java.awt.Color(0, 51, 255));
        Seleccionar_Vista24.setForeground(new java.awt.Color(255, 255, 255));
        Seleccionar_Vista24.setText("Seleccionar");
        Seleccionar_Vista24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Seleccionar_Vista24ActionPerformed(evt);
            }
        });

        Atras_Vista24.setBackground(new java.awt.Color(0, 51, 255));
        Atras_Vista24.setForeground(new java.awt.Color(255, 255, 255));
        Atras_Vista24.setText("Atrás");
        Atras_Vista24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_Vista24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Atras_Vista24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Seleccionar_Vista24)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Seleccionar_Vista24)
                    .addComponent(Atras_Vista24))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void Seleccionar_Vista24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Seleccionar_Vista24ActionPerformed
        Actividad a = ListaActividades_Vista24.getSelectedValue();
        if(a == null)
            JOptionPane.showMessageDialog(null, "SELECCIONA UNA ACTIVIDAD", "Inane error",JOptionPane.ERROR_MESSAGE);
        else
        {
            Vista_25 v25 = new Vista_25(c,clog,a);
            v25.show();
            this.dispose();
        }
            
    }//GEN-LAST:event_Seleccionar_Vista24ActionPerformed

    private void Atras_Vista24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_Vista24ActionPerformed
        // TODO add your handling code here:
        Vista_2 v2 = new Vista_2(c,clog);
        v2.show();
        this.dispose();
    }//GEN-LAST:event_Atras_Vista24ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista_12().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Vista24;
    private javax.swing.JList<Actividad> ListaActividades_Vista24;
    private javax.swing.JButton Seleccionar_Vista24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
    
}
