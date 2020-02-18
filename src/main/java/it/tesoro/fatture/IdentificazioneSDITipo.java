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
 * <p>Java class for identificazioneSDITipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificazioneSDITipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lottoSDI" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="numeroFattura" type="{http://www.tesoro.it/fatture}maxLenghtString20Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificazioneSDITipo", propOrder = {
    "lottoSDI",
    "numeroFattura"
})
public class IdentificazioneSDITipo {

    @XmlElement(required = true)
    protected BigDecimal lottoSDI;
    @XmlElement(required = true)
    protected String numeroFattura;

    /**
     * Gets the value of the lottoSDI property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLottoSDI() {
        return lottoSDI;
    }

    /**
     * Sets the value of the lottoSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLottoSDI(BigDecimal value) {
        this.lottoSDI = value;
    }

    /**
     * Gets the value of the numeroFattura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFattura() {
        return numeroFattura;
    }

    /**
     * Sets the value of the numeroFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFattura(String value) {
        this.numeroFattura = value;
    }

}
