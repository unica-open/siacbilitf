/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRichiestaDownloadDocumentoReadTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaDownloadDocumentoReadTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoAllegato" type="{http://www.tesoro.it/fatture}numericalDigit9Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaDownloadDocumentoReadTipo", propOrder = {
    "identificativoAllegato"
})
public class DatiRichiestaDownloadDocumentoReadTipo {

    protected long identificativoAllegato;

    /**
     * Gets the value of the identificativoAllegato property.
     * 
     */
    public long getIdentificativoAllegato() {
        return identificativoAllegato;
    }

    /**
     * Sets the value of the identificativoAllegato property.
     * 
     */
    public void setIdentificativoAllegato(long value) {
        this.identificativoAllegato = value;
    }

}
