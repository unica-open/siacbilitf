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
 * <p>Java class for filtroInterrogazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filtroInterrogazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntervalloDataEmissioneFatture" type="{http://www.tesoro.it/fatture}intervalloDateFatturaTipo" minOccurs="0"/>
 *         &lt;element name="identificativoFiscaleIvaImpresa" type="{http://www.tesoro.it/fatture}maxLenghtString16Type" minOccurs="0"/>
 *         &lt;element name="codiceFiscaleAmministrazione" type="{http://www.tesoro.it/fatture}maxLenghtString16Type" minOccurs="0"/>
 *         &lt;element name="codiceUfficioIPA" type="{http://www.tesoro.it/fatture}maxLenghtString6Type" minOccurs="0"/>
 *         &lt;element name="statoFattura" type="{http://www.tesoro.it/fatture}statoDocumentoTipo" minOccurs="0"/>
 *         &lt;element name="flagVariate" type="{http://www.tesoro.it/fatture}flagSiNoTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtroInterrogazioneTipo", propOrder = {
    "intervalloDataEmissioneFatture",
    "identificativoFiscaleIvaImpresa",
    "codiceFiscaleAmministrazione",
    "codiceUfficioIPA",
    "statoFattura",
    "flagVariate"
})
public class FiltroInterrogazioneTipo {

    @XmlElement(name = "IntervalloDataEmissioneFatture")
    protected IntervalloDateFatturaTipo intervalloDataEmissioneFatture;
    protected String identificativoFiscaleIvaImpresa;
    protected String codiceFiscaleAmministrazione;
    protected String codiceUfficioIPA;
    protected StatoDocumentoTipo statoFattura;
    @XmlElement(defaultValue = "SI")
    protected FlagSiNoTipo flagVariate;

    /**
     * Gets the value of the intervalloDataEmissioneFatture property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalloDateFatturaTipo }
     *     
     */
    public IntervalloDateFatturaTipo getIntervalloDataEmissioneFatture() {
        return intervalloDataEmissioneFatture;
    }

    /**
     * Sets the value of the intervalloDataEmissioneFatture property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalloDateFatturaTipo }
     *     
     */
    public void setIntervalloDataEmissioneFatture(IntervalloDateFatturaTipo value) {
        this.intervalloDataEmissioneFatture = value;
    }

    /**
     * Gets the value of the identificativoFiscaleIvaImpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificativoFiscaleIvaImpresa() {
        return identificativoFiscaleIvaImpresa;
    }

    /**
     * Sets the value of the identificativoFiscaleIvaImpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificativoFiscaleIvaImpresa(String value) {
        this.identificativoFiscaleIvaImpresa = value;
    }

    /**
     * Gets the value of the codiceFiscaleAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceFiscaleAmministrazione() {
        return codiceFiscaleAmministrazione;
    }

    /**
     * Sets the value of the codiceFiscaleAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceFiscaleAmministrazione(String value) {
        this.codiceFiscaleAmministrazione = value;
    }

    /**
     * Gets the value of the codiceUfficioIPA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceUfficioIPA() {
        return codiceUfficioIPA;
    }

    /**
     * Sets the value of the codiceUfficioIPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceUfficioIPA(String value) {
        this.codiceUfficioIPA = value;
    }

    /**
     * Gets the value of the statoFattura property.
     * 
     * @return
     *     possible object is
     *     {@link StatoDocumentoTipo }
     *     
     */
    public StatoDocumentoTipo getStatoFattura() {
        return statoFattura;
    }

    /**
     * Sets the value of the statoFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoDocumentoTipo }
     *     
     */
    public void setStatoFattura(StatoDocumentoTipo value) {
        this.statoFattura = value;
    }

    /**
     * Gets the value of the flagVariate property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public FlagSiNoTipo getFlagVariate() {
        return flagVariate;
    }

    /**
     * Sets the value of the flagVariate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public void setFlagVariate(FlagSiNoTipo value) {
        this.flagVariate = value;
    }

}
