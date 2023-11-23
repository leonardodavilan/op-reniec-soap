
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
 *         &lt;element name="ConsultaXNombresResult" type="{http://tempuri.org/}RespNombres" minOccurs="0"/&gt;
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
    "consultaXNombresResult"
})
@XmlRootElement(name = "ConsultaXNombresResponse")
public class ConsultaXNombresResponse {

    @XmlElement(name = "ConsultaXNombresResult")
    protected RespNombres consultaXNombresResult;

    /**
     * Obtiene el valor de la propiedad consultaXNombresResult.
     * 
     * @return
     *     possible object is
     *     {@link RespNombres }
     *     
     */
    public RespNombres getConsultaXNombresResult() {
        return consultaXNombresResult;
    }

    /**
     * Define el valor de la propiedad consultaXNombresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link RespNombres }
     *     
     */
    public void setConsultaXNombresResult(RespNombres value) {
        this.consultaXNombresResult = value;
    }

}
