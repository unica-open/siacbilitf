/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.marccommontypes_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametriApiManagerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametriApiManagerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsumerKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConsumerSecret" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URLApiManager" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndpointList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Endpoint" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ApiName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "ParametriApiManagerType", propOrder = {
    "consumerKey",
    "consumerSecret",
    "urlApiManager",
    "endpointList"
})
public class ParametriApiManagerType {

    @XmlElement(name = "ConsumerKey", required = true)
    protected String consumerKey;
    @XmlElement(name = "ConsumerSecret", required = true)
    protected String consumerSecret;
    @XmlElement(name = "URLApiManager", required = true)
    protected String urlApiManager;
    @XmlElement(name = "EndpointList", required = true)
    protected ParametriApiManagerType.EndpointList endpointList;

    /**
     * Gets the value of the consumerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * Sets the value of the consumerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerKey(String value) {
        this.consumerKey = value;
    }

    /**
     * Gets the value of the consumerSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Sets the value of the consumerSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSecret(String value) {
        this.consumerSecret = value;
    }

    /**
     * Gets the value of the urlApiManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLApiManager() {
        return urlApiManager;
    }

    /**
     * Sets the value of the urlApiManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLApiManager(String value) {
        this.urlApiManager = value;
    }

    /**
     * Gets the value of the endpointList property.
     * 
     * @return
     *     possible object is
     *     {@link ParametriApiManagerType.EndpointList }
     *     
     */
    public ParametriApiManagerType.EndpointList getEndpointList() {
        return endpointList;
    }

    /**
     * Sets the value of the endpointList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametriApiManagerType.EndpointList }
     *     
     */
    public void setEndpointList(ParametriApiManagerType.EndpointList value) {
        this.endpointList = value;
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
     *         &lt;element name="Endpoint" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ApiName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
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
        "endpoint"
    })
    public static class EndpointList {

        @XmlElement(name = "Endpoint", required = true)
        protected List<ParametriApiManagerType.EndpointList.Endpoint> endpoint;

        /**
         * Gets the value of the endpoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the endpoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEndpoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParametriApiManagerType.EndpointList.Endpoint }
         * 
         * 
         */
        public List<ParametriApiManagerType.EndpointList.Endpoint> getEndpoint() {
            if (endpoint == null) {
                endpoint = new ArrayList<ParametriApiManagerType.EndpointList.Endpoint>();
            }
            return this.endpoint;
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
         *       &lt;attribute name="ApiName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="URL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Endpoint {

            @XmlAttribute(name = "ApiName", required = true)
            protected String apiName;
            @XmlAttribute(name = "URL", required = true)
            @XmlSchemaType(name = "anyURI")
            protected String url;

            /**
             * Gets the value of the apiName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApiName() {
                return apiName;
            }

            /**
             * Sets the value of the apiName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApiName(String value) {
                this.apiName = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURL() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURL(String value) {
                this.url = value;
            }

        }

    }

}
