/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;

/**
 *
 * @author Cesar
 */
public class DetalleVenta {
    
    private int id_detalle_venta;
    private int folio_detalle_venta;
    private int cantidad_producto;
    private String nombre_producto;
    private int precio_unitario;
    private int precio_total;
    private int id_producto;

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getFolio_detalle_venta() {
        return folio_detalle_venta;
    }

    public void setFolio_detalle_venta(int folio_detalle_venta) {
        this.folio_detalle_venta = folio_detalle_venta;
    }
    

    

    
    
    
}
