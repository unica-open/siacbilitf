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
 * <p>Java class for pagamentoStornoTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pagamentoStornoTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="importoStorno" type="{http://www.tesoro.it/fatture}importoType"/>
 *         &lt;element name="naturaSpesa" type="{http://www.tesoro.it/fatture}naturaSpesaTipo"/>
 *         &lt;element name="idFiscaleIVABeneficiario" type="{http://www.tesoro.it/fatture}idFiscaleIvaTipo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagamentoStornoTipo", propOrder = {
    "importoStorno",
    "naturaSpesa",
    "idFiscaleIVABeneficiario"
})
public class PagamentoStornoTipo {

    @XmlElement(required = true)
    protected BigDecimal importoStorno;
    @XmlElement(required = true)
    protected NaturaSpesaTipo naturaSpesa;
    @XmlElement(required = true)
    protected String idFiscaleIVABeneficiario;

    /**
     * Gets the value of the importoStorno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoStorno() {
        return importoStorno;
    }

    /**
     * Sets the value of the importoStorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoStorno(BigDecimal value) {
        this.importoStorno = value;
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

}
