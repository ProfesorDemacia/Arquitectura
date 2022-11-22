/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDTO;


import java.util.Date;

/**
 *
 * @author Cesar
 */
public class Venta {
    
    private int idVenta;
    private Date fechaVenta;
    private int medioPago;
    private double totalVenta;
    private String rutUsuario;
    private String direccionVenta;

    /**
     * @return the idVenta
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * @param idVenta the idVenta to set
     */
    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    /**
     * @return the fechaVenta
     */
    public Date getFechaVenta() {
        return fechaVenta;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @return the medioPago
     */
    public int getMedioPago() {
        return medioPago;
    }

    /**
     * @param medioPago the medioPago to set
     */
    public void setMedioPago(int medioPago) {
        this.medioPago = medioPago;
    }

    /**
     * @return the totalVenta
     */
    public double getTotalVenta() {
        return totalVenta;
    }

    /**
     * @param totalVenta the totalVenta to set
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    /**
     * @return the rutUsuario
     */
    public String getRutUsuario() {
        return rutUsuario;
    }

    /**
     * @param rutUsuario the rutUsuario to set
     */
    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    /**
     * @return the direccionVenta
     */
    public String getDireccionVenta() {
        return direccionVenta;
    }

    /**
     * @param direccionVenta the direccionVenta to set
     */
    public void setDireccionVenta(String direccionVenta) {
        this.direccionVenta = direccionVenta;
    }
    
    
    
    
    
    
}
