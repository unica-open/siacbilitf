/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for datiRichiestaElencoMovimentiErarioReadTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiRichiestaElencoMovimentiErarioReadTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificativoPCCUfficio" type="{http://www.tesoro.it/fatture}maxLenghtString35Type" minOccurs="0"/>
 *         &lt;element name="intervalloDate" type="{http://www.tesoro.it/fatture}intervalloDateMovErarioIvaTipo" minOccurs="0"/>
 *         &lt;element name="numeroPagina" type="{http://www.tesoro.it/fatture}numericalDigit9Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiRichiestaElencoMovimentiErarioReadTipo", propOrder = {
    "identificativoPCCUfficio",
    "intervalloDate",
    "numeroPagina"
})
public class DatiRichiestaElencoMovimentiErarioReadTipo {

    @XmlElement(name = "IdentificativoPCCUfficio")
    protected String identificativoPCCUfficio;
    protected IntervalloDateMovErarioIvaTipo intervalloDate;
    protected Long numeroPagina;

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
     * Gets the value of the intervalloDate property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalloDateMovErarioIvaTipo }
     *     
     */
    public IntervalloDateMovErarioIvaTipo getIntervalloDate() {
        return intervalloDate;
    }

    /**
     * Sets the value of the intervalloDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalloDateMovErarioIvaTipo }
     *     
     */
    public void setIntervalloDate(IntervalloDateMovErarioIvaTipo value) {
        this.intervalloDate = value;
    }

    /**
     * Gets the value of the numeroPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroPagina() {
        return numeroPagina;
    }

    /**
     * Sets the value of the numeroPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroPagina(Long value) {
        this.numeroPagina = value;
    }

}
