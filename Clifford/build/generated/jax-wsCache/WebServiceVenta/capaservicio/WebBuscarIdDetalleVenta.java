
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
 *         &lt;element name="id_folio" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idFolio"
})
public class WebBuscarIdDetalleVenta {

    @XmlElement(name = "id_folio")
    protected int idFolio;

    /**
     * Obtiene el valor de la propiedad idFolio.
     * 
     */
    public int getIdFolio() {
        return idFolio;
    }

    /**
     * Define el valor de la propiedad idFolio.
     * 
     */
    public void setIdFolio(int value) {
        this.idFolio = value;
    }

}
