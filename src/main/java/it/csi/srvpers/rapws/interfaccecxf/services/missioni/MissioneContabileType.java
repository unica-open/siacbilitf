/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.srvpers.rapws.interfaccecxf.services.missioni;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for missioneContabileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="missioneContabileType">
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
 *         &lt;element name="dataA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataNascita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dipendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exMatricola" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagDestinazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagIspettiva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flagTipoAccredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibanDip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mezziTrasporto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivazioni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMatricola" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="oraA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oraDa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="progressivo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="protocollo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raggrCont" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoRegistrazione" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "missioneContabileType", propOrder = {
    "abiCod",
    "bicCod",
    "blocco",
    "cabCod",
    "cin",
    "comuneNascita",
    "contoCorrente",
    "dataA",
    "dataDa",
    "dataNascita",
    "delegato",
    "dipendente",
    "exMatricola",
    "flagDestinazione",
    "flagIspettiva",
    "flagTipoAccredito",
    "ibanDip",
    "id",
    "localita",
    "mezziTrasporto",
    "motivazioni",
    "newMatricola",
    "oraA",
    "oraDa",
    "progressivo",
    "protocollo",
    "raggrCont",
    "status",
    "tipoDip",
    "tipoRegistrazione",
    "unitaOrg",
    "uorDescr"
})
public class MissioneContabileType
    extends AbstractSoapType {

    protected String abiCod;
    protected String bicCod;
    protected String blocco;
    protected String cabCod;
    protected String cin;
    protected String comuneNascita;
    protected String contoCorrente;
    protected String dataA;
    protected String dataDa;
    protected String dataNascita;
    protected String delegato;
    protected String dipendente;
    protected String exMatricola;
    protected String flagDestinazione;
    protected String flagIspettiva;
    protected String flagTipoAccredito;
    protected String ibanDip;
    protected String id;
    protected String localita;
    protected String mezziTrasporto;
    protected String motivazioni;
    protected Integer newMatricola;
    protected String oraA;
    protected String oraDa;
    protected Integer progressivo;
    protected String protocollo;
    protected String raggrCont;
    protected Integer status;
    protected String tipoDip;
    protected String tipoRegistrazione;
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
     * Gets the value of the dataA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataA() {
        return dataA;
    }

    /**
     * Sets the value of the dataA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataA(String value) {
        this.dataA = value;
    }

    /**
     * Gets the value of the dataDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDa() {
        return dataDa;
    }

    /**
     * Sets the value of the dataDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDa(String value) {
        this.dataDa = value;
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
     * Gets the value of the delegato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegato() {
        return delegato;
    }

    /**
     * Sets the value of the delegato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegato(String value) {
        this.delegato = value;
    }

    /**
     * Gets the value of the dipendente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDipendente() {
        return dipendente;
    }

    /**
     * Sets the value of the dipendente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDipendente(String value) {
        this.dipendente = value;
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
     * Gets the value of the flagDestinazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagDestinazione() {
        return flagDestinazione;
    }

    /**
     * Sets the value of the flagDestinazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagDestinazione(String value) {
        this.flagDestinazione = value;
    }

    /**
     * Gets the value of the flagIspettiva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagIspettiva() {
        return flagIspettiva;
    }

    /**
     * Sets the value of the flagIspettiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagIspettiva(String value) {
        this.flagIspettiva = value;
    }

    /**
     * Gets the value of the flagTipoAccredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagTipoAccredito() {
        return flagTipoAccredito;
    }

    /**
     * Sets the value of the flagTipoAccredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagTipoAccredito(String value) {
        this.flagTipoAccredito = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the localita property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalita() {
        return localita;
    }

    /**
     * Sets the value of the localita property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalita(String value) {
        this.localita = value;
    }

    /**
     * Gets the value of the mezziTrasporto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezziTrasporto() {
        return mezziTrasporto;
    }

    /**
     * Sets the value of the mezziTrasporto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezziTrasporto(String value) {
        this.mezziTrasporto = value;
    }

    /**
     * Gets the value of the motivazioni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivazioni() {
        return motivazioni;
    }

    /**
     * Sets the value of the motivazioni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivazioni(String value) {
        this.motivazioni = value;
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
     * Gets the value of the oraA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOraA() {
        return oraA;
    }

    /**
     * Sets the value of the oraA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOraA(String value) {
        this.oraA = value;
    }

    /**
     * Gets the value of the oraDa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOraDa() {
        return oraDa;
    }

    /**
     * Sets the value of the oraDa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOraDa(String value) {
        this.oraDa = value;
    }

    /**
     * Gets the value of the progressivo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProgressivo() {
        return progressivo;
    }

    /**
     * Sets the value of the progressivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProgressivo(Integer value) {
        this.progressivo = value;
    }

    /**
     * Gets the value of the protocollo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocollo() {
        return protocollo;
    }

    /**
     * Sets the value of the protocollo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocollo(String value) {
        this.protocollo = value;
    }

    /**
     * Gets the value of the raggrCont property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaggrCont() {
        return raggrCont;
    }

    /**
     * Sets the value of the raggrCont property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaggrCont(String value) {
        this.raggrCont = value;
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
     * Gets the value of the tipoRegistrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRegistrazione() {
        return tipoRegistrazione;
    }

    /**
     * Sets the value of the tipoRegistrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRegistrazione(String value) {
        this.tipoRegistrazione = value;
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
