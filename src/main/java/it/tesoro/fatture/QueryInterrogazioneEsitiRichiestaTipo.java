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
 * <p>Java class for queryInterrogazioneEsitiRichiestaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="queryInterrogazioneEsitiRichiestaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRichiesta" type="{http://www.tesoro.it/fatture}testataBaseTipo"/>
 *         &lt;element name="datiRichiesta" type="{http://www.tesoro.it/fatture}datiRichiestaInterrogazioneEsitiQueryTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryInterrogazioneEsitiRichiestaTipo", propOrder = {
    "testataRichiesta",
    "datiRichiesta"
})
public class QueryInterrogazioneEsitiRichiestaTipo {

    @XmlElement(required = true)
    protected TestataBaseTipo testataRichiesta;
    @XmlElement(required = true)
    protected DatiRichiestaInterrogazioneEsitiQueryTipo datiRichiesta;

    /**
     * Gets the value of the testataRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataBaseTipo }
     *     
     */
    public TestataBaseTipo getTestataRichiesta() {
        return testataRichiesta;
    }

    /**
     * Sets the value of the testataRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataBaseTipo }
     *     
     */
    public void setTestataRichiesta(TestataBaseTipo value) {
        this.testataRichiesta = value;
    }

    /**
     * Gets the value of the datiRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRichiestaInterrogazioneEsitiQueryTipo }
     *     
     */
    public DatiRichiestaInterrogazioneEsitiQueryTipo getDatiRichiesta() {
        return datiRichiesta;
    }

    /**
     * Sets the value of the datiRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRichiestaInterrogazioneEsitiQueryTipo }
     *     
     */
    public void setDatiRichiesta(DatiRichiestaInterrogazioneEsitiQueryTipo value) {
        this.datiRichiesta = value;
    }

}
