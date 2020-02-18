/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRichiestaDatiFatturaProxyTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaDatiFatturaProxyTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="identificazionePCC" type="{http://www.tesoro.it/fatture}maxLenghtString20Type" minOccurs="0"/>
 *           &lt;element name="identificazioneSDI" type="{http://www.tesoro.it/fatture}identificazioneSDITipo" minOccurs="0"/>
 *           &lt;element name="identificazioneGenerale" type="{http://www.tesoro.it/fatture}identificazioneGeneraleTipo" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaDatiFatturaProxyTipo", propOrder = {
    "identificazionePCC",
    "identificazioneSDI",
    "identificazioneGenerale"
})
public class DatiRichiestaDatiFatturaProxyTipo {

    protected String identificazionePCC;
    protected IdentificazioneSDITipo identificazioneSDI;
    protected IdentificazioneGeneraleTipo identificazioneGenerale;

    /**
     * Gets the value of the identificazionePCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificazionePCC() {
        return identificazionePCC;
    }

    /**
     * Sets the value of the identificazionePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificazionePCC(String value) {
        this.identificazionePCC = value;
    }

    /**
     * Gets the value of the identificazioneSDI property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificazioneSDITipo }
     *     
     */
    public IdentificazioneSDITipo getIdentificazioneSDI() {
        return identificazioneSDI;
    }

    /**
     * Sets the value of the identificazioneSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificazioneSDITipo }
     *     
     */
    public void setIdentificazioneSDI(IdentificazioneSDITipo value) {
        this.identificazioneSDI = value;
    }

    /**
     * Gets the value of the identificazioneGenerale property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificazioneGeneraleTipo }
     *     
     */
    public IdentificazioneGeneraleTipo getIdentificazioneGenerale() {
        return identificazioneGenerale;
    }

    /**
     * Sets the value of the identificazioneGenerale property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificazioneGeneraleTipo }
     *     
     */
    public void setIdentificazioneGenerale(IdentificazioneGeneraleTipo value) {
        this.identificazioneGenerale = value;
    }

}
