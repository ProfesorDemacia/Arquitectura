
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webActualizarDetalleVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webActualizarDetalleVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetalleVenta" type="{http://CapaServicio/}detalleVenta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webActualizarDetalleVenta", propOrder = {
    "detalleVenta"
})
public class WebActualizarDetalleVenta {

    @XmlElement(name = "DetalleVenta")
    protected DetalleVenta detalleVenta;

    /**
     * Obtiene el valor de la propiedad detalleVenta.
     * 
     * @return
     *     possible object is
     *     {@link DetalleVenta }
     *     
     */
    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    /**
     * Define el valor de la propiedad detalleVenta.
     * 
     * @param value
     *     allowed object is
     *     {@link DetalleVenta }
     *     
     */
    public void setDetalleVenta(DetalleVenta value) {
        this.detalleVenta = value;
    }

}
