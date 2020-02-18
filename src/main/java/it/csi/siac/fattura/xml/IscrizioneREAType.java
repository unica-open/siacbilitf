/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 12:24:13 PM CET 
//


package it.csi.siac.fattura.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IscrizioneREAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IscrizioneREAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ufficio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}ProvinciaType"/>
 *         &lt;element name="NumeroREA" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String20Type"/>
 *         &lt;element name="CapitaleSociale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType" minOccurs="0"/>
 *         &lt;element name="SocioUnico" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}SocioUnicoType" minOccurs="0"/>
 *         &lt;element name="StatoLiquidazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}StatoLiquidazioneType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IscrizioneREAType", propOrder = {
    "ufficio",
    "numeroREA",
    "capitaleSociale",
    "socioUnico",
    "statoLiquidazione"
})
public class IscrizioneREAType {

    @XmlElement(name = "Ufficio", required = true)
    protected String ufficio;
    @XmlElement(name = "NumeroREA", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String numeroREA;
    @XmlElement(name = "CapitaleSociale")
    protected BigDecimal capitaleSociale;
    @XmlElement(name = "SocioUnico")
    protected SocioUnicoType socioUnico;
    @XmlElement(name = "StatoLiquidazione", required = true)
    protected StatoLiquidazioneType statoLiquidazione;

    /**
     * Gets the value of the ufficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUfficio() {
        return ufficio;
    }

    /**
     * Sets the value of the ufficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUfficio(String value) {
        this.ufficio = value;
    }

    /**
     * Gets the value of the numeroREA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroREA() {
        return numeroREA;
    }

    /**
     * Sets the value of the numeroREA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroREA(String value) {
        this.numeroREA = value;
    }

    /**
     * Gets the value of the capitaleSociale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitaleSociale() {
        return capitaleSociale;
    }

    /**
     * Sets the value of the capitaleSociale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitaleSociale(BigDecimal value) {
        this.capitaleSociale = value;
    }

    /**
     * Gets the value of the socioUnico property.
     * 
     * @return
     *     possible object is
     *     {@link SocioUnicoType }
     *     
     */
    public SocioUnicoType getSocioUnico() {
        return socioUnico;
    }

    /**
     * Sets the value of the socioUnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioUnicoType }
     *     
     */
    public void setSocioUnico(SocioUnicoType value) {
        this.socioUnico = value;
    }

    /**
     * Gets the value of the statoLiquidazione property.
     * 
     * @return
     *     possible object is
     *     {@link StatoLiquidazioneType }
     *     
     */
    public StatoLiquidazioneType getStatoLiquidazione() {
        return statoLiquidazione;
    }

    /**
     * Sets the value of the statoLiquidazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoLiquidazioneType }
     *     
     */
    public void setStatoLiquidazione(StatoLiquidazioneType value) {
        this.statoLiquidazione = value;
    }

}
