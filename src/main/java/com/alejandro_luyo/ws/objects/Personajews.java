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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para personajews complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="personajews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpersonaje" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nompersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apepersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fecnacpersonaje" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personajews", propOrder = {
    "idpersonaje",
    "nompersonaje",
    "apepersonaje",
    "fecnacpersonaje"
})
public class Personajews {

    protected int idpersonaje;
    @XmlElement(required = true)
    protected String nompersonaje;
    @XmlElement(required = true)
    protected String apepersonaje;
    @XmlElement(required = true)
    protected String fecnacpersonaje;

    /**
     * Obtiene el valor de la propiedad idpersonaje.
     * 
     */
    public int getIdpersonaje() {
        return idpersonaje;
    }

    /**
     * Define el valor de la propiedad idpersonaje.
     * 
     */
    public void setIdpersonaje(int value) {
        this.idpersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad nompersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNompersonaje() {
        return nompersonaje;
    }

    /**
     * Define el valor de la propiedad nompersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNompersonaje(String value) {
        this.nompersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad apepersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApepersonaje() {
        return apepersonaje;
    }

    /**
     * Define el valor de la propiedad apepersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApepersonaje(String value) {
        this.apepersonaje = value;
    }

    /**
     * Obtiene el valor de la propiedad fecnacpersonaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecnacpersonaje() {
        return fecnacpersonaje;
    }

    /**
     * Define el valor de la propiedad fecnacpersonaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecnacpersonaje(String value) {
        this.fecnacpersonaje = value;
    }

}
