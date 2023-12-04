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
 * <p>Java class for datiRichiestaPagamentoIvaProxyTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaPagamentoIvaProxyTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoPCCUfficio" type="{http://www.tesoro.it/fatture}maxLenghtString35Type"/>
 *         &lt;element name="tipologiaMovimentoErario" type="{http://www.tesoro.it/fatture}tipologiaMovimentoErarioTipo"/>
 *         &lt;element name="dettaglioMovimentoErario" type="{http://www.tesoro.it/fatture}dettaglioMovimentoErarioTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaPagamentoIvaProxyTipo", propOrder = {
    "identificativoPCCUfficio",
    "tipologiaMovimentoErario",
    "dettaglioMovimentoErario"
})
public class DatiRichiestaPagamentoIvaProxyTipo {

    @XmlElement(required = true)
    protected String identificativoPCCUfficio;
    @XmlElement(required = true)
    protected TipologiaMovimentoErarioTipo tipologiaMovimentoErario;
    @XmlElement(required = true)
    protected DettaglioMovimentoErarioTipo dettaglioMovimentoErario;

    /**
     * Gets the value of the identificativoPCCUfficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoPCCUfficio() {
        return identificativoPCCUfficio;
    }

    /**
     * Sets the value of the identificativoPCCUfficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoPCCUfficio(String value) {
        this.identificativoPCCUfficio = value;
    }

    /**
     * Gets the value of the tipologiaMovimentoErario property.
     * 
     * @return
     *     possible object is
     *     {@link TipologiaMovimentoErarioTipo }
     *     
     */
    public TipologiaMovimentoErarioTipo getTipologiaMovimentoErario() {
        return tipologiaMovimentoErario;
    }

    /**
     * Sets the value of the tipologiaMovimentoErario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipologiaMovimentoErarioTipo }
     *     
     */
    public void setTipologiaMovimentoErario(TipologiaMovimentoErarioTipo value) {
        this.tipologiaMovimentoErario = value;
    }

    /**
     * Gets the value of the dettaglioMovimentoErario property.
     * 
     * @return
     *     possible object is
     *     {@link DettaglioMovimentoErarioTipo }
     *     
     */
    public DettaglioMovimentoErarioTipo getDettaglioMovimentoErario() {
        return dettaglioMovimentoErario;
    }

    /**
     * Sets the value of the dettaglioMovimentoErario property.
     * 
     * @param value
     *     allowed object is
     *     {@link DettaglioMovimentoErarioTipo }
     *     
     */
    public void setDettaglioMovimentoErario(DettaglioMovimentoErarioTipo value) {
        this.dettaglioMovimentoErario = value;
    }

}
