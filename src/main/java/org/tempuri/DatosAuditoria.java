
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosAuditoria complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosAuditoria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodEjecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreEjecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoInstitucionSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaracteresVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DNIEjecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdLog" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosAuditoria", propOrder = {
    "codAgencia",
    "nombreAgencia",
    "codEjecutivo",
    "nombreEjecutivo",
    "ip",
    "version",
    "codigoInstitucionSolicitante",
    "caracteresVerificacion",
    "dniEjecutivo",
    "idLog"
})
public class DatosAuditoria {

    @XmlElement(name = "CodAgencia")
    protected String codAgencia;
    @XmlElement(name = "NombreAgencia")
    protected String nombreAgencia;
    @XmlElement(name = "CodEjecutivo")
    protected String codEjecutivo;
    @XmlElement(name = "NombreEjecutivo")
    protected String nombreEjecutivo;
    @XmlElement(name = "IP")
    protected String ip;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "CodigoInstitucionSolicitante")
    protected String codigoInstitucionSolicitante;
    @XmlElement(name = "CaracteresVerificacion")
    protected String caracteresVerificacion;
    @XmlElement(name = "DNIEjecutivo")
    protected String dniEjecutivo;
    @XmlElement(name = "IdLog")
    protected int idLog;

    /**
     * Obtiene el valor de la propiedad codAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodAgencia() {
        return codAgencia;
    }

    /**
     * Define el valor de la propiedad codAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodAgencia(String value) {
        this.codAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAgencia() {
        return nombreAgencia;
    }

    /**
     * Define el valor de la propiedad nombreAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAgencia(String value) {
        this.nombreAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codEjecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEjecutivo() {
        return codEjecutivo;
    }

    /**
     * Define el valor de la propiedad codEjecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEjecutivo(String value) {
        this.codEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEjecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEjecutivo() {
        return nombreEjecutivo;
    }

    /**
     * Define el valor de la propiedad nombreEjecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEjecutivo(String value) {
        this.nombreEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIP() {
        return ip;
    }

    /**
     * Define el valor de la propiedad ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIP(String value) {
        this.ip = value;
    }

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
     * Obtiene el valor de la propiedad dniEjecutivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNIEjecutivo() {
        return dniEjecutivo;
    }

    /**
     * Define el valor de la propiedad dniEjecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNIEjecutivo(String value) {
        this.dniEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad idLog.
     * 
     */
    public int getIdLog() {
        return idLog;
    }

    /**
     * Define el valor de la propiedad idLog.
     * 
     */
    public void setIdLog(int value) {
        this.idLog = value;
    }

}
