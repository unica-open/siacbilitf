/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for esitoBaseTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esitoBaseTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esitoTrasmissione" type="{http://www.tesoro.it/fatture}esitoOkKoTipo"/>
 *         &lt;element name="listaErroreTrasmissione" type="{http://www.tesoro.it/fatture}listaErroreTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoBaseTipo", propOrder = {
    "esitoTrasmissione",
    "listaErroreTrasmissione"
})
@XmlSeeAlso({
    DatiRispostaProxyTipo.class,
    EsitoFineElabTipo.class
})
public class EsitoBaseTipo {

    @XmlElement(required = true)
    protected EsitoOkKoTipo esitoTrasmissione;
    protected ListaErroreTipo listaErroreTrasmissione;

    /**
     * Gets the value of the esitoTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link EsitoOkKoTipo }
     *     
     */
    public EsitoOkKoTipo getEsitoTrasmissione() {
        return esitoTrasmissione;
    }

    /**
     * Sets the value of the esitoTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoOkKoTipo }
     *     
     */
    public void setEsitoTrasmissione(EsitoOkKoTipo value) {
        this.esitoTrasmissione = value;
    }

    /**
     * Gets the value of the listaErroreTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link ListaErroreTipo }
     *     
     */
    public ListaErroreTipo getListaErroreTrasmissione() {
        return listaErroreTrasmissione;
    }

    /**
     * Sets the value of the listaErroreTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaErroreTipo }
     *     
     */
    public void setListaErroreTrasmissione(ListaErroreTipo value) {
        this.listaErroreTrasmissione = value;
    }

}
