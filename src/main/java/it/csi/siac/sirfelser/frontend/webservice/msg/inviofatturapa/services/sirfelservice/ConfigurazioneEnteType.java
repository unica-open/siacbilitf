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
 * <p>Java class for ConfigurazioneEnteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfigurazioneEnteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodiceEnte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Params">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Config" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}EmbeddedXMLType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurazioneEnteType", propOrder = {
    "codiceEnte",
    "params"
})
public class ConfigurazioneEnteType {

    @XmlElement(name = "CodiceEnte", required = true)
    protected String codiceEnte;
    @XmlElement(name = "Params", required = true)
    protected ConfigurazioneEnteType.Params params;

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
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurazioneEnteType.Params }
     *     
     */
    public ConfigurazioneEnteType.Params getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurazioneEnteType.Params }
     *     
     */
    public void setParams(ConfigurazioneEnteType.Params value) {
        this.params = value;
    }


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
     *         &lt;element name="Config" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}EmbeddedXMLType"/>
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
        "config"
    })
    public static class Params {

        @XmlElement(name = "Config", required = true)
        protected EmbeddedXMLType config;

        /**
         * Gets the value of the config property.
         * 
         * @return
         *     possible object is
         *     {@link EmbeddedXMLType }
         *     
         */
        public EmbeddedXMLType getConfig() {
            return config;
        }

        /**
         * Sets the value of the config property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmbeddedXMLType }
         *     
         */
        public void setConfig(EmbeddedXMLType value) {
            this.config = value;
        }

    }

}
