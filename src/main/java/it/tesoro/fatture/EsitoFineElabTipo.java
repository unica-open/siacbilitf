/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for esitoFineElabTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="esitoFineElabTipo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.tesoro.it/fatture}esitoBaseTipo">
 *       &lt;sequence>
 *         &lt;element name="dataFineElaborazione" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "esitoFineElabTipo", propOrder = {
    "dataFineElaborazione"
})
@XmlSeeAlso({
    DatiRispostaElencoMovimentiErarioReadTipo.class,
    DatiRispostaDownloadDocumentoReadTipo.class,
    DatiRispostaInterrogazioneEsitiQueryTipo.class,
    DatiRispostaStatoFatturaReadTipo.class,
    EsitoElabTransazTipo.class
})
public class EsitoFineElabTipo
    extends EsitoBaseTipo
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dataFineElaborazione;

    /**
     * Gets the value of the dataFineElaborazione property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDataFineElaborazione() {
        return dataFineElaborazione;
    }

    /**
     * Sets the value of the dataFineElaborazione property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFineElaborazione(Calendar value) {
        this.dataFineElaborazione = value;
    }

}
