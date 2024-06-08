package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository;

import org.springframework.stereotype.Component;

@Component
public class NumeroRepository {
    public String obtenerVocal(int numero) {
        switch (numero) {
            case 1:
                return "A";
            case 2:
                return "E";
            case 3:
                return "I";
            case 4:
                return "O";
            case 5:
                return "U";
            default:
                return "Número fuera de rango"; // O manejar como un error
        }
    }
}
