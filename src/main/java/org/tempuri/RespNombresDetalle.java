
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespNombresDetalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespNombresDetalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroDNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaracterVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoFichaRegistral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prenombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Datos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RespNombresDetalle", propOrder = {
    "numeroDNI",
    "caracterVerificacion",
    "tipoFichaRegistral",
    "apellidoPaterno",
    "apellidoMaterno",
    "prenombres",
    "datos",
    "imagen",
    "reservado"
})
public class RespNombresDetalle {

    @XmlElement(name = "NumeroDNI")
    protected String numeroDNI;
    @XmlElement(name = "CaracterVerificacion")
    protected String caracterVerificacion;
    @XmlElement(name = "TipoFichaRegistral")
    protected String tipoFichaRegistral;
    @XmlElement(name = "ApellidoPaterno")
    protected String apellidoPaterno;
    @XmlElement(name = "ApellidoMaterno")
    protected String apellidoMaterno;
    @XmlElement(name = "Prenombres")
    protected String prenombres;
    @XmlElement(name = "Datos")
    protected String datos;
    @XmlElement(name = "Imagen")
    protected String imagen;
    @XmlElement(name = "Reservado")
    protected String reservado;

    /**
     * Obtiene el valor de la propiedad numeroDNI.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDNI() {
        return numeroDNI;
    }

    /**
     * Define el valor de la propiedad numeroDNI.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDNI(String value) {
        this.numeroDNI = value;
    }

    /**
     * Obtiene el valor de la propiedad caracterVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracterVerificacion() {
        return caracterVerificacion;
    }

    /**
     * Define el valor de la propiedad caracterVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracterVerificacion(String value) {
        this.caracterVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFichaRegistral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFichaRegistral() {
        return tipoFichaRegistral;
    }

    /**
     * Define el valor de la propiedad tipoFichaRegistral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFichaRegistral(String value) {
        this.tipoFichaRegistral = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Define el valor de la propiedad apellidoPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidoMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Define el valor de la propiedad apellidoMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad prenombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenombres() {
        return prenombres;
    }

    /**
     * Define el valor de la propiedad prenombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenombres(String value) {
        this.prenombres = value;
    }

    /**
     * Obtiene el valor de la propiedad datos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatos() {
        return datos;
    }

    /**
     * Define el valor de la propiedad datos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatos(String value) {
        this.datos = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
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
