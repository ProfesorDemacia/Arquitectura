
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

    private final static QName _WebBuscarIdDetalleVentaResponse_QNAME = new QName("http://CapaServicio/", "webBuscarIdDetalleVentaResponse");
    private final static QName _WebEliminarVentaResponse_QNAME = new QName("http://CapaServicio/", "webEliminarVentaResponse");
    private final static QName _WebConsultarVentaEspecifica_QNAME = new QName("http://CapaServicio/", "webConsultarVentaEspecifica");
    private final static QName _WebConsultaVentaResponse_QNAME = new QName("http://CapaServicio/", "webConsultaVentaResponse");
    private final static QName _WebActualizarVentaResponse_QNAME = new QName("http://CapaServicio/", "webActualizarVentaResponse");
    private final static QName _WebInsertarVenta_QNAME = new QName("http://CapaServicio/", "webInsertarVenta");
    private final static QName _WebConsultarVentaEspecificaResponse_QNAME = new QName("http://CapaServicio/", "webConsultarVentaEspecificaResponse");
    private final static QName _WebEliminarVenta_QNAME = new QName("http://CapaServicio/", "webEliminarVenta");
    private final static QName _WebConfigurarConexion_QNAME = new QName("http://CapaServicio/", "webConfigurarConexion");
    private final static QName _WebInsertarVentaResponse_QNAME = new QName("http://CapaServicio/", "webInsertarVentaResponse");
    private final static QName _WebConsultaVenta_QNAME = new QName("http://CapaServicio/", "webConsultaVenta");
    private final static QName _WebBuscarIdDetalleVenta_QNAME = new QName("http://CapaServicio/", "webBuscarIdDetalleVenta");
    private final static QName _WebConfigurarConexionResponse_QNAME = new QName("http://CapaServicio/", "webConfigurarConexionResponse");
    private final static QName _WebActualizarVenta_QNAME = new QName("http://CapaServicio/", "webActualizarVenta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: capaservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebActualizarVenta }
     * 
     */
    public WebActualizarVenta createWebActualizarVenta() {
        return new WebActualizarVenta();
    }

    /**
     * Create an instance of {@link WebBuscarIdDetalleVenta }
     * 
     */
    public WebBuscarIdDetalleVenta createWebBuscarIdDetalleVenta() {
        return new WebBuscarIdDetalleVenta();
    }

    /**
     * Create an instance of {@link WebConfigurarConexionResponse }
     * 
     */
    public WebConfigurarConexionResponse createWebConfigurarConexionResponse() {
        return new WebConfigurarConexionResponse();
    }

    /**
     * Create an instance of {@link WebConsultaVenta }
     * 
     */
    public WebConsultaVenta createWebConsultaVenta() {
        return new WebConsultaVenta();
    }

    /**
     * Create an instance of {@link WebConfigurarConexion }
     * 
     */
    public WebConfigurarConexion createWebConfigurarConexion() {
        return new WebConfigurarConexion();
    }

    /**
     * Create an instance of {@link WebInsertarVentaResponse }
     * 
     */
    public WebInsertarVentaResponse createWebInsertarVentaResponse() {
        return new WebInsertarVentaResponse();
    }

    /**
     * Create an instance of {@link WebEliminarVenta }
     * 
     */
    public WebEliminarVenta createWebEliminarVenta() {
        return new WebEliminarVenta();
    }

    /**
     * Create an instance of {@link WebConsultarVentaEspecificaResponse }
     * 
     */
    public WebConsultarVentaEspecificaResponse createWebConsultarVentaEspecificaResponse() {
        return new WebConsultarVentaEspecificaResponse();
    }

    /**
     * Create an instance of {@link WebInsertarVenta }
     * 
     */
    public WebInsertarVenta createWebInsertarVenta() {
        return new WebInsertarVenta();
    }

    /**
     * Create an instance of {@link WebActualizarVentaResponse }
     * 
     */
    public WebActualizarVentaResponse createWebActualizarVentaResponse() {
        return new WebActualizarVentaResponse();
    }

    /**
     * Create an instance of {@link WebConsultaVentaResponse }
     * 
     */
    public WebConsultaVentaResponse createWebConsultaVentaResponse() {
        return new WebConsultaVentaResponse();
    }

    /**
     * Create an instance of {@link WebConsultarVentaEspecifica }
     * 
     */
    public WebConsultarVentaEspecifica createWebConsultarVentaEspecifica() {
        return new WebConsultarVentaEspecifica();
    }

    /**
     * Create an instance of {@link WebEliminarVentaResponse }
     * 
     */
    public WebEliminarVentaResponse createWebEliminarVentaResponse() {
        return new WebEliminarVentaResponse();
    }

    /**
     * Create an instance of {@link WebBuscarIdDetalleVentaResponse }
     * 
     */
    public WebBuscarIdDetalleVentaResponse createWebBuscarIdDetalleVentaResponse() {
        return new WebBuscarIdDetalleVentaResponse();
    }

    /**
     * Create an instance of {@link Venta }
     * 
     */
    public Venta createVenta() {
        return new Venta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebBuscarIdDetalleVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webBuscarIdDetalleVentaResponse")
    public JAXBElement<WebBuscarIdDetalleVentaResponse> createWebBuscarIdDetalleVentaResponse(WebBuscarIdDetalleVentaResponse value) {
        return new JAXBElement<WebBuscarIdDetalleVentaResponse>(_WebBuscarIdDetalleVentaResponse_QNAME, WebBuscarIdDetalleVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebEliminarVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webEliminarVentaResponse")
    public JAXBElement<WebEliminarVentaResponse> createWebEliminarVentaResponse(WebEliminarVentaResponse value) {
        return new JAXBElement<WebEliminarVentaResponse>(_WebEliminarVentaResponse_QNAME, WebEliminarVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultarVentaEspecifica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultarVentaEspecifica")
    public JAXBElement<WebConsultarVentaEspecifica> createWebConsultarVentaEspecifica(WebConsultarVentaEspecifica value) {
        return new JAXBElement<WebConsultarVentaEspecifica>(_WebConsultarVentaEspecifica_QNAME, WebConsultarVentaEspecifica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultaVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultaVentaResponse")
    public JAXBElement<WebConsultaVentaResponse> createWebConsultaVentaResponse(WebConsultaVentaResponse value) {
        return new JAXBElement<WebConsultaVentaResponse>(_WebConsultaVentaResponse_QNAME, WebConsultaVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebActualizarVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webActualizarVentaResponse")
    public JAXBElement<WebActualizarVentaResponse> createWebActualizarVentaResponse(WebActualizarVentaResponse value) {
        return new JAXBElement<WebActualizarVentaResponse>(_WebActualizarVentaResponse_QNAME, WebActualizarVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInsertarVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webInsertarVenta")
    public JAXBElement<WebInsertarVenta> createWebInsertarVenta(WebInsertarVenta value) {
        return new JAXBElement<WebInsertarVenta>(_WebInsertarVenta_QNAME, WebInsertarVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultarVentaEspecificaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultarVentaEspecificaResponse")
    public JAXBElement<WebConsultarVentaEspecificaResponse> createWebConsultarVentaEspecificaResponse(WebConsultarVentaEspecificaResponse value) {
        return new JAXBElement<WebConsultarVentaEspecificaResponse>(_WebConsultarVentaEspecificaResponse_QNAME, WebConsultarVentaEspecificaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebEliminarVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webEliminarVenta")
    public JAXBElement<WebEliminarVenta> createWebEliminarVenta(WebEliminarVenta value) {
        return new JAXBElement<WebEliminarVenta>(_WebEliminarVenta_QNAME, WebEliminarVenta.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInsertarVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webInsertarVentaResponse")
    public JAXBElement<WebInsertarVentaResponse> createWebInsertarVentaResponse(WebInsertarVentaResponse value) {
        return new JAXBElement<WebInsertarVentaResponse>(_WebInsertarVentaResponse_QNAME, WebInsertarVentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultaVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultaVenta")
    public JAXBElement<WebConsultaVenta> createWebConsultaVenta(WebConsultaVenta value) {
        return new JAXBElement<WebConsultaVenta>(_WebConsultaVenta_QNAME, WebConsultaVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebBuscarIdDetalleVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webBuscarIdDetalleVenta")
    public JAXBElement<WebBuscarIdDetalleVenta> createWebBuscarIdDetalleVenta(WebBuscarIdDetalleVenta value) {
        return new JAXBElement<WebBuscarIdDetalleVenta>(_WebBuscarIdDetalleVenta_QNAME, WebBuscarIdDetalleVenta.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WebActualizarVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webActualizarVenta")
    public JAXBElement<WebActualizarVenta> createWebActualizarVenta(WebActualizarVenta value) {
        return new JAXBElement<WebActualizarVenta>(_WebActualizarVenta_QNAME, WebActualizarVenta.class, null, value);
    }

}
