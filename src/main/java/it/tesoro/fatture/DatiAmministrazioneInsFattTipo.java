/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiAmministrazioneInsFattTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiAmministrazioneInsFattTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.tesoro.it/fatture}codiceFiscaleGiuridicoTipo"/>
 *         &lt;element name="denominazione" type="{http://www.tesoro.it/fatture}maxLenghtString150Type"/>
 *         &lt;element name="codiceUfficioPCC" type="{http://www.tesoro.it/fatture}maxLenghtString6Type" minOccurs="0"/>
 *         &lt;element name="codiceUnivocoUfficioIPA" type="{http://www.tesoro.it/fatture}maxLenghtString6Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiAmministrazioneInsFattTipo", propOrder = {
    "codiceFiscale",
    "denominazione",
    "codiceUfficioPCC",
    "codiceUnivocoUfficioIPA"
})
public class DatiAmministrazioneInsFattTipo {

    @XmlElement(required = true)
    protected String codiceFiscale;
    @XmlElement(required = true)
    protected String denominazione;
    protected String codiceUfficioPCC;
    protected String codiceUnivocoUfficioIPA;

    /**
     * Gets the value of the codiceFiscale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Sets the value of the codiceFiscale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscale(String value) {
        this.codiceFiscale = value;
    }

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the codiceUfficioPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUfficioPCC() {
        return codiceUfficioPCC;
    }

    /**
     * Sets the value of the codiceUfficioPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUfficioPCC(String value) {
        this.codiceUfficioPCC = value;
    }

    /**
     * Gets the value of the codiceUnivocoUfficioIPA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUnivocoUfficioIPA() {
        return codiceUnivocoUfficioIPA;
    }

    /**
     * Sets the value of the codiceUnivocoUfficioIPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUnivocoUfficioIPA(String value) {
        this.codiceUnivocoUfficioIPA = value;
    }

}
