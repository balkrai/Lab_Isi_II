/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;

import modelo.Camping;
import modelo.Cliente;


/**
 *
 * @author teres
 */
public class Vista_2 extends javax.swing.JFrame {

     private Camping camp;
     private Cliente clienteLog;
    /**
     * Creates new form Ventana9a
     */
    public Vista_2(Camping c,Cliente client) {
        //this.controlador = c;
        initComponents();
        camp = c;
        clienteLog = client;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cancelar_Vista20 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jbsinReserva = new javax.swing.JButton();
        jbActividades = new javax.swing.JButton();
        jbReserva = new javax.swing.JButton();
        Cancelar_Vista2 = new javax.swing.JButton();
        jbActividades1 = new javax.swing.JButton();

        Cancelar_Vista20.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar_Vista20.setText("Cancelar");
        Cancelar_Vista20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_Vista20ActionPerformed(evt);
            }
        });

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

        jbsinReserva.setBackground(new java.awt.Color(0, 51, 255));
        jbsinReserva.setForeground(new java.awt.Color(255, 255, 255));
        jbsinReserva.setText("Sin reserva");
        jbsinReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsinReservaActionPerformed(evt);
            }
        });

        jbActividades.setBackground(new java.awt.Color(0, 51, 255));
        jbActividades.setForeground(new java.awt.Color(255, 255, 255));
        jbActividades.setText("Modificar Reserva");
        jbActividades.setActionCommand("Cancelar Reserva");
        jbActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActividadesActionPerformed(evt);
            }
        });

        jbReserva.setBackground(new java.awt.Color(0, 51, 255));
        jbReserva.setForeground(new java.awt.Color(255, 255, 255));
        jbReserva.setText("Reserva");
        jbReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservaActionPerformed(evt);
            }
        });

        Cancelar_Vista2.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar_Vista2.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar_Vista2.setText("Cancelar");
        Cancelar_Vista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_Vista2ActionPerformed(evt);
            }
        });

        jbActividades1.setBackground(new java.awt.Color(0, 51, 255));
        jbActividades1.setForeground(new java.awt.Color(255, 255, 255));
        jbActividades1.setText("Actividades");
        jbActividades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActividades1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbsinReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbActividades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbActividades1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(Cancelar_Vista2)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbsinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbActividades1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Cancelar_Vista2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbsinReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsinReservaActionPerformed

        Vista_6 v6 = new Vista_6();
        v6.show();
        this.dispose();
        //ventana10.setSize(getWidth(), getHeight());
        //ventana10.setVisible(true);
    }//GEN-LAST:event_jbsinReservaActionPerformed

    private void jbReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservaActionPerformed
        Vista_3 v3 = new Vista_3();
        v3.show();
        this.dispose();
    }//GEN-LAST:event_jbReservaActionPerformed

    private void Cancelar_Vista20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_Vista20ActionPerformed

    }//GEN-LAST:event_Cancelar_Vista20ActionPerformed

    private void Cancelar_Vista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancelar_Vista2ActionPerformed
        // TODO add your handling code here:
        Vista_1 v1 = new Vista_1();
        v1.show();
        this.dispose();
    }//GEN-LAST:event_Cancelar_Vista2ActionPerformed

    private void jbActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActividades1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbActividades1ActionPerformed

    private void jbActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActividadesActionPerformed
        Vista_22 v22 = new Vista_22(this,camp,clienteLog);
        v22.show();
        this.dispose();
    }//GEN-LAST:event_jbActividadesActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(Vista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar_Vista2;
    private javax.swing.JButton Cancelar_Vista20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbActividades;
    private javax.swing.JButton jbActividades1;
    private javax.swing.JButton jbReserva;
    private javax.swing.JButton jbsinReserva;
    // End of variables declaration//GEN-END:variables
    //private Personal_de_tierra controlador = new Personal_de_tierra("pt1","pt1");
}
