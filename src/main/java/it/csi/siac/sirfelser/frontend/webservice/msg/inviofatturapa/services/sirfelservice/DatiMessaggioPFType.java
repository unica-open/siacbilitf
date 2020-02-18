/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatiMessaggioPFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatiMessaggioPFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificativoFEL" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdentificativoSDI" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NomeFileMessaggio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdentificativoFELFattura" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DataMessaggio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatiMessaggioPFType", propOrder = {
    "identificativoFEL",
    "identificativoSDI",
    "nomeFileMessaggio",
    "identificativoFELFattura",
    "dataMessaggio"
})
public class DatiMessaggioPFType {

    @XmlElement(name = "IdentificativoFEL")
    protected long identificativoFEL;
    @XmlElement(name = "IdentificativoSDI")
    protected long identificativoSDI;
    @XmlElement(name = "NomeFileMessaggio", required = true)
    protected String nomeFileMessaggio;
    @XmlElement(name = "IdentificativoFELFattura")
    protected long identificativoFELFattura;
    @XmlElement(name = "DataMessaggio", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataMessaggio;

    /**
     * Gets the value of the identificativoFEL property.
     * 
     */
    public long getIdentificativoFEL() {
        return identificativoFEL;
    }

    /**
     * Sets the value of the identificativoFEL property.
     * 
     */
    public void setIdentificativoFEL(long value) {
        this.identificativoFEL = value;
    }

    /**
     * Gets the value of the identificativoSDI property.
     * 
     */
    public long getIdentificativoSDI() {
        return identificativoSDI;
    }

    /**
     * Sets the value of the identificativoSDI property.
     * 
     */
    public void setIdentificativoSDI(long value) {
        this.identificativoSDI = value;
    }

    /**
     * Gets the value of the nomeFileMessaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileMessaggio() {
        return nomeFileMessaggio;
    }

    /**
     * Sets the value of the nomeFileMessaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileMessaggio(String value) {
        this.nomeFileMessaggio = value;
    }

    /**
     * Gets the value of the identificativoFELFattura property.
     * 
     */
    public long getIdentificativoFELFattura() {
        return identificativoFELFattura;
    }

    /**
     * Sets the value of the identificativoFELFattura property.
     * 
     */
    public void setIdentificativoFELFattura(long value) {
        this.identificativoFELFattura = value;
    }

    /**
     * Gets the value of the dataMessaggio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataMessaggio() {
        return dataMessaggio;
    }

    /**
     * Sets the value of the dataMessaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataMessaggio(XMLGregorianCalendar value) {
        this.dataMessaggio = value;
    }

}
