
package capaservicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para empleado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="empleado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido_empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="correo_empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion_empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_cargo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_comuna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre_empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "empleado", propOrder = {
    "apellidoEmpleado",
    "correoEmpleado",
    "direccionEmpleado",
    "idCargo",
    "idComuna",
    "nombreEmpleado",
    "rutEmpleado"
})
public class Empleado {

    @XmlElement(name = "apellido_empleado")
    protected String apellidoEmpleado;
    @XmlElement(name = "correo_empleado")
    protected String correoEmpleado;
    @XmlElement(name = "direccion_empleado")
    protected String direccionEmpleado;
    @XmlElement(name = "id_cargo")
    protected int idCargo;
    @XmlElement(name = "id_comuna")
    protected int idComuna;
    @XmlElement(name = "nombre_empleado")
    protected String nombreEmpleado;
    @XmlElement(name = "rut_empleado")
    protected String rutEmpleado;

    /**
     * Obtiene el valor de la propiedad apellidoEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    /**
     * Define el valor de la propiedad apellidoEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoEmpleado(String value) {
        this.apellidoEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad correoEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    /**
     * Define el valor de la propiedad correoEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreoEmpleado(String value) {
        this.correoEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    /**
     * Define el valor de la propiedad direccionEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionEmpleado(String value) {
        this.direccionEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad idCargo.
     * 
     */
    public int getIdCargo() {
        return idCargo;
    }

    /**
     * Define el valor de la propiedad idCargo.
     * 
     */
    public void setIdCargo(int value) {
        this.idCargo = value;
    }

    /**
     * Obtiene el valor de la propiedad idComuna.
     * 
     */
    public int getIdComuna() {
        return idComuna;
    }

    /**
     * Define el valor de la propiedad idComuna.
     * 
     */
    public void setIdComuna(int value) {
        this.idComuna = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    /**
     * Define el valor de la propiedad nombreEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEmpleado(String value) {
        this.nombreEmpleado = value;
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

}
