/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDTO.Venta;
import CapaNegocio.NegocioCancelarVenta;
import CapaNegocio.NegocioDetalleVenta;
import CapaNegocio.NegocioVenta;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class VistaCancelarVenta extends javax.swing.JFrame {

    /**
     * Creates new form VistaCancelarVenta
     */
    public VistaCancelarVenta() {
        initComponents();
        buscarVenta();
    }
    
    public void eliminarVenta()
    {
        int fila = table_cancelarVenta.getSelectedRow();
        int id_venta = Integer.parseInt(table_cancelarVenta.getValueAt(fila, 0).toString());
        int id_detalle = Integer.parseInt(table_cancelarVenta.getValueAt(fila,4).toString());
        int folio = 0;
        try {
            
            NegocioCancelarVenta auxNegocioCancelarVenta = new NegocioCancelarVenta() ;
            NegocioDetalleVenta auxNegocioDetalleVenta =  new NegocioDetalleVenta();
            
         
            auxNegocioCancelarVenta.configurarConexion();
            folio = auxNegocioDetalleVenta.encontrarFolioEspecifico(id_detalle);
            auxNegocioCancelarVenta.eliminarVenta(id_venta);  
            auxNegocioCancelarVenta.getConect1().setEsSelect(false);
            auxNegocioCancelarVenta.getConect1().conectar();
            auxNegocioCancelarVenta.getConect1().cerrar();
            
            
            
            
            auxNegocioDetalleVenta.configurarConexion();
            auxNegocioDetalleVenta.eliminarDetalleVenta(folio);
            auxNegocioDetalleVenta.getConect1().setEsSelect(false);
            
            auxNegocioDetalleVenta.getConect1().conectar();
            JOptionPane.showMessageDialog(null,"Se borro la tabla con exito");
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo borrar la venta " + ex.getMessage());
        }
    }
    
    
    public void buscarVentaEspecifica(int id_venta)
    {
        try
        {
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.table_cancelarVenta.getModel();
            modelo.setNumRows(0);
            NegocioVenta auxNegocioVenta = new NegocioVenta();
            Iterator iter = auxNegocioVenta.consultaVentaEspecifica(id_venta).iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                Venta auxVenta = new Venta();
                auxVenta = (Venta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.table_cancelarVenta.setValueAt(auxVenta.getId_venta(), fila, 0);
                this.table_cancelarVenta.setValueAt(auxVenta.getFecha_venta(), fila, 1);
                this.table_cancelarVenta.setValueAt(auxVenta.getNombre_empresa(), fila, 2);
                this.table_cancelarVenta.setValueAt((auxVenta.getTotal_venta()), fila, 3);
                this.table_cancelarVenta.setValueAt(auxVenta.getId_detalleVenta(), fila, 4);
                this.table_cancelarVenta.setValueAt(auxVenta.getRut_empleado(), fila, 5);
                this.table_cancelarVenta.setValueAt(auxVenta.getMedio_pago(), fila, 6);
                fila++;
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se encontro venta " + ex.getMessage());
        }
    }
    
    public void buscarVenta()
    {
        try
        {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.table_cancelarVenta.getModel();
            modelo.setNumRows(0);
            NegocioVenta auxNegocioVenta = new NegocioVenta();
            Iterator iter = auxNegocioVenta.consultaVenta().iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                Venta auxVenta = new Venta();
                auxVenta = (Venta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.table_cancelarVenta.setValueAt(auxVenta.getId_venta(), fila, 0);
                this.table_cancelarVenta.setValueAt(auxVenta.getFecha_venta(), fila, 1);
                this.table_cancelarVenta.setValueAt(auxVenta.getNombre_empresa(), fila, 2);
                this.table_cancelarVenta.setValueAt((auxVenta.getTotal_venta()), fila, 3);
                this.table_cancelarVenta.setValueAt(auxVenta.getId_detalleVenta(), fila, 4);
                this.table_cancelarVenta.setValueAt(auxVenta.getRut_empleado(), fila, 5);
                this.table_cancelarVenta.setValueAt(auxVenta.getMedio_pago(), fila, 6);
                fila++;
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se encontro venta " + ex.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_cancelarVenta = new javax.swing.JTable();
        bto_buscar = new javax.swing.JButton();
        txt_idVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bto_borrar = new javax.swing.JButton();
<<<<<<< HEAD
        bto_salir = new javax.swing.JButton();
=======
        jLabelBanner = new javax.swing.JLabel();
>>>>>>> 0ac3683c9b5c6ff323e5a3fa3806b5dffe07471e

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_cancelarVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venta", "Fecha Venta", "Nombre Empresa", "Monto a Pagar", "ID Detalle Venta", "Rut Trabajador", "Metodo de PAgo"
            }
        ));
        jScrollPane1.setViewportView(table_cancelarVenta);

        bto_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        bto_buscar.setText("Buscar");
        bto_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_buscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID Venta");

        bto_borrar.setBackground(new java.awt.Color(255, 153, 51));
        bto_borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar.png"))); // NOI18N
        bto_borrar.setText("Borrar");
        bto_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_borrarActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        bto_salir.setText("Volver");
        bto_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_salirActionPerformed(evt);
            }
        });
=======
        jLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
>>>>>>> 0ac3683c9b5c6ff323e5a3fa3806b5dffe07471e

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bto_buscar)
                                .addGap(45, 45, 45)
                                .addComponent(bto_borrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(bto_salir)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addGap(86, 86, 86))
=======
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(bto_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bto_borrar)
                        .addGap(61, 61, 61)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> 0ac3683c9b5c6ff323e5a3fa3806b5dffe07471e
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bto_buscar)
                    .addComponent(bto_borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bto_salir)
                .addGap(125, 125, 125))
=======
                .addComponent(jLabelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bto_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bto_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
>>>>>>> 0ac3683c9b5c6ff323e5a3fa3806b5dffe07471e
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_borrarActionPerformed
        // TODO add your handling code here:
        eliminarVenta();
    }//GEN-LAST:event_bto_borrarActionPerformed

    private void bto_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        System.gc();
        VistaTrabajador pMenu = new VistaTrabajador();
        pMenu.setVisible(true);
    }//GEN-LAST:event_bto_salirActionPerformed

    private void bto_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_buscarActionPerformed
        // TODO add your handling code here:
        buscarVentaEspecifica(Integer.parseInt(txt_idVenta.getText()));
        
    }//GEN-LAST:event_bto_buscarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_borrar;
    private javax.swing.JButton bto_buscar;
    private javax.swing.JButton bto_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_cancelarVenta;
    private javax.swing.JTextField txt_idVenta;
    // End of variables declaration//GEN-END:variables
}
