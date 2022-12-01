/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaServicio;

import CapaDTO.Venta;
import CapaNegocio.NegocioVenta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cesar
 */
@WebService(serviceName = "WebServiceVenta")
public class WebServiceVenta {

    /**
     * This is a sample web service operation
     */
    
    
    @WebMethod(operationName = "webConfigurarConexion")
    public void WebConfigurarConexion() {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.configurarConexion();
        
    }
    
    
    @WebMethod(operationName = "webInsertarVenta")
    public void WebInsertarVenta(@WebParam(name = "Venta") String nombre_empresa,String lbl_montoFinal,int id_detalle_venta,String rut_empleado,int metodo_pago ) {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.insertarVenta(nombre_empresa,lbl_montoFinal,id_detalle_venta,rut_empleado,metodo_pago);
    }
    
    
    @WebMethod(operationName = "webActualizarVenta")
    public void WebActualizarVenta(@WebParam(name = "Venta") Venta venta) {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.actualizarVenta(venta);
    }
    
    
    @WebMethod(operationName = "webEliminarVenta")
    public void WebEliminarVenta(@WebParam(name = "id_venta") int id_venta) {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.eliminarVenta(id_venta);
    }
    
    
     
    @WebMethod(operationName = "webConsultaVenta")
    public ArrayList<Venta> WebConsultaVenta() {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.consultaVenta();
        return auxNegocio.consultaVenta();
    }
    
      
    @WebMethod(operationName = "webConsultarVentaEspecifica")
    public ArrayList<Venta> WebConsultaVentaEspecifica(@WebParam(name = "id_venta") int id_venta) {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.consultaVentaEspecifica(id_venta);
        return auxNegocio.consultaVentaEspecifica(id_venta);
    }
    
   
    @WebMethod(operationName = "webBuscarIdDetalleVenta")
    public int WebBuscarIdDetalleVenta(@WebParam(name = "id_folio") int id_folio) {
        NegocioVenta auxNegocio = new NegocioVenta();
        auxNegocio.buscarIdDetalleVenta(id_folio);
        return auxNegocio.buscarIdDetalleVenta(id_folio);
    }
    
    
}
