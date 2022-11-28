
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webBuscarIdDetalleVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webBuscarIdDetalleVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="folio_detalle_venta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webBuscarIdDetalleVenta", propOrder = {
    "folioDetalleVenta"
})
public class WebBuscarIdDetalleVenta {

    @XmlElement(name = "folio_detalle_venta")
    protected int folioDetalleVenta;

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

}
