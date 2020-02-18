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
 * <p>Java class for dettaglioMovimentoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dettaglioMovimentoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataMovimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="statoDebito" type="{http://www.tesoro.it/fatture}maxLenghtString20Type" minOccurs="0"/>
 *         &lt;element name="causale" type="{http://www.tesoro.it/fatture}maxLenghtString255Type" minOccurs="0"/>
 *         &lt;element name="importoNaturaCorrente" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="importoContoCapitale" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="capitoloPgConto" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="estremiImpegno" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="codiceCIG" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="codiceCUP" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="descrizioneContabilizzazione" type="{http://www.tesoro.it/fatture}maxLenghtString1024Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioMovimentoTipo", propOrder = {
    "dataMovimento",
    "importo",
    "statoDebito",
    "causale",
    "importoNaturaCorrente",
    "importoContoCapitale",
    "capitoloPgConto",
    "estremiImpegno",
    "codiceCIG",
    "codiceCUP",
    "descrizioneContabilizzazione"
})
public class DettaglioMovimentoTipo {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataMovimento;
    protected BigDecimal importo;
    protected String statoDebito;
    protected String causale;
    protected BigDecimal importoNaturaCorrente;
    protected BigDecimal importoContoCapitale;
    protected String capitoloPgConto;
    protected String estremiImpegno;
    protected String codiceCIG;
    protected String codiceCUP;
    protected String descrizioneContabilizzazione;

    /**
     * Gets the value of the dataMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataMovimento() {
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
    public void setDataMovimento(Calendar value) {
        this.dataMovimento = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporto(BigDecimal value) {
        this.importo = value;
    }

    /**
     * Gets the value of the statoDebito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatoDebito() {
        return statoDebito;
    }

    /**
     * Sets the value of the statoDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatoDebito(String value) {
        this.statoDebito = value;
    }

    /**
     * Gets the value of the causale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausale() {
        return causale;
    }

    /**
     * Sets the value of the causale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausale(String value) {
        this.causale = value;
    }

    /**
     * Gets the value of the importoNaturaCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoNaturaCorrente() {
        return importoNaturaCorrente;
    }

    /**
     * Sets the value of the importoNaturaCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoNaturaCorrente(BigDecimal value) {
        this.importoNaturaCorrente = value;
    }

    /**
     * Gets the value of the importoContoCapitale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoContoCapitale() {
        return importoContoCapitale;
    }

    /**
     * Sets the value of the importoContoCapitale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoContoCapitale(BigDecimal value) {
        this.importoContoCapitale = value;
    }

    /**
     * Gets the value of the capitoloPgConto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitoloPgConto() {
        return capitoloPgConto;
    }

    /**
     * Sets the value of the capitoloPgConto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitoloPgConto(String value) {
        this.capitoloPgConto = value;
    }

    /**
     * Gets the value of the estremiImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstremiImpegno() {
        return estremiImpegno;
    }

    /**
     * Sets the value of the estremiImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstremiImpegno(String value) {
        this.estremiImpegno = value;
    }

    /**
     * Gets the value of the codiceCIG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCIG() {
        return codiceCIG;
    }

    /**
     * Sets the value of the codiceCIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCIG(String value) {
        this.codiceCIG = value;
    }

    /**
     * Gets the value of the codiceCUP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCUP() {
        return codiceCUP;
    }

    /**
     * Sets the value of the codiceCUP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCUP(String value) {
        this.codiceCUP = value;
    }

    /**
     * Gets the value of the descrizioneContabilizzazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneContabilizzazione() {
        return descrizioneContabilizzazione;
    }

    /**
     * Sets the value of the descrizioneContabilizzazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneContabilizzazione(String value) {
        this.descrizioneContabilizzazione = value;
    }

}
