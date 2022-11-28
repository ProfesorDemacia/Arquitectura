/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author valay
 */
public class NegocioCargo {
    
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
    
    public int consultarCargo (String rut_empleado) throws SQLException{
        int id_cargo;
        this.configurarConexion();
        this.getConect1().setCadenaSQL("SELECT id_cargo FROM empleado WHERE rut_empleado = '" + rut_empleado + "';");
        this.getConect1().setEsSelect(true);
        this.getConect1().conectar();

        try {
            while (this.getConect1().getDbresultSet().next()){
                return this.getConect1().getDbresultSet().getInt("id_cargo");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    
    public ConexionMySQL getConect1() {
        return conect1;
    }

    public void setConect1(ConexionMySQL conect1) {
        this.conect1 = conect1;
    }
    
}
