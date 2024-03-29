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
 * <p>Java class for queryInserimentoFatturaRichiestaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryInserimentoFatturaRichiestaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRichiesta" type="{http://www.tesoro.it/fatture}testataQueryTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryInserimentoFatturaRichiestaTipo", propOrder = {
    "testataRichiesta"
})
public class QueryInserimentoFatturaRichiestaTipo {

    @XmlElement(required = true)
    protected TestataQueryTipo testataRichiesta;

    /**
     * Gets the value of the testataRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataQueryTipo }
     *     
     */
    public TestataQueryTipo getTestataRichiesta() {
        return testataRichiesta;
    }

    /**
     * Sets the value of the testataRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataQueryTipo }
     *     
     */
    public void setTestataRichiesta(TestataQueryTipo value) {
        this.testataRichiesta = value;
    }

}
