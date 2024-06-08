//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 03:28:22 PM COT 
//


package com.alejandro_luyo.ws.objects;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.alejandro_luyo.ws.objects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.alejandro_luyo.ws.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrestamoRequest }
     * 
     */
    public PrestamoRequest createPrestamoRequest() {
        return new PrestamoRequest();
    }

    /**
     * Create an instance of {@link PrestamoResponse }
     * 
     */
    public PrestamoResponse createPrestamoResponse() {
        return new PrestamoResponse();
    }

    /**
     * Create an instance of {@link Prestamo }
     * 
     */
    public Prestamo createPrestamo() {
        return new Prestamo();
    }

}
