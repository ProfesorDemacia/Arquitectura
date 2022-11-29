
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para webConsultarCargo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="webConsultarCargo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rut_empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "webConsultarCargo", propOrder = {
    "rutEmpleado"
})
public class WebConsultarCargo {

    @XmlElement(name = "rut_empleado")
    protected String rutEmpleado;

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

}
