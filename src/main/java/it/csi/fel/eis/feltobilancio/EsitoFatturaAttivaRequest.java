/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.feltobilancio;

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
 *         &lt;element name="TestataInvioFatturaAttiva" type="{http://www.csi.it/fel/eis/FelToBilancio}TestataEsitoFatturaAttivaType"/>
 *         &lt;element name="StatoElaborazioneFattura" type="{http://www.csi.it/fel/eis/FelToBilancio}StatoFatturaType"/>
 *         &lt;element name="DettaglioEsitoElaborazione" type="{http://www.csi.it/fel/eis/types}String250Type" minOccurs="0"/>
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
    "testataInvioFatturaAttiva",
    "statoElaborazioneFattura",
    "dettaglioEsitoElaborazione"
})
@XmlRootElement(name = "EsitoFatturaAttivaRequest")
public class EsitoFatturaAttivaRequest {

    @XmlElement(name = "TestataInvioFatturaAttiva", required = true)
    protected TestataEsitoFatturaAttivaType testataInvioFatturaAttiva;
    @XmlElement(name = "StatoElaborazioneFattura")
    protected int statoElaborazioneFattura;
    @XmlElement(name = "DettaglioEsitoElaborazione")
    protected String dettaglioEsitoElaborazione;

    /**
     * Gets the value of the testataInvioFatturaAttiva property.
     * 
     * @return
     *     possible object is
     *     {@link TestataEsitoFatturaAttivaType }
     *     
     */
    public TestataEsitoFatturaAttivaType getTestataInvioFatturaAttiva() {
        return testataInvioFatturaAttiva;
    }

    /**
     * Sets the value of the testataInvioFatturaAttiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestataEsitoFatturaAttivaType }
     *     
     */
    public void setTestataInvioFatturaAttiva(TestataEsitoFatturaAttivaType value) {
        this.testataInvioFatturaAttiva = value;
    }

    /**
     * Gets the value of the statoElaborazioneFattura property.
     * 
     */
    public int getStatoElaborazioneFattura() {
        return statoElaborazioneFattura;
    }

    /**
     * Sets the value of the statoElaborazioneFattura property.
     * 
     */
    public void setStatoElaborazioneFattura(int value) {
        this.statoElaborazioneFattura = value;
    }

    /**
     * Gets the value of the dettaglioEsitoElaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDettaglioEsitoElaborazione() {
        return dettaglioEsitoElaborazione;
    }

    /**
     * Sets the value of the dettaglioEsitoElaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDettaglioEsitoElaborazione(String value) {
        this.dettaglioEsitoElaborazione = value;
    }

}
