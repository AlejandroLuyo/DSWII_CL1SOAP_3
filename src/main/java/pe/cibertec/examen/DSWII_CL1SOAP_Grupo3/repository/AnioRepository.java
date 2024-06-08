package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository;

import org.springframework.stereotype.Component;

@Component
public class AnioRepository {
    public String validarBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            return "Es bisiesto";
        } else {
            return "No es bisiesto";
        }
    }
}
