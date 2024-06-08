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
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet
            (ApplicationContext applicationContext){
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet,"/ws/*");
    }

    @Bean(name ="prestamo")
    public DefaultWsdl11Definition prestamoWsdl11Definition (XsdSchema prestamoSchema){
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PrestamoPort");
        wsdl11Definition.setLocationUri("/ws/prestamo");
        wsdl11Definition.setTargetNamespace("http://www.alejandro-luyo.com/ws/objects");
        wsdl11Definition.setSchema(prestamoSchema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema prestamoSchema(){
        return  new SimpleXsdSchema(new ClassPathResource("xsd/prestamo.xsd"));
    }
}
