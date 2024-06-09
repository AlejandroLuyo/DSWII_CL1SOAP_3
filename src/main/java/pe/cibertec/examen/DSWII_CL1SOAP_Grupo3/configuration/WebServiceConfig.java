package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean(name = "prestamo")
    public DefaultWsdl11Definition prestamoWsdl11Definition(XsdSchema prestamoSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PrestamoPort");
        wsdl11Definition.setLocationUri("/ws/prestamo");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(prestamoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema prestamoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/prestamo.xsd"));
    }

    @Bean(name = "numero")
    public DefaultWsdl11Definition numeroWsdl11Definition(XsdSchema numeroSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("NumeroPort");
        wsdl11Definition.setLocationUri("/ws/numero");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(numeroSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema numeroSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/numero.xsd"));
    }

    @Bean(name = "resultado")
    public DefaultWsdl11Definition resultadoWsdl11Definition(XsdSchema resultadoSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ResultadoPort");
        wsdl11Definition.setLocationUri("/ws/resultado");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(resultadoSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema resultadoSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/resultado.xsd"));
    }

    @Bean(name = "compra")
    public DefaultWsdl11Definition compraWsdl11Definition(XsdSchema compraSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CompraPort");
        wsdl11Definition.setLocationUri("/ws/compra");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(compraSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema compraSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/compra.xsd"));
    }

    @Bean(name = "anio")
    public DefaultWsdl11Definition anioWsdl11Definition(XsdSchema anioSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("AnioPort");
        wsdl11Definition.setLocationUri("/ws/anio");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(anioSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema anioSchema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/anio.xsd"));
    }

    @Bean(name = "personajes")
    public DefaultWsdl11Definition personajeWsdl11Definition(XsdSchema personajeSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PersonajesPort");
        wsdl11Definition.setLocationUri("/ws/personajes");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(personajeSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema personajeSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/personaje.xsd"));
    }
}
