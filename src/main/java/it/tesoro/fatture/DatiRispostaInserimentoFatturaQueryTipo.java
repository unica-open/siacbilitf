/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaInserimentoFatturaQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaInserimentoFatturaQueryTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoElabTransazTipo">
 *       &lt;sequence>
 *         &lt;element name="codiceRegistrazioneFattura" type="{http://www.tesoro.it/fatture}maxLenghtString20Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaInserimentoFatturaQueryTipo", propOrder = {
    "codiceRegistrazioneFattura"
})
public class DatiRispostaInserimentoFatturaQueryTipo
    extends EsitoElabTransazTipo
{

    protected String codiceRegistrazioneFattura;

    /**
     * Gets the value of the codiceRegistrazioneFattura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceRegistrazioneFattura() {
        return codiceRegistrazioneFattura;
    }

    /**
     * Sets the value of the codiceRegistrazioneFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceRegistrazioneFattura(String value) {
        this.codiceRegistrazioneFattura = value;
    }

}
