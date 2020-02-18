/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for comunicazioneScadenzaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comunicazioneScadenzaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comunicaScadenza" type="{http://www.tesoro.it/fatture}comunicaScadenzaTipo"/>
 *         &lt;element name="importo" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comunicazioneScadenzaTipo", propOrder = {
    "comunicaScadenza",
    "importo",
    "dataScadenza"
})
public class ComunicazioneScadenzaTipo {

    @XmlElement(required = true)
    protected ComunicaScadenzaTipo comunicaScadenza;
    protected BigDecimal importo;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataScadenza;

    /**
     * Gets the value of the comunicaScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link ComunicaScadenzaTipo }
     *     
     */
    public ComunicaScadenzaTipo getComunicaScadenza() {
        return comunicaScadenza;
    }

    /**
     * Sets the value of the comunicaScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunicaScadenzaTipo }
     *     
     */
    public void setComunicaScadenza(ComunicaScadenzaTipo value) {
        this.comunicaScadenza = value;
    }

    /**
     * Gets the value of the importo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporto() {
        return importo;
    }

    /**
     * Sets the value of the importo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporto(BigDecimal value) {
        this.importo = value;
    }

    /**
     * Gets the value of the dataScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataScadenza() {
        return dataScadenza;
    }

    /**
     * Sets the value of the dataScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataScadenza(Calendar value) {
        this.dataScadenza = value;
    }

}
