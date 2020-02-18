/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.04 at 12:24:13 PM CET 
//


package it.csi.siac.fattura.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Il campo Denominazione e' in alternativa ai campi Nome e Cognome
 * 			
 * 
 * <p>Java class for AnagraficaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnagraficaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Denominazione" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String80LatinType"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Nome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/>
 *             &lt;element name="Cognome" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}String60LatinType"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Titolo" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}TitoloType" minOccurs="0"/>
 *         &lt;element name="CodEORI" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2}CodEORIType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnagraficaType", propOrder = {
    "denominazione",
    "nome",
    "cognome",
    "titolo",
    "codEORI"
})
public class AnagraficaType {

    @XmlElement(name = "Denominazione")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String denominazione;
    @XmlElement(name = "Nome")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String nome;
    @XmlElement(name = "Cognome")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String cognome;
    @XmlElement(name = "Titolo")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String titolo;
    @XmlElement(name = "CodEORI")
    protected String codEORI;

    /**
     * Gets the value of the denominazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenominazione() {
        return denominazione;
    }

    /**
     * Sets the value of the denominazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenominazione(String value) {
        this.denominazione = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the cognome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the value of the cognome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Gets the value of the titolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Sets the value of the titolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitolo(String value) {
        this.titolo = value;
    }

    /**
     * Gets the value of the codEORI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEORI() {
        return codEORI;
    }

    /**
     * Sets the value of the codEORI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEORI(String value) {
        this.codEORI = value;
    }

}
