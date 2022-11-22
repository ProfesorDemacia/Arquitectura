/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import CapaDTO.DetalleVenta;

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
    
    public void insertarDetalleVenta(DetalleVenta detalleventa)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("INSERT INTO detalle_venta "
                                     +" (id_detalle_venta,cantidad_producto,precio_unitario,"
               + "precio_total,id_producto) VALUES ("+
                                      detalleventa.getId_detalle_venta()+ ","+
                                      detalleventa.getCantidad_producto()+ ","+
                                      detalleventa.getPrecio_unitario()+ ","+
                                      detalleventa.getPrecio_total()+ ","+
                                      detalleventa.getId_producto() + ");");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    
    public void actualizarDetalleVenta(DetalleVenta detalleventa)
    {
       this.configurarConexion();
       this.getConect1().setCadenaSQL("UPDATE detalleventa "
                                     + " SET "
                                     + ", cantidad_producto = " + detalleventa.getCantidad_producto()
                                     + ", precio_unitario = " + detalleventa.getPrecio_unitario()
                                     + ", precio_total = " + detalleventa.getPrecio_total()
                                     + ", id_producto = " + detalleventa.getId_producto()
                                     + " WHERE it_id = " + detalleventa.getId_detalle_venta()+ ";");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    public void eliminarDetalleVenta(int id_detalle_venta)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("DELETE FROM detalleventa "
                                       + " WHERE id_detalle_venta = "+id_detalle_venta );
    }
    
    

    public ConexionMySQL getConect1() {
        return conect1;
    }

    public void setConect1(ConexionMySQL conect1) {
        this.conect1 = conect1;
    }
    
}
