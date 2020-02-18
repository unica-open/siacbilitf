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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for testataBaseTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testataBaseTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codiceFiscaleTrasmittente" type="{http://www.tesoro.it/fatture}codiceFiscaleTrasmittenteTipo" minOccurs="0"/>
 *         &lt;element name="timestampTrasmissione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="versioneApplicativa" type="{http://www.tesoro.it/fatture}maxLenghtString5Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testataBaseTipo", propOrder = {
    "codiceFiscaleTrasmittente",
    "timestampTrasmissione",
    "versioneApplicativa"
})
@XmlSeeAlso({
    TestataTransazioneTipo.class
})
public class TestataBaseTipo {

    protected String codiceFiscaleTrasmittente;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar timestampTrasmissione;
    protected String versioneApplicativa;

    /**
     * Gets the value of the codiceFiscaleTrasmittente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleTrasmittente() {
        return codiceFiscaleTrasmittente;
    }

    /**
     * Sets the value of the codiceFiscaleTrasmittente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleTrasmittente(String value) {
        this.codiceFiscaleTrasmittente = value;
    }

    /**
     * Gets the value of the timestampTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTimestampTrasmissione() {
        return timestampTrasmissione;
    }

    /**
     * Sets the value of the timestampTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampTrasmissione(Calendar value) {
        this.timestampTrasmissione = value;
    }

    /**
     * Gets the value of the versioneApplicativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersioneApplicativa() {
        return versioneApplicativa;
    }

    /**
     * Sets the value of the versioneApplicativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersioneApplicativa(String value) {
        this.versioneApplicativa = value;
    }

}
