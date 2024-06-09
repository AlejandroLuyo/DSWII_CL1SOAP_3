package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.convert;

import com.alejandro_luyo.ws.objects.Personajews;
import org.springframework.stereotype.Component;
import pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.model.Personaje;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonajeConvert {

    public Personaje convertPersonajewsToPersonaje(Personajews personajews){
        Personaje personaje = new Personaje();
        personaje.setIdpersonaje(personajews.getIdpersonaje());
        personaje.setNompersonaje(personajews.getNompersonaje());
        personaje.setApepersonaje(personajews.getApepersonaje());
        personaje.setFecnacpersonaje(personajews.getFecnacpersonaje());
        return personaje;

    }

    public List<Personaje> convertPersonajewsToPersonaje(List<Personajews> personajews){
        List<Personaje> personajeList = new ArrayList<>();
        personajews.forEach(dom ->{
            personajeList.add(convertPersonajewsToPersonaje(dom));
        });
        return personajeList;
    }
    public Personajews convertPersonajeToPersonajeWs(Personaje personaje){
        Personajews personajews = new Personajews();
        personajews.setIdpersonaje(personaje.getIdpersonaje());
        personajews.setNompersonaje(personaje.getNompersonaje());
        personajews.setApepersonaje(personaje.getApepersonaje());
        personajews.setFecnacpersonaje(personaje.getFecnacpersonaje());
        return personajews;
    }
    public List<Personajews> convertPersonajeToPersonajeWs(List<Personaje> personaje){
        List<Personajews> personajeList = new ArrayList<>();
        personaje.forEach(dom ->{
            personajeList.add(convertPersonajeToPersonajeWs(dom));
        });
        return personajeList;
    }
}
