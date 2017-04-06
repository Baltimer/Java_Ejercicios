//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.06 a las 02:17:55 PM CEST 
//


package org.foobarspam.JAXBicipalma;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Estacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Estacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numeroAnclajes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="anclajes" type="{https://api.mobipalma.mobi/docs/}Anclajes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estacion", propOrder = {
    "id",
    "direccion",
    "numeroAnclajes",
    "anclajes"
})
public class Estacion {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String direccion;
    protected int numeroAnclajes;
    @XmlElement(required = true)
    protected Anclajes anclajes;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroAnclajes.
     * 
     */
    public int getNumeroAnclajes() {
        return numeroAnclajes;
    }

    /**
     * Define el valor de la propiedad numeroAnclajes.
     * 
     */
    public void setNumeroAnclajes(int value) {
        this.numeroAnclajes = value;
    }

    /**
     * Obtiene el valor de la propiedad anclajes.
     * 
     * @return
     *     possible object is
     *     {@link Anclajes }
     *     
     */
    public Anclajes getAnclajes() {
        return anclajes;
    }

    /**
     * Define el valor de la propiedad anclajes.
     * 
     * @param value
     *     allowed object is
     *     {@link Anclajes }
     *     
     */
    public void setAnclajes(Anclajes value) {
        this.anclajes = value;
    }

}
