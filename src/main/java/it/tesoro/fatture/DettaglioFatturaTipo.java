/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dettaglioFatturaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dettaglioFatturaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiFornitore" type="{http://www.tesoro.it/fatture}datiFornitoreTipo" minOccurs="0"/>
 *         &lt;element name="datiCessionario" type="{http://www.tesoro.it/fatture}datiCessionarioTipo" minOccurs="0"/>
 *         &lt;element name="datiAmministrazione" type="{http://www.tesoro.it/fatture}datiAmministrazioneTipo" minOccurs="0"/>
 *         &lt;element name="datiDistintaTrasmissione" type="{http://www.tesoro.it/fatture}datiDistintaTrasmissioneTipo" minOccurs="0"/>
 *         &lt;element name="flagFatturaCertificata" type="{http://www.tesoro.it/fatture}flagSiNoTipo" minOccurs="0"/>
 *         &lt;element name="listaCertificazione" type="{http://www.tesoro.it/fatture}listaCertificazioneTipo" minOccurs="0"/>
 *         &lt;element name="importoTotaleComunicazioniScadenze" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="listaComunicazioneScadenza" type="{http://www.tesoro.it/fatture}listaPianoComunicazioneScadenzaTipo" minOccurs="0"/>
 *         &lt;element name="datiDocumento" type="{http://www.tesoro.it/fatture}dettaglioDocumentoTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioFatturaTipo", propOrder = {
    "datiFornitore",
    "datiCessionario",
    "datiAmministrazione",
    "datiDistintaTrasmissione",
    "flagFatturaCertificata",
    "listaCertificazione",
    "importoTotaleComunicazioniScadenze",
    "listaComunicazioneScadenza",
    "datiDocumento"
})
public class DettaglioFatturaTipo {

    protected DatiFornitoreTipo datiFornitore;
    protected DatiCessionarioTipo datiCessionario;
    protected DatiAmministrazioneTipo datiAmministrazione;
    protected DatiDistintaTrasmissioneTipo datiDistintaTrasmissione;
    protected FlagSiNoTipo flagFatturaCertificata;
    protected ListaCertificazioneTipo listaCertificazione;
    protected BigDecimal importoTotaleComunicazioniScadenze;
    protected ListaPianoComunicazioneScadenzaTipo listaComunicazioneScadenza;
    @XmlElement(required = true)
    protected DettaglioDocumentoTipo datiDocumento;

    /**
     * Gets the value of the datiFornitore property.
     * 
     * @return
     *     possible object is
     *     {@link DatiFornitoreTipo }
     *     
     */
    public DatiFornitoreTipo getDatiFornitore() {
        return datiFornitore;
    }

    /**
     * Sets the value of the datiFornitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiFornitoreTipo }
     *     
     */
    public void setDatiFornitore(DatiFornitoreTipo value) {
        this.datiFornitore = value;
    }

    /**
     * Gets the value of the datiCessionario property.
     * 
     * @return
     *     possible object is
     *     {@link DatiCessionarioTipo }
     *     
     */
    public DatiCessionarioTipo getDatiCessionario() {
        return datiCessionario;
    }

    /**
     * Sets the value of the datiCessionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiCessionarioTipo }
     *     
     */
    public void setDatiCessionario(DatiCessionarioTipo value) {
        this.datiCessionario = value;
    }

    /**
     * Gets the value of the datiAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAmministrazioneTipo }
     *     
     */
    public DatiAmministrazioneTipo getDatiAmministrazione() {
        return datiAmministrazione;
    }

    /**
     * Sets the value of the datiAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAmministrazioneTipo }
     *     
     */
    public void setDatiAmministrazione(DatiAmministrazioneTipo value) {
        this.datiAmministrazione = value;
    }

    /**
     * Gets the value of the datiDistintaTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiDistintaTrasmissioneTipo }
     *     
     */
    public DatiDistintaTrasmissioneTipo getDatiDistintaTrasmissione() {
        return datiDistintaTrasmissione;
    }

    /**
     * Sets the value of the datiDistintaTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiDistintaTrasmissioneTipo }
     *     
     */
    public void setDatiDistintaTrasmissione(DatiDistintaTrasmissioneTipo value) {
        this.datiDistintaTrasmissione = value;
    }

    /**
     * Gets the value of the flagFatturaCertificata property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public FlagSiNoTipo getFlagFatturaCertificata() {
        return flagFatturaCertificata;
    }

    /**
     * Sets the value of the flagFatturaCertificata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public void setFlagFatturaCertificata(FlagSiNoTipo value) {
        this.flagFatturaCertificata = value;
    }

    /**
     * Gets the value of the listaCertificazione property.
     * 
     * @return
     *     possible object is
     *     {@link ListaCertificazioneTipo }
     *     
     */
    public ListaCertificazioneTipo getListaCertificazione() {
        return listaCertificazione;
    }

    /**
     * Sets the value of the listaCertificazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCertificazioneTipo }
     *     
     */
    public void setListaCertificazione(ListaCertificazioneTipo value) {
        this.listaCertificazione = value;
    }

    /**
     * Gets the value of the importoTotaleComunicazioniScadenze property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoTotaleComunicazioniScadenze() {
        return importoTotaleComunicazioniScadenze;
    }

    /**
     * Sets the value of the importoTotaleComunicazioniScadenze property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoTotaleComunicazioniScadenze(BigDecimal value) {
        this.importoTotaleComunicazioniScadenze = value;
    }

    /**
     * Gets the value of the listaComunicazioneScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link ListaPianoComunicazioneScadenzaTipo }
     *     
     */
    public ListaPianoComunicazioneScadenzaTipo getListaComunicazioneScadenza() {
        return listaComunicazioneScadenza;
    }

    /**
     * Sets the value of the listaComunicazioneScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPianoComunicazioneScadenzaTipo }
     *     
     */
    public void setListaComunicazioneScadenza(ListaPianoComunicazioneScadenzaTipo value) {
        this.listaComunicazioneScadenza = value;
    }

    /**
     * Gets the value of the datiDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link DettaglioDocumentoTipo }
     *     
     */
    public DettaglioDocumentoTipo getDatiDocumento() {
        return datiDocumento;
    }

    /**
     * Sets the value of the datiDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DettaglioDocumentoTipo }
     *     
     */
    public void setDatiDocumento(DettaglioDocumentoTipo value) {
        this.datiDocumento = value;
    }

}
