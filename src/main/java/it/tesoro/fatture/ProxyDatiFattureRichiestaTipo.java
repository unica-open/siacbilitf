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
 * <p>Java class for proxyDatiFattureRichiestaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proxyDatiFattureRichiestaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="testataRichiesta" type="{http://www.tesoro.it/fatture}testataAsyncTipo"/>
 *         &lt;element name="datiRichiesta" type="{http://www.tesoro.it/fatture}datiRichiestaDatiFattureProxyTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proxyDatiFattureRichiestaTipo", propOrder = {
    "testataRichiesta",
    "datiRichiesta"
})
public class ProxyDatiFattureRichiestaTipo {

    @XmlElement(required = true)
    protected TestataAsyncTipo testataRichiesta;
    @XmlElement(required = true)
    protected DatiRichiestaDatiFattureProxyTipo datiRichiesta;

    /**
     * Gets the value of the testataRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link TestataAsyncTipo }
     *     
     */
    public TestataAsyncTipo getTestataRichiesta() {
        return testataRichiesta;
    }

    /**
     * Sets the value of the testataRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataAsyncTipo }
     *     
     */
    public void setTestataRichiesta(TestataAsyncTipo value) {
        this.testataRichiesta = value;
    }

    /**
     * Gets the value of the datiRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link DatiRichiestaDatiFattureProxyTipo }
     *     
     */
    public DatiRichiestaDatiFattureProxyTipo getDatiRichiesta() {
        return datiRichiesta;
    }

    /**
     * Sets the value of the datiRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiRichiestaDatiFattureProxyTipo }
     *     
     */
    public void setDatiRichiesta(DatiRichiestaDatiFattureProxyTipo value) {
        this.datiRichiesta = value;
    }

}
