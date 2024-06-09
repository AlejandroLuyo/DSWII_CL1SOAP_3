package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.service;

import com.alejandro_luyo.ws.objects.Personajews;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.convert.PersonajeConvert;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.model.Personaje;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository.PersonajeRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonajeService implements IPersonajeService{

    private PersonajeRepository personajeRepository;
    private PersonajeConvert personajeConvert;

    @Override
    public List<Personajews> listarPersonajes() {
        return personajeConvert.convertPersonajeToPersonajeWs
                (personajeRepository.findAll());
    }

    @Override
    public Personajews obtenerPersonajexId(int id) {
        Optional<Personaje> personaje = personajeRepository.findById(id);
        return personaje.map(value ->
                        personajeConvert.convertPersonajeToPersonajeWs(value))
                .orElse(null);
    }

    @Override
    public Personajews registrarActualizarPersonaje(Personajews personajews) {
        Personaje nuevoPersonaje = personajeRepository.save(
                personajeConvert.convertPersonajewsToPersonaje(personajews));
        if(nuevoPersonaje == null)
            return  null;
        return personajeConvert.convertPersonajeToPersonajeWs(nuevoPersonaje);
    }
}
