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
 * <p>Java class for identificativoTransazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificativoTransazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificativoTransazionePA" type="{http://www.tesoro.it/fatture}maxLenghtString50Type"/>
 *         &lt;element name="identificativoPCCAmministrazione" type="{http://www.tesoro.it/fatture}numericalDigit9Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificativoTransazioneTipo", propOrder = {
    "identificativoTransazionePA",
    "identificativoPCCAmministrazione"
})
public class IdentificativoTransazioneTipo {

    @XmlElement(required = true)
    protected String identificativoTransazionePA;
    protected long identificativoPCCAmministrazione;

    /**
     * Gets the value of the identificativoTransazionePA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoTransazionePA() {
        return identificativoTransazionePA;
    }

    /**
     * Sets the value of the identificativoTransazionePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoTransazionePA(String value) {
        this.identificativoTransazionePA = value;
    }

    /**
     * Gets the value of the identificativoPCCAmministrazione property.
     * 
     */
    public long getIdentificativoPCCAmministrazione() {
        return identificativoPCCAmministrazione;
    }

    /**
     * Sets the value of the identificativoPCCAmministrazione property.
     * 
     */
    public void setIdentificativoPCCAmministrazione(long value) {
        this.identificativoPCCAmministrazione = value;
    }

}
