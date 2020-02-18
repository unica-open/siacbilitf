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
 * <p>Java class for rifiutoFatturaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rifiutoFatturaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataRifiuto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="descrizioneRifiuto" type="{http://www.tesoro.it/fatture}maxLenghtString100Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rifiutoFatturaTipo", propOrder = {
    "dataRifiuto",
    "descrizioneRifiuto"
})
public class RifiutoFatturaTipo {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataRifiuto;
    @XmlElement(required = true)
    protected String descrizioneRifiuto;

    /**
     * Gets the value of the dataRifiuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataRifiuto() {
        return dataRifiuto;
    }

    /**
     * Sets the value of the dataRifiuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataRifiuto(Calendar value) {
        this.dataRifiuto = value;
    }

    /**
     * Gets the value of the descrizioneRifiuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneRifiuto() {
        return descrizioneRifiuto;
    }

    /**
     * Sets the value of the descrizioneRifiuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneRifiuto(String value) {
        this.descrizioneRifiuto = value;
    }

}
