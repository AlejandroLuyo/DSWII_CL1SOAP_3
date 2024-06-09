package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.service;

import com.alejandro_luyo.ws.objects.Personajews;

import java.util.List;

public interface IPersonajeService {
    List<Personajews> listarPersonajes();
    Personajews obtenerPersonajexId(int id);
    Personajews registrarActualizarPersonaje(Personajews personaje);

}
