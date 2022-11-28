/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import CapaDTO.Venta;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author valay
 */
public class NegocioRegistro {
    
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
    public ArrayList<Venta> listarRegistro()
    {
       ArrayList<Venta> auxLisReg = new ArrayList<>();
       this.configurarConexion();
       this.getConect1().setCadenaSQL("SELECT * FROM venta VALUES");
       this.getConect1().setEsSelect(true);
       this.getConect1().conectar();
       
       try
       {
           while(this.getConect1().getDbresultSet().next()) 
           {
              Venta auxVenta = new Venta();
              auxVenta.setId_venta(this.getConect1().getDbresultSet().getString("nombre_empleado"));
              auxVenta.setFecha_venta(this.getConect1().getDbresultSet().getDate("fecha_venta"));
              auxVenta.setNombre_empresa(this.getConect1().getDbresultSet().getString("nombre_empresa"));
              auxVenta.setTotal_venta(this.getConect1().getDbresultSet().getInt("monto_pagar"));
              auxVenta.setId_detalleVenta(this.getConect1().getDbresultSet().getInt("id_detalle_venta"));
              auxVenta.setRut_empleado(this.getConect1().getDbresultSet().getString("rut_empleado"));
           
              auxLisReg.add(auxVenta);
           
           }
       }
       catch(Exception ex)
       {
          JOptionPane.showMessageDialog(null, "Error SQL ..." + ex.getMessage());
       }
       return auxLisReg; 
    
    }
    
     public ConexionMySQL getConect1() {
        return conect1;
    }

    public void setConect1(ConexionMySQL conect1) {
        this.conect1 = conect1;
    }
    
}
