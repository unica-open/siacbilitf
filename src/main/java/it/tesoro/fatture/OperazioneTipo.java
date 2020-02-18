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
 * <p>Java class for operazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoOperazione" type="{http://www.tesoro.it/fatture}tipoOperazioneTipo"/>
 *         &lt;element name="progressivoOperazione" type="{http://www.tesoro.it/fatture}numericalDigit5Type"/>
 *         &lt;element name="strutturaDatiOperazione" type="{http://www.tesoro.it/fatture}strutturaDatiOperazioneTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operazioneTipo", propOrder = {
    "tipoOperazione",
    "progressivoOperazione",
    "strutturaDatiOperazione"
})
public class OperazioneTipo {

    @XmlElement(required = true)
    protected TipoOperazioneTipo tipoOperazione;
    protected long progressivoOperazione;
    @XmlElement(required = true)
    protected StrutturaDatiOperazioneTipo strutturaDatiOperazione;

    /**
     * Gets the value of the tipoOperazione property.
     * 
     * @return
     *     possible object is
     *     {@link TipoOperazioneTipo }
     *     
     */
    public TipoOperazioneTipo getTipoOperazione() {
        return tipoOperazione;
    }

    /**
     * Sets the value of the tipoOperazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoOperazioneTipo }
     *     
     */
    public void setTipoOperazione(TipoOperazioneTipo value) {
        this.tipoOperazione = value;
    }

    /**
     * Gets the value of the progressivoOperazione property.
     * 
     */
    public long getProgressivoOperazione() {
        return progressivoOperazione;
    }

    /**
     * Sets the value of the progressivoOperazione property.
     * 
     */
    public void setProgressivoOperazione(long value) {
        this.progressivoOperazione = value;
    }

    /**
     * Gets the value of the strutturaDatiOperazione property.
     * 
     * @return
     *     possible object is
     *     {@link StrutturaDatiOperazioneTipo }
     *     
     */
    public StrutturaDatiOperazioneTipo getStrutturaDatiOperazione() {
        return strutturaDatiOperazione;
    }

    /**
     * Sets the value of the strutturaDatiOperazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrutturaDatiOperazioneTipo }
     *     
     */
    public void setStrutturaDatiOperazione(StrutturaDatiOperazioneTipo value) {
        this.strutturaDatiOperazione = value;
    }

}
