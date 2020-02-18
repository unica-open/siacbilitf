/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaDatiFatturaQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaDatiFatturaQueryTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoElabTransazTipo">
 *       &lt;sequence>
 *         &lt;element name="dettaglioFattura" type="{http://www.tesoro.it/fatture}dettaglioFatturaTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaDatiFatturaQueryTipo", propOrder = {
    "dettaglioFattura"
})
public class DatiRispostaDatiFatturaQueryTipo
    extends EsitoElabTransazTipo
{

    protected DettaglioFatturaTipo dettaglioFattura;

    /**
     * Gets the value of the dettaglioFattura property.
     * 
     * @return
     *     possible object is
     *     {@link DettaglioFatturaTipo }
     *     
     */
    public DettaglioFatturaTipo getDettaglioFattura() {
        return dettaglioFattura;
    }

    /**
     * Sets the value of the dettaglioFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link DettaglioFatturaTipo }
     *     
     */
    public void setDettaglioFattura(DettaglioFatturaTipo value) {
        this.dettaglioFattura = value;
    }

}
