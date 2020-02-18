/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.marcservicestypes_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.tesoro.fatture.ProxyOperazioneContabileRichiestaTipo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiRichiestaOperazioneContabile" type="{http://www.tesoro.it/fatture}proxyOperazioneContabileRichiestaTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datiRichiestaOperazioneContabile"
})
@XmlRootElement(name = "InvioOperazioneContabile")
public class InvioOperazioneContabile {

    @XmlElement(name = "DatiRichiestaOperazioneContabile", required = true)
    protected ProxyOperazioneContabileRichiestaTipo datiRichiestaOperazioneContabile;

    /**
     * Gets the value of the datiRichiestaOperazioneContabile property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyOperazioneContabileRichiestaTipo }
     *     
     */
    public ProxyOperazioneContabileRichiestaTipo getDatiRichiestaOperazioneContabile() {
        return datiRichiestaOperazioneContabile;
    }

    /**
     * Sets the value of the datiRichiestaOperazioneContabile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyOperazioneContabileRichiestaTipo }
     *     
     */
    public void setDatiRichiestaOperazioneContabile(ProxyOperazioneContabileRichiestaTipo value) {
        this.datiRichiestaOperazioneContabile = value;
    }

}
