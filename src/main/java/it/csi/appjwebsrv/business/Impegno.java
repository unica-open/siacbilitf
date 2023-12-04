/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.appjwebsrv.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impegno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impegno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annoImpegno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="importoQuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="numeroImpegno" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroPrenotazione" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impegno", propOrder = {
    "annoImpegno",
    "importoQuota",
    "numeroImpegno",
    "numeroPrenotazione"
})
public class Impegno {

    protected String annoImpegno;
    protected BigDecimal importoQuota;
    protected Integer numeroImpegno;
    protected Integer numeroPrenotazione;

    /**
     * Gets the value of the annoImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnoImpegno() {
        return annoImpegno;
    }

    /**
     * Sets the value of the annoImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnoImpegno(String value) {
        this.annoImpegno = value;
    }

    /**
     * Gets the value of the importoQuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoQuota() {
        return importoQuota;
    }

    /**
     * Sets the value of the importoQuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoQuota(BigDecimal value) {
        this.importoQuota = value;
    }

    /**
     * Gets the value of the numeroImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroImpegno() {
        return numeroImpegno;
    }

    /**
     * Sets the value of the numeroImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroImpegno(Integer value) {
        this.numeroImpegno = value;
    }

    /**
     * Gets the value of the numeroPrenotazione property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPrenotazione() {
        return numeroPrenotazione;
    }

    /**
     * Sets the value of the numeroPrenotazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPrenotazione(Integer value) {
        this.numeroPrenotazione = value;
    }

}
