
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ConsultarDNIResult" type="{http://tempuri.org/}RespDNI" minOccurs="0"/&gt;
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
    "consultarDNIResult"
})
@XmlRootElement(name = "ConsultarDNIResponse")
public class ConsultarDNIResponse {

    @XmlElement(name = "ConsultarDNIResult")
    protected RespDNI consultarDNIResult;

    /**
     * Obtiene el valor de la propiedad consultarDNIResult.
     * 
     * @return
     *     possible object is
     *     {@link RespDNI }
     *     
     */
    public RespDNI getConsultarDNIResult() {
        return consultarDNIResult;
    }

    /**
     * Define el valor de la propiedad consultarDNIResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespDNI }
     *     
     */
    public void setConsultarDNIResult(RespDNI value) {
        this.consultarDNIResult = value;
    }

}
