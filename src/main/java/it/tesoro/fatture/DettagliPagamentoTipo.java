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
 * <p>Java class for dettagliPagamentoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dettagliPagamentoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importo" type="{http://www.tesoro.it/fatture}importoType"/>
 *         &lt;element name="capitoliSpesa" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="estremiImpegno" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="noteAggiuntive" type="{http://www.tesoro.it/fatture}maxLenghtString4000Type" minOccurs="0"/>
 *         &lt;element name="documentoAllegato" type="{http://www.tesoro.it/fatture}allegato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettagliPagamentoTipo", propOrder = {
    "importo",
    "capitoliSpesa",
    "estremiImpegno",
    "noteAggiuntive",
    "documentoAllegato"
})
public class DettagliPagamentoTipo {

    @XmlElement(required = true)
    protected BigDecimal importo;
    protected String capitoliSpesa;
    protected String estremiImpegno;
    protected String noteAggiuntive;
    protected Allegato documentoAllegato;

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
     * Gets the value of the capitoliSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitoliSpesa() {
        return capitoliSpesa;
    }

    /**
     * Sets the value of the capitoliSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitoliSpesa(String value) {
        this.capitoliSpesa = value;
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
     * Gets the value of the documentoAllegato property.
     * 
     * @return
     *     possible object is
     *     {@link Allegato }
     *     
     */
    public Allegato getDocumentoAllegato() {
        return documentoAllegato;
    }

    /**
     * Sets the value of the documentoAllegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Allegato }
     *     
     */
    public void setDocumentoAllegato(Allegato value) {
        this.documentoAllegato = value;
    }

}
