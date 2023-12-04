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
 * <p>Java class for datiRichiestaInterrogazioneEsitiQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaInterrogazioneEsitiQueryTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="listaTransazionePA" type="{http://www.tesoro.it/fatture}listaIdentificativoTransazioneTipo"/>
 *           &lt;element name="listaTransazionePCC" type="{http://www.tesoro.it/fatture}listaIdentificativoTransazionePCCTipo"/>
 *           &lt;element name="intervalloDate" type="{http://www.tesoro.it/fatture}intervalloDateTipo"/>
 *         &lt;/choice>
 *         &lt;element name="flagEsitiNonComunicati" type="{http://www.tesoro.it/fatture}flagSiNoTipo" minOccurs="0"/>
 *         &lt;element name="numeroPagina" type="{http://www.tesoro.it/fatture}numericalDigit9Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaInterrogazioneEsitiQueryTipo", propOrder = {
    "listaTransazionePA",
    "listaTransazionePCC",
    "intervalloDate",
    "flagEsitiNonComunicati",
    "numeroPagina"
})
public class DatiRichiestaInterrogazioneEsitiQueryTipo {

    protected ListaIdentificativoTransazioneTipo listaTransazionePA;
    protected ListaIdentificativoTransazionePCCTipo listaTransazionePCC;
    protected IntervalloDateTipo intervalloDate;
    @XmlElement(defaultValue = "NO")
    protected FlagSiNoTipo flagEsitiNonComunicati;
    protected Long numeroPagina;

    /**
     * Gets the value of the listaTransazionePA property.
     * 
     * @return
     *     possible object is
     *     {@link ListaIdentificativoTransazioneTipo }
     *     
     */
    public ListaIdentificativoTransazioneTipo getListaTransazionePA() {
        return listaTransazionePA;
    }

    /**
     * Sets the value of the listaTransazionePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaIdentificativoTransazioneTipo }
     *     
     */
    public void setListaTransazionePA(ListaIdentificativoTransazioneTipo value) {
        this.listaTransazionePA = value;
    }

    /**
     * Gets the value of the listaTransazionePCC property.
     * 
     * @return
     *     possible object is
     *     {@link ListaIdentificativoTransazionePCCTipo }
     *     
     */
    public ListaIdentificativoTransazionePCCTipo getListaTransazionePCC() {
        return listaTransazionePCC;
    }

    /**
     * Sets the value of the listaTransazionePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaIdentificativoTransazionePCCTipo }
     *     
     */
    public void setListaTransazionePCC(ListaIdentificativoTransazionePCCTipo value) {
        this.listaTransazionePCC = value;
    }

    /**
     * Gets the value of the intervalloDate property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalloDateTipo }
     *     
     */
    public IntervalloDateTipo getIntervalloDate() {
        return intervalloDate;
    }

    /**
     * Sets the value of the intervalloDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalloDateTipo }
     *     
     */
    public void setIntervalloDate(IntervalloDateTipo value) {
        this.intervalloDate = value;
    }

    /**
     * Gets the value of the flagEsitiNonComunicati property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public FlagSiNoTipo getFlagEsitiNonComunicati() {
        return flagEsitiNonComunicati;
    }

    /**
     * Sets the value of the flagEsitiNonComunicati property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public void setFlagEsitiNonComunicati(FlagSiNoTipo value) {
        this.flagEsitiNonComunicati = value;
    }

    /**
     * Gets the value of the numeroPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroPagina() {
        return numeroPagina;
    }

    /**
     * Sets the value of the numeroPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroPagina(Long value) {
        this.numeroPagina = value;
    }

}
