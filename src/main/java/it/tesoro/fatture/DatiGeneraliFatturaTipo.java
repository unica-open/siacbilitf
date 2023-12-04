/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for datiGeneraliFatturaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="datiGeneraliFatturaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumento" type="{http://www.tesoro.it/fatture}tipoDocumentoTipo"/>
 *         &lt;element name="dataEmissione" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="numeroFattura" type="{http://www.tesoro.it/fatture}maxLenghtString20Type"/>
 *         &lt;element name="descrizioneCausale" type="{http://www.tesoro.it/fatture}maxLenghtString200Type"/>
 *         &lt;element name="importoTotaleDocumento" type="{http://www.tesoro.it/fatture}importoType"/>
 *         &lt;element name="importoImponibile" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="totaleImposta" type="{http://www.tesoro.it/fatture}importoType" minOccurs="0"/>
 *         &lt;element name="art73" type="{http://www.tesoro.it/fatture}flagSiNoTipo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datiGeneraliFatturaTipo", propOrder = {
    "tipoDocumento",
    "dataEmissione",
    "numeroFattura",
    "descrizioneCausale",
    "importoTotaleDocumento",
    "importoImponibile",
    "totaleImposta",
    "art73"
})
public class DatiGeneraliFatturaTipo {

    @XmlElement(required = true)
    protected TipoDocumentoTipo tipoDocumento;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar dataEmissione;
    @XmlElement(required = true)
    protected String numeroFattura;
    @XmlElement(required = true)
    protected String descrizioneCausale;
    @XmlElement(required = true)
    protected BigDecimal importoTotaleDocumento;
    protected BigDecimal importoImponibile;
    protected BigDecimal totaleImposta;
    protected FlagSiNoTipo art73;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoTipo }
     *     
     */
    public TipoDocumentoTipo getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoTipo }
     *     
     */
    public void setTipoDocumento(TipoDocumentoTipo value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the dataEmissione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataEmissione() {
        return dataEmissione;
    }

    /**
     * Sets the value of the dataEmissione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEmissione(Calendar value) {
        this.dataEmissione = value;
    }

    /**
     * Gets the value of the numeroFattura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFattura() {
        return numeroFattura;
    }

    /**
     * Sets the value of the numeroFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFattura(String value) {
        this.numeroFattura = value;
    }

    /**
     * Gets the value of the descrizioneCausale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescrizioneCausale() {
        return descrizioneCausale;
    }

    /**
     * Sets the value of the descrizioneCausale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescrizioneCausale(String value) {
        this.descrizioneCausale = value;
    }

    /**
     * Gets the value of the importoTotaleDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoTotaleDocumento() {
        return importoTotaleDocumento;
    }

    /**
     * Sets the value of the importoTotaleDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoTotaleDocumento(BigDecimal value) {
        this.importoTotaleDocumento = value;
    }

    /**
     * Gets the value of the importoImponibile property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportoImponibile() {
        return importoImponibile;
    }

    /**
     * Sets the value of the importoImponibile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportoImponibile(BigDecimal value) {
        this.importoImponibile = value;
    }

    /**
     * Gets the value of the totaleImposta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotaleImposta() {
        return totaleImposta;
    }

    /**
     * Sets the value of the totaleImposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotaleImposta(BigDecimal value) {
        this.totaleImposta = value;
    }

    /**
     * Gets the value of the art73 property.
     * 
     * @return
     *     possible object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public FlagSiNoTipo getArt73() {
        return art73;
    }

    /**
     * Sets the value of the art73 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagSiNoTipo }
     *     
     */
    public void setArt73(FlagSiNoTipo value) {
        this.art73 = value;
    }

}
