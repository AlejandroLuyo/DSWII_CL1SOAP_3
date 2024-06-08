package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.endpoint;

import com.alejandro_luyo.ws.objects.Prestamo;
import com.alejandro_luyo.ws.objects.PrestamoRequest;
import com.alejandro_luyo.ws.objects.PrestamoResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository.PrestamoRepository;

@Endpoint
@AllArgsConstructor
public class PrestamoEndpoint {

    private static final String NAMESPACE_URI="http://www.alejandro-luyo.com/ws/objects";
    private PrestamoRepository prestamoRepository;

    @PayloadRoot(namespace =NAMESPACE_URI, localPart="PrestamoRequest")
    @ResponsePayload
    public PrestamoResponse getPrestamo(@RequestPayload PrestamoRequest request) {
        double monto = request.getMonto();
        Prestamo prestamo = prestamoRepository.obtenerPrestamo(monto);
        PrestamoResponse response = new PrestamoResponse();
        response.setCuotas(prestamo.getCuotas());
        response.setMontoCuota(prestamo.getMontoCuota());
        response.setInteres(prestamo.getInteres());
        response.setDeudaTotal(prestamo.getDeudaTotal());
        return response;
    }
}
