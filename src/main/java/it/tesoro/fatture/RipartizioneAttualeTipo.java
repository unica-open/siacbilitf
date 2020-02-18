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
 * <p>Java class for ripartizioneAttualeTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ripartizioneAttualeTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importoLiquidato" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="importoNonLiquidato" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="importoSospeso" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="importoPagato" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="dataCertificazione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="importoCertificato" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ripartizioneAttualeTipo", propOrder = {
    "importoLiquidato",
    "importoNonLiquidato",
    "importoSospeso",
    "importoPagato",
    "dataCertificazione",
    "importoCertificato"
})
public class RipartizioneAttualeTipo {

    protected BigDecimal importoLiquidato;
    protected BigDecimal importoNonLiquidato;
    protected BigDecimal importoSospeso;
    protected BigDecimal importoPagato;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataCertificazione;
    protected BigDecimal importoCertificato;

    /**
     * Gets the value of the importoLiquidato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoLiquidato() {
        return importoLiquidato;
    }

    /**
     * Sets the value of the importoLiquidato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoLiquidato(BigDecimal value) {
        this.importoLiquidato = value;
    }

    /**
     * Gets the value of the importoNonLiquidato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoNonLiquidato() {
        return importoNonLiquidato;
    }

    /**
     * Sets the value of the importoNonLiquidato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoNonLiquidato(BigDecimal value) {
        this.importoNonLiquidato = value;
    }

    /**
     * Gets the value of the importoSospeso property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoSospeso() {
        return importoSospeso;
    }

    /**
     * Sets the value of the importoSospeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoSospeso(BigDecimal value) {
        this.importoSospeso = value;
    }

    /**
     * Gets the value of the importoPagato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoPagato() {
        return importoPagato;
    }

    /**
     * Sets the value of the importoPagato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoPagato(BigDecimal value) {
        this.importoPagato = value;
    }

    /**
     * Gets the value of the dataCertificazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataCertificazione() {
        return dataCertificazione;
    }

    /**
     * Sets the value of the dataCertificazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCertificazione(Calendar value) {
        this.dataCertificazione = value;
    }

    /**
     * Gets the value of the importoCertificato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoCertificato() {
        return importoCertificato;
    }

    /**
     * Sets the value of the importoCertificato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoCertificato(BigDecimal value) {
        this.importoCertificato = value;
    }

}
