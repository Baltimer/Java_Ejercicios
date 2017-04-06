//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.06 a las 02:17:55 PM CEST 
//


package org.foobarspam.JAXBicipalma;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.foobarspam.JAXBicipalma package. 
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

    private final static QName _Estacion_QNAME = new QName("https://api.mobipalma.mobi/docs/", "estacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.foobarspam.JAXBicipalma
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Estacion }
     * 
     */
    public Estacion createEstacion() {
        return new Estacion();
    }

    /**
     * Create an instance of {@link Anclajes }
     * 
     */
    public Anclajes createAnclajes() {
        return new Anclajes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.mobipalma.mobi/docs/", name = "estacion")
    public JAXBElement<Estacion> createEstacion(Estacion value) {
        return new JAXBElement<Estacion>(_Estacion_QNAME, Estacion.class, null, value);
    }

}
