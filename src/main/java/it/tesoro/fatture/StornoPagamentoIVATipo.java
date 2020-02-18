/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stornoPagamentoIVATipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stornoPagamentoIVATipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoPagamentoIVA" type="{http://www.tesoro.it/fatture}numericalDigit9Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stornoPagamentoIVATipo", propOrder = {
    "identificativoPagamentoIVA"
})
public class StornoPagamentoIVATipo {

    protected long identificativoPagamentoIVA;

    /**
     * Gets the value of the identificativoPagamentoIVA property.
     * 
     */
    public long getIdentificativoPagamentoIVA() {
        return identificativoPagamentoIVA;
    }

    /**
     * Sets the value of the identificativoPagamentoIVA property.
     * 
     */
    public void setIdentificativoPagamentoIVA(long value) {
        this.identificativoPagamentoIVA = value;
    }

}
