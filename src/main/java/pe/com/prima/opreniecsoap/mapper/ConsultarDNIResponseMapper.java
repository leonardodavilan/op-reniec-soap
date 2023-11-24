package pe.com.prima.opreniecsoap.mapper;

import org.mapstruct.Mapper;
import org.tempuri.RespDNI;
import pe.com.prima.opreniecsoap.proxy.OpReniecClient;

@Mapper(componentModel = "spring")
public interface ConsultarDNIResponseMapper {
    RespDNI toSoapEntity(OpReniecClient.ByDniResponse response);
}