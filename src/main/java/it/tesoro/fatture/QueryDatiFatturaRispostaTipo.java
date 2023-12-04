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
 * <p>Java class for queryDatiFatturaRispostaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryDatiFatturaRispostaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRisposta" type="{http://www.tesoro.it/fatture}testataAsyncTipo"/>
 *         &lt;element name="datiRisposta" type="{http://www.tesoro.it/fatture}datiRispostaDatiFatturaQueryTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryDatiFatturaRispostaTipo", propOrder = {
    "testataRisposta",
    "datiRisposta"
})
public class QueryDatiFatturaRispostaTipo {

    @XmlElement(required = true)
    protected TestataAsyncTipo testataRisposta;
    @XmlElement(required = true)
    protected DatiRispostaDatiFatturaQueryTipo datiRisposta;

    /**
     * Gets the value of the testataRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataAsyncTipo }
     *     
     */
    public TestataAsyncTipo getTestataRisposta() {
        return testataRisposta;
    }

    /**
     * Sets the value of the testataRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataAsyncTipo }
     *     
     */
    public void setTestataRisposta(TestataAsyncTipo value) {
        this.testataRisposta = value;
    }

    /**
     * Gets the value of the datiRisposta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRispostaDatiFatturaQueryTipo }
     *     
     */
    public DatiRispostaDatiFatturaQueryTipo getDatiRisposta() {
        return datiRisposta;
    }

    /**
     * Sets the value of the datiRisposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRispostaDatiFatturaQueryTipo }
     *     
     */
    public void setDatiRisposta(DatiRispostaDatiFatturaQueryTipo value) {
        this.datiRisposta = value;
    }

}
