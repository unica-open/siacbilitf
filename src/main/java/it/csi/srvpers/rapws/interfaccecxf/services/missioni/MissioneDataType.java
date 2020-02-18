/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.srvpers.rapws.interfaccecxf.services.missioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for missioneDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="missioneDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://missioni.services.interfaccecxf.rapws.srvpers.csi.it/}abstractSoapType">
 *       &lt;sequence>
 *         &lt;element name="abiCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bicCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blocco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabCod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuneNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contoCorrente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_nascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dipentente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exMatricola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibanDip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMatricola" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="raggCont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitaOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uorDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "missioneDataType", propOrder = {
    "abiCod",
    "bicCod",
    "blocco",
    "cabCod",
    "cin",
    "comuneNascita",
    "contoCorrente",
    "dataNascita",
    "dipentente",
    "exMatricola",
    "ibanDip",
    "newMatricola",
    "raggCont",
    "status",
    "tipoDip",
    "unitaOrg",
    "uorDescr"
})
public class MissioneDataType
    extends AbstractSoapType {

    protected String abiCod;
    protected String bicCod;
    protected String blocco;
    protected String cabCod;
    protected String cin;
    protected String comuneNascita;
    protected String contoCorrente;
    @XmlElement(name = "data_nascita")
    protected String dataNascita;
    protected String dipentente;
    protected String exMatricola;
    protected String ibanDip;
    protected Integer newMatricola;
    protected String raggCont;
    protected Integer status;
    protected String tipoDip;
    protected String unitaOrg;
    protected String uorDescr;

    /**
     * Gets the value of the abiCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbiCod() {
        return abiCod;
    }

    /**
     * Sets the value of the abiCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbiCod(String value) {
        this.abiCod = value;
    }

    /**
     * Gets the value of the bicCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBicCod() {
        return bicCod;
    }

    /**
     * Sets the value of the bicCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBicCod(String value) {
        this.bicCod = value;
    }

    /**
     * Gets the value of the blocco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlocco() {
        return blocco;
    }

    /**
     * Sets the value of the blocco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlocco(String value) {
        this.blocco = value;
    }

    /**
     * Gets the value of the cabCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabCod() {
        return cabCod;
    }

    /**
     * Sets the value of the cabCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabCod(String value) {
        this.cabCod = value;
    }

    /**
     * Gets the value of the cin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCin() {
        return cin;
    }

    /**
     * Sets the value of the cin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCin(String value) {
        this.cin = value;
    }

    /**
     * Gets the value of the comuneNascita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuneNascita() {
        return comuneNascita;
    }

    /**
     * Sets the value of the comuneNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuneNascita(String value) {
        this.comuneNascita = value;
    }

    /**
     * Gets the value of the contoCorrente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContoCorrente() {
        return contoCorrente;
    }

    /**
     * Sets the value of the contoCorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContoCorrente(String value) {
        this.contoCorrente = value;
    }

    /**
     * Gets the value of the dataNascita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascita() {
        return dataNascita;
    }

    /**
     * Sets the value of the dataNascita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascita(String value) {
        this.dataNascita = value;
    }

    /**
     * Gets the value of the dipentente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDipentente() {
        return dipentente;
    }

    /**
     * Sets the value of the dipentente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDipentente(String value) {
        this.dipentente = value;
    }

    /**
     * Gets the value of the exMatricola property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExMatricola() {
        return exMatricola;
    }

    /**
     * Sets the value of the exMatricola property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExMatricola(String value) {
        this.exMatricola = value;
    }

    /**
     * Gets the value of the ibanDip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanDip() {
        return ibanDip;
    }

    /**
     * Sets the value of the ibanDip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanDip(String value) {
        this.ibanDip = value;
    }

    /**
     * Gets the value of the newMatricola property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewMatricola() {
        return newMatricola;
    }

    /**
     * Sets the value of the newMatricola property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewMatricola(Integer value) {
        this.newMatricola = value;
    }

    /**
     * Gets the value of the raggCont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaggCont() {
        return raggCont;
    }

    /**
     * Sets the value of the raggCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaggCont(String value) {
        this.raggCont = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

    /**
     * Gets the value of the tipoDip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDip() {
        return tipoDip;
    }

    /**
     * Sets the value of the tipoDip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDip(String value) {
        this.tipoDip = value;
    }

    /**
     * Gets the value of the unitaOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitaOrg() {
        return unitaOrg;
    }

    /**
     * Sets the value of the unitaOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitaOrg(String value) {
        this.unitaOrg = value;
    }

    /**
     * Gets the value of the uorDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUorDescr() {
        return uorDescr;
    }

    /**
     * Sets the value of the uorDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUorDescr(String value) {
        this.uorDescr = value;
    }

}
