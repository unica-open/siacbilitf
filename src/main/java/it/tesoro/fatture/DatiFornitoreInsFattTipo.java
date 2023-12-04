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
 * <p>Java class for datiFornitoreInsFattTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiFornitoreInsFattTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscale" type="{http://www.tesoro.it/fatture}codiceFiscaleTrasmittenteTipo"/>
 *         &lt;element name="denominazione" type="{http://www.tesoro.it/fatture}maxLenghtString150Type"/>
 *         &lt;element name="idFiscaleIVA" type="{http://www.tesoro.it/fatture}idFiscaleIvaTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiFornitoreInsFattTipo", propOrder = {
    "codiceFiscale",
    "denominazione",
    "idFiscaleIVA"
})
public class DatiFornitoreInsFattTipo {

    @XmlElement(required = true)
    protected String codiceFiscale;
    @XmlElement(required = true)
    protected String denominazione;
    @XmlElement(required = true)
    protected String idFiscaleIVA;

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
     * Gets the value of the idFiscaleIVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * Sets the value of the idFiscaleIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscaleIVA(String value) {
        this.idFiscaleIVA = value;
    }

}
