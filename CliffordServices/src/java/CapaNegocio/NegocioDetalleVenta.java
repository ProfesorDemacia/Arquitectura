/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import CapaDTO.DetalleVenta;
import CapaDTO.Venta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class NegocioDetalleVenta {
    
    private ConexionMySQL conect1;
    
    public void configurarConexion () 
    {
        this.setConect1(new ConexionMySQL());
        this.getConect1().setNombreBaseDatos("jdbc:mysql://localhost/clifford");
        this.getConect1().setNombreTabla("detalle_venta");
        this.getConect1().setCadenaConexion("com.mysql.jdbc.Driver");
        this.getConect1().setUsuario("root");
        this.getConect1().setPass("");
}
    
    public void insertarDetalleVenta(int folio, int cantidad_producto, String nombre_producto, int precio_unitario, int precio_total, int id_producto)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("INSERT INTO detalle_venta "
                                     +" (folio_detalle_venta,cantidad_producto,nombre_producto,"
               +"precio_unitario, precio_total,id_producto) VALUES "
                + "("+folio+","+cantidad_producto+",'"+nombre_producto+"',"
               +precio_unitario+","+precio_total+","+id_producto+");");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    
    public void actualizarDetalleVenta(DetalleVenta detalleventa)
    {
       this.configurarConexion();
       this.getConect1().setCadenaSQL("UPDATE detalle_venta "
                                     + " SET "
                                     + ", folio_detalle_venta = " + detalleventa.getFolio_detalle_venta()
                                     + ", cantidad_producto = " + detalleventa.getCantidad_producto()
                                     + ", nombre_producto = " + detalleventa.getNombre_producto()
                                     + ", precio_unitario = " + detalleventa.getPrecio_unitario()
                                     + ", precio_total = " + detalleventa.getPrecio_total()
                                     + ", id_producto = " + detalleventa.getId_producto()
                                     + " WHERE id_detalle_venta = " + detalleventa.getId_detalle_venta()+ ";");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    public void eliminarDetalleVenta(int id_folio)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("DELETE FROM detalle_venta "
                                       + " WHERE folio_detalle_venta = "+id_folio+";" );
        this.getConect1().setEsSelect(false);
        this.getConect1().conectar();
    }
    
    public ArrayList<DetalleVenta> consultaDetalleVenta()
    {
       ArrayList<DetalleVenta> auxLisDetalleVenta = new ArrayList<>();
       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT *  FROM detalle_venta;");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              DetalleVenta auxDetalleVenta = new DetalleVenta();
              auxDetalleVenta.setId_detalle_venta(this.getConect1().getDbresultSet().getInt("id_detalle_venta"));
              auxDetalleVenta.setFolio_detalle_venta(this.getConect1().getDbresultSet().getInt("folio_detalle_venta"));
              auxDetalleVenta.setCantidad_producto(this.getConect1().getDbresultSet().getInt("cantidad_producto"));
              auxDetalleVenta.setNombre_producto(this.getConect1().getDbresultSet().getString("nombre_producto"));
              auxDetalleVenta.setPrecio_unitario(this.getConect1().getDbresultSet().getInt("precio_unitario"));
              auxDetalleVenta.setPrecio_total(this.getConect1().getDbresultSet().getInt("precio_total"));
              auxDetalleVenta.setId_producto(this.getConect1().getDbresultSet().getInt("id_producto"));
           
              auxLisDetalleVenta.add(auxDetalleVenta);
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return auxLisDetalleVenta; 
    
    }
    
     public ArrayList<DetalleVenta> buscarDetalleVenta(int id_detalle_venta)
    {
       ArrayList<DetalleVenta> auxLisDetalleVenta = new ArrayList<>();
       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT * FROM detalle_venta WHERE id_detalle_venta = "+id_detalle_venta+";");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              DetalleVenta auxDetalleVenta = new DetalleVenta();
              auxDetalleVenta.setId_detalle_venta(this.getConect1().getDbresultSet().getInt("id_detalle_venta"));
              auxDetalleVenta.setFolio_detalle_venta(this.getConect1().getDbresultSet().getInt("folio_detalle_venta"));
              auxDetalleVenta.setCantidad_producto(this.getConect1().getDbresultSet().getInt("cantidad_producto"));
              auxDetalleVenta.setNombre_producto(this.getConect1().getDbresultSet().getString("nombre_producto"));
              auxDetalleVenta.setPrecio_unitario(this.getConect1().getDbresultSet().getInt("precio_unitario"));
              auxDetalleVenta.setPrecio_total(this.getConect1().getDbresultSet().getInt("precio_total"));
              auxDetalleVenta.setId_producto(this.getConect1().getDbresultSet().getInt("id_producto"));
           
              auxLisDetalleVenta.add(auxDetalleVenta);
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return auxLisDetalleVenta; 
    
    }
     
     public int sumarFolio()
    {

       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT MAX(folio_detalle_venta) FROM detalle_venta;");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       int id_folio = 1;
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              
              id_folio = (this.getConect1().getDbresultSet().getInt(1))+1;

           
              
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return id_folio; 
    
    }
     
     
     public int encontrarFolio()
    {

       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT MAX(folio_detalle_venta) FROM detalle_venta;");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       int id_folio = 1;
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              
              id_folio = (this.getConect1().getDbresultSet().getInt(1));
    
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return id_folio; 
    
    }
     
    
    
    public int encontrarFolioEspecifico(int id_detalle_venta)
    {
        
        this.configurarConexion();
        this.getConect1().setCadenaSQL("SELECT folio_detalle_venta FROM detalle_venta WHERE id_detalle_venta = "+id_detalle_venta+";");
        this.getConect1().setEsSelect(true);
        this.getConect1().conectar();
        int folio_detalle_venta = 0;
        try {
            
            while(this.getConect1().getDbresultSet().next()) 
           {
              
              folio_detalle_venta = (this.getConect1().getDbresultSet().getInt(1));
   
           }
            
        } catch (Exception e) {
        }
        return folio_detalle_venta;
    }
    
        public ArrayList<DetalleVenta> buscarDetalleVentaPorFolio(int id_folio)
    {
       ArrayList<DetalleVenta> auxLisVenta = new ArrayList<>();
       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT *  FROM detalle_venta WHERE folio_detalle_venta = "+id_folio+";");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              DetalleVenta auxVenta = new DetalleVenta();
              
              
              auxVenta.setId_detalle_venta(this.getConect1().getDbresultSet().getInt("id_detalle_venta"));
              auxVenta.setFolio_detalle_venta(this.getConect1().getDbresultSet().getInt("folio_detalle_venta"));
              auxVenta.setCantidad_producto(this.getConect1().getDbresultSet().getInt("cantidad_producto"));
              auxVenta.setNombre_producto(this.getConect1().getDbresultSet().getString("nombre_producto"));
              auxVenta.setPrecio_unitario(this.getConect1().getDbresultSet().getInt("precio_unitario"));
              auxVenta.setPrecio_total(this.getConect1().getDbresultSet().getInt("precio_total"));
              auxVenta.setId_producto(this.getConect1().getDbresultSet().getInt("id_producto"));
           
              auxLisVenta.add(auxVenta);
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return auxLisVenta; 
    
    }
        
        
    public boolean existeDetalleVenta(int id_detalle_venta) 
     {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("SELECT * FROM detalle_venta WHERE sku = "+id_detalle_venta+";");
        this.getConect1().setEsSelect(true);
        this.getConect1().conectar();
        boolean existe = false;
         try
        {
            
           existe = this.getConect1().getDbresultSet().next() ;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
        }
        return(existe);
     }
    
    
    

    public ConexionMySQL getConect1() {
        return conect1;
    }

    public void setConect1(ConexionMySQL conect1) {
        this.conect1 = conect1;
    }
    
}
