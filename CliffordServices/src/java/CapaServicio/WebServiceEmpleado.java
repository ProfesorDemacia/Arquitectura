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
    
    @WebMethod(operationName = "webConfigurarConexion")
    public void webConfigurarConexion() {
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.configurarConexion();
    }
    
    @WebMethod(operationName = "webInsertarEmpleado")
    public void webInsertarEmpleado(@WebParam(name = "Empleado") Empleado empleado) {
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.insertarEmpleado(empleado);
    }
    
    @WebMethod(operationName = "webActualizarEmpleado")
    public void webActualizarEmpleado(@WebParam(name = "Empleado") Empleado empleado) {
    NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.actualizarEmpleado(empleado);
    }
    
    @WebMethod(operationName = "webEliminarEmpleado")
    public void webEliminarEmpleado(@WebParam(name = "rut_empleado") String rut_empleado) {
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.eliminarEmpleado(rut_empleado);
    }
            
    
    @WebMethod(operationName = "webConsultarCargo")
    public int webConsultarCargo(@WebParam(name = "rut_empleado") String rut_Empleado) {     
        NegocioEmpleado auxNegocio = new NegocioEmpleado();
        auxNegocio.consultarCargo(rut_Empleado);
        return auxNegocio.consultarCargo(rut_Empleado);
    }   
            
   
}
