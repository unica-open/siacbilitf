/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa;

import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.InformazioniAggiuntiveType;
import it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice.ServiceResponseType;

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
 *         &lt;element name="Result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Esito" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}ServiceResponseType"/>
 *                   &lt;element name="InformazioniAggiuntive" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}InformazioniAggiuntiveType" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "InvioFatturaPAResponse")
public class InvioFatturaPAResponse {

    @XmlElement(name = "Result", required = true)
    protected InvioFatturaPAResponse.Result result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link InvioFatturaPAResponse.Result }
     *     
     */
    public InvioFatturaPAResponse.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvioFatturaPAResponse.Result }
     *     
     */
    public void setResult(InvioFatturaPAResponse.Result value) {
        this.result = value;
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
     *         &lt;element name="Esito" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}ServiceResponseType"/>
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
        "esito",
        "informazioniAggiuntive"
    })
    public static class Result {

        @XmlElement(name = "Esito", required = true)
        protected ServiceResponseType esito;
        @XmlElement(name = "InformazioniAggiuntive")
        protected InformazioniAggiuntiveType informazioniAggiuntive;

        /**
         * Gets the value of the esito property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceResponseType }
         *     
         */
        public ServiceResponseType getEsito() {
            return esito;
        }

        /**
         * Sets the value of the esito property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceResponseType }
         *     
         */
        public void setEsito(ServiceResponseType value) {
            this.esito = value;
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

}
