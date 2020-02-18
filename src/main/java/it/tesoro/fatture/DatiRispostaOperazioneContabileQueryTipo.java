/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for datiRispostaOperazioneContabileQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRispostaOperazioneContabileQueryTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esitoTrasmissione" type="{http://www.tesoro.it/fatture}esitoOkKoTipo"/>
 *         &lt;element name="listaErroreTrasmissione" type="{http://www.tesoro.it/fatture}listaErroreTipo" minOccurs="0"/>
 *         &lt;element name="dataFineElaborazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="esitoElaborazioneTransazione" type="{http://www.tesoro.it/fatture}maxLenghtString10Type" minOccurs="0"/>
 *         &lt;element name="listaErroreElaborazione" type="{http://www.tesoro.it/fatture}listaErroreElaborazioneOperazioneTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRispostaOperazioneContabileQueryTipo", propOrder = {
    "esitoTrasmissione",
    "listaErroreTrasmissione",
    "dataFineElaborazione",
    "esitoElaborazioneTransazione",
    "listaErroreElaborazione"
})
public class DatiRispostaOperazioneContabileQueryTipo {

    @XmlElement(required = true)
    protected EsitoOkKoTipo esitoTrasmissione;
    protected ListaErroreTipo listaErroreTrasmissione;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dataFineElaborazione;
    protected String esitoElaborazioneTransazione;
    protected ListaErroreElaborazioneOperazioneTipo listaErroreElaborazione;

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

    /**
     * Gets the value of the dataFineElaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataFineElaborazione() {
        return dataFineElaborazione;
    }

    /**
     * Sets the value of the dataFineElaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFineElaborazione(Calendar value) {
        this.dataFineElaborazione = value;
    }

    /**
     * Gets the value of the esitoElaborazioneTransazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsitoElaborazioneTransazione() {
        return esitoElaborazioneTransazione;
    }

    /**
     * Sets the value of the esitoElaborazioneTransazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsitoElaborazioneTransazione(String value) {
        this.esitoElaborazioneTransazione = value;
    }

    /**
     * Gets the value of the listaErroreElaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link ListaErroreElaborazioneOperazioneTipo }
     *     
     */
    public ListaErroreElaborazioneOperazioneTipo getListaErroreElaborazione() {
        return listaErroreElaborazione;
    }

    /**
     * Sets the value of the listaErroreElaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaErroreElaborazioneOperazioneTipo }
     *     
     */
    public void setListaErroreElaborazione(ListaErroreElaborazioneOperazioneTipo value) {
        this.listaErroreElaborazione = value;
    }

}
