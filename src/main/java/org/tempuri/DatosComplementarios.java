
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosComplementarios complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosComplementarios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescEstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescGradoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescConstanciaVotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescRestriccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescPrefijoDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescPrefijoBlockChalet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescPrefijoDptoPisoInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescPrefijoUrbCondResid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionCompleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosComplementarios", propOrder = {
    "descEstadoCivil",
    "descGradoInstruccion",
    "descSexo",
    "descConstanciaVotacion",
    "descRestriccion",
    "descPrefijoDireccion",
    "descPrefijoBlockChalet",
    "descPrefijoDptoPisoInterior",
    "descPrefijoUrbCondResid",
    "direccionCompleta"
})
public class DatosComplementarios {

    @XmlElement(name = "DescEstadoCivil")
    protected String descEstadoCivil;
    @XmlElement(name = "DescGradoInstruccion")
    protected String descGradoInstruccion;
    @XmlElement(name = "DescSexo")
    protected String descSexo;
    @XmlElement(name = "DescConstanciaVotacion")
    protected String descConstanciaVotacion;
    @XmlElement(name = "DescRestriccion")
    protected String descRestriccion;
    @XmlElement(name = "DescPrefijoDireccion")
    protected String descPrefijoDireccion;
    @XmlElement(name = "DescPrefijoBlockChalet")
    protected String descPrefijoBlockChalet;
    @XmlElement(name = "DescPrefijoDptoPisoInterior")
    protected String descPrefijoDptoPisoInterior;
    @XmlElement(name = "DescPrefijoUrbCondResid")
    protected String descPrefijoUrbCondResid;
    @XmlElement(name = "DireccionCompleta")
    protected String direccionCompleta;

    /**
     * Obtiene el valor de la propiedad descEstadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstadoCivil() {
        return descEstadoCivil;
    }

    /**
     * Define el valor de la propiedad descEstadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstadoCivil(String value) {
        this.descEstadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad descGradoInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescGradoInstruccion() {
        return descGradoInstruccion;
    }

    /**
     * Define el valor de la propiedad descGradoInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescGradoInstruccion(String value) {
        this.descGradoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad descSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescSexo() {
        return descSexo;
    }

    /**
     * Define el valor de la propiedad descSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescSexo(String value) {
        this.descSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad descConstanciaVotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescConstanciaVotacion() {
        return descConstanciaVotacion;
    }

    /**
     * Define el valor de la propiedad descConstanciaVotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescConstanciaVotacion(String value) {
        this.descConstanciaVotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descRestriccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescRestriccion() {
        return descRestriccion;
    }

    /**
     * Define el valor de la propiedad descRestriccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescRestriccion(String value) {
        this.descRestriccion = value;
    }

    /**
     * Obtiene el valor de la propiedad descPrefijoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPrefijoDireccion() {
        return descPrefijoDireccion;
    }

    /**
     * Define el valor de la propiedad descPrefijoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPrefijoDireccion(String value) {
        this.descPrefijoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad descPrefijoBlockChalet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPrefijoBlockChalet() {
        return descPrefijoBlockChalet;
    }

    /**
     * Define el valor de la propiedad descPrefijoBlockChalet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPrefijoBlockChalet(String value) {
        this.descPrefijoBlockChalet = value;
    }

    /**
     * Obtiene el valor de la propiedad descPrefijoDptoPisoInterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPrefijoDptoPisoInterior() {
        return descPrefijoDptoPisoInterior;
    }

    /**
     * Define el valor de la propiedad descPrefijoDptoPisoInterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPrefijoDptoPisoInterior(String value) {
        this.descPrefijoDptoPisoInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad descPrefijoUrbCondResid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescPrefijoUrbCondResid() {
        return descPrefijoUrbCondResid;
    }

    /**
     * Define el valor de la propiedad descPrefijoUrbCondResid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescPrefijoUrbCondResid(String value) {
        this.descPrefijoUrbCondResid = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionCompleta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionCompleta() {
        return direccionCompleta;
    }

    /**
     * Define el valor de la propiedad direccionCompleta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionCompleta(String value) {
        this.direccionCompleta = value;
    }

}
