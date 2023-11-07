/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author ramon
 */
public class Vista_14 extends javax.swing.JFrame {
    private Camping c;
    private Actividad actActual;
    /**
     * Creates new form Ventana8
     */
    public Vista_14(Actividad actActual, Camping c) {
        initComponents();
        this.c = c;
        this.actActual = actActual;
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
        ListaParticipantes_Vista14 = new javax.swing.JList<>();
        Emparejar_Vista14 = new javax.swing.JButton();
        Atras_Vista14 = new javax.swing.JButton();

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

        ListaParticipantes_Vista14.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Pepe", "Isabel", "Vicente", "Juan", "Pablo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaParticipantes_Vista14);

        Emparejar_Vista14.setBackground(new java.awt.Color(0, 51, 255));
        Emparejar_Vista14.setForeground(new java.awt.Color(255, 255, 255));
        Emparejar_Vista14.setText("Emparejar");
        Emparejar_Vista14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emparejar_Vista14ActionPerformed(evt);
            }
        });

        Atras_Vista14.setBackground(new java.awt.Color(0, 51, 255));
        Atras_Vista14.setForeground(new java.awt.Color(255, 255, 255));
        Atras_Vista14.setText("Atrás");
        Atras_Vista14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atras_Vista14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(Atras_Vista14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emparejar_Vista14)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emparejar_Vista14)
                    .addComponent(Atras_Vista14))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed

    private void Emparejar_Vista14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emparejar_Vista14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emparejar_Vista14ActionPerformed

    private void Atras_Vista14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_Vista14ActionPerformed
        // TODO add your handling code here:
        Vista_13 v13 = new Vista_13(actActual,c);
        v13.show();
        this.dispose();
    }//GEN-LAST:event_Atras_Vista14ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Vista_14().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Vista14;
    private javax.swing.JButton Emparejar_Vista14;
    private javax.swing.JList<String> ListaParticipantes_Vista14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}
