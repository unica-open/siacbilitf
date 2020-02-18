/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.appjwebsrv.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificaEvasione complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificaEvasione">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evasioni" type="{http://business.appjwebsrv.csi.it/}evasioni" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaEvasione", propOrder = {
    "evasioni"
})
public class VerificaEvasione {

    protected Evasioni evasioni;

    /**
     * Gets the value of the evasioni property.
     * 
     * @return
     *     possible object is
     *     {@link Evasioni }
     *     
     */
    public Evasioni getEvasioni() {
        return evasioni;
    }

    /**
     * Sets the value of the evasioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Evasioni }
     *     
     */
    public void setEvasioni(Evasioni value) {
        this.evasioni = value;
    }

}
