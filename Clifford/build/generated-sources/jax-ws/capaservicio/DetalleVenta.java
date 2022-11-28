
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para detalleVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="detalleVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="folio_detalle_venta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_detalle_venta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_producto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_producto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio_total" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="precio_unitario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleVenta", propOrder = {
    "cantidadProducto",
    "folioDetalleVenta",
    "idDetalleVenta",
    "idProducto",
    "nombreProducto",
    "precioTotal",
    "precioUnitario"
})
public class DetalleVenta {

    @XmlElement(name = "cantidad_producto")
    protected int cantidadProducto;
    @XmlElement(name = "folio_detalle_venta")
    protected int folioDetalleVenta;
    @XmlElement(name = "id_detalle_venta")
    protected int idDetalleVenta;
    @XmlElement(name = "id_producto")
    protected int idProducto;
    @XmlElement(name = "nombre_producto")
    protected String nombreProducto;
    @XmlElement(name = "precio_total")
    protected int precioTotal;
    @XmlElement(name = "precio_unitario")
    protected int precioUnitario;

    /**
     * Obtiene el valor de la propiedad cantidadProducto.
     * 
     */
    public int getCantidadProducto() {
        return cantidadProducto;
    }

    /**
     * Define el valor de la propiedad cantidadProducto.
     * 
     */
    public void setCantidadProducto(int value) {
        this.cantidadProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad folioDetalleVenta.
     * 
     */
    public int getFolioDetalleVenta() {
        return folioDetalleVenta;
    }

    /**
     * Define el valor de la propiedad folioDetalleVenta.
     * 
     */
    public void setFolioDetalleVenta(int value) {
        this.folioDetalleVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idDetalleVenta.
     * 
     */
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    /**
     * Define el valor de la propiedad idDetalleVenta.
     * 
     */
    public void setIdDetalleVenta(int value) {
        this.idDetalleVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreProducto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Define el valor de la propiedad nombreProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreProducto(String value) {
        this.nombreProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad precioTotal.
     * 
     */
    public int getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Define el valor de la propiedad precioTotal.
     * 
     */
    public void setPrecioTotal(int value) {
        this.precioTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     */
    public int getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     */
    public void setPrecioUnitario(int value) {
        this.precioUnitario = value;
    }

}
