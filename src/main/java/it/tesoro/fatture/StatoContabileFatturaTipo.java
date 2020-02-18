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
 * <p>Java class for statoContabileFatturaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statoContabileFatturaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datiFornitore" type="{http://www.tesoro.it/fatture}datiFornitoreTipo"/>
 *         &lt;element name="datiAmministrazione" type="{http://www.tesoro.it/fatture}datiAmministrazioneTipo"/>
 *         &lt;element name="datiDistintaTrasmissione" type="{http://www.tesoro.it/fatture}datiDistintaTrasmissioneTipo"/>
 *         &lt;element name="datiDocumento" type="{http://www.tesoro.it/fatture}dettaglioDocumentoReadTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statoContabileFatturaTipo", propOrder = {
    "datiFornitore",
    "datiAmministrazione",
    "datiDistintaTrasmissione",
    "datiDocumento"
})
public class StatoContabileFatturaTipo {

    @XmlElement(required = true)
    protected DatiFornitoreTipo datiFornitore;
    @XmlElement(required = true)
    protected DatiAmministrazioneTipo datiAmministrazione;
    @XmlElement(required = true)
    protected DatiDistintaTrasmissioneTipo datiDistintaTrasmissione;
    @XmlElement(required = true)
    protected DettaglioDocumentoReadTipo datiDocumento;

    /**
     * Gets the value of the datiFornitore property.
     * 
     * @return
     *     possible object is
     *     {@link DatiFornitoreTipo }
     *     
     */
    public DatiFornitoreTipo getDatiFornitore() {
        return datiFornitore;
    }

    /**
     * Sets the value of the datiFornitore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiFornitoreTipo }
     *     
     */
    public void setDatiFornitore(DatiFornitoreTipo value) {
        this.datiFornitore = value;
    }

    /**
     * Gets the value of the datiAmministrazione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiAmministrazioneTipo }
     *     
     */
    public DatiAmministrazioneTipo getDatiAmministrazione() {
        return datiAmministrazione;
    }

    /**
     * Sets the value of the datiAmministrazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiAmministrazioneTipo }
     *     
     */
    public void setDatiAmministrazione(DatiAmministrazioneTipo value) {
        this.datiAmministrazione = value;
    }

    /**
     * Gets the value of the datiDistintaTrasmissione property.
     * 
     * @return
     *     possible object is
     *     {@link DatiDistintaTrasmissioneTipo }
     *     
     */
    public DatiDistintaTrasmissioneTipo getDatiDistintaTrasmissione() {
        return datiDistintaTrasmissione;
    }

    /**
     * Sets the value of the datiDistintaTrasmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatiDistintaTrasmissioneTipo }
     *     
     */
    public void setDatiDistintaTrasmissione(DatiDistintaTrasmissioneTipo value) {
        this.datiDistintaTrasmissione = value;
    }

    /**
     * Gets the value of the datiDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link DettaglioDocumentoReadTipo }
     *     
     */
    public DettaglioDocumentoReadTipo getDatiDocumento() {
        return datiDocumento;
    }

    /**
     * Sets the value of the datiDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DettaglioDocumentoReadTipo }
     *     
     */
    public void setDatiDocumento(DettaglioDocumentoReadTipo value) {
        this.datiDocumento = value;
    }

}
