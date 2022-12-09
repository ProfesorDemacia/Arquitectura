/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import CapaDTO.Producto;
import CapaDTO.Venta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class NegocioProducto {
    
    private ConexionMySQL conect1;
    
    
    
    public void configurarConexion () 
    {
        this.setConect1(new ConexionMySQL());
        this.getConect1().setNombreBaseDatos("jdbc:mysql://localhost/clifford");
        this.getConect1().setNombreTabla("producto");
        this.getConect1().setCadenaConexion("com.mysql.jdbc.Driver");
        this.getConect1().setUsuario("root");
        this.getConect1().setPass("");
}
    
    
     public void insertarProducto(Producto producto)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("INSERT INTO producto "
                                     +" (id_producto,nombre_producto,descripcion_producto,"
               + "precio_unitario,stock_producto) VALUES ("+
                                      producto.getIdProducto()+ ","+
                                      producto.getNombreProducto()+ ","+
                                      producto.getDescripcionProducto()+ ","+
                                      producto.getPrecioUnitario()+ ","+
                                      producto.getStockProducto() + ");");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    
    public void actualizarProducto(int id_producto, int cantidad)
    {
       this.configurarConexion();
       this.getConect1().setCadenaSQL("UPDATE producto "
                                     + " SET "
                                     + " stock_producto = stock_producto -"+cantidad
                                     + " WHERE id_producto = " + id_producto+ ";");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    public void eliminarproducto(int id_producto)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("DELETE FROM producto "
                                       + " WHERE id_producto = "+id_producto );
    }
    
    
    public ArrayList<Producto> buscarProducto(int id_producto)
    {
       ArrayList<Producto> auxListProducto = new ArrayList<>();
       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT * FROM producto WHERE id_producto = "+id_producto+";");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              Producto auxProducto = new Producto();
              auxProducto.setIdProducto(this.getConect1().getDbresultSet().getInt("id_producto"));
              auxProducto.setNombreProducto(this.getConect1().getDbresultSet().getString("nombre_producto"));
              auxProducto.setDescripcionProducto(this.getConect1().getDbresultSet().getString("descripcion_producto"));
              auxProducto.setPrecioUnitario(this.getConect1().getDbresultSet().getInt("precio_unitario"));
              auxProducto.setStockProducto(this.getConect1().getDbresultSet().getInt("stock_producto"));
              auxListProducto.add(auxProducto);
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return auxListProducto; 
    
    }
    
    public ArrayList<Producto> consultarProducto()
    {
       ArrayList<Producto> auxListProducto = new ArrayList<>();
       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT * FROM producto;");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              Producto auxProducto = new Producto();
              auxProducto.setIdProducto(this.getConect1().getDbresultSet().getInt("id_producto"));
              auxProducto.setNombreProducto(this.getConect1().getDbresultSet().getString("nombre_producto"));
              auxProducto.setDescripcionProducto(this.getConect1().getDbresultSet().getString("descripcion_producto"));
              auxProducto.setPrecioUnitario(this.getConect1().getDbresultSet().getInt("precio_unitario"));
              auxProducto.setStockProducto(this.getConect1().getDbresultSet().getInt("stock_producto"));
              auxListProducto.add(auxProducto);
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return auxListProducto; 
    
    }
    
    
    public boolean existeProducto(int id_producto) 
     {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("SELECT * FROM producto WHERE id_producto = "+id_producto+";");
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
