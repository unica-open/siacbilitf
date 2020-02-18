/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dettaglioMovimentoErarioTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dettaglioMovimentoErarioTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="stornoPagamentoIVA" type="{http://www.tesoro.it/fatture}stornoPagamentoIVATipo"/>
 *           &lt;element name="pagamentoIVA" type="{http://www.tesoro.it/fatture}pagamentoIVATipo"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioMovimentoErarioTipo", propOrder = {
    "stornoPagamentoIVA",
    "pagamentoIVA"
})
public class DettaglioMovimentoErarioTipo {

    protected StornoPagamentoIVATipo stornoPagamentoIVA;
    protected PagamentoIVATipo pagamentoIVA;

    /**
     * Gets the value of the stornoPagamentoIVA property.
     * 
     * @return
     *     possible object is
     *     {@link StornoPagamentoIVATipo }
     *     
     */
    public StornoPagamentoIVATipo getStornoPagamentoIVA() {
        return stornoPagamentoIVA;
    }

    /**
     * Sets the value of the stornoPagamentoIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link StornoPagamentoIVATipo }
     *     
     */
    public void setStornoPagamentoIVA(StornoPagamentoIVATipo value) {
        this.stornoPagamentoIVA = value;
    }

    /**
     * Gets the value of the pagamentoIVA property.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoIVATipo }
     *     
     */
    public PagamentoIVATipo getPagamentoIVA() {
        return pagamentoIVA;
    }

    /**
     * Sets the value of the pagamentoIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoIVATipo }
     *     
     */
    public void setPagamentoIVA(PagamentoIVATipo value) {
        this.pagamentoIVA = value;
    }

}
