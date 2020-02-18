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
 * <p>Java class for erroreElaborazioneOperazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="erroreElaborazioneOperazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoOperazione" type="{http://www.tesoro.it/fatture}tipoOperazioneTipo" minOccurs="0"/>
 *         &lt;element name="progressivoOperazione" type="{http://www.tesoro.it/fatture}numericalDigit5Type" minOccurs="0"/>
 *         &lt;element name="codiceEsitoElaborazioneOperazione" type="{http://www.tesoro.it/fatture}maxLenghtString10Type"/>
 *         &lt;element name="descrizioneEsitoElaborazioneOperazione" type="{http://www.tesoro.it/fatture}maxLenghtString1024Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "erroreElaborazioneOperazioneTipo", propOrder = {
    "tipoOperazione",
    "progressivoOperazione",
    "codiceEsitoElaborazioneOperazione",
    "descrizioneEsitoElaborazioneOperazione"
})
public class ErroreElaborazioneOperazioneTipo {

    protected TipoOperazioneTipo tipoOperazione;
    protected Long progressivoOperazione;
    @XmlElement(required = true)
    protected String codiceEsitoElaborazioneOperazione;
    protected String descrizioneEsitoElaborazioneOperazione;

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
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProgressivoOperazione() {
        return progressivoOperazione;
    }

    /**
     * Sets the value of the progressivoOperazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProgressivoOperazione(Long value) {
        this.progressivoOperazione = value;
    }

    /**
     * Gets the value of the codiceEsitoElaborazioneOperazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEsitoElaborazioneOperazione() {
        return codiceEsitoElaborazioneOperazione;
    }

    /**
     * Sets the value of the codiceEsitoElaborazioneOperazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEsitoElaborazioneOperazione(String value) {
        this.codiceEsitoElaborazioneOperazione = value;
    }

    /**
     * Gets the value of the descrizioneEsitoElaborazioneOperazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneEsitoElaborazioneOperazione() {
        return descrizioneEsitoElaborazioneOperazione;
    }

    /**
     * Sets the value of the descrizioneEsitoElaborazioneOperazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneEsitoElaborazioneOperazione(String value) {
        this.descrizioneEsitoElaborazioneOperazione = value;
    }

}
