/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 12:24:13 PM CET 
//


package it.csi.siac.fattura.xml;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatiBolloType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiBolloType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BolloVirtuale" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}BolloVirtualeType"/>
 *         &lt;element name="ImportoBollo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}Amount2DecimalType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiBolloType", propOrder = {
    "bolloVirtuale",
    "importoBollo"
})
public class DatiBolloType {

    @XmlElement(name = "BolloVirtuale", required = true)
    protected BolloVirtualeType bolloVirtuale;
    @XmlElement(name = "ImportoBollo", required = true)
    protected BigDecimal importoBollo;

    /**
     * Gets the value of the bolloVirtuale property.
     * 
     * @return
     *     possible object is
     *     {@link BolloVirtualeType }
     *     
     */
    public BolloVirtualeType getBolloVirtuale() {
        return bolloVirtuale;
    }

    /**
     * Sets the value of the bolloVirtuale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BolloVirtualeType }
     *     
     */
    public void setBolloVirtuale(BolloVirtualeType value) {
        this.bolloVirtuale = value;
    }

    /**
     * Gets the value of the importoBollo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoBollo() {
        return importoBollo;
    }

    /**
     * Sets the value of the importoBollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoBollo(BigDecimal value) {
        this.importoBollo = value;
    }

}