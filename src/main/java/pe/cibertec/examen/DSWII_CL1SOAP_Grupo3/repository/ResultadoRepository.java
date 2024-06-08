package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository;

import com.alejandro_luyo.ws.objects.Resultado;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResultadoRepository {

    public List<Resultado> calcularCuboYCuarta(int limite) {
        List<Resultado> resultados = new ArrayList<>();
        for (int i = 1; i <= limite; i++) {
            Resultado resultado = new Resultado();
            resultado.setNumero(i);
            resultado.setCubo(Math.pow(i, 3));
            resultado.setCuarta(Math.pow(i, 4));
            resultados.add(resultado);
        }
        return resultados;
    }
}
