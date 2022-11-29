/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import capaservicio.Venta;
import capaservicio.WebServiceDetalleVenta_Service;
import capaservicio.WebServiceVenta_Service;
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
        this.setLocationRelativeTo(null);
    }
    
    public void eliminarVenta()
    {
        int fila = table_cancelarVenta.getSelectedRow();
        int id_venta = Integer.parseInt(table_cancelarVenta.getValueAt(fila, 0).toString());
        int id_detalle = Integer.parseInt(table_cancelarVenta.getValueAt(fila,4).toString());
        int folio = 0;
        try {
            
            WebServiceVenta_Service auxNegocioVenta = new WebServiceVenta_Service();
            WebServiceDetalleVenta_Service auxNegocioDetalleVenta = new WebServiceDetalleVenta_Service();
            
         
            auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webConfigurarConexion();
            folio = auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webEncontrarFolioEspecifico(id_detalle);
            auxNegocioVenta.getWebServiceVentaPort().webEliminarVenta(id_venta);  
            
            
            
            
            auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webConfigurarConexion();
            auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webEliminarDetalleVenta(folio);
            JOptionPane.showMessageDialog(null,"Se borro la tabla con exito");
            initComponents();
            
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"No se pudo borrar la venta " + ex.getMessage());
        }
    }
    
    public void buscarVenta()
    {
        try
        {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.table_cancelarVenta.getModel();
            modelo.setNumRows(0);
            WebServiceVenta_Service auxNegocioVenta = new WebServiceVenta_Service();
            Iterator iter = auxNegocioVenta.getWebServiceVentaPort().webConsultaVenta().iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                Venta auxVenta = new Venta();
                auxVenta = (Venta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.table_cancelarVenta.setValueAt(auxVenta.getIdVenta(), fila, 0);
                this.table_cancelarVenta.setValueAt(auxVenta.getFechaVenta(), fila, 1);
                this.table_cancelarVenta.setValueAt(auxVenta.getNombreEmpresa(), fila, 2);
                this.table_cancelarVenta.setValueAt((auxVenta.getTotalVenta()), fila, 3);
                this.table_cancelarVenta.setValueAt(auxVenta.getIdDetalleVenta(), fila, 4);
                this.table_cancelarVenta.setValueAt(auxVenta.getRutEmpleado(), fila, 5);
                this.table_cancelarVenta.setValueAt(auxVenta.getMedioPago(), fila, 6);
                fila++;
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se encontro venta " + ex.getMessage());
        }
    }
    public void buscarVentaEspecifica(int id_venta)
    {
        try
        {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.table_cancelarVenta.getModel();
            modelo.setNumRows(0);
            WebServiceVenta_Service auxNegocioVenta = new WebServiceVenta_Service();
            Iterator iter = auxNegocioVenta.getWebServiceVentaPort().webConsultarVentaEspecifica(id_venta).iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                Venta auxVenta = new Venta();
                auxVenta = (Venta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.table_cancelarVenta.setValueAt(auxVenta.getIdVenta(), fila, 0);
                this.table_cancelarVenta.setValueAt(auxVenta.getFechaVenta(), fila, 1);
                this.table_cancelarVenta.setValueAt(auxVenta.getNombreEmpresa(), fila, 2);
                this.table_cancelarVenta.setValueAt((auxVenta.getTotalVenta()), fila, 3);
                this.table_cancelarVenta.setValueAt(auxVenta.getIdDetalleVenta(), fila, 4);
                this.table_cancelarVenta.setValueAt(auxVenta.getRutEmpleado(), fila, 5);
                this.table_cancelarVenta.setValueAt(auxVenta.getMedioPago(), fila, 6);
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
        jLabelBanner = new javax.swing.JLabel();
        bto_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        txt_idVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idVentaActionPerformed(evt);
            }
        });
        txt_idVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idVentaKeyTyped(evt);
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

        jLabelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N

        bto_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salir.png"))); // NOI18N
        bto_salir.setText("Volver");
        bto_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGap(61, 61, 61))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bto_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                        .addGap(31, 31, 31)
                        .addComponent(bto_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_borrarActionPerformed
        // TODO add your handling code here:
        eliminarVenta();
    }//GEN-LAST:event_bto_borrarActionPerformed

    private void bto_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_salirActionPerformed
        // TODO add your handling code here:
        VistaMenu auxMenu = new VistaMenu();
        this.dispose();
    }//GEN-LAST:event_bto_salirActionPerformed

    private void txt_idVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idVentaActionPerformed

    private void bto_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_buscarActionPerformed
        // TODO add your handling code here:
        buscarVentaEspecifica(Integer.parseInt(txt_idVenta.getText()));
    }//GEN-LAST:event_bto_buscarActionPerformed

    private void txt_idVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idVentaKeyTyped
        // TODO add your handling code here:
        if (txt_idVenta.getText().length()>3)
        {
          evt.consume();
        }
    }//GEN-LAST:event_txt_idVentaKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        buscarVenta();
    }//GEN-LAST:event_formWindowOpened

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
