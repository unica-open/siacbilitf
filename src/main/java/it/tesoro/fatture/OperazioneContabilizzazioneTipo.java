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
 * <p>Java class for operazioneContabilizzazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operazioneContabilizzazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statoDebito" type="{http://www.tesoro.it/fatture}statoDebitoTipo"/>
 *         &lt;element name="causale" type="{http://www.tesoro.it/fatture}maxLenghtString255Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operazioneContabilizzazioneTipo", propOrder = {
    "statoDebito",
    "causale"
})
public class OperazioneContabilizzazioneTipo {

    @XmlElement(required = true)
    protected StatoDebitoTipo statoDebito;
    protected String causale;

    /**
     * Gets the value of the statoDebito property.
     * 
     * @return
     *     possible object is
     *     {@link StatoDebitoTipo }
     *     
     */
    public StatoDebitoTipo getStatoDebito() {
        return statoDebito;
    }

    /**
     * Sets the value of the statoDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoDebitoTipo }
     *     
     */
    public void setStatoDebito(StatoDebitoTipo value) {
        this.statoDebito = value;
    }

    /**
     * Gets the value of the causale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausale() {
        return causale;
    }

    /**
     * Sets the value of the causale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausale(String value) {
        this.causale = value;
    }

}
