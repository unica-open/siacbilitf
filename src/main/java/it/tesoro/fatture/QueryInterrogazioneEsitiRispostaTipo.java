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
 * <p>Java class for queryInterrogazioneEsitiRispostaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryInterrogazioneEsitiRispostaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRisposta" type="{http://www.tesoro.it/fatture}testataBaseTipo"/>
 *         &lt;element name="datiRisposta" type="{http://www.tesoro.it/fatture}datiRispostaInterrogazioneEsitiQueryTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryInterrogazioneEsitiRispostaTipo", propOrder = {
    "testataRisposta",
    "datiRisposta"
})
public class QueryInterrogazioneEsitiRispostaTipo {

    @XmlElement(required = true)
    protected TestataBaseTipo testataRisposta;
    @XmlElement(required = true)
    protected DatiRispostaInterrogazioneEsitiQueryTipo datiRisposta;

    /**
     * Gets the value of the testataRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataBaseTipo }
     *     
     */
    public TestataBaseTipo getTestataRisposta() {
        return testataRisposta;
    }

    /**
     * Sets the value of the testataRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataBaseTipo }
     *     
     */
    public void setTestataRisposta(TestataBaseTipo value) {
        this.testataRisposta = value;
    }

    /**
     * Gets the value of the datiRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRispostaInterrogazioneEsitiQueryTipo }
     *     
     */
    public DatiRispostaInterrogazioneEsitiQueryTipo getDatiRisposta() {
        return datiRisposta;
    }

    /**
     * Sets the value of the datiRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRispostaInterrogazioneEsitiQueryTipo }
     *     
     */
    public void setDatiRisposta(DatiRispostaInterrogazioneEsitiQueryTipo value) {
        this.datiRisposta = value;
    }

}
