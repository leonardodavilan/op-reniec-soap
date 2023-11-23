
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespNombresCabecera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespNombresCabecera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTotalCoincidencias" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Reservado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespNombresCabecera", propOrder = {
    "codigoError",
    "numeroTotalCoincidencias",
    "reservado"
})
public class RespNombresCabecera {

    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "NumeroTotalCoincidencias")
    protected int numeroTotalCoincidencias;
    @XmlElement(name = "Reservado")
    protected String reservado;

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTotalCoincidencias.
     * 
     */
    public int getNumeroTotalCoincidencias() {
        return numeroTotalCoincidencias;
    }

    /**
     * Define el valor de la propiedad numeroTotalCoincidencias.
     * 
     */
    public void setNumeroTotalCoincidencias(int value) {
        this.numeroTotalCoincidencias = value;
    }

    /**
     * Obtiene el valor de la propiedad reservado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservado() {
        return reservado;
    }

    /**
     * Define el valor de la propiedad reservado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservado(String value) {
        this.reservado = value;
    }

}
