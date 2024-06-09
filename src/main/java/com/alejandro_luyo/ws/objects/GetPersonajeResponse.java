//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 07:29:38 PM COT 
//


package com.alejandro_luyo.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="personaje" type="{http://www.alejandro-luyo.com/ws/objects}personajews"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personaje"
})
@XmlRootElement(name = "getPersonajeResponse")
public class GetPersonajeResponse {

    @XmlElement(required = true)
    protected Personajews personaje;

    /**
     * Obtiene el valor de la propiedad personaje.
     * 
     * @return
     *     possible object is
     *     {@link Personajews }
     *     
     */
    public Personajews getPersonaje() {
        return personaje;
    }

    /**
     * Define el valor de la propiedad personaje.
     * 
     * @param value
     *     allowed object is
     *     {@link Personajews }
     *     
     */
    public void setPersonaje(Personajews value) {
        this.personaje = value;
    }

}
