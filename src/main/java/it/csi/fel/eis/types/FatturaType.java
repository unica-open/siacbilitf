/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.types;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FatturaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FatturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroFattura" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="DataEmissione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ImportoTotaleDocumento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IdFiscaleIvaFornitore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdFatturaBilancio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FatturaType", propOrder = {
    "numeroFattura",
    "dataEmissione",
    "importoTotaleDocumento",
    "idFiscaleIvaFornitore",
    "idFatturaBilancio"
})
public class FatturaType {

    @XmlElement(name = "NumeroFattura", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String numeroFattura;
    @XmlElement(name = "DataEmissione", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissione;
    @XmlElement(name = "ImportoTotaleDocumento", required = true)
    protected BigDecimal importoTotaleDocumento;
    @XmlElement(name = "IdFiscaleIvaFornitore", required = true)
    protected String idFiscaleIvaFornitore;
    @XmlElement(name = "IdFatturaBilancio", required = true)
    protected String idFatturaBilancio;

    /**
     * Gets the value of the numeroFattura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFattura() {
        return numeroFattura;
    }

    /**
     * Sets the value of the numeroFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFattura(String value) {
        this.numeroFattura = value;
    }

    /**
     * Gets the value of the dataEmissione property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Sets the value of the dataEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissione(XMLGregorianCalendar value) {
        this.dataEmissione = value;
    }

    /**
     * Gets the value of the importoTotaleDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    /**
     * Sets the value of the importoTotaleDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoTotaleDocumento(BigDecimal value) {
        this.importoTotaleDocumento = value;
    }

    /**
     * Gets the value of the idFiscaleIvaFornitore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscaleIvaFornitore() {
        return idFiscaleIvaFornitore;
    }

    /**
     * Sets the value of the idFiscaleIvaFornitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscaleIvaFornitore(String value) {
        this.idFiscaleIvaFornitore = value;
    }

    /**
     * Gets the value of the idFatturaBilancio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFatturaBilancio() {
        return idFatturaBilancio;
    }

    /**
     * Sets the value of the idFatturaBilancio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFatturaBilancio(String value) {
        this.idFatturaBilancio = value;
    }

}
