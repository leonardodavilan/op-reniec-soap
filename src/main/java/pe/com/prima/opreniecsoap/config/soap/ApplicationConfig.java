package pe.com.prima.opreniecsoap.config.soap;

import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.com.prima.opreniecsoap.business.impl.ReniecServiceImpl;

@Configuration
public class ApplicationConfig {

  @Autowired
  private Bus bus;

  @Bean
  public Endpoint endpoint(ReniecServiceImpl sumServiceImpl){
    Endpoint endpoint = new EndpointImpl(bus, sumServiceImpl, SOAPBinding.SOAP12HTTP_BINDING);
    endpoint.publish("/soap/SumService");
    return endpoint;
  }
}
