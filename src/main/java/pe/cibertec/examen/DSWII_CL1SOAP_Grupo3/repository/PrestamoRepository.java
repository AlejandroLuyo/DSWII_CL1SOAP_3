package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository;

import com.alejandro_luyo.ws.objects.Prestamo;
import org.springframework.stereotype.Component;

@Component
public class PrestamoRepository {

    public Prestamo obtenerPrestamo(double monto){
        Prestamo objprestamo = new Prestamo();
        objprestamo.setMonto(monto);
        if (monto>5000){
            objprestamo.setCuotas(3);
        }else if (monto<1000){
            objprestamo.setCuotas(1);
        }else if (monto>=2000&&monto<=3000){
            objprestamo.setCuotas(2);
        }
        else{
            objprestamo.setCuotas(5);
        }
        if(monto<4000){
            objprestamo.setInteres(0.12);
        } else {
            objprestamo.setInteres(0.10);
        }
        objprestamo.setDeudaTotal(monto+(monto*objprestamo.getInteres()));
        objprestamo.setMontoCuota(objprestamo.getDeudaTotal()/objprestamo.getCuotas());

        return objprestamo;
    }

}
