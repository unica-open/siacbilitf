/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testataAsyncTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testataAsyncTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}testataTransazioneTipo">
 *       &lt;sequence>
 *         &lt;element name="identificativoTransazionePA" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testataAsyncTipo", propOrder = {
    "identificativoTransazionePA"
})
@XmlSeeAlso({
    TestataQueryTipo.class
})
public class TestataAsyncTipo
    extends TestataTransazioneTipo
{

    protected String identificativoTransazionePA;

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

}
