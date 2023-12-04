/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.feltobilancio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import it.csi.fel.eis.types.FatturaType;


/**
 * <p>Java class for TestataEsitoFatturaAttivaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestataEsitoFatturaAttivaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdMessaggio" type="{http://www.csi.it/fel/eis/types}String35Type"/>
 *         &lt;element name="DataOraInvio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodiceApplicativoChiamante" type="{http://www.csi.it/fel/eis/types}String35Type"/>
 *         &lt;element name="CFEnte" type="{http://www.csi.it/fel/eis/types}idFiscaleIvaTipo"/>
 *         &lt;element name="DatiFattura" type="{http://www.csi.it/fel/eis/types}FatturaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestataEsitoFatturaAttivaType", propOrder = {
    "idMessaggio",
    "dataOraInvio",
    "codiceApplicativoChiamante",
    "cfEnte",
    "datiFattura"
})
public class TestataEsitoFatturaAttivaType {

    @XmlElement(name = "IdMessaggio", required = true)
    protected String idMessaggio;
    @XmlElement(name = "DataOraInvio", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraInvio;
    @XmlElement(name = "CodiceApplicativoChiamante", required = true)
    protected String codiceApplicativoChiamante;
    @XmlElement(name = "CFEnte", required = true)
    protected String cfEnte;
    @XmlElement(name = "DatiFattura", required = true)
    protected FatturaType datiFattura;

    /**
     * Gets the value of the idMessaggio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMessaggio() {
        return idMessaggio;
    }

    /**
     * Sets the value of the idMessaggio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMessaggio(String value) {
        this.idMessaggio = value;
    }

    /**
     * Gets the value of the dataOraInvio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraInvio() {
        return dataOraInvio;
    }

    /**
     * Sets the value of the dataOraInvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraInvio(XMLGregorianCalendar value) {
        this.dataOraInvio = value;
    }

    /**
     * Gets the value of the codiceApplicativoChiamante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodiceApplicativoChiamante() {
        return codiceApplicativoChiamante;
    }

    /**
     * Sets the value of the codiceApplicativoChiamante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodiceApplicativoChiamante(String value) {
        this.codiceApplicativoChiamante = value;
    }

    /**
     * Gets the value of the cfEnte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFEnte() {
        return cfEnte;
    }

    /**
     * Sets the value of the cfEnte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFEnte(String value) {
        this.cfEnte = value;
    }

    /**
     * Gets the value of the datiFattura property.
     * 
     * @return
     *     possible object is
     *     {@link FatturaType }
     *     
     */
    public FatturaType getDatiFattura() {
        return datiFattura;
    }

    /**
     * Sets the value of the datiFattura property.
     * 
     * @param value
     *     allowed object is
     *     {@link FatturaType }
     *     
     */
    public void setDatiFattura(FatturaType value) {
        this.datiFattura = value;
    }

}
