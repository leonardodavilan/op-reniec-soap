package pe.com.prima.opreniecsoap.business.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.annotations.SchemaValidation;
import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;
import org.springframework.stereotype.Service;
import org.tempuri.*;
import pe.com.prima.opreniecsoap.mapper.ConsultaXNombresResponseMapper;
import pe.com.prima.opreniecsoap.mapper.ConsultarDNIResponseMapper;
import pe.com.prima.opreniecsoap.proxy.OpReniecClient;
import pe.com.prima.opreniecsoap.proxy.OpReniecRestService;


@Slf4j
@Service
@AllArgsConstructor
@SchemaValidation(type = SchemaValidationType.REQUEST)
public class ReniecServiceImpl implements ConsultaReniecSoap {

  private final OpReniecRestService opReniecRestService;
  private final ConsultarDNIResponseMapper consultarDNIResponseMapper;
  private final ConsultaXNombresResponseMapper consultaXNombresResponseMapper;


  @Override
  public RespNombres consultaXNombres(String apellidoPaterno, String apellidoMaterno, String nombres, String inicio, int cant, DatosAuditoria datosAuditoria) {
    log.info("[ReniecServiceClient] - consultaXNombres {} {} {}",new Object[] { nombres, apellidoPaterno, apellidoMaterno });
    try {
      OpReniecClient.ByNombreRequest request = new OpReniecClient.ByNombreRequest();
      request.setNombres(nombres);
      request.setApellidoPaterno(apellidoPaterno);
      request.setApellidoMaterno(apellidoMaterno);
      request.setInicio(inicio);
      request.setCant(cant);
      request.setDatosAuditoria(toModel(datosAuditoria));
      OpReniecClient.ByNombreResponse respNombres = this.opReniecRestService.consultarNombres(request);
      return this.consultaXNombresResponseMapper.toSoapEntity(respNombres);
    } catch (Exception ex) {
      log.error(ex.getMessage());
      throw ex;
    }
  }

  @Override
  public RespDNI consultarDNI(String dni, DatosAuditoria datosAuditoria) {

    log.info("[ReniecServiceClient] - consultarDNI {} ", dni);
    try {
      OpReniecClient.DniRequest request = new OpReniecClient.DniRequest();
      request.setDni(dni);
      request.setDatosAuditoria(toModel(datosAuditoria));
      OpReniecClient.ByDniResponse respDNI = this.opReniecRestService.consultarDatosDni(request);
      return this.consultarDNIResponseMapper.toSoapEntity(respDNI);
    } catch (Exception ex) {
      log.error(ex.getMessage());
      throw ex;
    }
  }

  private OpReniecClient.DatosAuditoria toModel(DatosAuditoria datos) {
    OpReniecClient.DatosAuditoria auditoria = new OpReniecClient.DatosAuditoria();
    auditoria.setCodAgencia(datos.getCodAgencia());
    auditoria.setNombreAgencia(datos.getNombreAgencia());
    auditoria.setCodEjecutivo(datos.getCodEjecutivo());
    auditoria.setNombreEjecutivo(datos.getNombreEjecutivo());
    auditoria.setDniEjecutivo(datos.getDNIEjecutivo());
    auditoria.setCaracteresVerificacion(datos.getCaracteresVerificacion());
    auditoria.setCodigoInstitucionSolicitante(datos.getCodigoInstitucionSolicitante());
    auditoria.setIdLog(datos.getIdLog());
    auditoria.setIp(datos.getIP());
    auditoria.setVersion(datos.getVersion());
    return auditoria;
  }
}