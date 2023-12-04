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
 * <p>Java class for pagamentoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagamentoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importoPagato" type="{http://www.tesoro.it/fatture}importoType"/>
 *         &lt;element name="naturaSpesa" type="{http://www.tesoro.it/fatture}naturaSpesaTipo"/>
 *         &lt;element name="capitoliSpesa" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *         &lt;element name="estremiImpegno" type="{http://www.tesoro.it/fatture}maxLenghtString50Type" minOccurs="0"/>
 *         &lt;element name="mandatoPagamento" type="{http://www.tesoro.it/fatture}mandatoPagamentoTipo"/>
 *         &lt;element name="idFiscaleIVABeneficiario" type="{http://www.tesoro.it/fatture}idFiscaleIvaTipo"/>
 *         &lt;element name="codiceCIG" type="{http://www.tesoro.it/fatture}maxLenghtString15Type"/>
 *         &lt;element name="codiceCUP" type="{http://www.tesoro.it/fatture}maxLenghtString15Type"/>
 *         &lt;element name="descrizione" type="{http://www.tesoro.it/fatture}maxLenghtString100Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagamentoTipo", propOrder = {
    "importoPagato",
    "naturaSpesa",
    "capitoliSpesa",
    "estremiImpegno",
    "mandatoPagamento",
    "idFiscaleIVABeneficiario",
    "codiceCIG",
    "codiceCUP",
    "descrizione"
})
public class PagamentoTipo {

    @XmlElement(required = true)
    protected BigDecimal importoPagato;
    @XmlElement(required = true)
    protected NaturaSpesaTipo naturaSpesa;
    protected String capitoliSpesa;
    protected String estremiImpegno;
    @XmlElement(required = true)
    protected MandatoPagamentoTipo mandatoPagamento;
    @XmlElement(required = true)
    protected String idFiscaleIVABeneficiario;
    @XmlElement(required = true)
    protected String codiceCIG;
    @XmlElement(required = true)
    protected String codiceCUP;
    protected String descrizione;

    /**
     * Gets the value of the importoPagato property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoPagato() {
        return importoPagato;
    }

    /**
     * Sets the value of the importoPagato property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoPagato(BigDecimal value) {
        this.importoPagato = value;
    }

    /**
     * Gets the value of the naturaSpesa property.
     * 
     * @return
     *     possible object is
     *     {@link NaturaSpesaTipo }
     *     
     */
    public NaturaSpesaTipo getNaturaSpesa() {
        return naturaSpesa;
    }

    /**
     * Sets the value of the naturaSpesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturaSpesaTipo }
     *     
     */
    public void setNaturaSpesa(NaturaSpesaTipo value) {
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
     * Gets the value of the mandatoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link MandatoPagamentoTipo }
     *     
     */
    public MandatoPagamentoTipo getMandatoPagamento() {
        return mandatoPagamento;
    }

    /**
     * Sets the value of the mandatoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandatoPagamentoTipo }
     *     
     */
    public void setMandatoPagamento(MandatoPagamentoTipo value) {
        this.mandatoPagamento = value;
    }

    /**
     * Gets the value of the idFiscaleIVABeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFiscaleIVABeneficiario() {
        return idFiscaleIVABeneficiario;
    }

    /**
     * Sets the value of the idFiscaleIVABeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFiscaleIVABeneficiario(String value) {
        this.idFiscaleIVABeneficiario = value;
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

}
