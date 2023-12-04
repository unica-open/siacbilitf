/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listaIdentificativoTransazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaIdentificativoTransazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transazione" type="{http://www.tesoro.it/fatture}identificativoTransazioneTipo" maxOccurs="240"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaIdentificativoTransazioneTipo", propOrder = {
    "transazione"
})
public class ListaIdentificativoTransazioneTipo {

    @XmlElement(required = true)
    protected List<IdentificativoTransazioneTipo> transazione;

    /**
     * Gets the value of the transazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificativoTransazioneTipo }
     * 
     * 
     */
    public List<IdentificativoTransazioneTipo> getTransazione() {
        if (transazione == null) {
            transazione = new ArrayList<IdentificativoTransazioneTipo>();
        }
        return this.transazione;
    }

}
