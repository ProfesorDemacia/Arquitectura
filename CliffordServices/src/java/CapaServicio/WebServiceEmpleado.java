/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaServicio;

import CapaDTO.DetalleVenta;
import CapaDTO.Empleado;
import CapaNegocio.NegocioEmpleado;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cesar
 */
@WebService(serviceName = "WebServiceEmpleado")
public class WebServiceEmpleado {

    /**
     * This is a sample web service operation
     * @param empleado
     */
    
    @WebMethod(operationName = "webInsertarDetalleVenta")
    public void webInsertarDetalleVenta(@WebParam(name = "Empleado") Empleado empleado) {
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.insertarDetalleVenta(empleado);
    }
    
    @WebMethod(operationName = "webActualizarDetalleVenta")
    public void webActualizarDetalleVenta(@WebParam(name = "Empleado") Empleado empleado) {
    NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.actualizarDetalleVenta(empleado);
    }
    
    @WebMethod(operationName = "webEliminarDetalleVenta")
    public void webEliminarDetalleVenta(@WebParam(name = "Empleado") Empleado empleado) {
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.eliminarDetalleVenta(0);
    }
            
    
    @WebMethod(operationName = "webConsultarCargo")
    public void webConsultarCargo(@WebParam(name = "Empleado") String rut_Empleado) throws SQLException {     
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.consultarCargo(rut_Empleado);
    }   
            
    @WebMethod(operationName = "webBuscarEmpleado")
    public ArrayList<DetalleVenta> buscarEmpleado(String rut_Empleado) {
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        return auxNegocio.buscarEmpleado(rut_Empleado);
    
    }
}
