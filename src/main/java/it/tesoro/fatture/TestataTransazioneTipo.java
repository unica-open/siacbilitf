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
 * <p>Java class for testataTransazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testataTransazioneTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}testataBaseTipo">
 *       &lt;sequence>
 *         &lt;element name="identificativoPCCAmministrazione" type="{http://www.tesoro.it/fatture}numericalDigit9Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testataTransazioneTipo", propOrder = {
    "identificativoPCCAmministrazione"
})
@XmlSeeAlso({
    TestataAsyncTipo.class
})
public class TestataTransazioneTipo
    extends TestataBaseTipo
{

    protected Long identificativoPCCAmministrazione;

    /**
     * Gets the value of the identificativoPCCAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdentificativoPCCAmministrazione() {
        return identificativoPCCAmministrazione;
    }

    /**
     * Sets the value of the identificativoPCCAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdentificativoPCCAmministrazione(Long value) {
        this.identificativoPCCAmministrazione = value;
    }

}
