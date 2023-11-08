/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.lab_isi.ii;


import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Camping;
import modelo.Cliente;
import modelo.Reserva;

/**
 *
 * @author Borja Somovilla del saz
 */
public class Vista_22 extends javax.swing.JFrame {
        private int filaSeleccionada;
        private Vista_2 ant;    
        Cliente clienteLog;
        Camping camp;
    /**
     * Creates new form Ventana8
     */
    public Vista_22(Vista_2 v2,Camping c, Cliente cl) {
        initComponents();
        ant = v2;
        camp = c;
        clienteLog = cl;
        ActualizarTabla(clienteLog);
       
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
        Atras_Vista19 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReservas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        Atras_Vista19.setBackground(new java.awt.Color(0, 51, 255));
        Atras_Vista19.setForeground(new java.awt.Color(255, 255, 255));
        Atras_Vista19.setText("Modificar reserva");
        Atras_Vista19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoModificar(evt);
            }
        });

        TablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "28/1/2023", "29/1/2023",  new Float(15.0)},
                {"2", "28/1/2023", "29/1/2023",  new Float(50.0)},
                {"3", "19/5/2023", "21/5/2023",  new Float(88.0)},
                {"4", "20/5/2023", "21/5/2023",  new Float(26.0)},
                {null, null, null,  new Float(179.0)}
            },
            new String [] {
                "Parcela", "Entrada", "Salida", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaReservas);
        if (TablaReservas.getColumnModel().getColumnCount() > 0) {
            TablaReservas.getColumnModel().getColumn(0).setResizable(false);
            TablaReservas.getColumnModel().getColumn(1).setResizable(false);
            TablaReservas.getColumnModel().getColumn(2).setResizable(false);
            TablaReservas.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar llegada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Registrar salida");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atras_Vista19)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(148, 148, 148))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Atras_Vista19)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseña3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña3ActionPerformed

    private void tfContraseña7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseña7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseña7ActionPerformed


    private void EventoModificar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoModificar
        filaSeleccionada = TablaReservas.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) TablaReservas.getModel();
            Object valorID = modelo.getValueAt(filaSeleccionada, modelo.findColumn("id_reserva"));
            int identificador = Integer.parseInt(valorID.toString());
            Reserva ResSelec = clienteLog.BuscarReservaPorId(identificador);
            Vista_23 v23 = new Vista_23(clienteLog, ResSelec, this);
            v23.show();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila", "Error Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EventoModificar

    private void Atras_Vista19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atras_Vista19ActionPerformed
        
    }//GEN-LAST:event_Atras_Vista19ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ant.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        filaSeleccionada = TablaReservas.getSelectedRow();
        if (filaSeleccionada != -1) {
    
            DefaultTableModel modelo = (DefaultTableModel) TablaReservas.getModel();
            Object valorID = modelo.getValueAt(filaSeleccionada, modelo.findColumn("id_reserva"));
            int identificador = Integer.parseInt(valorID.toString());
            Reserva ResSelec = clienteLog.BuscarReservaPorId(identificador);
            if(ResSelec.setLlegada())
                JOptionPane.showMessageDialog(null, "Llegada registrada correctamente", "Llegada registrada", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "La fecha actual no coincide con el periodo de llegada", "Error al registrar la llegada", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila", "Error Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        filaSeleccionada = TablaReservas.getSelectedRow();
        if (filaSeleccionada != -1) {
    
            DefaultTableModel modelo = (DefaultTableModel) TablaReservas.getModel();
            Object valorID = modelo.getValueAt(filaSeleccionada, modelo.findColumn("id_reserva"));
            int identificador = Integer.parseInt(valorID.toString());
            Reserva ResSelec = clienteLog.BuscarReservaPorId(identificador);
            if(ResSelec.getLlegada())
                JOptionPane.showMessageDialog(null, "Salida registrada correctamente", "Salida registrada", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "No se registro la llegada", "Error al registrar la salida", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila", "Error Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    /**
     * @param args the command line arguments
     */
    
  public void ActualizarTabla(Cliente c)
  {
      ArrayList<Reserva> lista = clienteLog.getReservas();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("id_reserva");
        newModel.addColumn("FechaInicio");
        newModel.addColumn("FechaFin");
        newModel.addColumn("Precio");
        
        for (int i = 0; i < lista.size(); i++) {
            Reserva res = lista.get(i);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

           String fechaInicio = dateFormat.format(res.getFechaInicio());
           String fechaFin = dateFormat.format(res.getFechaFin());

           newModel.addRow(new Object[]{res.getId(), fechaInicio, fechaFin, res.getPrecio()});
            
        }
        TablaReservas.setModel(newModel);
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras_Vista19;
    private javax.swing.JTable TablaReservas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfContraseña3;
    private javax.swing.JTextField tfContraseña7;
    private javax.swing.JTextField tfUsuario1;
    // End of variables declaration//GEN-END:variables
}
