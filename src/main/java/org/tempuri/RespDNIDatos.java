
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespDNIDatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespDNIDatos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosComplementarios" type="{http://tempuri.org/}DatosComplementarios" minOccurs="0"/&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDNI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DigitoVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidoCasada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUbigeoDepartamentoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUbigeoProvinciaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUbigeoDistritoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartamentoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistritoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoGradoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentoSustentatorioTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocumentoSustentatorioNumeroDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUbigeoDepartamentoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUbigeoProvinciaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoUbigeoDistritoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartamentoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistritoNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreMadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaExpedicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConstanciaVotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restriccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefijoDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockChalet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Interior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Urbanizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Etapa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Manzana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Lote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefijoBlockChalet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefijoDptoPisoInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrefijoUrbCondResid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reservado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Foto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Firma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespDNIDatos", propOrder = {
    "datosComplementarios",
    "codigoError",
    "numeroDNI",
    "digitoVerificacion",
    "apellidoPaterno",
    "apellidoMaterno",
    "apellidoCasada",
    "nombres",
    "codigoUbigeoDepartamentoDomicilio",
    "codigoUbigeoProvinciaDomicilio",
    "codigoUbigeoDistritoDomicilio",
    "departamentoDomicilio",
    "provinciaDomicilio",
    "distritoDomicilio",
    "estadoCivil",
    "codigoGradoInstruccion",
    "estatura",
    "sexo",
    "documentoSustentatorioTipoDoc",
    "documentoSustentatorioNumeroDoc",
    "codigoUbigeoDepartamentoNacimiento",
    "codigoUbigeoProvinciaNacimiento",
    "codigoUbigeoDistritoNacimiento",
    "departamentoNacimiento",
    "provinciaNacimiento",
    "distritoNacimiento",
    "fechaNacimiento",
    "nombrePadre",
    "nombreMadre",
    "fechaInscripcion",
    "fechaExpedicion",
    "constanciaVotacion",
    "restriccion",
    "prefijoDireccion",
    "direccion",
    "numeroDireccion",
    "blockChalet",
    "interior",
    "urbanizacion",
    "etapa",
    "manzana",
    "lote",
    "prefijoBlockChalet",
    "prefijoDptoPisoInterior",
    "prefijoUrbCondResid",
    "reservado",
    "foto",
    "firma"
})
public class RespDNIDatos {

