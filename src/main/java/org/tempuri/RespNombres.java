
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespNombres complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespNombres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Resultado" type="{http://tempuri.org/}Resultado" minOccurs="0"/&gt;
 *         &lt;element name="Cabecera" type="{http://tempuri.org/}Cabecera" minOccurs="0"/&gt;
 *         &lt;element name="SubCabecera" type="{http://tempuri.org/}RespNombresCabecera" minOccurs="0"/&gt;
 *         &lt;element name="Detalles" type="{http://tempuri.org/}ArrayOfRespNombresDetalle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespNombres", propOrder = {
    "resultado",
    "cabecera",
    "subCabecera",
    "detalles"
})
public class RespNombres {

    @XmlElement(name = "Resultado")
    protected Resultado resultado;
    @XmlElement(name = "Cabecera")
    protected Cabecera cabecera;
    @XmlElement(name = "SubCabecera")
    protected RespNombresCabecera subCabecera;
    @XmlElement(name = "Detalles")
    protected ArrayOfRespNombresDetalle detalles;

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
     * Obtiene el valor de la propiedad subCabecera.
     * 
     * @return
     *     possible object is
     *     {@link RespNombresCabecera }
     *     
     */
    public RespNombresCabecera getSubCabecera() {
        return subCabecera;
    }

    /**
     * Define el valor de la propiedad subCabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link RespNombresCabecera }
     *     
     */
    public void setSubCabecera(RespNombresCabecera value) {
        this.subCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad detalles.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRespNombresDetalle }
     *     
     */
    public ArrayOfRespNombresDetalle getDetalles() {
        return detalles;
    }

    /**
     * Define el valor de la propiedad detalles.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRespNombresDetalle }
     *     
     */
    public void setDetalles(ArrayOfRespNombresDetalle value) {
        this.detalles = value;
    }

}
