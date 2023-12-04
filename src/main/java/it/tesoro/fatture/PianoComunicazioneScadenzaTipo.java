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
 * <p>Java class for pianoComunicazioneScadenzaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pianoComunicazioneScadenzaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataScadenza" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="importoInScadenza" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="importoIniziale" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="pagatoRicontabilizzato" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pianoComunicazioneScadenzaTipo", propOrder = {
    "dataScadenza",
    "importoInScadenza",
    "importoIniziale",
    "pagatoRicontabilizzato"
})
public class PianoComunicazioneScadenzaTipo {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataScadenza;
    protected BigDecimal importoInScadenza;
    protected BigDecimal importoIniziale;
    protected BigDecimal pagatoRicontabilizzato;

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

    /**
     * Gets the value of the importoInScadenza property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoInScadenza() {
        return importoInScadenza;
    }

    /**
     * Sets the value of the importoInScadenza property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoInScadenza(BigDecimal value) {
        this.importoInScadenza = value;
    }

    /**
     * Gets the value of the importoIniziale property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoIniziale() {
        return importoIniziale;
    }

    /**
     * Sets the value of the importoIniziale property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoIniziale(BigDecimal value) {
        this.importoIniziale = value;
    }

    /**
     * Gets the value of the pagatoRicontabilizzato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagatoRicontabilizzato() {
        return pagatoRicontabilizzato;
    }

    /**
     * Sets the value of the pagatoRicontabilizzato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagatoRicontabilizzato(BigDecimal value) {
        this.pagatoRicontabilizzato = value;
    }

}
