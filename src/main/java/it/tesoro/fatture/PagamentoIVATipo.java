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
 * <p>Java class for pagamentoIVATipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagamentoIVATipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiPagamento" type="{http://www.tesoro.it/fatture}datiPagamentoTipo"/>
 *         &lt;element name="listaDettagliPagamento" type="{http://www.tesoro.it/fatture}listaDettagliPagamentoTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagamentoIVATipo", propOrder = {
    "datiPagamento",
    "listaDettagliPagamento"
})
public class PagamentoIVATipo {

    @XmlElement(required = true)
    protected DatiPagamentoTipo datiPagamento;
    @XmlElement(required = true)
    protected ListaDettagliPagamentoTipo listaDettagliPagamento;

    /**
     * Gets the value of the datiPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link DatiPagamentoTipo }
     *     
     */
    public DatiPagamentoTipo getDatiPagamento() {
        return datiPagamento;
    }

    /**
     * Sets the value of the datiPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiPagamentoTipo }
     *     
     */
    public void setDatiPagamento(DatiPagamentoTipo value) {
        this.datiPagamento = value;
    }

    /**
     * Gets the value of the listaDettagliPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ListaDettagliPagamentoTipo }
     *     
     */
    public ListaDettagliPagamentoTipo getListaDettagliPagamento() {
        return listaDettagliPagamento;
    }

    /**
     * Sets the value of the listaDettagliPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDettagliPagamentoTipo }
     *     
     */
    public void setListaDettagliPagamento(ListaDettagliPagamentoTipo value) {
        this.listaDettagliPagamento = value;
    }

}
