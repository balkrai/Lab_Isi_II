/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


/**
 *
 * @author teres
 */
public class Vista_2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana9a
     */
    public Vista_2(/*Personal_de_tierra c*/) {
        //this.controlador = c;
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

        Cancelar_Vista20 = new javax.swing.JButton();
        jbsinReserva = new javax.swing.JButton();
        jbActividades = new javax.swing.JButton();
        jbReserva = new javax.swing.JButton();
        Cancelar_Vista2 = new javax.swing.JButton();

        Cancelar_Vista20.setBackground(new java.awt.Color(0, 51, 255));
        Cancelar_Vista20.setText("Cancelar");
        Cancelar_Vista20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancelar_Vista20ActionPerformed(evt);
            }
        });

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
        jbActividades.setText("Actividades");
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
                            .addComponent(jbReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jbActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(Cancelar_Vista2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActividadesActionPerformed
        //PANEL_USUARIO_NO_REGISTRADO_1 ventana1 = new PANEL_USUARIO_NO_REGISTRADO_1();
        setVisible(false);
        //ventana1.setSize(getWidth(), getHeight());
        //ventana1.setVisible(true);
        Vista_21 v21 = new Vista_21();
        v21.show();
        this.dispose();
    }//GEN-LAST:event_jbActividadesActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Personal_de_tierra controlador = new Personal_de_tierra("pt1","pt1");
                new Vista_2(/*controlador*/).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar_Vista2;
    private javax.swing.JButton Cancelar_Vista20;
    private javax.swing.JButton jbActividades;
    private javax.swing.JButton jbReserva;
    private javax.swing.JButton jbsinReserva;
    // End of variables declaration//GEN-END:variables
    //private Personal_de_tierra controlador = new Personal_de_tierra("pt1","pt1");
}
