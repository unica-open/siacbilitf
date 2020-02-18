/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for dettaglioDocumentoReadTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dettaglioDocumentoReadTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statoDocumento" type="{http://www.tesoro.it/fatture}statoDocumentoTipo" minOccurs="0"/>
 *         &lt;element name="IdFiscaleIVA" type="{http://www.tesoro.it/fatture}idFiscaleIvaTipo"/>
 *         &lt;element name="progressivoRegistrazione" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="numeroProtocollo" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="dataRicezione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="tipoDocumento" type="{http://www.tesoro.it/fatture}tipoDocumentoTipo" minOccurs="0"/>
 *         &lt;element name="dataEmissione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.tesoro.it/fatture}maxLenghtString20Type" minOccurs="0"/>
 *         &lt;element name="descrizioneCausale" type="{http://www.tesoro.it/fatture}maxLenghtString200Type" minOccurs="0"/>
 *         &lt;element name="importoTotale" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="importoImponibile" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="totaleImposta" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="splitPayment" type="{http://www.tesoro.it/fatture}flagSiNoTipo" minOccurs="0"/>
 *         &lt;element name="ripartizioneAttuale" type="{http://www.tesoro.it/fatture}ripartizioneAttualeTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioDocumentoReadTipo", propOrder = {
    "statoDocumento",
    "idFiscaleIVA",
    "progressivoRegistrazione",
    "numeroProtocollo",
    "dataRicezione",
    "tipoDocumento",
    "dataEmissione",
    "numeroDocumento",
    "descrizioneCausale",
    "importoTotale",
    "importoImponibile",
    "totaleImposta",
    "splitPayment",
    "ripartizioneAttuale"
})
public class DettaglioDocumentoReadTipo {

    protected StatoDocumentoTipo statoDocumento;
    @XmlElement(name = "IdFiscaleIVA", required = true)
    protected String idFiscaleIVA;
    protected String progressivoRegistrazione;
    protected String numeroProtocollo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataRicezione;
    protected TipoDocumentoTipo tipoDocumento;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataEmissione;
    protected String numeroDocumento;
    protected String descrizioneCausale;
    protected BigDecimal importoTotale;
    protected BigDecimal importoImponibile;
    protected BigDecimal totaleImposta;
    protected FlagSiNoTipo splitPayment;
    @XmlElement(required = true)
    protected RipartizioneAttualeTipo ripartizioneAttuale;

    /**
     * Gets the value of the statoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link StatoDocumentoTipo }
     *     
     */
    public StatoDocumentoTipo getStatoDocumento() {
        return statoDocumento;
    }

    /**
     * Sets the value of the statoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoDocumentoTipo }
     *     
     */
    public void setStatoDocumento(StatoDocumentoTipo value) {
        this.statoDocumento = value;
    }

    /**
     * Gets the value of the idFiscaleIVA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscaleIVA() {
        return idFiscaleIVA;
    }

    /**
     * Sets the value of the idFiscaleIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscaleIVA(String value) {
        this.idFiscaleIVA = value;
    }

    /**
     * Gets the value of the progressivoRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgressivoRegistrazione() {
        return progressivoRegistrazione;
    }

    /**
     * Sets the value of the progressivoRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgressivoRegistrazione(String value) {
        this.progressivoRegistrazione = value;
    }

    /**
     * Gets the value of the numeroProtocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocollo() {
        return numeroProtocollo;
    }

    /**
     * Sets the value of the numeroProtocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocollo(String value) {
        this.numeroProtocollo = value;
    }

    /**
     * Gets the value of the dataRicezione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataRicezione() {
        return dataRicezione;
    }

    /**
     * Sets the value of the dataRicezione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRicezione(Calendar value) {
        this.dataRicezione = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoTipo }
     *     
     */
    public TipoDocumentoTipo getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoTipo }
     *     
     */
    public void setTipoDocumento(TipoDocumentoTipo value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the dataEmissione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Sets the value of the dataEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissione(Calendar value) {
        this.dataEmissione = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the descrizioneCausale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneCausale() {
        return descrizioneCausale;
    }

    /**
     * Sets the value of the descrizioneCausale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneCausale(String value) {
        this.descrizioneCausale = value;
    }

    /**
     * Gets the value of the importoTotale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoTotale() {
        return importoTotale;
    }

    /**
     * Sets the value of the importoTotale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoTotale(BigDecimal value) {
        this.importoTotale = value;
    }

    /**
     * Gets the value of the importoImponibile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoImponibile() {
        return importoImponibile;
    }

    /**
     * Sets the value of the importoImponibile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoImponibile(BigDecimal value) {
        this.importoImponibile = value;
    }

    /**
     * Gets the value of the totaleImposta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleImposta() {
        return totaleImposta;
    }

    /**
     * Sets the value of the totaleImposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleImposta(BigDecimal value) {
        this.totaleImposta = value;
    }

    /**
     * Gets the value of the splitPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public FlagSiNoTipo getSplitPayment() {
        return splitPayment;
    }

    /**
     * Sets the value of the splitPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public void setSplitPayment(FlagSiNoTipo value) {
        this.splitPayment = value;
    }

    /**
     * Gets the value of the ripartizioneAttuale property.
     * 
     * @return
     *     possible object is
     *     {@link RipartizioneAttualeTipo }
     *     
     */
    public RipartizioneAttualeTipo getRipartizioneAttuale() {
        return ripartizioneAttuale;
    }

    /**
     * Sets the value of the ripartizioneAttuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link RipartizioneAttualeTipo }
     *     
     */
    public void setRipartizioneAttuale(RipartizioneAttualeTipo value) {
        this.ripartizioneAttuale = value;
    }

}
