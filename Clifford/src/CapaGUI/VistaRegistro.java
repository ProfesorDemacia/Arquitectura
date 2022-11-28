/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDTO.Venta;
import CapaNegocio.NegocioVenta;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valay
 */
public class VistaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistro() {
        initComponents();
    }
    
    private void registroVentaTable(){
        try
        {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.tabla_registro.getModel();
            modelo.setNumRows(0);
            NegocioVenta auxNegocio = new NegocioVenta();
            Iterator iter = auxNegocio.consultaVenta().iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                Venta auxVent = new Venta();
                auxVent = (Venta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.tabla_registro.setValueAt(auxVent.getId_venta(), fila, 0);
                this.tabla_registro.setValueAt(auxVent.getFecha_venta(), fila, 1);
                this.tabla_registro.setValueAt(auxVent.getNombre_empresa(), fila, 2);
                this.tabla_registro.setValueAt(auxVent.getTotal_venta(), fila, 3);
                this.tabla_registro.setValueAt(auxVent.getId_detalleVenta(), fila, 4);
                this.tabla_registro.setValueAt(auxVent.getRut_empleado(), fila, 5);
                this.tabla_registro.setValueAt(auxVent.getMedio_pago(), fila, 6);
                fila++;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se ha podido registrar las ventas " + ex.getMessage());
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

        bto_mostrar = new javax.swing.JButton();
        jLabelBanner = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registro = new javax.swing.JTable();
        txt_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bto_mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/registro.png"))); // NOI18N
        bto_mostrar.setText("Mostrar Registro");
        bto_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 200, 70));

        jLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
        getContentPane().add(jLabelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 956, 140));

        tabla_registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Venta", "Fecha", "Nombre Empresa", "Monto", "Id Detalle", "Empleado", "Id Método de Pago"
            }
        ));
        jScrollPane1.setViewportView(tabla_registro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 910, 170));
        getContentPane().add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Total");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_mostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bto_mostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_mostrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_registro;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
