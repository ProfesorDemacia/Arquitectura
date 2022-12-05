/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaServicio;

import CapaDTO.DetalleVenta;
import CapaNegocio.NegocioDetalleVenta;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cesar
 */
@WebService(serviceName = "WebServiceDetalleVenta")
public class WebServiceDetalleVenta {

    /**
     * This is a sample web service operation
     */
    
 
    @WebMethod(operationName = "webConfigurarConexion")
    public void WebConfigurarConexion() {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.configurarConexion();
                
    }
    
    @WebMethod(operationName = "webInsertarDetalleVenta")
    public void WebInsertarDetalleVenta(@WebParam(name = "DetalleVenta") int folio, int cantidad_producto, String nombre_producto, int precio_unitario, int precio_total, int id_producto) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.insertarDetalleVenta(folio, cantidad_producto, nombre_producto, precio_unitario, precio_total, id_producto);
                
    }
    
    @WebMethod(operationName = "webActualizarDetalleVenta")
    public void WebActualizarDetalleVenta(@WebParam(name = "DetalleVenta") DetalleVenta detalleventa) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.actualizarDetalleVenta(detalleventa);
                
    }
    
    @WebMethod(operationName = "webEliminarDetalleVenta")
    public void WebEliminarDetalleVenta(@WebParam(name = "id_folio") int id_folio) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.eliminarDetalleVenta(id_folio);
                
    }
    
    @WebMethod(operationName = "webConsultaDetalleVenta")
    public ArrayList<DetalleVenta> WebConsultaDetalleVenta() {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.consultaDetalleVenta();
        return auxNegocio.consultaDetalleVenta();
    }
    
    @WebMethod(operationName = "webBuscarDetalleVenta")
    public ArrayList<DetalleVenta> WebBuscarDetalleVenta(@WebParam(name = "id_detalle_venta") int id_detalle_venta) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.buscarDetalleVenta(id_detalle_venta);
        return auxNegocio.buscarDetalleVenta(id_detalle_venta);
    }
    
    @WebMethod(operationName = "webSumarFolio")
    public int WebSumarFolio() {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.sumarFolio();
        return auxNegocio.sumarFolio();
    }
    
    @WebMethod(operationName = "webEncontrarFolio")
    public int WebEncontrarFolio() {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.sumarFolio();
        return auxNegocio.encontrarFolio();
    }
    
    @WebMethod(operationName = "webEncontrarFolioEspecifico")
    public int WebEncontrarFolioEspecifico(@WebParam(name = "id_detalle_venta") int id_detalle_venta) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.encontrarFolioEspecifico(id_detalle_venta);
        return auxNegocio.encontrarFolioEspecifico(id_detalle_venta);
    }
    
    
    @WebMethod(operationName = "webBuscarDetalleVentaPorFolio")
    public ArrayList<DetalleVenta> WebBuscarDetalleVentaPorFolio(@WebParam(name = "id_folio") int id_folio) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.buscarDetalleVentaPorFolio(id_folio);
        return auxNegocio.buscarDetalleVentaPorFolio(id_folio);
    }
    
    @WebMethod(operationName = "webExisteDetalleVenta")
    public boolean WebExisteDetalleVenta(@WebParam(name = "id_detalle_venta") int id_detalle_venta) {
        NegocioDetalleVenta auxNegocio = new NegocioDetalleVenta();
        auxNegocio.existeDetalleVenta(id_detalle_venta);
        return auxNegocio.existeDetalleVenta(id_detalle_venta);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
