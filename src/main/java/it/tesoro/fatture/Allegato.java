/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allegato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allegato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileAllegato" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="nomeFile" type="{http://www.tesoro.it/fatture}maxLenghtString4000Type"/>
 *         &lt;element name="contentType" type="{http://www.tesoro.it/fatture}maxLenghtString255Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allegato", propOrder = {
    "fileAllegato",
    "nomeFile",
    "contentType"
})
public class Allegato {

    @XmlElement(required = true)
    protected byte[] fileAllegato;
    @XmlElement(required = true)
    protected String nomeFile;
    @XmlElement(required = true)
    protected String contentType;

    /**
     * Gets the value of the fileAllegato property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileAllegato() {
        return fileAllegato;
    }

    /**
     * Sets the value of the fileAllegato property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileAllegato(byte[] value) {
        this.fileAllegato = ((byte[]) value);
    }

    /**
     * Gets the value of the nomeFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Sets the value of the nomeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

}