    @XmlElement(name = "DatosComplementarios")
    protected DatosComplementarios datosComplementarios;
    @XmlElement(name = "CodigoError")
    protected String codigoError;
    @XmlElement(name = "NumeroDNI")
    protected String numeroDNI;
    @XmlElement(name = "DigitoVerificacion")
    protected String digitoVerificacion;
    @XmlElement(name = "ApellidoPaterno")
    protected String apellidoPaterno;
    @XmlElement(name = "ApellidoMaterno")
    protected String apellidoMaterno;
    @XmlElement(name = "ApellidoCasada")
    protected String apellidoCasada;
    @XmlElement(name = "Nombres")
    protected String nombres;
    @XmlElement(name = "CodigoUbigeoDepartamentoDomicilio")
    protected String codigoUbigeoDepartamentoDomicilio;
    @XmlElement(name = "CodigoUbigeoProvinciaDomicilio")
    protected String codigoUbigeoProvinciaDomicilio;
    @XmlElement(name = "CodigoUbigeoDistritoDomicilio")
    protected String codigoUbigeoDistritoDomicilio;
    @XmlElement(name = "DepartamentoDomicilio")
    protected String departamentoDomicilio;
    @XmlElement(name = "ProvinciaDomicilio")
    protected String provinciaDomicilio;
    @XmlElement(name = "DistritoDomicilio")
    protected String distritoDomicilio;
    @XmlElement(name = "EstadoCivil")
    protected String estadoCivil;
    @XmlElement(name = "CodigoGradoInstruccion")
    protected String codigoGradoInstruccion;
    @XmlElement(name = "Estatura")
    protected String estatura;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "DocumentoSustentatorioTipoDoc")
    protected String documentoSustentatorioTipoDoc;
    @XmlElement(name = "DocumentoSustentatorioNumeroDoc")
    protected String documentoSustentatorioNumeroDoc;
    @XmlElement(name = "CodigoUbigeoDepartamentoNacimiento")
    protected String codigoUbigeoDepartamentoNacimiento;
    @XmlElement(name = "CodigoUbigeoProvinciaNacimiento")
    protected String codigoUbigeoProvinciaNacimiento;
    @XmlElement(name = "CodigoUbigeoDistritoNacimiento")
    protected String codigoUbigeoDistritoNacimiento;
    @XmlElement(name = "DepartamentoNacimiento")
    protected String departamentoNacimiento;
    @XmlElement(name = "ProvinciaNacimiento")
    protected String provinciaNacimiento;
    @XmlElement(name = "DistritoNacimiento")
    protected String distritoNacimiento;
    @XmlElement(name = "FechaNacimiento")
    protected String fechaNacimiento;
    @XmlElement(name = "NombrePadre")
    protected String nombrePadre;
    @XmlElement(name = "NombreMadre")
    protected String nombreMadre;
    @XmlElement(name = "FechaInscripcion")
    protected String fechaInscripcion;
    @XmlElement(name = "FechaExpedicion")
    protected String fechaExpedicion;
    @XmlElement(name = "ConstanciaVotacion")
    protected String constanciaVotacion;
    @XmlElement(name = "Restriccion")
    protected String restriccion;
    @XmlElement(name = "PrefijoDireccion")
    protected String prefijoDireccion;
    @XmlElement(name = "Direccion")
    protected String direccion;
    @XmlElement(name = "NumeroDireccion")
    protected String numeroDireccion;
    @XmlElement(name = "BlockChalet")
    protected String blockChalet;
    @XmlElement(name = "Interior")
    protected String interior;
    @XmlElement(name = "Urbanizacion")
    protected String urbanizacion;
    @XmlElement(name = "Etapa")
    protected String etapa;
    @XmlElement(name = "Manzana")
    protected String manzana;
    @XmlElement(name = "Lote")
    protected String lote;
    @XmlElement(name = "PrefijoBlockChalet")
    protected String prefijoBlockChalet;
    @XmlElement(name = "PrefijoDptoPisoInterior")
    protected String prefijoDptoPisoInterior;
    @XmlElement(name = "PrefijoUrbCondResid")
    protected String prefijoUrbCondResid;
    @XmlElement(name = "Reservado")
    protected String reservado;
    @XmlElement(name = "Foto")
    protected String foto;
    @XmlElement(name = "Firma")
    protected String firma;

    /**
     * Obtiene el valor de la propiedad datosComplementarios.
     * 
     * @return
     *     possible object is
     *     {@link DatosComplementarios }
     *     
     */
    public DatosComplementarios getDatosComplementarios() {
        return datosComplementarios;
    }

    /**
     * Define el valor de la propiedad datosComplementarios.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosComplementarios }
     *     
     */
    public void setDatosComplementarios(DatosComplementarios value) {
        this.datosComplementarios = value;
    }

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
     * Obtiene el valor de la propiedad digitoVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitoVerificacion() {
        return digitoVerificacion;
    }

    /**
     * Define el valor de la propiedad digitoVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitoVerificacion(String value) {
        this.digitoVerificacion = value;
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
     * Obtiene el valor de la propiedad apellidoCasada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoCasada() {
        return apellidoCasada;
    }

    /**
     * Define el valor de la propiedad apellidoCasada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoCasada(String value) {
        this.apellidoCasada = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoDepartamentoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoDepartamentoDomicilio() {
        return codigoUbigeoDepartamentoDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoDepartamentoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoDepartamentoDomicilio(String value) {
        this.codigoUbigeoDepartamentoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoProvinciaDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoProvinciaDomicilio() {
        return codigoUbigeoProvinciaDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoProvinciaDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoProvinciaDomicilio(String value) {
        this.codigoUbigeoProvinciaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoDistritoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoDistritoDomicilio() {
        return codigoUbigeoDistritoDomicilio;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoDistritoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoDistritoDomicilio(String value) {
        this.codigoUbigeoDistritoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoDomicilio() {
        return departamentoDomicilio;
    }

    /**
     * Define el valor de la propiedad departamentoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoDomicilio(String value) {
        this.departamentoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaDomicilio() {
        return provinciaDomicilio;
    }

    /**
     * Define el valor de la propiedad provinciaDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaDomicilio(String value) {
        this.provinciaDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistritoDomicilio() {
        return distritoDomicilio;
    }

    /**
     * Define el valor de la propiedad distritoDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistritoDomicilio(String value) {
        this.distritoDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoGradoInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoGradoInstruccion() {
        return codigoGradoInstruccion;
    }

    /**
     * Define el valor de la propiedad codigoGradoInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoGradoInstruccion(String value) {
        this.codigoGradoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad estatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstatura() {
        return estatura;
    }

    /**
     * Define el valor de la propiedad estatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstatura(String value) {
        this.estatura = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoSustentatorioTipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoSustentatorioTipoDoc() {
        return documentoSustentatorioTipoDoc;
    }

    /**
     * Define el valor de la propiedad documentoSustentatorioTipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoSustentatorioTipoDoc(String value) {
        this.documentoSustentatorioTipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoSustentatorioNumeroDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoSustentatorioNumeroDoc() {
        return documentoSustentatorioNumeroDoc;
    }

    /**
     * Define el valor de la propiedad documentoSustentatorioNumeroDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoSustentatorioNumeroDoc(String value) {
        this.documentoSustentatorioNumeroDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoDepartamentoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoDepartamentoNacimiento() {
        return codigoUbigeoDepartamentoNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoDepartamentoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoDepartamentoNacimiento(String value) {
        this.codigoUbigeoDepartamentoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoProvinciaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoProvinciaNacimiento() {
        return codigoUbigeoProvinciaNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoProvinciaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoProvinciaNacimiento(String value) {
        this.codigoUbigeoProvinciaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoUbigeoDistritoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUbigeoDistritoNacimiento() {
        return codigoUbigeoDistritoNacimiento;
    }

    /**
     * Define el valor de la propiedad codigoUbigeoDistritoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUbigeoDistritoNacimiento(String value) {
        this.codigoUbigeoDistritoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad departamentoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamentoNacimiento() {
        return departamentoNacimiento;
    }

    /**
     * Define el valor de la propiedad departamentoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamentoNacimiento(String value) {
        this.departamentoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    /**
     * Define el valor de la propiedad provinciaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinciaNacimiento(String value) {
        this.provinciaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad distritoNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistritoNacimiento() {
        return distritoNacimiento;
    }

    /**
     * Define el valor de la propiedad distritoNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistritoNacimiento(String value) {
        this.distritoNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * Define el valor de la propiedad nombrePadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePadre(String value) {
        this.nombrePadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * Define el valor de la propiedad nombreMadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMadre(String value) {
        this.nombreMadre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInscripcion(String value) {
        this.fechaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicion(String value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad constanciaVotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstanciaVotacion() {
        return constanciaVotacion;
    }

    /**
     * Define el valor de la propiedad constanciaVotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstanciaVotacion(String value) {
        this.constanciaVotacion = value;
    }

    /**
     * Obtiene el valor de la propiedad restriccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriccion() {
        return restriccion;
    }

    /**
     * Define el valor de la propiedad restriccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriccion(String value) {
        this.restriccion = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoDireccion() {
        return prefijoDireccion;
    }

    /**
     * Define el valor de la propiedad prefijoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoDireccion(String value) {
        this.prefijoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDireccion() {
        return numeroDireccion;
    }

    /**
     * Define el valor de la propiedad numeroDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDireccion(String value) {
        this.numeroDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad blockChalet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockChalet() {
        return blockChalet;
    }

    /**
     * Define el valor de la propiedad blockChalet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockChalet(String value) {
        this.blockChalet = value;
    }

    /**
     * Obtiene el valor de la propiedad interior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterior() {
        return interior;
    }

    /**
     * Define el valor de la propiedad interior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterior(String value) {
        this.interior = value;
    }

    /**
     * Obtiene el valor de la propiedad urbanizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrbanizacion() {
        return urbanizacion;
    }

    /**
     * Define el valor de la propiedad urbanizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrbanizacion(String value) {
        this.urbanizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad etapa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     * Define el valor de la propiedad etapa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtapa(String value) {
        this.etapa = value;
    }

    /**
     * Obtiene el valor de la propiedad manzana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManzana() {
        return manzana;
    }

    /**
     * Define el valor de la propiedad manzana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManzana(String value) {
        this.manzana = value;
    }

    /**
     * Obtiene el valor de la propiedad lote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLote() {
        return lote;
    }

    /**
     * Define el valor de la propiedad lote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLote(String value) {
        this.lote = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoBlockChalet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoBlockChalet() {
        return prefijoBlockChalet;
    }

    /**
     * Define el valor de la propiedad prefijoBlockChalet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoBlockChalet(String value) {
        this.prefijoBlockChalet = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoDptoPisoInterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoDptoPisoInterior() {
        return prefijoDptoPisoInterior;
    }

    /**
     * Define el valor de la propiedad prefijoDptoPisoInterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoDptoPisoInterior(String value) {
        this.prefijoDptoPisoInterior = value;
    }

    /**
     * Obtiene el valor de la propiedad prefijoUrbCondResid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefijoUrbCondResid() {
        return prefijoUrbCondResid;
    }

    /**
     * Define el valor de la propiedad prefijoUrbCondResid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefijoUrbCondResid(String value) {
        this.prefijoUrbCondResid = value;
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

    /**
     * Obtiene el valor de la propiedad foto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Define el valor de la propiedad foto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoto(String value) {
        this.foto = value;
    }

    /**
     * Obtiene el valor de la propiedad firma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirma() {
        return firma;
    }

    /**
     * Define el valor de la propiedad firma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirma(String value) {
        this.firma = value;
    }

}
