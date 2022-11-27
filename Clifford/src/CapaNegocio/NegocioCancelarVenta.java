/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;

/**
 *
 * @author Cesar
 */
public class NegocioCancelarVenta {
    
    
    private ConexionMySQL conect1;
    
    public void configurarConexion () 
    {
        this.setConect1(new ConexionMySQL());
        this.getConect1().setNombreBaseDatos("jdbc:mysql://localhost/clifford");
        this.getConect1().setNombreTabla("venta");
        this.getConect1().setCadenaConexion("com.mysql.jdbc.Driver");
        this.getConect1().setUsuario("root");
        this.getConect1().setPass("");
}

    public ConexionMySQL getConect1() {
        return conect1;
    }

    public void setConect1(ConexionMySQL conect1) {
        this.conect1 = conect1;
    }
    
    
    public void eliminarVenta(int id_venta)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("DELETE FROM venta "
                                       + " WHERE id_venta = "+id_venta );
    }
    
    
    public void eliminarDetalleVenta(int id_folio)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("DELETE FROM detalle_venta "
                                       + " WHERE folio_detalle_venta = "+id_folio+";" );
    }
    
    
    public int encontrarFolio(int id_detalle_venta)
    {
        int folio_detalle_venta = 0;
        this.configurarConexion();
        this.getConect1().setCadenaSQL("SELECT folio_detalle_venta WHERE id_detalle_venta = "+id_detalle_venta+";");
        this.getConect1().setEsSelect(true);
        this.getConect1().conectar();
        try {
            
            while(this.getConect1().getDbresultSet().next()) 
           {
              
              folio_detalle_venta = (this.getConect1().getDbresultSet().getInt(1));

           
              
           
           }
            
        } catch (Exception e) {
        }
        return folio_detalle_venta;
    }
}
