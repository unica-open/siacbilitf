/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaInterrogazioneEsitiQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaInterrogazioneEsitiQueryTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoFineElabTipo">
 *       &lt;sequence>
 *         &lt;element name="paginazione" type="{http://www.tesoro.it/fatture}paginazioneTipo" minOccurs="0"/>
 *         &lt;element name="listaEsito" type="{http://www.tesoro.it/fatture}listaEsitoTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaInterrogazioneEsitiQueryTipo", propOrder = {
    "paginazione",
    "listaEsito"
})
public class DatiRispostaInterrogazioneEsitiQueryTipo
    extends EsitoFineElabTipo
{

    protected PaginazioneTipo paginazione;
    protected ListaEsitoTipo listaEsito;

    /**
     * Gets the value of the paginazione property.
     * 
     * @return
     *     possible object is
     *     {@link PaginazioneTipo }
     *     
     */
    public PaginazioneTipo getPaginazione() {
        return paginazione;
    }

    /**
     * Sets the value of the paginazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginazioneTipo }
     *     
     */
    public void setPaginazione(PaginazioneTipo value) {
        this.paginazione = value;
    }

    /**
     * Gets the value of the listaEsito property.
     * 
     * @return
     *     possible object is
     *     {@link ListaEsitoTipo }
     *     
     */
    public ListaEsitoTipo getListaEsito() {
        return listaEsito;
    }

    /**
     * Sets the value of the listaEsito property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaEsitoTipo }
     *     
     */
    public void setListaEsito(ListaEsitoTipo value) {
        this.listaEsito = value;
    }

}
