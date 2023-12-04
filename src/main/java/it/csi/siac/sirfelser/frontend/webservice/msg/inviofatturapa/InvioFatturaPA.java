/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa;

import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.DatiPortaleFattureType;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.EmbeddedXMLType;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.InformazioniAggiuntiveType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatiPortaleFatture" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}DatiPortaleFattureType"/>
 *         &lt;element name="FatturaElettronica" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}EmbeddedXMLType"/>
 *         &lt;element name="CodiceEnte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InformazioniAggiuntive" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}InformazioniAggiuntiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datiPortaleFatture",
    "fatturaElettronica",
    "codiceEnte",
    "informazioniAggiuntive"
})
@XmlRootElement(name = "InvioFatturaPA")
public class InvioFatturaPA {

    @XmlElement(name = "DatiPortaleFatture", required = true)
    protected DatiPortaleFattureType datiPortaleFatture;
    @XmlElement(name = "FatturaElettronica", required = true)
    protected EmbeddedXMLType fatturaElettronica;
    @XmlElement(name = "CodiceEnte", required = true)
    protected String codiceEnte;
    @XmlElement(name = "InformazioniAggiuntive")
    protected InformazioniAggiuntiveType informazioniAggiuntive;

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
     * Gets the value of the codiceEnte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceEnte() {
        return codiceEnte;
    }

    /**
     * Sets the value of the codiceEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceEnte(String value) {
        this.codiceEnte = value;
    }

    /**
     * Gets the value of the informazioniAggiuntive property.
     * 
     * @return
     *     possible object is
     *     {@link InformazioniAggiuntiveType }
     *     
     */
    public InformazioniAggiuntiveType getInformazioniAggiuntive() {
        return informazioniAggiuntive;
    }

    /**
     * Sets the value of the informazioniAggiuntive property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformazioniAggiuntiveType }
     *     
     */
    public void setInformazioniAggiuntive(InformazioniAggiuntiveType value) {
        this.informazioniAggiuntive = value;
    }

}
