package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.endpoint;

import com.alejandro_luyo.ws.objects.NumeroRequest;
import com.alejandro_luyo.ws.objects.NumeroResponse;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository.NumeroRepository;

@Endpoint
@AllArgsConstructor
public class NumeroEndpoint {

    private static final String NAMESPACE_URI="http://www.alejandro-luyo.com/ws/objects";
    private final NumeroRepository numeroRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "NumeroRequest")
    @ResponsePayload
    public NumeroResponse convertirNumeroAVocal(@RequestPayload NumeroRequest request) {
        NumeroResponse response = new NumeroResponse();
        String vocal = numeroRepository.obtenerVocal(request.getNumero());
        response.setVocal(vocal);
        return response;
    }
}
