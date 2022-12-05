
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webExisteDetalleVenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webExisteDetalleVenta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_detalle_venta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webExisteDetalleVenta", propOrder = {
    "idDetalleVenta"
})
public class WebExisteDetalleVenta {

    @XmlElement(name = "id_detalle_venta")
    protected int idDetalleVenta;

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

}
