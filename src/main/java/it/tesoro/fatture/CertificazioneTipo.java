/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for certificazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroIstanza" type="{http://www.tesoro.it/fatture}maxLenghtString20Type" minOccurs="0"/>
 *         &lt;element name="numeroCertificazione" type="{http://www.tesoro.it/fatture}maxLenghtString20Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificazioneTipo", propOrder = {
    "numeroIstanza",
    "numeroCertificazione"
})
public class CertificazioneTipo {

    protected String numeroIstanza;
    protected String numeroCertificazione;

    /**
     * Gets the value of the numeroIstanza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroIstanza() {
        return numeroIstanza;
    }

    /**
     * Sets the value of the numeroIstanza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroIstanza(String value) {
        this.numeroIstanza = value;
    }

    /**
     * Gets the value of the numeroCertificazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCertificazione() {
        return numeroCertificazione;
    }

    /**
     * Sets the value of the numeroCertificazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCertificazione(String value) {
        this.numeroCertificazione = value;
    }

}
