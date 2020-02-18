/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaStatoFatturaReadTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaStatoFatturaReadTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoFineElabTipo">
 *       &lt;sequence>
 *         &lt;element name="statoContabileFattura" type="{http://www.tesoro.it/fatture}statoContabileFatturaTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaStatoFatturaReadTipo", propOrder = {
    "statoContabileFattura"
})
public class DatiRispostaStatoFatturaReadTipo
    extends EsitoFineElabTipo
{

    protected StatoContabileFatturaTipo statoContabileFattura;

    /**
     * Gets the value of the statoContabileFattura property.
     * 
     * @return
     *     possible object is
     *     {@link StatoContabileFatturaTipo }
     *     
     */
    public StatoContabileFatturaTipo getStatoContabileFattura() {
        return statoContabileFattura;
    }

    /**
     * Sets the value of the statoContabileFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoContabileFatturaTipo }
     *     
     */
    public void setStatoContabileFattura(StatoContabileFatturaTipo value) {
        this.statoContabileFattura = value;
    }

}
