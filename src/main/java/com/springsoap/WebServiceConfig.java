package com.springsoap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.commons.CommonsXsdSchemaCollection;

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

    @Bean(name = "CBPInterface_API_Request")
    public DefaultWsdl11Definition defaultWsdl11Definition(CommonsXsdSchemaCollection schemaCollection) {

        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("APIRequestMgrPortType");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://cps.huawei.com/cpsinterface/api_requestmgr");
        wsdl11Definition.setSchemaCollection(schemaCollection);

        return wsdl11Definition;
    }

    @Bean
    public CommonsXsdSchemaCollection schemaCollection() {
        // Create a CommonsXsdSchemaCollection and add multiple XsdSchema instances
        return new CommonsXsdSchemaCollection(
                new ClassPathResource("static/wsdl/CPSInterface_API_Request.xsd"),
                 new ClassPathResource("static/wsdl/CPSInterface_API_Response.xsd"));
    }
}