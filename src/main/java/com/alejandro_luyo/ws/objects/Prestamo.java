//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 03:28:22 PM COT 
//


package com.alejandro_luyo.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Prestamo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Prestamo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cuotas" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="montoCuota" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="interes" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="deudaTotal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prestamo", propOrder = {
    "monto",
    "cuotas",
    "montoCuota",
    "interes",
    "deudaTotal"
})
public class Prestamo {

    protected double monto;
    protected int cuotas;
    protected double montoCuota;
    protected double interes;
    protected double deudaTotal;

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(double value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotas.
     * 
     */
    public int getCuotas() {
        return cuotas;
    }

    /**
     * Define el valor de la propiedad cuotas.
     * 
     */
    public void setCuotas(int value) {
        this.cuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCuota.
     * 
     */
    public double getMontoCuota() {
        return montoCuota;
    }

    /**
     * Define el valor de la propiedad montoCuota.
     * 
     */
    public void setMontoCuota(double value) {
        this.montoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad interes.
     * 
     */
    public double getInteres() {
        return interes;
    }

    /**
     * Define el valor de la propiedad interes.
     * 
     */
    public void setInteres(double value) {
        this.interes = value;
    }

    /**
     * Obtiene el valor de la propiedad deudaTotal.
     * 
     */
    public double getDeudaTotal() {
        return deudaTotal;
    }

    /**
     * Define el valor de la propiedad deudaTotal.
     * 
     */
    public void setDeudaTotal(double value) {
        this.deudaTotal = value;
    }

}
