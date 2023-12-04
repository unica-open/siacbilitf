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
 * <p>Java class for pagamentoStornoIvaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagamentoStornoIvaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoMovimentoIva" type="{http://www.tesoro.it/fatture}numericalDigit9Type" minOccurs="0"/>
 *         &lt;element name="tipoMovimento" type="{http://www.tesoro.it/fatture}tipologiaMovimentoErarioTipo" minOccurs="0"/>
 *         &lt;element name="identificativoPCCUfficio" type="{http://www.tesoro.it/fatture}maxLenghtString35Type" minOccurs="0"/>
 *         &lt;element name="descrizioneUfficio" type="{http://www.tesoro.it/fatture}maxLenghtString1024Type" minOccurs="0"/>
 *         &lt;element name="dataMandato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataRegistrazione" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="mumeroMandato" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="importo" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="capitoloSpesa" type="{http://www.tesoro.it/fatture}maxLenghtString30Type" minOccurs="0"/>
 *         &lt;element name="estremiImpegno" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="noteAggiuntive" type="{http://www.tesoro.it/fatture}maxLenghtString4000Type" minOccurs="0"/>
 *         &lt;element name="identificativoAllegato" type="{http://www.tesoro.it/fatture}numericalDigit9Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagamentoStornoIvaTipo", propOrder = {
    "identificativoMovimentoIva",
    "tipoMovimento",
    "identificativoPCCUfficio",
    "descrizioneUfficio",
    "dataMandato",
    "dataRegistrazione",
    "mumeroMandato",
    "importo",
    "capitoloSpesa",
    "estremiImpegno",
    "noteAggiuntive",
    "identificativoAllegato"
})
public class PagamentoStornoIvaTipo {

    protected Long identificativoMovimentoIva;
    protected TipologiaMovimentoErarioTipo tipoMovimento;
    protected String identificativoPCCUfficio;
    protected String descrizioneUfficio;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataMandato;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataRegistrazione;
    protected String mumeroMandato;
    protected BigDecimal importo;
    protected String capitoloSpesa;
    protected String estremiImpegno;
    protected String noteAggiuntive;
    protected Long identificativoAllegato;

    /**
     * Gets the value of the identificativoMovimentoIva property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificativoMovimentoIva() {
        return identificativoMovimentoIva;
    }

    /**
     * Sets the value of the identificativoMovimentoIva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificativoMovimentoIva(Long value) {
        this.identificativoMovimentoIva = value;
    }

    /**
     * Gets the value of the tipoMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link TipologiaMovimentoErarioTipo }
     *     
     */
    public TipologiaMovimentoErarioTipo getTipoMovimento() {
        return tipoMovimento;
    }

    /**
     * Sets the value of the tipoMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipologiaMovimentoErarioTipo }
     *     
     */
    public void setTipoMovimento(TipologiaMovimentoErarioTipo value) {
        this.tipoMovimento = value;
    }

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
     * Gets the value of the descrizioneUfficio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneUfficio() {
        return descrizioneUfficio;
    }

    /**
     * Sets the value of the descrizioneUfficio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneUfficio(String value) {
        this.descrizioneUfficio = value;
    }

    /**
     * Gets the value of the dataMandato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataMandato() {
        return dataMandato;
    }

    /**
     * Sets the value of the dataMandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataMandato(Calendar value) {
        this.dataMandato = value;
    }

    /**
     * Gets the value of the dataRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataRegistrazione() {
        return dataRegistrazione;
    }

    /**
     * Sets the value of the dataRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRegistrazione(Calendar value) {
        this.dataRegistrazione = value;
    }

    /**
     * Gets the value of the mumeroMandato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMumeroMandato() {
        return mumeroMandato;
    }

    /**
     * Sets the value of the mumeroMandato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMumeroMandato(String value) {
        this.mumeroMandato = value;
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
     * Gets the value of the capitoloSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitoloSpesa() {
        return capitoloSpesa;
    }

    /**
     * Sets the value of the capitoloSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitoloSpesa(String value) {
        this.capitoloSpesa = value;
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
     * Gets the value of the noteAggiuntive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteAggiuntive() {
        return noteAggiuntive;
    }

    /**
     * Sets the value of the noteAggiuntive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteAggiuntive(String value) {
        this.noteAggiuntive = value;
    }

    /**
     * Gets the value of the identificativoAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificativoAllegato() {
        return identificativoAllegato;
    }

    /**
     * Sets the value of the identificativoAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificativoAllegato(Long value) {
        this.identificativoAllegato = value;
    }

}
