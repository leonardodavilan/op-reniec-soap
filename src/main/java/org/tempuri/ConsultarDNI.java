
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
 *         &lt;element name="DNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datosAuditoria" type="{http://tempuri.org/}DatosAuditoria" minOccurs="0"/&gt;
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
    "dni",
    "datosAuditoria"
})
@XmlRootElement(name = "ConsultarDNI")
public class ConsultarDNI {

    @XmlElement(name = "DNI")
    protected String dni;
    protected DatosAuditoria datosAuditoria;

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNI(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAuditoria.
     * 
     * @return
     *     possible object is
     *     {@link DatosAuditoria }
     *     
     */
    public DatosAuditoria getDatosAuditoria() {
        return datosAuditoria;
    }

    /**
     * Define el valor de la propiedad datosAuditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosAuditoria }
     *     
     */
    public void setDatosAuditoria(DatosAuditoria value) {
        this.datosAuditoria = value;
    }

}
