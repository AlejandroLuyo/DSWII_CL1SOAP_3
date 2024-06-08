package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.endpoint;

import com.alejandro_luyo.ws.objects.CalculoRequest;
import com.alejandro_luyo.ws.objects.CalculoResponse;
import com.alejandro_luyo.ws.objects.Resultado;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository.ResultadoRepository;

import java.util.List;

@Endpoint
@AllArgsConstructor
public class ResultadoEndpoint {

    private static final String NAMESPACE_URI="http://www.alejandro-luyo.com/ws/objects";
    private final ResultadoRepository resultadoRepository;

    @PayloadRoot(namespace =NAMESPACE_URI, localPart = "CalculoRequest")
    @ResponsePayload
    public CalculoResponse calculoResponse(@RequestPayload CalculoRequest request) {
        int limite = request.getLimite();
        List<Resultado> resultados = resultadoRepository.calcularCuboYCuarta(limite);
        CalculoResponse response = new CalculoResponse();
        response.getResultados().addAll(resultados);
        return response;
    }
}
