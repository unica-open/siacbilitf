/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for identificazioneGeneraleTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificazioneGeneraleTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroFattura" type="{http://www.tesoro.it/fatture}maxLenghtString20Type"/>
 *         &lt;element name="dataEmissione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="importoTotaleDocumento" type="{http://www.tesoro.it/fatture}importoType"/>
 *         &lt;element name="idFiscaleIvaFornitore" type="{http://www.tesoro.it/fatture}idFiscaleIvaTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificazioneGeneraleTipo", propOrder = {
    "numeroFattura",
    "dataEmissione",
    "importoTotaleDocumento",
    "idFiscaleIvaFornitore"
})
public class IdentificazioneGeneraleTipo {

    @XmlElement(required = true)
    protected String numeroFattura;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataEmissione;
    @XmlElement(required = true)
    protected BigDecimal importoTotaleDocumento;
    @XmlElement(required = true)
    protected String idFiscaleIvaFornitore;

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
     *     {@link String }
     *     
     */
    public Calendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Sets the value of the dataEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissione(Calendar value) {
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

}
