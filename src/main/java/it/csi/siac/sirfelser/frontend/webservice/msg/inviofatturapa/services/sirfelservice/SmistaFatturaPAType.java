/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmistaFatturaPAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmistaFatturaPAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiPortaleFatture" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}DatiPortaleFattureType"/>
 *         &lt;element name="FatturaPAFile" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="FatturaElettronica" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}EmbeddedXMLType"/>
 *         &lt;element name="ConfigurazioneEnte" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}ConfigurazioneEnteType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmistaFatturaPAType", propOrder = {
    "datiPortaleFatture",
    "fatturaPAFile",
    "fatturaElettronica",
    "configurazioneEnte"
})
public class SmistaFatturaPAType {

    @XmlElement(name = "DatiPortaleFatture", required = true)
    protected DatiPortaleFattureType datiPortaleFatture;
    @XmlElement(name = "FatturaPAFile", required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler fatturaPAFile;
    @XmlElement(name = "FatturaElettronica", required = true)
    protected EmbeddedXMLType fatturaElettronica;
    @XmlElement(name = "ConfigurazioneEnte", required = true)
    protected ConfigurazioneEnteType configurazioneEnte;

    /**
     * Gets the value of the datiPortaleFatture property.
     * 
     * @return
     *     possible object is
     *     {@link DatiPortaleFattureType }
     *     
     */
    public DatiPortaleFattureType getDatiPortaleFatture() {
        return datiPortaleFatture;
    }

    /**
     * Sets the value of the datiPortaleFatture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiPortaleFattureType }
     *     
     */
    public void setDatiPortaleFatture(DatiPortaleFattureType value) {
        this.datiPortaleFatture = value;
    }

    /**
     * Gets the value of the fatturaPAFile property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFatturaPAFile() {
        return fatturaPAFile;
    }

    /**
     * Sets the value of the fatturaPAFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFatturaPAFile(DataHandler value) {
        this.fatturaPAFile = value;
    }

    /**
     * Gets the value of the fatturaElettronica property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedXMLType }
     *     
     */
    public EmbeddedXMLType getFatturaElettronica() {
        return fatturaElettronica;
    }

    /**
     * Sets the value of the fatturaElettronica property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedXMLType }
     *     
     */
    public void setFatturaElettronica(EmbeddedXMLType value) {
        this.fatturaElettronica = value;
    }

    /**
     * Gets the value of the configurazioneEnte property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurazioneEnteType }
     *     
     */
    public ConfigurazioneEnteType getConfigurazioneEnte() {
        return configurazioneEnte;
    }

    /**
     * Sets the value of the configurazioneEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurazioneEnteType }
     *     
     */
    public void setConfigurazioneEnte(ConfigurazioneEnteType value) {
        this.configurazioneEnte = value;
    }

}
