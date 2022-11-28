
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webInsertarDetalleVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webInsertarDetalleVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetalleVenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webInsertarDetalleVenta", propOrder = {
    "detalleVenta",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5"
})
public class WebInsertarDetalleVenta {

    @XmlElement(name = "DetalleVenta")
    protected int detalleVenta;
    protected int arg1;
    protected String arg2;
    protected int arg3;
    protected int arg4;
    protected int arg5;

    /**
     * Obtiene el valor de la propiedad detalleVenta.
     * 
     */
    public int getDetalleVenta() {
        return detalleVenta;
    }

    /**
     * Define el valor de la propiedad detalleVenta.
     * 
     */
    public void setDetalleVenta(int value) {
        this.detalleVenta = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg2() {
        return arg2;
    }

    /**
     * Define el valor de la propiedad arg2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg2(String value) {
        this.arg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg3.
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * Define el valor de la propiedad arg3.
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg4.
     * 
     */
    public int getArg4() {
        return arg4;
    }

    /**
     * Define el valor de la propiedad arg4.
     * 
     */
    public void setArg4(int value) {
        this.arg4 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg5.
     * 
     */
    public int getArg5() {
        return arg5;
    }

    /**
     * Define el valor de la propiedad arg5.
     * 
     */
    public void setArg5(int value) {
        this.arg5 = value;
    }

}
