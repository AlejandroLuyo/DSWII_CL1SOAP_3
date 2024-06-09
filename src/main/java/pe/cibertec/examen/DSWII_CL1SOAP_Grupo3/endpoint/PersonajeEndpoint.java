package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.endpoint;

import com.alejandro_luyo.ws.objects.*;
import lombok.AllArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.exception.NotFoundException;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.service.PersonajeService;

@AllArgsConstructor
@Endpoint
public class PersonajeEndpoint {
    private PersonajeService personajeService;
    private static final String NAMESPACE_URL ="http://www.alejandro-luyo.com/ws/objects";

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPersonajesRequest")
    @ResponsePayload
    public GetPersonajesResponse getPersonajes(@RequestPayload
                                               GetPersonajesRequest request){
        GetPersonajesResponse response = new GetPersonajesResponse();
        response.getPersonajes().addAll(personajeService.listarPersonajes());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getPersonajeRequest")
    @ResponsePayload
    public GetPersonajeResponse getPersonaje(@RequestPayload
                                             GetPersonajeRequest request){
        GetPersonajeResponse response = new GetPersonajeResponse();
        Personajews personajews = personajeService.obtenerPersonajexId(request.getId());
        if(personajews == null)
            throw new NotFoundException("El personaje con el ID " + request.getId()+" no existe!");
        response.setPersonaje(personajews);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "postPersonajeRequest")
    @ResponsePayload
    public PostPersonajeResponse savePersonaje(@RequestPayload
                                               PostPersonajeRequest request){
        PostPersonajeResponse response = new PostPersonajeResponse();
        response.setPersonaje(personajeService.registrarActualizarPersonaje(
                request.getPersonaje()));
        return response;
    }
}
