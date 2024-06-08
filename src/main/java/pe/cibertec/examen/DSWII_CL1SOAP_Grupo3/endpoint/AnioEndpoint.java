package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.endpoint;

import com.alejandro_luyo.ws.objects.AnioRequest;
import com.alejandro_luyo.ws.objects.AnioResponse;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository.AnioRepository;

@Endpoint
@AllArgsConstructor
public class AnioEndpoint {
    private static final String NAMESPACE_URI = "http://www.alejandro-luyo.com/ws/objects";
    private final AnioRepository anioRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AnioRequest")
    @ResponsePayload
    public AnioResponse anioResponse(@RequestPayload AnioRequest request) {
        int anio = request.getAnio();
        String mensaje = anioRepository.validarBisiesto(anio);

        AnioResponse response = new AnioResponse();
        response.setBisiesto(mensaje);

        return response;
    }
}
