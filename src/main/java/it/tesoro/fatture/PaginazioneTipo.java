/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paginazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paginazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paginaCorrente" type="{http://www.tesoro.it/fatture}numericalDigit9Type"/>
 *         &lt;element name="numeroPagine" type="{http://www.tesoro.it/fatture}numericalDigit9Type"/>
 *         &lt;element name="numeroTotaleElementi" type="{http://www.tesoro.it/fatture}numericalDigit9Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paginazioneTipo", propOrder = {
    "paginaCorrente",
    "numeroPagine",
    "numeroTotaleElementi"
})
public class PaginazioneTipo {

    protected long paginaCorrente;
    protected long numeroPagine;
    protected long numeroTotaleElementi;

    /**
     * Gets the value of the paginaCorrente property.
     * 
     */
    public long getPaginaCorrente() {
        return paginaCorrente;
    }

    /**
     * Sets the value of the paginaCorrente property.
     * 
     */
    public void setPaginaCorrente(long value) {
        this.paginaCorrente = value;
    }

    /**
     * Gets the value of the numeroPagine property.
     * 
     */
    public long getNumeroPagine() {
        return numeroPagine;
    }

    /**
     * Sets the value of the numeroPagine property.
     * 
     */
    public void setNumeroPagine(long value) {
        this.numeroPagine = value;
    }

    /**
     * Gets the value of the numeroTotaleElementi property.
     * 
     */
    public long getNumeroTotaleElementi() {
        return numeroTotaleElementi;
    }

    /**
     * Sets the value of the numeroTotaleElementi property.
     * 
     */
    public void setNumeroTotaleElementi(long value) {
        this.numeroTotaleElementi = value;
    }

}
