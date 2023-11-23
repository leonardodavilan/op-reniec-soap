
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cabecera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cabecera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongitudCabecera" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongitudTotalTrama" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Fragmentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TTL" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaracteresVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoInstitucionSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoServidorRENIEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgenciaInstitucionSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioFinalInstitucionSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HostFinalInstitucionSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Cabecera", propOrder = {
    "version",
    "longitudCabecera",
    "tipoServicio",
    "longitudTotalTrama",
    "fragmentacion",
    "ttl",
    "tipoConsulta",
    "caracteresVerificacion",
    "codigoInstitucionSolicitante",
    "codigoServidorRENIEC",
    "agenciaInstitucionSolicitante",
    "usuarioFinalInstitucionSolicitante",
    "hostFinalInstitucionSolicitante",
    "reservado"
})
public class Cabecera {

    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "LongitudCabecera")
    protected int longitudCabecera;
    @XmlElement(name = "TipoServicio")
    protected String tipoServicio;
    @XmlElement(name = "LongitudTotalTrama")
    protected int longitudTotalTrama;
    @XmlElement(name = "Fragmentacion")
    protected String fragmentacion;
    @XmlElement(name = "TTL")
    protected int ttl;
    @XmlElement(name = "TipoConsulta")
    protected String tipoConsulta;
    @XmlElement(name = "CaracteresVerificacion")
    protected String caracteresVerificacion;
    @XmlElement(name = "CodigoInstitucionSolicitante")
    protected String codigoInstitucionSolicitante;
    @XmlElement(name = "CodigoServidorRENIEC")
    protected String codigoServidorRENIEC;
    @XmlElement(name = "AgenciaInstitucionSolicitante")
    protected String agenciaInstitucionSolicitante;
    @XmlElement(name = "UsuarioFinalInstitucionSolicitante")
    protected String usuarioFinalInstitucionSolicitante;
    @XmlElement(name = "HostFinalInstitucionSolicitante")
    protected String hostFinalInstitucionSolicitante;
    @XmlElement(name = "Reservado")
    protected String reservado;

    /**
     * Obtiene el valor de la propiedad version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Define el valor de la propiedad version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudCabecera.
     * 
     */
    public int getLongitudCabecera() {
        return longitudCabecera;
    }

    /**
     * Define el valor de la propiedad longitudCabecera.
     * 
     */
    public void setLongitudCabecera(int value) {
        this.longitudCabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Define el valor de la propiedad tipoServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoServicio(String value) {
        this.tipoServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad longitudTotalTrama.
     * 
     */
    public int getLongitudTotalTrama() {
        return longitudTotalTrama;
    }

    /**
     * Define el valor de la propiedad longitudTotalTrama.
     * 
     */
    public void setLongitudTotalTrama(int value) {
        this.longitudTotalTrama = value;
    }

    /**
     * Obtiene el valor de la propiedad fragmentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFragmentacion() {
        return fragmentacion;
    }

    /**
     * Define el valor de la propiedad fragmentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFragmentacion(String value) {
        this.fragmentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ttl.
     * 
     */
    public int getTTL() {
        return ttl;
    }

    /**
     * Define el valor de la propiedad ttl.
     * 
     */
    public void setTTL(int value) {
        this.ttl = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Define el valor de la propiedad tipoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad caracteresVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracteresVerificacion() {
        return caracteresVerificacion;
    }

    /**
     * Define el valor de la propiedad caracteresVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracteresVerificacion(String value) {
        this.caracteresVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInstitucionSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoInstitucionSolicitante() {
        return codigoInstitucionSolicitante;
    }

    /**
     * Define el valor de la propiedad codigoInstitucionSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoInstitucionSolicitante(String value) {
        this.codigoInstitucionSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoServidorRENIEC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoServidorRENIEC() {
        return codigoServidorRENIEC;
    }

    /**
     * Define el valor de la propiedad codigoServidorRENIEC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoServidorRENIEC(String value) {
        this.codigoServidorRENIEC = value;
    }

    /**
     * Obtiene el valor de la propiedad agenciaInstitucionSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgenciaInstitucionSolicitante() {
        return agenciaInstitucionSolicitante;
    }

    /**
     * Define el valor de la propiedad agenciaInstitucionSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgenciaInstitucionSolicitante(String value) {
        this.agenciaInstitucionSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioFinalInstitucionSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioFinalInstitucionSolicitante() {
        return usuarioFinalInstitucionSolicitante;
    }

    /**
     * Define el valor de la propiedad usuarioFinalInstitucionSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioFinalInstitucionSolicitante(String value) {
        this.usuarioFinalInstitucionSolicitante = value;
    }

    /**
     * Obtiene el valor de la propiedad hostFinalInstitucionSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostFinalInstitucionSolicitante() {
        return hostFinalInstitucionSolicitante;
    }

    /**
     * Define el valor de la propiedad hostFinalInstitucionSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostFinalInstitucionSolicitante(String value) {
        this.hostFinalInstitucionSolicitante = value;
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
