package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.endpoint;

import com.alejandro_luyo.ws.objects.Compra;
import com.alejandro_luyo.ws.objects.CompraRequest;
import com.alejandro_luyo.ws.objects.CompraResponse;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository.CompraRepository;

@Endpoint
@AllArgsConstructor
public class CompraEndpoint {

    private static final String NAMESPACE_URI = "http://www.alejandro-luyo.com/ws/objects";
    private final CompraRepository compraRepository;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CompraRequest")
    @ResponsePayload
    public CompraResponse calcularTotal(@RequestPayload CompraRequest request) {
        double precioUnitario = request.getPrecioUnitario();
        int cantidad = request.getCantidad();

        Compra detalleCompra = compraRepository.calcularTotal(precioUnitario, cantidad);

        CompraResponse response = new CompraResponse();
        response.setDetalleCompra(detalleCompra);

        return response;
    }
}
