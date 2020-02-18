/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.25 at 03:07:32 PM CEST 
//


package it.csi.epay.epaywso.rendicontazione;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlussoRiconciliazioneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlussoRiconciliazioneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TestataFlusso" type="{http://www.csi.it/epay/epaywso/rendicontazione}TestataFlussoRiconciliazioneType"/>
 *         &lt;element name="RigheSintesi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SingolaRigaSintesi" type="{http://www.csi.it/epay/epaywso/rendicontazione}FlussoSintesiType" maxOccurs="unbounded"/>
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
@XmlType(name = "FlussoRiconciliazioneType", namespace = "http://www.csi.it/epay/epaywso/rendicontazione", propOrder = {
    "testataFlusso",
    "righeSintesi"
})
public class FlussoRiconciliazioneType {

    @XmlElement(name = "TestataFlusso", namespace = "http://www.csi.it/epay/epaywso/rendicontazione", required = true)
    protected TestataFlussoRiconciliazioneType testataFlusso;
    @XmlElement(name = "RigheSintesi", namespace = "http://www.csi.it/epay/epaywso/rendicontazione", required = true)
    protected FlussoRiconciliazioneType.RigheSintesi righeSintesi;

    /**
     * Gets the value of the testataFlusso property.
     * 
     * @return
     *     possible object is
     *     {@link TestataFlussoRiconciliazioneType }
     *     
     */
    public TestataFlussoRiconciliazioneType getTestataFlusso() {
        return testataFlusso;
    }

    /**
     * Sets the value of the testataFlusso property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataFlussoRiconciliazioneType }
     *     
     */
    public void setTestataFlusso(TestataFlussoRiconciliazioneType value) {
        this.testataFlusso = value;
    }

    /**
     * Gets the value of the righeSintesi property.
     * 
     * @return
     *     possible object is
     *     {@link FlussoRiconciliazioneType.RigheSintesi }
     *     
     */
    public FlussoRiconciliazioneType.RigheSintesi getRigheSintesi() {
        return righeSintesi;
    }

    /**
     * Sets the value of the righeSintesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlussoRiconciliazioneType.RigheSintesi }
     *     
     */
    public void setRigheSintesi(FlussoRiconciliazioneType.RigheSintesi value) {
        this.righeSintesi = value;
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
     *         &lt;element name="SingolaRigaSintesi" type="{http://www.csi.it/epay/epaywso/rendicontazione}FlussoSintesiType" maxOccurs="unbounded"/>
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
        "singolaRigaSintesi"
    })
    public static class RigheSintesi {

        @XmlElement(name = "SingolaRigaSintesi", namespace = "http://www.csi.it/epay/epaywso/rendicontazione", required = true)
        protected List<FlussoSintesiType> singolaRigaSintesi;

        /**
         * Gets the value of the singolaRigaSintesi property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the singolaRigaSintesi property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSingolaRigaSintesi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlussoSintesiType }
         * 
         * 
         */
        public List<FlussoSintesiType> getSingolaRigaSintesi() {
            if (singolaRigaSintesi == null) {
                singolaRigaSintesi = new ArrayList<FlussoSintesiType>();
            }
            return this.singolaRigaSintesi;
        }

    }

}
