/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.bilanciotofel.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestataInvioFatturaAttiva" type="{http://www.csi.it/fel/eis/bilancioToFel/types}TestataInvioFatturaAttivaType" form="qualified"/>
 *         &lt;element name="Fattura" type="{http://www.w3.org/2001/XMLSchema}base64Binary" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "testataInvioFatturaAttiva",
    "fattura"
})
@XmlRootElement(name = "InvioFatturaAttivaRequest")
public class InvioFatturaAttivaRequest {

    @XmlElement(name = "TestataInvioFatturaAttiva", required = true)
    protected TestataInvioFatturaAttivaType testataInvioFatturaAttiva;
    @XmlElement(name = "Fattura", required = true)
    @XmlMimeType("application/xop+xml")
    //protected Source fattura;
    protected String fattura;
    
    /**
     * Gets the value of the testataInvioFatturaAttiva property.
     * 
     * @return
     *     possible object is
     *     {@link TestataInvioFatturaAttivaType }
     *     
     */
    public TestataInvioFatturaAttivaType getTestataInvioFatturaAttiva() {
        return testataInvioFatturaAttiva;
    }

    /**
     * Sets the value of the testataInvioFatturaAttiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataInvioFatturaAttivaType }
     *     
     */
    public void setTestataInvioFatturaAttiva(TestataInvioFatturaAttivaType value) {
        this.testataInvioFatturaAttiva = value;
    }

	public String getFattura() {
		return fattura;
	}

	public void setFattura(String fattura) {
		this.fattura = fattura;
	}

    /**
     * Gets the value of the fattura property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    /*public Source getFattura() {
        return fattura;
    }*/

    /**
     * Sets the value of the fattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    /*public void setFattura(Source value) {
        this.fattura = value;
    }*/

    
    
}
