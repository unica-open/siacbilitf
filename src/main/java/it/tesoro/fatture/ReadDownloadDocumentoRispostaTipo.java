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
 * <p>Java class for readDownloadDocumentoRispostaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readDownloadDocumentoRispostaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRisposta" type="{http://www.tesoro.it/fatture}testataTransazioneTipo"/>
 *         &lt;element name="datiRisposta" type="{http://www.tesoro.it/fatture}datiRispostaDownloadDocumentoReadTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readDownloadDocumentoRispostaTipo", propOrder = {
    "testataRisposta",
    "datiRisposta"
})
public class ReadDownloadDocumentoRispostaTipo {

    @XmlElement(required = true)
    protected TestataTransazioneTipo testataRisposta;
    @XmlElement(required = true)
    protected DatiRispostaDownloadDocumentoReadTipo datiRisposta;

    /**
     * Gets the value of the testataRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataTransazioneTipo }
     *     
     */
    public TestataTransazioneTipo getTestataRisposta() {
        return testataRisposta;
    }

    /**
     * Sets the value of the testataRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataTransazioneTipo }
     *     
     */
    public void setTestataRisposta(TestataTransazioneTipo value) {
        this.testataRisposta = value;
    }

    /**
     * Gets the value of the datiRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRispostaDownloadDocumentoReadTipo }
     *     
     */
    public DatiRispostaDownloadDocumentoReadTipo getDatiRisposta() {
        return datiRisposta;
    }

    /**
     * Sets the value of the datiRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRispostaDownloadDocumentoReadTipo }
     *     
     */
    public void setDatiRisposta(DatiRispostaDownloadDocumentoReadTipo value) {
        this.datiRisposta = value;
    }

}
