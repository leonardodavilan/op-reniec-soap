
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para RespDNI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespDNI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{http://tempuri.org/}Cabecera" minOccurs="0"/&gt;
 *         &lt;element name="Resultado" type="{http://tempuri.org/}Resultado" minOccurs="0"/&gt;
 *         &lt;element name="DatosReniec" type="{http://tempuri.org/}RespDNIDatos" minOccurs="0"/&gt;
 *         &lt;element name="DatosPensiones" type="{http://tempuri.org/}RespDNIDatos" minOccurs="0"/&gt;
 *         &lt;element name="DataReporte" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespDNI", propOrder = {
    "cabecera",
    "resultado",
    "datosReniec",
    "datosPensiones",
    "dataReporte"
})
public class RespDNI {

    @XmlElement(name = "Cabecera")
    protected Cabecera cabecera;
    @XmlElement(name = "Resultado")
    protected Resultado resultado;
    @XmlElement(name = "DatosReniec")
    protected RespDNIDatos datosReniec;
    @XmlElement(name = "DatosPensiones")
    protected RespDNIDatos datosPensiones;
    @XmlElement(name = "DataReporte")
    protected RespDNI.DataReporte dataReporte;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link Cabecera }
     *     
     */
    public Cabecera getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link Cabecera }
     *     
     */
    public void setCabecera(Cabecera value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setResultado(Resultado value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad datosReniec.
     * 
     * @return
     *     possible object is
     *     {@link RespDNIDatos }
     *     
     */
    public RespDNIDatos getDatosReniec() {
        return datosReniec;
    }

    /**
     * Define el valor de la propiedad datosReniec.
     * 
     * @param value
     *     allowed object is
     *     {@link RespDNIDatos }
     *     
     */
    public void setDatosReniec(RespDNIDatos value) {
        this.datosReniec = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPensiones.
     * 
     * @return
     *     possible object is
     *     {@link RespDNIDatos }
     *     
     */
    public RespDNIDatos getDatosPensiones() {
        return datosPensiones;
    }

    /**
     * Define el valor de la propiedad datosPensiones.
     * 
     * @param value
     *     allowed object is
     *     {@link RespDNIDatos }
     *     
     */
    public void setDatosPensiones(RespDNIDatos value) {
        this.datosPensiones = value;
    }

    /**
     * Obtiene el valor de la propiedad dataReporte.
     * 
     * @return
     *     possible object is
     *     {@link RespDNI.DataReporte }
     *     
     */
    public RespDNI.DataReporte getDataReporte() {
        return dataReporte;
    }

    /**
     * Define el valor de la propiedad dataReporte.
     * 
     * @param value
     *     allowed object is
     *     {@link RespDNI.DataReporte }
     *     
     */
    public void setDataReporte(RespDNI.DataReporte value) {
        this.dataReporte = value;
    }


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
     *         &lt;any processContents='lax' namespace='http://www.w3.org/2001/XMLSchema' maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;any processContents='lax' namespace='urn:schemas-microsoft-com:xml-diffgram-v1'/&gt;
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
        "any",
        "any2"
    })
    public static class DataReporte {

        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAnyElement(lax = true)
        protected Object any2;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Obtiene el valor de la propiedad any2.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny2() {
            return any2;
        }

        /**
         * Define el valor de la propiedad any2.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny2(Object value) {
            this.any2 = value;
        }

    }

}
