/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaDatiFattureQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaDatiFattureQueryTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoElabTransazTipo">
 *       &lt;sequence>
 *         &lt;element name="listaUrl" type="{http://www.tesoro.it/fatture}listaUrlTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaDatiFattureQueryTipo", propOrder = {
    "listaUrl"
})
public class DatiRispostaDatiFattureQueryTipo
    extends EsitoElabTransazTipo
{

    protected ListaUrlTipo listaUrl;

    /**
     * Gets the value of the listaUrl property.
     * 
     * @return
     *     possible object is
     *     {@link ListaUrlTipo }
     *     
     */
    public ListaUrlTipo getListaUrl() {
        return listaUrl;
    }

    /**
     * Sets the value of the listaUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaUrlTipo }
     *     
     */
    public void setListaUrl(ListaUrlTipo value) {
        this.listaUrl = value;
    }

}
