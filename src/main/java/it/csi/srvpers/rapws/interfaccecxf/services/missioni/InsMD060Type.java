/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.srvpers.rapws.interfaccecxf.services.missioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insMD060Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insMD060Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://missioni.services.interfaccecxf.rapws.srvpers.csi.it/}abstractSoapType">
 *       &lt;sequence>
 *         &lt;element name="anno_movimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cassa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cod_voce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_impostazione_stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_missione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_movimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag_totalizzatore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_missione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ita_est" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrososp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="num_movimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="progressivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="quantita" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insMD060Type", propOrder = {
    "annoMovimento",
    "cassa",
    "codVoce",
    "dataImpostazioneStato",
    "dataMissione",
    "dataMovimento",
    "flagTotalizzatore",
    "idMissione",
    "importo",
    "itaEst",
    "note",
    "nrososp",
    "numMovimento",
    "progressivo",
    "quantita",
    "stato"
})
public class InsMD060Type
    extends AbstractSoapType {

    @XmlElement(name = "anno_movimento")
    protected String annoMovimento;
    protected String cassa;
    @XmlElement(name = "cod_voce")
    protected String codVoce;
    @XmlElement(name = "data_impostazione_stato")
    protected String dataImpostazioneStato;
    @XmlElement(name = "data_missione")
    protected String dataMissione;
    @XmlElement(name = "data_movimento")
    protected String dataMovimento;
    @XmlElement(name = "flag_totalizzatore")
    protected String flagTotalizzatore;
    @XmlElement(name = "id_missione")
    protected Integer idMissione;
    protected Float importo;
    @XmlElement(name = "ita_est")
    protected String itaEst;
    protected String note;
    protected Integer nrososp;
    @XmlElement(name = "num_movimento")
    protected Integer numMovimento;
    protected Integer progressivo;
    protected Integer quantita;
    protected String stato;

    /**
     * Gets the value of the annoMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoMovimento() {
        return annoMovimento;
    }

    /**
     * Sets the value of the annoMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoMovimento(String value) {
        this.annoMovimento = value;
    }

    /**
     * Gets the value of the cassa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCassa() {
        return cassa;
    }

    /**
     * Sets the value of the cassa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCassa(String value) {
        this.cassa = value;
    }

    /**
     * Gets the value of the codVoce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodVoce() {
        return codVoce;
    }

    /**
     * Sets the value of the codVoce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodVoce(String value) {
        this.codVoce = value;
    }

    /**
     * Gets the value of the dataImpostazioneStato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataImpostazioneStato() {
        return dataImpostazioneStato;
    }

    /**
     * Sets the value of the dataImpostazioneStato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataImpostazioneStato(String value) {
        this.dataImpostazioneStato = value;
    }

    /**
     * Gets the value of the dataMissione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMissione() {
        return dataMissione;
    }

    /**
     * Sets the value of the dataMissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMissione(String value) {
        this.dataMissione = value;
    }

    /**
     * Gets the value of the dataMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataMovimento() {
        return dataMovimento;
    }

    /**
     * Sets the value of the dataMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMovimento(String value) {
        this.dataMovimento = value;
    }

    /**
     * Gets the value of the flagTotalizzatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagTotalizzatore() {
        return flagTotalizzatore;
    }

    /**
     * Sets the value of the flagTotalizzatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagTotalizzatore(String value) {
        this.flagTotalizzatore = value;
    }

    /**
     * Gets the value of the idMissione property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMissione() {
        return idMissione;
    }

    /**
     * Sets the value of the idMissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMissione(Integer value) {
        this.idMissione = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImporto(Float value) {
        this.importo = value;
    }

    /**
     * Gets the value of the itaEst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItaEst() {
        return itaEst;
    }

    /**
     * Sets the value of the itaEst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItaEst(String value) {
        this.itaEst = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the nrososp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNrososp() {
        return nrososp;
    }

    /**
     * Sets the value of the nrososp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNrososp(Integer value) {
        this.nrososp = value;
    }

    /**
     * Gets the value of the numMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumMovimento() {
        return numMovimento;
    }

    /**
     * Sets the value of the numMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumMovimento(Integer value) {
        this.numMovimento = value;
    }

    /**
     * Gets the value of the progressivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressivo() {
        return progressivo;
    }

    /**
     * Sets the value of the progressivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressivo(Integer value) {
        this.progressivo = value;
    }

    /**
     * Gets the value of the quantita property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantita() {
        return quantita;
    }

    /**
     * Sets the value of the quantita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantita(Integer value) {
        this.quantita = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStato(String value) {
        this.stato = value;
    }

}
