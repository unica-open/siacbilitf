/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.callbackservicetypes_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.pcc.marc.schema.marccommontypes_1.ResultType;
import it.csi.siac.pcc.marc.schema.marccommontypes_1.StatoRichiestaType;
import it.tesoro.fatture.ProxyRispostaTipo;
import it.tesoro.fatture.QueryOperazioneContabileRispostaTipo;


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
 *         &lt;element name="IdTransazionePA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoRichiesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Stato" type="{http://www.csi.it/marc/schema/MarcCommonTypes-1.0}StatoRichiestaType"/>
 *         &lt;element name="EsitoTrattamento" type="{http://www.csi.it/marc/schema/MarcCommonTypes-1.0}ResultType"/>
 *         &lt;choice>
 *           &lt;element name="RispostaQueryOperazioneContabile" type="{http://www.tesoro.it/fatture}queryOperazioneContabileRispostaTipo"/>
 *           &lt;element name="RispostaProxyOperazioneContabile" type="{http://www.tesoro.it/fatture}proxyRispostaTipo"/>
 *         &lt;/choice>
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
    "idTransazionePA",
    "tipoRichiesta",
    "stato",
    "esitoTrattamento",
    "rispostaQueryOperazioneContabile",
    "rispostaProxyOperazioneContabile"
})
@XmlRootElement(name = "AggiornamentoStatoRichiestaRequest")
public class AggiornamentoStatoRichiestaRequest {

    @XmlElement(name = "IdTransazionePA", required = true)
    protected String idTransazionePA;
    @XmlElement(name = "TipoRichiesta", required = true)
    protected String tipoRichiesta;
    @XmlElement(name = "Stato", required = true)
    protected StatoRichiestaType stato;
    @XmlElement(name = "EsitoTrattamento", required = true)
    protected ResultType esitoTrattamento;
    @XmlElement(name = "RispostaQueryOperazioneContabile")
    protected QueryOperazioneContabileRispostaTipo rispostaQueryOperazioneContabile;
    @XmlElement(name = "RispostaProxyOperazioneContabile")
    protected ProxyRispostaTipo rispostaProxyOperazioneContabile;

    /**
     * Gets the value of the idTransazionePA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransazionePA() {
        return idTransazionePA;
    }

    /**
     * Sets the value of the idTransazionePA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransazionePA(String value) {
        this.idTransazionePA = value;
    }

    /**
     * Gets the value of the tipoRichiesta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRichiesta() {
        return tipoRichiesta;
    }

    /**
     * Sets the value of the tipoRichiesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRichiesta(String value) {
        this.tipoRichiesta = value;
    }

    /**
     * Gets the value of the stato property.
     * 
     * @return
     *     possible object is
     *     {@link StatoRichiestaType }
     *     
     */
    public StatoRichiestaType getStato() {
        return stato;
    }

    /**
     * Sets the value of the stato property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoRichiestaType }
     *     
     */
    public void setStato(StatoRichiestaType value) {
        this.stato = value;
    }

    /**
     * Gets the value of the esitoTrattamento property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getEsitoTrattamento() {
        return esitoTrattamento;
    }

    /**
     * Sets the value of the esitoTrattamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setEsitoTrattamento(ResultType value) {
        this.esitoTrattamento = value;
    }

    /**
     * Gets the value of the rispostaQueryOperazioneContabile property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOperazioneContabileRispostaTipo }
     *     
     */
    public QueryOperazioneContabileRispostaTipo getRispostaQueryOperazioneContabile() {
        return rispostaQueryOperazioneContabile;
    }

    /**
     * Sets the value of the rispostaQueryOperazioneContabile property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOperazioneContabileRispostaTipo }
     *     
     */
    public void setRispostaQueryOperazioneContabile(QueryOperazioneContabileRispostaTipo value) {
        this.rispostaQueryOperazioneContabile = value;
    }

    /**
     * Gets the value of the rispostaProxyOperazioneContabile property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyRispostaTipo }
     *     
     */
    public ProxyRispostaTipo getRispostaProxyOperazioneContabile() {
        return rispostaProxyOperazioneContabile;
    }

    /**
     * Sets the value of the rispostaProxyOperazioneContabile property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyRispostaTipo }
     *     
     */
    public void setRispostaProxyOperazioneContabile(ProxyRispostaTipo value) {
        this.rispostaProxyOperazioneContabile = value;
    }

}
