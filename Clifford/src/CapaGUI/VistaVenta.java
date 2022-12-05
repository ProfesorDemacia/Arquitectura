/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;


import capaservicio.DetalleVenta;
import capaservicio.WebServiceDetalleVenta_Service;
import capaservicio.WebServiceVenta_Service;
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
        int id_folio = pVenta.folio;
        lbl_montoFinal.setText(pVenta.montofinal);
        this.setLocationRelativeTo(null);
        buscarVenta(id_folio);
        
        
        
    }
    VistaMenu pMenu = new VistaMenu();
    private String rut_empleado = pMenu.rut_empleado;
   
    
    
    
    public void cancelarVenta()
    {
        int id_detalle_venta = 0;
        try
        {
            //NegocioVenta auxNegocioVenta = new NegocioVenta();
            WebServiceVenta_Service auxNegocioVenta = new WebServiceVenta_Service();
            WebServiceDetalleVenta_Service auxNegocioDetalleVenta = new WebServiceDetalleVenta_Service();
            id_folio = auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webEncontrarFolio();
            auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webConfigurarConexion();
            auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webEliminarDetalleVenta(id_detalle_venta);
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
            int id_detalle_venta = 0;
            if(box_metodoPago.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(null, "Seleccione un metodo de pago");
            }else{
                try
                {
                    
                    VistaMenu pMenu = new VistaMenu();
                    //NegocioVenta auxNegocioVenta = new NegocioVenta();
                    WebServiceVenta_Service auxNegocioVenta = new WebServiceVenta_Service();
                    WebServiceDetalleVenta_Service auxNegocioDetalleVenta = new WebServiceDetalleVenta_Service();
                    auxNegocioVenta.getWebServiceVentaPort().webConfigurarConexion();
                    
                    id_folio = auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webEncontrarFolio();
                    id_detalle_venta = auxNegocioVenta.getWebServiceVentaPort().webBuscarIdDetalleVenta(id_folio);
                    
                    if(JOptionPane.showConfirmDialog(null, "Se realizara la venta, ¿Desea Continuar?", "Confirmacion de Venta"
                    ,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                    {
                    auxNegocioVenta.getWebServiceVentaPort().webInsertarVenta(nombre_empresa,lbl_montoFinal.getText(),
                            +id_detalle_venta,rut_empleado,box_metodoPago.getSelectedIndex());
                    
                    JOptionPane.showMessageDialog(null, "La venta fue realizada...");
                    this.dispose();
                    }
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
            WebServiceDetalleVenta_Service auxNegocioDetalleVenta = new WebServiceDetalleVenta_Service();
            id_folio = auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webEncontrarFolio();
            
            Iterator iter = auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webBuscarDetalleVentaPorFolio(id_folio).iterator();
            int fila = 0;
            while(iter.hasNext())
            {
                DetalleVenta auxDetalleVenta = new DetalleVenta();
                auxDetalleVenta = (DetalleVenta) iter.next();
                Object[] num = {};
                modelo.addRow(num);
                this.table_venta.setValueAt(auxDetalleVenta.getFolioDetalleVenta(), fila, 0);
                this.table_venta.setValueAt(auxDetalleVenta.getIdProducto(), fila, 1);
                this.table_venta.setValueAt(auxDetalleVenta.getNombreProducto(), fila, 2);
                this.table_venta.setValueAt(auxDetalleVenta.getCantidadProducto(), fila, 3);
                this.table_venta.setValueAt(auxDetalleVenta.getPrecioUnitario(), fila, 4);
                this.table_venta.setValueAt(auxDetalleVenta.getPrecioTotal(), fila, 5);
                fila++;
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se ha podido listar a las ventas ");
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
        box_metodoPago = new javax.swing.JComboBox<>();
        bto_pagar = new javax.swing.JButton();
        bto_cancelarVenta = new javax.swing.JButton();
        lbl_montoFinal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_venta = new javax.swing.JTable();
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

        box_metodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Metodo de Pago", "Credito", "Debito", "Efectivo" }));
        getContentPane().add(box_metodoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

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

        bto_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
        getContentPane().add(bto_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bto_cancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cancelarVentaActionPerformed
        // TODO add your handling code here:
        cancelarVenta();
        VistaDetalleVenta pMenu = new VistaDetalleVenta();
                pMenu.setVisible(true);
                this.dispose();
       
    }//GEN-LAST:event_bto_cancelarVentaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        buscarVenta(id_folio);
    }//GEN-LAST:event_formWindowOpened

    private void bto_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_pagarActionPerformed
        // TODO add your handling code here:
        validarVenta();
    }//GEN-LAST:event_bto_pagarActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box_metodoPago;
    private javax.swing.JButton bto_cancelarVenta;
    private javax.swing.JLabel bto_cerrar;
    private javax.swing.JButton bto_pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_montoFinal;
    private javax.swing.JTable table_venta;
    // End of variables declaration//GEN-END:variables
}
