
package capaservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the capaservicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WebConsultarCargo_QNAME = new QName("http://CapaServicio/", "webConsultarCargo");
    private final static QName _WebInsertarEmpleadoResponse_QNAME = new QName("http://CapaServicio/", "webInsertarEmpleadoResponse");
    private final static QName _WebActualizarEmpleadoResponse_QNAME = new QName("http://CapaServicio/", "webActualizarEmpleadoResponse");
    private final static QName _WebConfigurarConexion_QNAME = new QName("http://CapaServicio/", "webConfigurarConexion");
    private final static QName _WebActualizarEmpleado_QNAME = new QName("http://CapaServicio/", "webActualizarEmpleado");
    private final static QName _WebEliminarEmpleadoResponse_QNAME = new QName("http://CapaServicio/", "webEliminarEmpleadoResponse");
    private final static QName _WebInsertarEmpleado_QNAME = new QName("http://CapaServicio/", "webInsertarEmpleado");
    private final static QName _WebConfigurarConexionResponse_QNAME = new QName("http://CapaServicio/", "webConfigurarConexionResponse");
    private final static QName _WebEliminarEmpleado_QNAME = new QName("http://CapaServicio/", "webEliminarEmpleado");
    private final static QName _WebConsultarCargoResponse_QNAME = new QName("http://CapaServicio/", "webConsultarCargoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: capaservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebConsultarCargoResponse }
     * 
     */
    public WebConsultarCargoResponse createWebConsultarCargoResponse() {
        return new WebConsultarCargoResponse();
    }

    /**
     * Create an instance of {@link WebEliminarEmpleado }
     * 
     */
    public WebEliminarEmpleado createWebEliminarEmpleado() {
        return new WebEliminarEmpleado();
    }

    /**
     * Create an instance of {@link WebConfigurarConexionResponse }
     * 
     */
    public WebConfigurarConexionResponse createWebConfigurarConexionResponse() {
        return new WebConfigurarConexionResponse();
    }

    /**
     * Create an instance of {@link WebActualizarEmpleado }
     * 
     */
    public WebActualizarEmpleado createWebActualizarEmpleado() {
        return new WebActualizarEmpleado();
    }

    /**
     * Create an instance of {@link WebEliminarEmpleadoResponse }
     * 
     */
    public WebEliminarEmpleadoResponse createWebEliminarEmpleadoResponse() {
        return new WebEliminarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link WebInsertarEmpleado }
     * 
     */
    public WebInsertarEmpleado createWebInsertarEmpleado() {
        return new WebInsertarEmpleado();
    }

    /**
     * Create an instance of {@link WebConfigurarConexion }
     * 
     */
    public WebConfigurarConexion createWebConfigurarConexion() {
        return new WebConfigurarConexion();
    }

    /**
     * Create an instance of {@link WebActualizarEmpleadoResponse }
     * 
     */
    public WebActualizarEmpleadoResponse createWebActualizarEmpleadoResponse() {
        return new WebActualizarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link WebConsultarCargo }
     * 
     */
    public WebConsultarCargo createWebConsultarCargo() {
        return new WebConsultarCargo();
    }

    /**
     * Create an instance of {@link WebInsertarEmpleadoResponse }
     * 
     */
    public WebInsertarEmpleadoResponse createWebInsertarEmpleadoResponse() {
        return new WebInsertarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link Empleado }
     * 
     */
    public Empleado createEmpleado() {
        return new Empleado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultarCargo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultarCargo")
    public JAXBElement<WebConsultarCargo> createWebConsultarCargo(WebConsultarCargo value) {
        return new JAXBElement<WebConsultarCargo>(_WebConsultarCargo_QNAME, WebConsultarCargo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInsertarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webInsertarEmpleadoResponse")
    public JAXBElement<WebInsertarEmpleadoResponse> createWebInsertarEmpleadoResponse(WebInsertarEmpleadoResponse value) {
        return new JAXBElement<WebInsertarEmpleadoResponse>(_WebInsertarEmpleadoResponse_QNAME, WebInsertarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebActualizarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webActualizarEmpleadoResponse")
    public JAXBElement<WebActualizarEmpleadoResponse> createWebActualizarEmpleadoResponse(WebActualizarEmpleadoResponse value) {
        return new JAXBElement<WebActualizarEmpleadoResponse>(_WebActualizarEmpleadoResponse_QNAME, WebActualizarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConfigurarConexion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConfigurarConexion")
    public JAXBElement<WebConfigurarConexion> createWebConfigurarConexion(WebConfigurarConexion value) {
        return new JAXBElement<WebConfigurarConexion>(_WebConfigurarConexion_QNAME, WebConfigurarConexion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebActualizarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webActualizarEmpleado")
    public JAXBElement<WebActualizarEmpleado> createWebActualizarEmpleado(WebActualizarEmpleado value) {
        return new JAXBElement<WebActualizarEmpleado>(_WebActualizarEmpleado_QNAME, WebActualizarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebEliminarEmpleadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webEliminarEmpleadoResponse")
    public JAXBElement<WebEliminarEmpleadoResponse> createWebEliminarEmpleadoResponse(WebEliminarEmpleadoResponse value) {
        return new JAXBElement<WebEliminarEmpleadoResponse>(_WebEliminarEmpleadoResponse_QNAME, WebEliminarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInsertarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webInsertarEmpleado")
    public JAXBElement<WebInsertarEmpleado> createWebInsertarEmpleado(WebInsertarEmpleado value) {
        return new JAXBElement<WebInsertarEmpleado>(_WebInsertarEmpleado_QNAME, WebInsertarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConfigurarConexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConfigurarConexionResponse")
    public JAXBElement<WebConfigurarConexionResponse> createWebConfigurarConexionResponse(WebConfigurarConexionResponse value) {
        return new JAXBElement<WebConfigurarConexionResponse>(_WebConfigurarConexionResponse_QNAME, WebConfigurarConexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebEliminarEmpleado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webEliminarEmpleado")
    public JAXBElement<WebEliminarEmpleado> createWebEliminarEmpleado(WebEliminarEmpleado value) {
        return new JAXBElement<WebEliminarEmpleado>(_WebEliminarEmpleado_QNAME, WebEliminarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultarCargoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultarCargoResponse")
    public JAXBElement<WebConsultarCargoResponse> createWebConsultarCargoResponse(WebConsultarCargoResponse value) {
        return new JAXBElement<WebConsultarCargoResponse>(_WebConsultarCargoResponse_QNAME, WebConsultarCargoResponse.class, null, value);
    }

}
