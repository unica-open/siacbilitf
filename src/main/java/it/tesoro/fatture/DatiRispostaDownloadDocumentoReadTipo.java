/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaDownloadDocumentoReadTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaDownloadDocumentoReadTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoFineElabTipo">
 *       &lt;sequence>
 *         &lt;element name="documento" type="{http://www.tesoro.it/fatture}allegato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaDownloadDocumentoReadTipo", propOrder = {
    "documento"
})
public class DatiRispostaDownloadDocumentoReadTipo
    extends EsitoFineElabTipo
{

    protected Allegato documento;

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link Allegato }
     *     
     */
    public Allegato getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allegato }
     *     
     */
    public void setDocumento(Allegato value) {
        this.documento = value;
    }

}
