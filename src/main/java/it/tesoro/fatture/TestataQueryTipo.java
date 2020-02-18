/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testataQueryTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testataQueryTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}testataAsyncTipo">
 *       &lt;sequence>
 *         &lt;element name="identificativoTransazionePCC" type="{http://www.tesoro.it/fatture}maxLenghtString35Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testataQueryTipo", propOrder = {
    "identificativoTransazionePCC"
})
public class TestataQueryTipo
    extends TestataAsyncTipo
{

    protected String identificativoTransazionePCC;

    /**
     * Gets the value of the identificativoTransazionePCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoTransazionePCC() {
        return identificativoTransazionePCC;
    }

    /**
     * Sets the value of the identificativoTransazionePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoTransazionePCC(String value) {
        this.identificativoTransazionePCC = value;
    }

}
