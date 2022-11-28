/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;

import CapaDTO.DetalleVenta;
import CapaNegocio.NegocioDetalleVenta;
import CapaNegocio.NegocioVenta;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class VistaVenta extends javax.swing.JFrame {

    
    private int id_folio = 0;
    private String nombre_empresa = "Clifford INC";
    /**
     * Creates new form VistaDetalleVenta
     */
    public VistaVenta() {
        initComponents();
        VistaDetalleVenta pVenta = new VistaDetalleVenta();
       
        lbl_montoFinal.setText(pVenta.montofinal);
        this.setLocationRelativeTo(null);
        
        
    }
   
    
    private int id_detalle_venta = 0;
    
    public void cancelarVenta()
    {
        try
        {
            NegocioVenta auxNegocioVenta = new NegocioVenta();
            NegocioDetalleVenta auxNegocioDetalleVenta = new NegocioDetalleVenta();
            id_folio = auxNegocioDetalleVenta.encontrarFolio();
            auxNegocioDetalleVenta.configurarConexion();
            auxNegocioDetalleVenta.eliminarDetalleVenta(id_folio);
            auxNegocioDetalleVenta.getConect1().setEsSelect(false);
            auxNegocioDetalleVenta.getConect1().conectar();
            JOptionPane.showMessageDialog(null, "La venta fue cancelada...");
            this.dispose();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se pudo cancelar la venta"+ex.getMessage());
        }
    }
    
    public void validarVenta()
    {
        try
        {
            if(box_metodoPAgo.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(null, "Seleccione un metodo de pago");
            }else{
                try
                {
                    
                    VistaMenu pMenu = new VistaMenu();
                    String rut_empleado = pMenu.rut_empleado;
                    NegocioVenta auxNegocioVenta = new NegocioVenta();
                    NegocioDetalleVenta auxNegocioDetalleVenta = new NegocioDetalleVenta();
                    id_folio = auxNegocioDetalleVenta.encontrarFolio();
                    id_detalle_venta =auxNegocioVenta.buscarIdDetalleVenta(id_folio);
                    auxNegocioVenta.configurarConexion();
                    auxNegocioVenta.getConect1().setCadenaSQL("INSERT INTO venta (fecha_venta,nombre_empresa, monto_pagar,"
                            + "id_detalle_venta,rut_empleado,id_metodo_pago) VALUES ((SELECT CURRENT_DATE()),'"+nombre_empresa+"',"
                            +Integer.parseInt(lbl_montoFinal.getText())+","+id_detalle_venta+",'"+rut_empleado+"',"
                                    +box_metodoPAgo.getSelectedIndex()+");");
                    auxNegocioVenta.getConect1().setEsSelect(false);
                    auxNegocioVenta.getConect1().conectar();
                    JOptionPane.showMessageDialog(null, "La venta fue realizada...");
                    this.dispose();
                
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "No se ha podido realizar el pago"+ex.getMessage());
                }
                
                
            }
            
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se ha podido realizar el pago"+ex.getMessage());
        }
    }
    
    
    public void buscarVenta(int id_folio)
    {
        try
        {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) this.table_venta.getModel();
            modelo.setNumRows(0);
            NegocioDetalleVenta auxNegocioDetalleVenta = new NegocioDetalleVenta();
            NegocioVenta auxNegocioVenta = new NegocioVenta();
            id_folio = auxNegocioDetalleVenta.encontrarFolio();
            Iterator iter = auxNegocioVenta.buscarDetalleVenta(id_folio).iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                DetalleVenta auxDetalleVenta = new DetalleVenta();
                auxDetalleVenta = (DetalleVenta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.table_venta.setValueAt(auxDetalleVenta.getFolio_detalle_venta(), fila, 0);
                this.table_venta.setValueAt(auxDetalleVenta.getId_producto(), fila, 1);
                this.table_venta.setValueAt(auxDetalleVenta.getNombre_producto(), fila, 2);
                this.table_venta.setValueAt(auxDetalleVenta.getCantidad_producto(), fila, 3);
                this.table_venta.setValueAt(auxDetalleVenta.getPrecio_unitario(), fila, 4);
                this.table_venta.setValueAt(auxDetalleVenta.getPrecio_total(), fila, 5);
                fila++;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se ha podido listar a los jugadores " + ex.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        box_metodoPAgo = new javax.swing.JComboBox<>();
        bto_pagar = new javax.swing.JButton();
        bto_cancelarVenta = new javax.swing.JButton();
        lbl_montoFinal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_venta = new javax.swing.JTable();
        bto_salir = new javax.swing.JButton();
        bto_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Monto Total a Pagar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 20));

        jLabel2.setText("Modo de Pago");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        box_metodoPAgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Metodo de Pago", "Credito", "Debido", "Efectivo" }));
        getContentPane().add(box_metodoPAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        bto_pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pagar.png"))); // NOI18N
        bto_pagar.setText("Pagar");
        bto_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_pagarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 120, 60));

        bto_cancelarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar.png"))); // NOI18N
        bto_cancelarVenta.setText("Cancelar Venta");
        bto_cancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_cancelarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(bto_cancelarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, 60));

        lbl_montoFinal.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(lbl_montoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 156, 24));

        table_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio Venta", "ID Producto", "Nombre Producto", "Cantidad ", "Precio Unitario", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(table_venta);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 570, 350));

        bto_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salir.png"))); // NOI18N
        bto_salir.setText("Volver");
        bto_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_salirActionPerformed(evt);
            }
        });
        getContentPane().add(bto_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 110, 50));

        bto_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
        getContentPane().add(bto_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_cancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cancelarVentaActionPerformed
        // TODO add your handling code here:
        cancelarVenta();
       
    }//GEN-LAST:event_bto_cancelarVentaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        buscarVenta(id_folio);
    }//GEN-LAST:event_formWindowOpened

    private void bto_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_pagarActionPerformed
        // TODO add your handling code here:
        validarVenta();
    }//GEN-LAST:event_bto_pagarActionPerformed

    private void bto_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_salirActionPerformed
        // TODO add your handling code here:
        VistaMenu auxMenu = new VistaMenu();
        this.dispose();
        
    }//GEN-LAST:event_bto_salirActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_metodoPAgo;
    private javax.swing.JButton bto_cancelarVenta;
    private javax.swing.JLabel bto_cerrar;
    private javax.swing.JButton bto_pagar;
    private javax.swing.JButton bto_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_montoFinal;
    private javax.swing.JTable table_venta;
    // End of variables declaration//GEN-END:variables
}
