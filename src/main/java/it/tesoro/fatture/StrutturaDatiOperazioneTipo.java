/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for strutturaDatiOperazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="strutturaDatiOperazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="pagamento" type="{http://www.tesoro.it/fatture}pagamentoTipo"/>
 *           &lt;element name="pagamentoStorno" type="{http://www.tesoro.it/fatture}pagamentoStornoTipo"/>
 *           &lt;element name="comunicazioneScadenza" type="{http://www.tesoro.it/fatture}comunicazioneScadenzaTipo"/>
 *           &lt;element name="listaContabilizzazione" type="{http://www.tesoro.it/fatture}listaContabilizzazioneTipo" minOccurs="0"/>
 *           &lt;element name="rifiutoFattura" type="{http://www.tesoro.it/fatture}rifiutoFatturaTipo"/>
 *           &lt;element name="ricezioneFattura" type="{http://www.tesoro.it/fatture}ricezioneFatturaTipo"/>
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
@XmlType(name = "strutturaDatiOperazioneTipo", propOrder = {
    "pagamento",
    "pagamentoStorno",
    "comunicazioneScadenza",
    "listaContabilizzazione",
    "rifiutoFattura",
    "ricezioneFattura"
})
public class StrutturaDatiOperazioneTipo {

    protected PagamentoTipo pagamento;
    protected PagamentoStornoTipo pagamentoStorno;
    protected ComunicazioneScadenzaTipo comunicazioneScadenza;
    protected ListaContabilizzazioneTipo listaContabilizzazione;
    protected RifiutoFatturaTipo rifiutoFattura;
    protected RicezioneFatturaTipo ricezioneFattura;

    /**
     * Gets the value of the pagamento property.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoTipo }
     *     
     */
    public PagamentoTipo getPagamento() {
        return pagamento;
    }

    /**
     * Sets the value of the pagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoTipo }
     *     
     */
    public void setPagamento(PagamentoTipo value) {
        this.pagamento = value;
    }

    /**
     * Gets the value of the pagamentoStorno property.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoStornoTipo }
     *     
     */
    public PagamentoStornoTipo getPagamentoStorno() {
        return pagamentoStorno;
    }

    /**
     * Sets the value of the pagamentoStorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoStornoTipo }
     *     
     */
    public void setPagamentoStorno(PagamentoStornoTipo value) {
        this.pagamentoStorno = value;
    }

    /**
     * Gets the value of the comunicazioneScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link ComunicazioneScadenzaTipo }
     *     
     */
    public ComunicazioneScadenzaTipo getComunicazioneScadenza() {
        return comunicazioneScadenza;
    }

    /**
     * Sets the value of the comunicazioneScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicazioneScadenzaTipo }
     *     
     */
    public void setComunicazioneScadenza(ComunicazioneScadenzaTipo value) {
        this.comunicazioneScadenza = value;
    }

    /**
     * Gets the value of the listaContabilizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link ListaContabilizzazioneTipo }
     *     
     */
    public ListaContabilizzazioneTipo getListaContabilizzazione() {
        return listaContabilizzazione;
    }

    /**
     * Sets the value of the listaContabilizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaContabilizzazioneTipo }
     *     
     */
    public void setListaContabilizzazione(ListaContabilizzazioneTipo value) {
        this.listaContabilizzazione = value;
    }

    /**
     * Gets the value of the rifiutoFattura property.
     * 
     * @return
     *     possible object is
     *     {@link RifiutoFatturaTipo }
     *     
     */
    public RifiutoFatturaTipo getRifiutoFattura() {
        return rifiutoFattura;
    }

    /**
     * Sets the value of the rifiutoFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link RifiutoFatturaTipo }
     *     
     */
    public void setRifiutoFattura(RifiutoFatturaTipo value) {
        this.rifiutoFattura = value;
    }

    /**
     * Gets the value of the ricezioneFattura property.
     * 
     * @return
     *     possible object is
     *     {@link RicezioneFatturaTipo }
     *     
     */
    public RicezioneFatturaTipo getRicezioneFattura() {
        return ricezioneFattura;
    }

    /**
     * Sets the value of the ricezioneFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link RicezioneFatturaTipo }
     *     
     */
    public void setRicezioneFattura(RicezioneFatturaTipo value) {
        this.ricezioneFattura = value;
    }

}
