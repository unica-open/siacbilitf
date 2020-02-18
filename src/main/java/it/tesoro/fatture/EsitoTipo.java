/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esitoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esitoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoTransazionePCC" type="{http://www.tesoro.it/fatture}maxLenghtString35Type" minOccurs="0"/>
 *         &lt;element name="identificativoTransazionePA" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="identificativoPCCAmministrazione" type="{http://www.tesoro.it/fatture}numericalDigit9Type" minOccurs="0"/>
 *         &lt;element name="statoTransazione" type="{http://www.tesoro.it/fatture}statoTransazioneTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoTipo", propOrder = {
    "identificativoTransazionePCC",
    "identificativoTransazionePA",
    "identificativoPCCAmministrazione",
    "statoTransazione"
})
public class EsitoTipo {

    protected String identificativoTransazionePCC;
    protected String identificativoTransazionePA;
    protected Long identificativoPCCAmministrazione;
    protected StatoTransazioneTipo statoTransazione;

    /**
     * Gets the value of the identificativoTransazionePCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoTransazionePCC() {
        return identificativoTransazionePCC;
    }

    /**
     * Sets the value of the identificativoTransazionePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoTransazionePCC(String value) {
        this.identificativoTransazionePCC = value;
    }

    /**
     * Gets the value of the identificativoTransazionePA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoTransazionePA() {
        return identificativoTransazionePA;
    }

    /**
     * Sets the value of the identificativoTransazionePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoTransazionePA(String value) {
        this.identificativoTransazionePA = value;
    }

    /**
     * Gets the value of the identificativoPCCAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificativoPCCAmministrazione() {
        return identificativoPCCAmministrazione;
    }

    /**
     * Sets the value of the identificativoPCCAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificativoPCCAmministrazione(Long value) {
        this.identificativoPCCAmministrazione = value;
    }

    /**
     * Gets the value of the statoTransazione property.
     * 
     * @return
     *     possible object is
     *     {@link StatoTransazioneTipo }
     *     
     */
    public StatoTransazioneTipo getStatoTransazione() {
        return statoTransazione;
    }

    /**
     * Sets the value of the statoTransazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoTransazioneTipo }
     *     
     */
    public void setStatoTransazione(StatoTransazioneTipo value) {
        this.statoTransazione = value;
    }

}
