//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.11 a las 07:48:32 PM CEST 
//


package org.foobarspam.cotxox_app.carrera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Carrera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Carrera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tarjetaCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tiempoEsperadoMinutos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tiempoCarrera" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="costeEsperado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="costeTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="propina" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="conductor" type="{https://api.mobipalma.mobi/docs/}Conductor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carrera", propOrder = {
    "tarjetaCredito",
    "origen",
    "destino",
    "distancia",
    "tiempoEsperadoMinutos",
    "tiempoCarrera",
    "costeEsperado",
    "costeTotal",
    "propina",
    "conductor"
})
public class Carrera {

    @XmlElement(required = true)
    protected String tarjetaCredito;
    @XmlElement(required = true)
    protected String origen;
    @XmlElement(required = true)
    protected String destino;
    protected double distancia;
    protected int tiempoEsperadoMinutos;
    protected int tiempoCarrera;
    protected double costeEsperado;
    protected double costeTotal;
    protected int propina;
    @XmlElement(required = true)
    protected Conductor conductor;

    /**
     * Obtiene el valor de la propiedad tarjetaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Define el valor de la propiedad tarjetaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaCredito(String value) {
        this.tarjetaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad distancia.
     * 
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Define el valor de la propiedad distancia.
     * 
     */
    public void setDistancia(double value) {
        this.distancia = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoEsperadoMinutos.
     * 
     */
    public int getTiempoEsperadoMinutos() {
        return tiempoEsperadoMinutos;
    }

    /**
     * Define el valor de la propiedad tiempoEsperadoMinutos.
     * 
     */
    public void setTiempoEsperadoMinutos(int value) {
        this.tiempoEsperadoMinutos = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoCarrera.
     * 
     */
    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    /**
     * Define el valor de la propiedad tiempoCarrera.
     * 
     */
    public void setTiempoCarrera(int value) {
        this.tiempoCarrera = value;
    }

    /**
     * Obtiene el valor de la propiedad costeEsperado.
     * 
     */
    public double getCosteEsperado() {
        return costeEsperado;
    }

    /**
     * Define el valor de la propiedad costeEsperado.
     * 
     */
    public void setCosteEsperado(double value) {
        this.costeEsperado = value;
    }

    /**
     * Obtiene el valor de la propiedad costeTotal.
     * 
     */
    public double getCosteTotal() {
        return costeTotal;
    }

    /**
     * Define el valor de la propiedad costeTotal.
     * 
     */
    public void setCosteTotal(double value) {
        this.costeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad propina.
     * 
     */
    public int getPropina() {
        return propina;
    }

    /**
     * Define el valor de la propiedad propina.
     * 
     */
    public void setPropina(int value) {
        this.propina = value;
    }

    /**
     * Obtiene el valor de la propiedad conductor.
     * 
     * @return
     *     possible object is
     *     {@link Conductor }
     *     
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * Define el valor de la propiedad conductor.
     * 
     * @param value
     *     allowed object is
     *     {@link Conductor }
     *     
     */
    public void setConductor(Conductor value) {
        this.conductor = value;
    }

}
