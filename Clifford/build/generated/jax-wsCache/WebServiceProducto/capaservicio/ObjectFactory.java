
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

    private final static QName _WebActualizarProductoResponse_QNAME = new QName("http://CapaServicio/", "webActualizarProductoResponse");
    private final static QName _WebEliminarProductoResponse_QNAME = new QName("http://CapaServicio/", "webEliminarProductoResponse");
    private final static QName _WebConsultarProducto_QNAME = new QName("http://CapaServicio/", "webConsultarProducto");
    private final static QName _WebExisteProducto_QNAME = new QName("http://CapaServicio/", "webExisteProducto");
    private final static QName _WebBuscarProductoResponse_QNAME = new QName("http://CapaServicio/", "webBuscarProductoResponse");
    private final static QName _WebEliminarProducto_QNAME = new QName("http://CapaServicio/", "webEliminarProducto");
    private final static QName _WebInsertarProducto_QNAME = new QName("http://CapaServicio/", "webInsertarProducto");
    private final static QName _WebConsultarProductoResponse_QNAME = new QName("http://CapaServicio/", "webConsultarProductoResponse");
    private final static QName _WebInsertarProductoResponse_QNAME = new QName("http://CapaServicio/", "webInsertarProductoResponse");
    private final static QName _WebBuscarProducto_QNAME = new QName("http://CapaServicio/", "webBuscarProducto");
    private final static QName _WebConfigurarConexion_QNAME = new QName("http://CapaServicio/", "webConfigurarConexion");
    private final static QName _WebConfigurarConexionResponse_QNAME = new QName("http://CapaServicio/", "webConfigurarConexionResponse");
    private final static QName _WebExisteProductoResponse_QNAME = new QName("http://CapaServicio/", "webExisteProductoResponse");
    private final static QName _WebActualizarProducto_QNAME = new QName("http://CapaServicio/", "webActualizarProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: capaservicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebActualizarProducto }
     * 
     */
    public WebActualizarProducto createWebActualizarProducto() {
        return new WebActualizarProducto();
    }

    /**
     * Create an instance of {@link WebExisteProductoResponse }
     * 
     */
    public WebExisteProductoResponse createWebExisteProductoResponse() {
        return new WebExisteProductoResponse();
    }

    /**
     * Create an instance of {@link WebConfigurarConexionResponse }
     * 
     */
    public WebConfigurarConexionResponse createWebConfigurarConexionResponse() {
        return new WebConfigurarConexionResponse();
    }

    /**
     * Create an instance of {@link WebConfigurarConexion }
     * 
     */
    public WebConfigurarConexion createWebConfigurarConexion() {
        return new WebConfigurarConexion();
    }

    /**
     * Create an instance of {@link WebBuscarProducto }
     * 
     */
    public WebBuscarProducto createWebBuscarProducto() {
        return new WebBuscarProducto();
    }

    /**
     * Create an instance of {@link WebInsertarProductoResponse }
     * 
     */
    public WebInsertarProductoResponse createWebInsertarProductoResponse() {
        return new WebInsertarProductoResponse();
    }

    /**
     * Create an instance of {@link WebConsultarProductoResponse }
     * 
     */
    public WebConsultarProductoResponse createWebConsultarProductoResponse() {
        return new WebConsultarProductoResponse();
    }

    /**
     * Create an instance of {@link WebBuscarProductoResponse }
     * 
     */
    public WebBuscarProductoResponse createWebBuscarProductoResponse() {
        return new WebBuscarProductoResponse();
    }

    /**
     * Create an instance of {@link WebEliminarProducto }
     * 
     */
    public WebEliminarProducto createWebEliminarProducto() {
        return new WebEliminarProducto();
    }

    /**
     * Create an instance of {@link WebInsertarProducto }
     * 
     */
    public WebInsertarProducto createWebInsertarProducto() {
        return new WebInsertarProducto();
    }

    /**
     * Create an instance of {@link WebConsultarProducto }
     * 
     */
    public WebConsultarProducto createWebConsultarProducto() {
        return new WebConsultarProducto();
    }

    /**
     * Create an instance of {@link WebExisteProducto }
     * 
     */
    public WebExisteProducto createWebExisteProducto() {
        return new WebExisteProducto();
    }

    /**
     * Create an instance of {@link WebActualizarProductoResponse }
     * 
     */
    public WebActualizarProductoResponse createWebActualizarProductoResponse() {
        return new WebActualizarProductoResponse();
    }

    /**
     * Create an instance of {@link WebEliminarProductoResponse }
     * 
     */
    public WebEliminarProductoResponse createWebEliminarProductoResponse() {
        return new WebEliminarProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebActualizarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webActualizarProductoResponse")
    public JAXBElement<WebActualizarProductoResponse> createWebActualizarProductoResponse(WebActualizarProductoResponse value) {
        return new JAXBElement<WebActualizarProductoResponse>(_WebActualizarProductoResponse_QNAME, WebActualizarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebEliminarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webEliminarProductoResponse")
    public JAXBElement<WebEliminarProductoResponse> createWebEliminarProductoResponse(WebEliminarProductoResponse value) {
        return new JAXBElement<WebEliminarProductoResponse>(_WebEliminarProductoResponse_QNAME, WebEliminarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultarProducto")
    public JAXBElement<WebConsultarProducto> createWebConsultarProducto(WebConsultarProducto value) {
        return new JAXBElement<WebConsultarProducto>(_WebConsultarProducto_QNAME, WebConsultarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebExisteProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webExisteProducto")
    public JAXBElement<WebExisteProducto> createWebExisteProducto(WebExisteProducto value) {
        return new JAXBElement<WebExisteProducto>(_WebExisteProducto_QNAME, WebExisteProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebBuscarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webBuscarProductoResponse")
    public JAXBElement<WebBuscarProductoResponse> createWebBuscarProductoResponse(WebBuscarProductoResponse value) {
        return new JAXBElement<WebBuscarProductoResponse>(_WebBuscarProductoResponse_QNAME, WebBuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebEliminarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webEliminarProducto")
    public JAXBElement<WebEliminarProducto> createWebEliminarProducto(WebEliminarProducto value) {
        return new JAXBElement<WebEliminarProducto>(_WebEliminarProducto_QNAME, WebEliminarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInsertarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webInsertarProducto")
    public JAXBElement<WebInsertarProducto> createWebInsertarProducto(WebInsertarProducto value) {
        return new JAXBElement<WebInsertarProducto>(_WebInsertarProducto_QNAME, WebInsertarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConsultarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConsultarProductoResponse")
    public JAXBElement<WebConsultarProductoResponse> createWebConsultarProductoResponse(WebConsultarProductoResponse value) {
        return new JAXBElement<WebConsultarProductoResponse>(_WebConsultarProductoResponse_QNAME, WebConsultarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebInsertarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webInsertarProductoResponse")
    public JAXBElement<WebInsertarProductoResponse> createWebInsertarProductoResponse(WebInsertarProductoResponse value) {
        return new JAXBElement<WebInsertarProductoResponse>(_WebInsertarProductoResponse_QNAME, WebInsertarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebBuscarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webBuscarProducto")
    public JAXBElement<WebBuscarProducto> createWebBuscarProducto(WebBuscarProducto value) {
        return new JAXBElement<WebBuscarProducto>(_WebBuscarProducto_QNAME, WebBuscarProducto.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link WebConfigurarConexionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webConfigurarConexionResponse")
    public JAXBElement<WebConfigurarConexionResponse> createWebConfigurarConexionResponse(WebConfigurarConexionResponse value) {
        return new JAXBElement<WebConfigurarConexionResponse>(_WebConfigurarConexionResponse_QNAME, WebConfigurarConexionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebExisteProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webExisteProductoResponse")
    public JAXBElement<WebExisteProductoResponse> createWebExisteProductoResponse(WebExisteProductoResponse value) {
        return new JAXBElement<WebExisteProductoResponse>(_WebExisteProductoResponse_QNAME, WebExisteProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebActualizarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CapaServicio/", name = "webActualizarProducto")
    public JAXBElement<WebActualizarProducto> createWebActualizarProducto(WebActualizarProducto value) {
        return new JAXBElement<WebActualizarProducto>(_WebActualizarProducto_QNAME, WebActualizarProducto.class, null, value);
    }

}
