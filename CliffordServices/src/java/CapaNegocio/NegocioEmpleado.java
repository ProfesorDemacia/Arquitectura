/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import CapaDTO.DetalleVenta;
import CapaDTO.Empleado;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class NegocioEmpleado {
    
    private ConexionMySQL conect1;
    
    
    public void configurarConexion () 
    {
        this.setConect1(new ConexionMySQL());
        this.getConect1().setNombreBaseDatos("jdbc:mysql://localhost/clifford");
        this.getConect1().setNombreTabla("empleado");
        this.getConect1().setCadenaConexion("com.mysql.jdbc.Driver");
        this.getConect1().setUsuario("root");
        this.getConect1().setPass("");
}
    
    
     public void insertarEmpleado(Empleado empleado)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("INSERT INTO empleado "
                                     +" (rut_empleado,nombre_empleado,apellido_empleado,"
               + "direccion_empleado,correo_empleado, id_cargo, id_comuna) VALUES ("+
                                      empleado.getRut_empleado()+ ","+
                                      empleado.getNombre_empleado()+ ","+
                                      empleado.getApellido_empleado()+ ","+
                                      empleado.getDireccion_empleado()+ ","+
                                      empleado.getCorreo_empleado()+ ","+
                                      empleado.getId_cargo()+ ","+
                                      empleado.getId_comuna() + ");");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    
    public void actualizarEmpleado(Empleado empleado)
    {
       this.configurarConexion();
       this.getConect1().setCadenaSQL("UPDATE empleado "
                                     + " SET "
                                     + ", nombre_empleado = " + empleado.getNombre_empleado()
                                     + ", apellido_empleado = " + empleado.getApellido_empleado()
                                     + ", direccion_empleado = " + empleado.getDireccion_empleado()
                                     + ", correo_empleado = " + empleado.getCorreo_empleado()
                                     + ", id_cargo = " + empleado.getId_cargo()
                                     + ", id_comuna = " + empleado.getId_comuna()
                                     + " WHERE rut_empleado = " + empleado.getRut_empleado()+ ";");
       this.getConect1().setEsSelect(false);
       this.getConect1().conectar();
    }
    
    public void eliminarEmpleado(String rut_empleado)
    {
        this.configurarConexion();
        this.getConect1().setCadenaSQL("DELETE FROM empleado "
                                       + " WHERE rut_empleado = "+rut_empleado );
    }
    
    public int consultarCargo (String rut_empleado){
        int id_cargo = 0;
        this.configurarConexion();
        this.getConect1().setCadenaSQL("SELECT id_cargo FROM empleado WHERE rut_empleado = '" + rut_empleado + "';");
        this.getConect1().setEsSelect(true);
        this.getConect1().conectar();

        try {
            while (this.getConect1().getDbresultSet().next()){
                id_cargo = this.getConect1().getDbresultSet().getInt("id_cargo");
                return id_cargo;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id_cargo;
    }
    
    
  
    
    

    public ConexionMySQL getConect1() {
        return conect1;
    }

    public void setConect1(ConexionMySQL conect1) {
        this.conect1 = conect1;
    }
    
    
    
}
