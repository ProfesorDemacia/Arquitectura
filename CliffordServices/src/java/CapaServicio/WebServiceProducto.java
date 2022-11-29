/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaServicio;

import CapaDTO.Producto;
import CapaNegocio.NegocioProducto;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Cesar
 */
@WebService(serviceName = "WebServiceProducto")
public class WebServiceProducto {

    /**
     * This is a sample web service operation
     */
    
    @WebMethod(operationName = "webConfigurarConexion")
    public void webConfigurarConexion() {
        NegocioProducto auxNegocio = new NegocioProducto();
        auxNegocio.configurarConexion();
    }
    
    @WebMethod(operationName = "webInsertarProducto")
    public void webInsertarProducto(@WebParam(name = "Producto") Producto producto) {
        NegocioProducto auxNegocio = new NegocioProducto();
        auxNegocio.insertarProducto(producto);
    }
    
    @WebMethod(operationName = "webActualizarProducto")
    public void actualizarProducto(@WebParam(name = "Producto") Producto producto) {
        NegocioProducto auxNegocio = new NegocioProducto();
        auxNegocio.actualizarProducto(producto);
    }
    
    @WebMethod(operationName = "webEliminarProducto")
    public void eliminarproducto(@WebParam(name = "id_producto") int id_producto) {
        NegocioProducto auxNegocio = new NegocioProducto();
        auxNegocio.eliminarproducto(id_producto);
    }
    
    @WebMethod(operationName = "webBuscarProducto")
    public ArrayList<Producto> webBuscarProducto(@WebParam(name = "id_producto") int id_producto){
        NegocioProducto auxNegocio = new NegocioProducto();
        return auxNegocio.buscarProducto(id_producto);
    }
    
    @WebMethod(operationName = "webConsultarProducto")
    public ArrayList<Producto> webConsultarProducto(){
        NegocioProducto auxNegocio = new NegocioProducto();
        return auxNegocio.consultarProducto();
    }
}
