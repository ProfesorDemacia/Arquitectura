/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaGUI;


import capaservicio.DetalleVenta;
import capaservicio.Producto;
import capaservicio.WebServiceDetalleVenta_Service;
import capaservicio.WebServiceVenta_Service;
import capaservicio.WebServiceProducto_Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class VistaDetalleVenta extends javax.swing.JFrame {
    
    
    
    
    /**
     * Creates new form VistaVenta
     */
    public VistaDetalleVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public static String montofinal = "";
    public static int folio = 0; 
    
    
    private void grabarDetalleVenta()
    {
      if(table_DetalleVenta.getRowCount()>0)
      {
          
        try
        {
            //NegocioDetalleVenta auxNegocioDetalleVenta = new NegocioDetalleVenta();
            WebServiceDetalleVenta_Service auxNegocioDetalleVenta = new WebServiceDetalleVenta_Service();
            folio = auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webSumarFolio();
            for(int i = 0;i<table_DetalleVenta.getRowCount();i++)
            {
              try
              {
              Object cantidad_producto = table_DetalleVenta.getValueAt(i, 2);
              Object nombre_producto = table_DetalleVenta.getValueAt(i, 1);
              Object precio_unitario = table_DetalleVenta.getValueAt(i, 3);
              Object precio_total = table_DetalleVenta.getValueAt(i, 4);
              Object id_producto = table_DetalleVenta.getValueAt(i, 0);
              
              auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webSumarFolio();
              DetalleVenta auxDetalleVenta = new DetalleVenta();
              
              
              auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webConfigurarConexion();
              auxNegocioDetalleVenta.getWebServiceDetalleVentaPort().webInsertarDetalleVenta(folio,Integer.parseInt(cantidad_producto.toString())
                      , nombre_producto.toString(),Integer.parseInt(precio_unitario.toString()), Integer.parseInt(precio_total.toString()),
                      Integer.parseInt(id_producto.toString()));

   
                } catch(Exception ex){
                  JOptionPane.showMessageDialog(null,"No se pudo registrar"+ex); 
                    }
              }
              JOptionPane.showMessageDialog(null,"Redireccionando a la venta");
              VistaVenta pMenu = new VistaVenta();
              pMenu.setVisible(true);
              this.setVisible(false);
           
           
            
              
          }catch(Exception ex){
                  JOptionPane.showMessageDialog(null,"No se pudo registrar"+ex); 
              }
          
          
      }else
      {
          JOptionPane.showMessageDialog(null, "No se han ingresado productos para su venta");
      }
    }
    
    
    private void ValorTotal()
    {
        int a = 0;
        int b = 0;
        
        if (table_DetalleVenta.getRowCount()>0)
        {
            for (int i=0;i<table_DetalleVenta.getRowCount();i++)
            {
                b = Integer.parseInt(table_DetalleVenta.getValueAt(i,4).toString());
                a+=b;
            }
            txt_precioFinal.setText(String.valueOf(a));
            
        }
    }
    
    public void limpiarDatos()
    {
        this.txt_idProducto.setText("");
        this.txt_cantidad.setText("");
        this.txt_nombreProducto.setText("");
        this.txt_precioUnitario.setText("");
        this.txt_precioFinal.setText("");
        
    }
    
    
    public boolean existeIdProducto(JTable jtable, String id_producto, int colum)
    {
        boolean Existe = false;
        for (int i=0;i<jtable.getRowCount();i++)
        {
            if (jtable.getValueAt(i, colum).equals(id_producto))
            {
                Existe = true;
            }
        }
        return Existe;
    }
 
    public void buscarProducto(String id_producto)
    {
  
        try{
            
            
            
            //NegocioProducto auxNegocioProducto = new NegocioProducto();
            WebServiceProducto_Service auxNegocioProducto = new WebServiceProducto_Service();
            
            if (this.txt_idProducto.getText().length() == 0 || this.txt_cantidad.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Ingrese el codigo del producto");
                
            }else{
                
                
                Iterator iter = auxNegocioProducto.getWebServiceProductoPort().webBuscarProducto(Integer.parseInt(id_producto)).iterator();
                
                while(iter.hasNext())
            {
                Producto auxProducto = new Producto();
                auxProducto = (Producto) iter.next();
                this.txt_nombreProducto.setText(auxProducto.getNombreProducto());
                this.txt_precioUnitario.setText(String.valueOf(auxProducto.getPrecioUnitario()));
                
            }
                
            }
            
            
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,"No se ha podido agregar los productos");
    }
    }
    
    
         public void agregarTablaProducto (JTable jtable, String id_producto) {
        try{
            
            
            if (this.txt_idProducto.getText().length() == 0 || this.txt_cantidad.getText().length() == 0 
                    || this.txt_precioUnitario.getText().length() == 0 || this.txt_nombreProducto.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Primero busque el producto");
                
            }else
            {
                
                
            
            DefaultTableModel modelo = new DefaultTableModel();
            modelo = (DefaultTableModel) table_DetalleVenta.getModel();
                
            
                if (!existeIdProducto(jtable, id_producto, 0))
                {
                     Object[] num = new Object[5];
                
                
                    num [0] =(txt_idProducto.getText());
                    num [1] =(txt_nombreProducto.getText());
                    num [2] =(Integer.parseInt(txt_cantidad.getText()));
                    num [3] =(txt_precioUnitario.getText());
                    num [4] =(Integer.parseInt(txt_cantidad.getText())*Integer.parseInt(txt_precioUnitario.getText())) ;

                    modelo.addRow(num);

                    this.table_DetalleVenta.setModel(modelo);

                    limpiarDatos();
                }else
                {
                  JOptionPane.showMessageDialog(null,"El producto ya fue registrado");  
                }
            
            
         

               
            
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"No se ha podido agregar los productos");
        }
    }
         
         public void eliminarTabla(){
        DefaultTableModel tb = (DefaultTableModel) table_DetalleVenta.getModel();
        int a = table_DetalleVenta.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
        tb.removeRow(tb.getRowCount()-1);
        }
        //cargaTicket();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_idProducto = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_precioUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_DetalleVenta = new javax.swing.JTable();
        bto_agregar = new javax.swing.JButton();
        bto_continuar = new javax.swing.JButton();
        bto_salir = new javax.swing.JButton();
        bto_cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_precioFinal = new javax.swing.JTextField();
        bto_buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(983, 570));
        getContentPane().setLayout(null);

        jLabel1.setText("ID Producto");
        jLabel1.setMaximumSize(new java.awt.Dimension(75, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 14));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 160, 70, 20);

        jLabel2.setText("Cantidad");
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 14));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 210, 80, 14);

        jLabel3.setText("Precio Unitario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 280, 90, 20);

        txt_idProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idProductoActionPerformed(evt);
            }
        });
        txt_idProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idProductoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_idProducto);
        txt_idProducto.setBounds(170, 160, 178, 20);

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        txt_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cantidad);
        txt_cantidad.setBounds(170, 200, 178, 20);

        jLabel6.setText("Nombre Producto");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 240, 100, 20);

        txt_nombreProducto.setEditable(false);
        txt_nombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombreProducto);
        txt_nombreProducto.setBounds(170, 240, 178, 20);

        txt_precioUnitario.setEditable(false);
        txt_precioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioUnitarioActionPerformed(evt);
            }
        });
        getContentPane().add(txt_precioUnitario);
        txt_precioUnitario.setBounds(170, 280, 178, 20);

        table_DetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "Nombre Producto", "Cantidad", "Precio Unitario ", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(table_DetalleVenta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 150, 450, 140);

        bto_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/compras.png"))); // NOI18N
        bto_agregar.setText("Agregar");
        bto_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_agregar);
        bto_agregar.setBounds(170, 360, 120, 60);

        bto_continuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/pagar.png"))); // NOI18N
        bto_continuar.setText("Pagar");
        bto_continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_continuarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_continuar);
        bto_continuar.setBounds(650, 440, 110, 60);

        bto_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/salir.png"))); // NOI18N
        bto_salir.setText("Volver");
        bto_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_salirActionPerformed(evt);
            }
        });
        getContentPane().add(bto_salir);
        bto_salir.setBounds(800, 440, 120, 60);

        bto_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminar.png"))); // NOI18N
        bto_cancelar.setText("Cancelar");
        bto_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_cancelar);
        bto_cancelar.setBounds(300, 360, 130, 60);

        jLabel4.setText("Precio Final");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(650, 360, 80, 30);
        getContentPane().add(txt_precioFinal);
        txt_precioFinal.setBounds(730, 360, 160, 30);

        bto_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/buscar.png"))); // NOI18N
        bto_buscar.setText("Buscar");
        bto_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bto_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(bto_buscar);
        bto_buscar.setBounds(40, 360, 120, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/banner.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 990, 130);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idProductoActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_nombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreProductoActionPerformed

    private void txt_precioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioUnitarioActionPerformed

    private void bto_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_agregarActionPerformed
        // TODO add your handling code here:
 
        agregarTablaProducto(table_DetalleVenta,(txt_idProducto.getText()));
        ValorTotal();
        
    }//GEN-LAST:event_bto_agregarActionPerformed

    private void bto_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_salirActionPerformed
        // TODO add your handling code here:
        
        VistaMenu auxMenu = new VistaMenu();
        try {
            auxMenu.redireccionarVentana();
        } catch (SQLException ex) {
            Logger.getLogger(VistaDetalleVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_bto_salirActionPerformed

    private void bto_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_buscarActionPerformed
        // TODO add your handling code here:
        
        buscarProducto((txt_idProducto.getText()));
        
        
    }//GEN-LAST:event_bto_buscarActionPerformed

    private void bto_continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_continuarActionPerformed
        // TODO add your handling code here:
        montofinal = txt_precioFinal.getText();
        grabarDetalleVenta();
        
    }//GEN-LAST:event_bto_continuarActionPerformed

    private void txt_idProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idProductoKeyTyped
        // TODO add your handling code here:
        if (txt_idProducto.getText().length()>2)
        {
            evt.consume();
        }
        
    }//GEN-LAST:event_txt_idProductoKeyTyped

    private void txt_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantidadKeyTyped
        // TODO add your handling code here:
        if (txt_cantidad.getText().length()>2)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_cantidadKeyTyped

    private void bto_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bto_cancelarActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
        eliminarTabla();
        
        
    }//GEN-LAST:event_bto_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bto_agregar;
    private javax.swing.JButton bto_buscar;
    private javax.swing.JButton bto_cancelar;
    private javax.swing.JButton bto_continuar;
    private javax.swing.JButton bto_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_DetalleVenta;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_idProducto;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precioFinal;
    private javax.swing.JTextField txt_precioUnitario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the montofinal
     */

}
