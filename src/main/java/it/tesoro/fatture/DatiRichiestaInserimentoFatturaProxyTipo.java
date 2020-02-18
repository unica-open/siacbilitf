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
 * <p>Java class for datiRichiestaInserimentoFatturaProxyTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaInserimentoFatturaProxyTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiFornitore" type="{http://www.tesoro.it/fatture}datiFornitoreInsFattTipo"/>
 *         &lt;element name="datiAmministrazione" type="{http://www.tesoro.it/fatture}datiAmministrazioneInsFattTipo"/>
 *         &lt;element name="identificativoDistinta" type="{http://www.tesoro.it/fatture}maxLenghtString50Type"/>
 *         &lt;element name="datiGeneraliFattura" type="{http://www.tesoro.it/fatture}datiGeneraliFatturaTipo"/>
 *         &lt;element name="listaRiepilogoAliquote" type="{http://www.tesoro.it/fatture}listaRiepilogoAliquoteTipo" minOccurs="0"/>
 *         &lt;element name="listaDistribuzioneCupCig" type="{http://www.tesoro.it/fatture}listaDistribuzioneCupCigTipo" minOccurs="0"/>
 *         &lt;element name="listaDettaglioPagamento" type="{http://www.tesoro.it/fatture}listaDettaglioPagamentoTipo" minOccurs="0"/>
 *         &lt;element name="datiRicezioneFattura" type="{http://www.tesoro.it/fatture}ricezioneFatturaTipo"/>
 *         &lt;element name="forzaturaImmissione" type="{http://www.tesoro.it/fatture}forzaturaImmissioneTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaInserimentoFatturaProxyTipo", propOrder = {
    "datiFornitore",
    "datiAmministrazione",
    "identificativoDistinta",
    "datiGeneraliFattura",
    "listaRiepilogoAliquote",
    "listaDistribuzioneCupCig",
    "listaDettaglioPagamento",
    "datiRicezioneFattura",
    "forzaturaImmissione"
})
public class DatiRichiestaInserimentoFatturaProxyTipo {

    @XmlElement(required = true)
    protected DatiFornitoreInsFattTipo datiFornitore;
    @XmlElement(required = true)
    protected DatiAmministrazioneInsFattTipo datiAmministrazione;
    @XmlElement(required = true)
    protected String identificativoDistinta;
    @XmlElement(required = true)
    protected DatiGeneraliFatturaTipo datiGeneraliFattura;
    protected ListaRiepilogoAliquoteTipo listaRiepilogoAliquote;
    protected ListaDistribuzioneCupCigTipo listaDistribuzioneCupCig;
    protected ListaDettaglioPagamentoTipo listaDettaglioPagamento;
    @XmlElement(required = true)
    protected RicezioneFatturaTipo datiRicezioneFattura;
    protected ForzaturaImmissioneTipo forzaturaImmissione;

    /**
     * Gets the value of the datiFornitore property.
     * 
     * @return
     *     possible object is
     *     {@link DatiFornitoreInsFattTipo }
     *     
     */
    public DatiFornitoreInsFattTipo getDatiFornitore() {
        return datiFornitore;
    }

    /**
     * Sets the value of the datiFornitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiFornitoreInsFattTipo }
     *     
     */
    public void setDatiFornitore(DatiFornitoreInsFattTipo value) {
        this.datiFornitore = value;
    }

    /**
     * Gets the value of the datiAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAmministrazioneInsFattTipo }
     *     
     */
    public DatiAmministrazioneInsFattTipo getDatiAmministrazione() {
        return datiAmministrazione;
    }

    /**
     * Sets the value of the datiAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAmministrazioneInsFattTipo }
     *     
     */
    public void setDatiAmministrazione(DatiAmministrazioneInsFattTipo value) {
        this.datiAmministrazione = value;
    }

    /**
     * Gets the value of the identificativoDistinta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoDistinta() {
        return identificativoDistinta;
    }

    /**
     * Sets the value of the identificativoDistinta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoDistinta(String value) {
        this.identificativoDistinta = value;
    }

    /**
     * Gets the value of the datiGeneraliFattura property.
     * 
     * @return
     *     possible object is
     *     {@link DatiGeneraliFatturaTipo }
     *     
     */
    public DatiGeneraliFatturaTipo getDatiGeneraliFattura() {
        return datiGeneraliFattura;
    }

    /**
     * Sets the value of the datiGeneraliFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiGeneraliFatturaTipo }
     *     
     */
    public void setDatiGeneraliFattura(DatiGeneraliFatturaTipo value) {
        this.datiGeneraliFattura = value;
    }

    /**
     * Gets the value of the listaRiepilogoAliquote property.
     * 
     * @return
     *     possible object is
     *     {@link ListaRiepilogoAliquoteTipo }
     *     
     */
    public ListaRiepilogoAliquoteTipo getListaRiepilogoAliquote() {
        return listaRiepilogoAliquote;
    }

    /**
     * Sets the value of the listaRiepilogoAliquote property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaRiepilogoAliquoteTipo }
     *     
     */
    public void setListaRiepilogoAliquote(ListaRiepilogoAliquoteTipo value) {
        this.listaRiepilogoAliquote = value;
    }

    /**
     * Gets the value of the listaDistribuzioneCupCig property.
     * 
     * @return
     *     possible object is
     *     {@link ListaDistribuzioneCupCigTipo }
     *     
     */
    public ListaDistribuzioneCupCigTipo getListaDistribuzioneCupCig() {
        return listaDistribuzioneCupCig;
    }

    /**
     * Sets the value of the listaDistribuzioneCupCig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDistribuzioneCupCigTipo }
     *     
     */
    public void setListaDistribuzioneCupCig(ListaDistribuzioneCupCigTipo value) {
        this.listaDistribuzioneCupCig = value;
    }

    /**
     * Gets the value of the listaDettaglioPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ListaDettaglioPagamentoTipo }
     *     
     */
    public ListaDettaglioPagamentoTipo getListaDettaglioPagamento() {
        return listaDettaglioPagamento;
    }

    /**
     * Sets the value of the listaDettaglioPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDettaglioPagamentoTipo }
     *     
     */
    public void setListaDettaglioPagamento(ListaDettaglioPagamentoTipo value) {
        this.listaDettaglioPagamento = value;
    }

    /**
     * Gets the value of the datiRicezioneFattura property.
     * 
     * @return
     *     possible object is
     *     {@link RicezioneFatturaTipo }
     *     
     */
    public RicezioneFatturaTipo getDatiRicezioneFattura() {
        return datiRicezioneFattura;
    }

    /**
     * Sets the value of the datiRicezioneFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link RicezioneFatturaTipo }
     *     
     */
    public void setDatiRicezioneFattura(RicezioneFatturaTipo value) {
        this.datiRicezioneFattura = value;
    }

    /**
     * Gets the value of the forzaturaImmissione property.
     * 
     * @return
     *     possible object is
     *     {@link ForzaturaImmissioneTipo }
     *     
     */
    public ForzaturaImmissioneTipo getForzaturaImmissione() {
        return forzaturaImmissione;
    }

    /**
     * Sets the value of the forzaturaImmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForzaturaImmissioneTipo }
     *     
     */
    public void setForzaturaImmissione(ForzaturaImmissioneTipo value) {
        this.forzaturaImmissione = value;
    }

}
