/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for riepilogoAliquoteTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="riepilogoAliquoteTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliquotaIVA" type="{http://www.tesoro.it/fatture}aliquotaIVAType" minOccurs="0"/>
 *         &lt;element name="codiceEsenzioneIVA" type="{http://www.tesoro.it/fatture}codiceEsenzioneIVATipo" minOccurs="0"/>
 *         &lt;element name="totaleImponibileAliquota" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="totaleImpostaAliquota" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "riepilogoAliquoteTipo", propOrder = {
    "aliquotaIVA",
    "codiceEsenzioneIVA",
    "totaleImponibileAliquota",
    "totaleImpostaAliquota"
})
public class RiepilogoAliquoteTipo {

    protected BigDecimal aliquotaIVA;
    protected CodiceEsenzioneIVATipo codiceEsenzioneIVA;
    protected BigDecimal totaleImponibileAliquota;
    protected BigDecimal totaleImpostaAliquota;

    /**
     * Gets the value of the aliquotaIVA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquotaIVA() {
        return aliquotaIVA;
    }

    /**
     * Sets the value of the aliquotaIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquotaIVA(BigDecimal value) {
        this.aliquotaIVA = value;
    }

    /**
     * Gets the value of the codiceEsenzioneIVA property.
     * 
     * @return
     *     possible object is
     *     {@link CodiceEsenzioneIVATipo }
     *     
     */
    public CodiceEsenzioneIVATipo getCodiceEsenzioneIVA() {
        return codiceEsenzioneIVA;
    }

    /**
     * Sets the value of the codiceEsenzioneIVA property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodiceEsenzioneIVATipo }
     *     
     */
    public void setCodiceEsenzioneIVA(CodiceEsenzioneIVATipo value) {
        this.codiceEsenzioneIVA = value;
    }

    /**
     * Gets the value of the totaleImponibileAliquota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleImponibileAliquota() {
        return totaleImponibileAliquota;
    }

    /**
     * Sets the value of the totaleImponibileAliquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleImponibileAliquota(BigDecimal value) {
        this.totaleImponibileAliquota = value;
    }

    /**
     * Gets the value of the totaleImpostaAliquota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleImpostaAliquota() {
        return totaleImpostaAliquota;
    }

    /**
     * Sets the value of the totaleImpostaAliquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleImpostaAliquota(BigDecimal value) {
        this.totaleImpostaAliquota = value;
    }

}
