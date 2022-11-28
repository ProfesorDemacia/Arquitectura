
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webActualizarVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webActualizarVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Venta" type="{http://CapaServicio/}venta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webActualizarVenta", propOrder = {
    "venta"
})
public class WebActualizarVenta {

    @XmlElement(name = "Venta")
    protected Venta venta;

    /**
     * Obtiene el valor de la propiedad venta.
     * 
     * @return
     *     possible object is
     *     {@link Venta }
     *     
     */
    public Venta getVenta() {
        return venta;
    }

    /**
     * Define el valor de la propiedad venta.
     * 
     * @param value
     *     allowed object is
     *     {@link Venta }
     *     
     */
    public void setVenta(Venta value) {
        this.venta = value;
    }

}
