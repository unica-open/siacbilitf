/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contabilizzazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contabilizzazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importoMovimento" type="{http://www.tesoro.it/fatture}importoType"/>
 *         &lt;element name="naturaSpesa" type="{http://www.tesoro.it/fatture}naturaSpesaContabiliTipo"/>
 *         &lt;element name="capitoliSpesa" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="operazione" type="{http://www.tesoro.it/fatture}operazioneContabilizzazioneTipo"/>
 *         &lt;element name="descrizione" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="estremiImpegno" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="codiceCIG" type="{http://www.tesoro.it/fatture}maxLenghtString15Type"/>
 *         &lt;element name="codiceCUP" type="{http://www.tesoro.it/fatture}maxLenghtString15Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contabilizzazioneTipo", propOrder = {
    "importoMovimento",
    "naturaSpesa",
    "capitoliSpesa",
    "operazione",
    "descrizione",
    "estremiImpegno",
    "codiceCIG",
    "codiceCUP"
})
public class ContabilizzazioneTipo {

    @XmlElement(required = true)
    protected BigDecimal importoMovimento;
    @XmlElement(required = true)
    protected NaturaSpesaContabiliTipo naturaSpesa;
    protected String capitoliSpesa;
    @XmlElement(required = true)
    protected OperazioneContabilizzazioneTipo operazione;
    protected String descrizione;
    protected String estremiImpegno;
    @XmlElement(required = true)
    protected String codiceCIG;
    @XmlElement(required = true)
    protected String codiceCUP;

    /**
     * Gets the value of the importoMovimento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoMovimento() {
        return importoMovimento;
    }

    /**
     * Sets the value of the importoMovimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoMovimento(BigDecimal value) {
        this.importoMovimento = value;
    }

    /**
     * Gets the value of the naturaSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link NaturaSpesaContabiliTipo }
     *     
     */
    public NaturaSpesaContabiliTipo getNaturaSpesa() {
        return naturaSpesa;
    }

    /**
     * Sets the value of the naturaSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturaSpesaContabiliTipo }
     *     
     */
    public void setNaturaSpesa(NaturaSpesaContabiliTipo value) {
        this.naturaSpesa = value;
    }

    /**
     * Gets the value of the capitoliSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapitoliSpesa() {
        return capitoliSpesa;
    }

    /**
     * Sets the value of the capitoliSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapitoliSpesa(String value) {
        this.capitoliSpesa = value;
    }

    /**
     * Gets the value of the operazione property.
     * 
     * @return
     *     possible object is
     *     {@link OperazioneContabilizzazioneTipo }
     *     
     */
    public OperazioneContabilizzazioneTipo getOperazione() {
        return operazione;
    }

    /**
     * Sets the value of the operazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperazioneContabilizzazioneTipo }
     *     
     */
    public void setOperazione(OperazioneContabilizzazioneTipo value) {
        this.operazione = value;
    }

    /**
     * Gets the value of the descrizione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the value of the descrizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizione(String value) {
        this.descrizione = value;
    }

    /**
     * Gets the value of the estremiImpegno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstremiImpegno() {
        return estremiImpegno;
    }

    /**
     * Sets the value of the estremiImpegno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstremiImpegno(String value) {
        this.estremiImpegno = value;
    }

    /**
     * Gets the value of the codiceCIG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCIG() {
        return codiceCIG;
    }

    /**
     * Sets the value of the codiceCIG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCIG(String value) {
        this.codiceCIG = value;
    }

    /**
     * Gets the value of the codiceCUP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceCUP() {
        return codiceCUP;
    }

    /**
     * Sets the value of the codiceCUP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceCUP(String value) {
        this.codiceCUP = value;
    }

}
