//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 07:29:38 PM COT 
//


package com.alejandro_luyo.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Resultado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Resultado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cubo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cuarta" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resultado", propOrder = {
    "numero",
    "cubo",
    "cuarta"
})
public class Resultado {

    protected int numero;
    protected double cubo;
    protected double cuarta;

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtiene el valor de la propiedad cubo.
     * 
     */
    public double getCubo() {
        return cubo;
    }

    /**
     * Define el valor de la propiedad cubo.
     * 
     */
    public void setCubo(double value) {
        this.cubo = value;
    }

    /**
     * Obtiene el valor de la propiedad cuarta.
     * 
     */
    public double getCuarta() {
        return cuarta;
    }

    /**
     * Define el valor de la propiedad cuarta.
     * 
     */
    public void setCuarta(double value) {
        this.cuarta = value;
    }

}
