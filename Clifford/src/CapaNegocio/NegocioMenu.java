/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;
import CapaConexion.ConexionMySQL;
import CapaDTO.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author valay
 */
public class NegocioMenu {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ConexionMySQL cn = new ConexionMySQL();
    
    public Empleado emp(String rut_empleado){
    Empleado l = new Empleado();
    String sql = "SELECT * FROM empleado WHERE rut_empleado = ?";
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, rut_empleado);
        rs = ps.executeQuery();
        if (rs.next()) {
            l.setRut_empleado(rs.getString("rut_empleado"));
        } 
    } catch (SQLException e) {
        System.out.println(e.toString());  
    }
    return l;
    }
}
    
    
