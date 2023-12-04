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
 * <p>Java class for datiRichiestaDatiFattureProxyTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaDatiFattureProxyTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filtroInterrogazione" type="{http://www.tesoro.it/fatture}filtroInterrogazioneTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaDatiFattureProxyTipo", propOrder = {
    "filtroInterrogazione"
})
public class DatiRichiestaDatiFattureProxyTipo {

    @XmlElement(required = true)
    protected FiltroInterrogazioneTipo filtroInterrogazione;

    /**
     * Gets the value of the filtroInterrogazione property.
     * 
     * @return
     *     possible object is
     *     {@link FiltroInterrogazioneTipo }
     *     
     */
    public FiltroInterrogazioneTipo getFiltroInterrogazione() {
        return filtroInterrogazione;
    }

    /**
     * Sets the value of the filtroInterrogazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroInterrogazioneTipo }
     *     
     */
    public void setFiltroInterrogazione(FiltroInterrogazioneTipo value) {
        this.filtroInterrogazione = value;
    }

}
