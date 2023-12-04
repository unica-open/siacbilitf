/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esitoElabTransazTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esitoElabTransazTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoFineElabTipo">
 *       &lt;sequence>
 *         &lt;element name="esitoElaborazioneTransazione" type="{http://www.tesoro.it/fatture}maxLenghtString10Type" minOccurs="0"/>
 *         &lt;element name="descrizioneElaborazioneTransazione" type="{http://www.tesoro.it/fatture}maxLenghtString1024Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoElabTransazTipo", propOrder = {
    "esitoElaborazioneTransazione",
    "descrizioneElaborazioneTransazione"
})
@XmlSeeAlso({
    DatiRispostaDatiFattureQueryTipo.class,
    DatiRispostaInserimentoFatturaQueryTipo.class,
    DatiRispostaDatiFatturaQueryTipo.class
})
public class EsitoElabTransazTipo
    extends EsitoFineElabTipo
{

    protected String esitoElaborazioneTransazione;
    protected String descrizioneElaborazioneTransazione;

    /**
     * Gets the value of the esitoElaborazioneTransazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoElaborazioneTransazione() {
        return esitoElaborazioneTransazione;
    }

    /**
     * Sets the value of the esitoElaborazioneTransazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoElaborazioneTransazione(String value) {
        this.esitoElaborazioneTransazione = value;
    }

    /**
     * Gets the value of the descrizioneElaborazioneTransazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneElaborazioneTransazione() {
        return descrizioneElaborazioneTransazione;
    }

    /**
     * Sets the value of the descrizioneElaborazioneTransazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneElaborazioneTransazione(String value) {
        this.descrizioneElaborazioneTransazione = value;
    }

}
