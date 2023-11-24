package pe.com.prima.opreniecsoap.mapper;

import org.mapstruct.Mapper;
import org.tempuri.RespNombres;
import pe.com.prima.opreniecsoap.proxy.OpReniecClient;

@Mapper(componentModel = "spring")
public interface ConsultaXNombresResponseMapper {
    RespNombres toSoapEntity(OpReniecClient.ByNombreResponse response);

}