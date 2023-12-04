/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRispostaElencoMovimentiErarioReadTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaElencoMovimentiErarioReadTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoFineElabTipo">
 *       &lt;sequence>
 *         &lt;element name="totaleImportoPagato" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="totaleIva" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="listaPagamentiStornoIva" type="{http://www.tesoro.it/fatture}listaPagamentoStornoIvaTipo" minOccurs="0"/>
 *         &lt;element name="paginazione" type="{http://www.tesoro.it/fatture}paginazioneTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaElencoMovimentiErarioReadTipo", propOrder = {
    "totaleImportoPagato",
    "totaleIva",
    "listaPagamentiStornoIva",
    "paginazione"
})
public class DatiRispostaElencoMovimentiErarioReadTipo
    extends EsitoFineElabTipo
{

    protected BigDecimal totaleImportoPagato;
    protected BigDecimal totaleIva;
    protected ListaPagamentoStornoIvaTipo listaPagamentiStornoIva;
    protected PaginazioneTipo paginazione;

    /**
     * Gets the value of the totaleImportoPagato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleImportoPagato() {
        return totaleImportoPagato;
    }

    /**
     * Sets the value of the totaleImportoPagato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleImportoPagato(BigDecimal value) {
        this.totaleImportoPagato = value;
    }

    /**
     * Gets the value of the totaleIva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleIva() {
        return totaleIva;
    }

    /**
     * Sets the value of the totaleIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleIva(BigDecimal value) {
        this.totaleIva = value;
    }

    /**
     * Gets the value of the listaPagamentiStornoIva property.
     * 
     * @return
     *     possible object is
     *     {@link ListaPagamentoStornoIvaTipo }
     *     
     */
    public ListaPagamentoStornoIvaTipo getListaPagamentiStornoIva() {
        return listaPagamentiStornoIva;
    }

    /**
     * Sets the value of the listaPagamentiStornoIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPagamentoStornoIvaTipo }
     *     
     */
    public void setListaPagamentiStornoIva(ListaPagamentoStornoIvaTipo value) {
        this.listaPagamentiStornoIva = value;
    }

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

}
