/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmistaMessaggioType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmistaMessaggioType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiPortaleFatture" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}DatiMessaggioPFType"/>
 *         &lt;element name="MessaggioSDI" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}EmbeddedXMLType"/>
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
@XmlType(name = "SmistaMessaggioType", propOrder = {
    "datiPortaleFatture",
    "messaggioSDI",
    "fatturaElettronica",
    "configurazioneEnte"
})
public class SmistaMessaggioType {

    @XmlElement(name = "DatiPortaleFatture", required = true)
    protected DatiMessaggioPFType datiPortaleFatture;
    @XmlElement(name = "MessaggioSDI", required = true)
    protected EmbeddedXMLType messaggioSDI;
    @XmlElement(name = "FatturaElettronica", required = true)
    protected EmbeddedXMLType fatturaElettronica;
    @XmlElement(name = "ConfigurazioneEnte", required = true)
    protected ConfigurazioneEnteType configurazioneEnte;

    /**
     * Gets the value of the datiPortaleFatture property.
     * 
     * @return
     *     possible object is
     *     {@link DatiMessaggioPFType }
     *     
     */
    public DatiMessaggioPFType getDatiPortaleFatture() {
        return datiPortaleFatture;
    }

    /**
     * Sets the value of the datiPortaleFatture property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiMessaggioPFType }
     *     
     */
    public void setDatiPortaleFatture(DatiMessaggioPFType value) {
        this.datiPortaleFatture = value;
    }

    /**
     * Gets the value of the messaggioSDI property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedXMLType }
     *     
     */
    public EmbeddedXMLType getMessaggioSDI() {
        return messaggioSDI;
    }

    /**
     * Sets the value of the messaggioSDI property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedXMLType }
     *     
     */
    public void setMessaggioSDI(EmbeddedXMLType value) {
        this.messaggioSDI = value;
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
