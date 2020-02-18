/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for intervalloDateMovErarioIvaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalloDateMovErarioIvaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inizioDataRicerca" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="fineDataRicerca" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalloDateMovErarioIvaTipo", propOrder = {
    "inizioDataRicerca",
    "fineDataRicerca"
})
public class IntervalloDateMovErarioIvaTipo {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar inizioDataRicerca;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fineDataRicerca;

    /**
     * Gets the value of the inizioDataRicerca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInizioDataRicerca() {
        return inizioDataRicerca;
    }

    /**
     * Sets the value of the inizioDataRicerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInizioDataRicerca(Calendar value) {
        this.inizioDataRicerca = value;
    }

    /**
     * Gets the value of the fineDataRicerca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFineDataRicerca() {
        return fineDataRicerca;
    }

    /**
     * Sets the value of the fineDataRicerca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineDataRicerca(Calendar value) {
        this.fineDataRicerca = value;
    }

}
