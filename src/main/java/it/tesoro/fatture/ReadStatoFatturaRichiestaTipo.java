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
 * <p>Java class for readStatoFatturaRichiestaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readStatoFatturaRichiestaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRichiesta" type="{http://www.tesoro.it/fatture}testataTransazioneTipo"/>
 *         &lt;element name="datiRichiesta" type="{http://www.tesoro.it/fatture}datiRichiestaDatiFatturaProxyTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readStatoFatturaRichiestaTipo", propOrder = {
    "testataRichiesta",
    "datiRichiesta"
})
public class ReadStatoFatturaRichiestaTipo {

    @XmlElement(required = true)
    protected TestataTransazioneTipo testataRichiesta;
    @XmlElement(required = true)
    protected DatiRichiestaDatiFatturaProxyTipo datiRichiesta;

    /**
     * Gets the value of the testataRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataTransazioneTipo }
     *     
     */
    public TestataTransazioneTipo getTestataRichiesta() {
        return testataRichiesta;
    }

    /**
     * Sets the value of the testataRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataTransazioneTipo }
     *     
     */
    public void setTestataRichiesta(TestataTransazioneTipo value) {
        this.testataRichiesta = value;
    }

    /**
     * Gets the value of the datiRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRichiestaDatiFatturaProxyTipo }
     *     
     */
    public DatiRichiestaDatiFatturaProxyTipo getDatiRichiesta() {
        return datiRichiesta;
    }

    /**
     * Sets the value of the datiRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRichiestaDatiFatturaProxyTipo }
     *     
     */
    public void setDatiRichiesta(DatiRichiestaDatiFatturaProxyTipo value) {
        this.datiRichiesta = value;
    }

}
