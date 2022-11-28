
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para venta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="venta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fecha_venta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id_detalleVenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_venta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="medio_pago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rut_empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="total_venta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "venta", propOrder = {
    "fechaVenta",
    "idDetalleVenta",
    "idVenta",
    "medioPago",
    "nombreEmpresa",
    "rutEmpleado",
    "totalVenta"
})
public class Venta {

    @XmlElement(name = "fecha_venta")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVenta;
    @XmlElement(name = "id_detalleVenta")
    protected int idDetalleVenta;
    @XmlElement(name = "id_venta")
    protected int idVenta;
    @XmlElement(name = "medio_pago")
    protected int medioPago;
    @XmlElement(name = "nombre_empresa")
    protected String nombreEmpresa;
    @XmlElement(name = "rut_empleado")
    protected String rutEmpleado;
    @XmlElement(name = "total_venta")
    protected int totalVenta;

    /**
     * Obtiene el valor de la propiedad fechaVenta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVenta() {
        return fechaVenta;
    }

    /**
     * Define el valor de la propiedad fechaVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVenta(XMLGregorianCalendar value) {
        this.fechaVenta = value;
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
     * Obtiene el valor de la propiedad idVenta.
     * 
     */
    public int getIdVenta() {
        return idVenta;
    }

    /**
     * Define el valor de la propiedad idVenta.
     * 
     */
    public void setIdVenta(int value) {
        this.idVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad medioPago.
     * 
     */
    public int getMedioPago() {
        return medioPago;
    }

    /**
     * Define el valor de la propiedad medioPago.
     * 
     */
    public void setMedioPago(int value) {
        this.medioPago = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpresa(String value) {
        this.nombreEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad rutEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutEmpleado() {
        return rutEmpleado;
    }

    /**
     * Define el valor de la propiedad rutEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutEmpleado(String value) {
        this.rutEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalVenta.
     * 
     */
    public int getTotalVenta() {
        return totalVenta;
    }

    /**
     * Define el valor de la propiedad totalVenta.
     * 
     */
    public void setTotalVenta(int value) {
        this.totalVenta = value;
    }

}
