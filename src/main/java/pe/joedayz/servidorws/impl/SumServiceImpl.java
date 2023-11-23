package pe.joedayz.servidorws.impl;

import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.springframework.stereotype.Service;
import org.tempuri.*;


@Service
@SchemaValidation(type = SchemaValidationType.REQUEST)
public class SumServiceImpl implements ConsultaReniecSoap {

  @Override
  public RespNombres consultaXNombres(String apellidoPaterno, String apellidoMaterno, String nombres, String inicio, int cant, DatosAuditoria datosAuditoria) {
    return null;
  }

  @Override
  public RespDNI consultarDNI(String dni, DatosAuditoria datosAuditoria) {
    RespDNI response = new RespDNI();
    return response;
  }
}