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
 * <p>Java class for intervalloDateTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="intervalloDateTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inizioDataRichiestaElaborazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fineDataRichiestaElaborazione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "intervalloDateTipo", propOrder = {
    "inizioDataRichiestaElaborazione",
    "fineDataRichiestaElaborazione"
})
public class IntervalloDateTipo {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar inizioDataRichiestaElaborazione;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fineDataRichiestaElaborazione;

    /**
     * Gets the value of the inizioDataRichiestaElaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getInizioDataRichiestaElaborazione() {
        return inizioDataRichiestaElaborazione;
    }

    /**
     * Sets the value of the inizioDataRichiestaElaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInizioDataRichiestaElaborazione(Calendar value) {
        this.inizioDataRichiestaElaborazione = value;
    }

    /**
     * Gets the value of the fineDataRichiestaElaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFineDataRichiestaElaborazione() {
        return fineDataRichiestaElaborazione;
    }

    /**
     * Sets the value of the fineDataRichiestaElaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFineDataRichiestaElaborazione(Calendar value) {
        this.fineDataRichiestaElaborazione = value;
    }

}
