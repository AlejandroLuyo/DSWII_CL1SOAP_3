package pe.cibertec.examen.DSWII_CL1SOAP_Grupo3.repository;

import com.alejandro_luyo.ws.objects.Compra;
import org.springframework.stereotype.Component;

@Component
public class CompraRepository {
    public Compra calcularTotal(double precioUnitario, int cantidad) {
        Compra compra = new Compra();
        compra.setPrecioUnitario(precioUnitario);
        compra.setCantidad(cantidad);
        double descuento = 0.0;
        if (cantidad > 20) {
            descuento = 0.10;
        } else if (cantidad > 10) {
            descuento = 0.05;
        }
        double total = precioUnitario * cantidad * (1 - descuento);
        compra.setDescuento(descuento * 100);
        compra.setTotalPagar(total);
        return compra;
    }
}
