
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Resultado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Resultado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Estado" type="{http://tempuri.org/}EstadoEnum"/&gt;
 *         &lt;element name="MensajeInterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resultado", propOrder = {
    "estado",
    "mensajeInterno"
})
public class Resultado {

    @XmlElement(name = "Estado", required = true)
    @XmlSchemaType(name = "string")
    protected EstadoEnum estado;
    @XmlElement(name = "MensajeInterno")
    protected String mensajeInterno;

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoEnum }
     *     
     */
    public EstadoEnum getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoEnum }
     *     
     */
    public void setEstado(EstadoEnum value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeInterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeInterno() {
        return mensajeInterno;
    }

    /**
     * Define el valor de la propiedad mensajeInterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeInterno(String value) {
        this.mensajeInterno = value;
    }

}
