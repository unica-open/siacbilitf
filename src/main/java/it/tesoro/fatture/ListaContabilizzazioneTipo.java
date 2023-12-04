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
 * <p>Java class for listaContabilizzazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaContabilizzazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contabilizzazione" type="{http://www.tesoro.it/fatture}contabilizzazioneTipo" maxOccurs="230"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaContabilizzazioneTipo", propOrder = {
    "contabilizzazione"
})
public class ListaContabilizzazioneTipo {

    @XmlElement(required = true)
    protected List<ContabilizzazioneTipo> contabilizzazione;

    /**
     * Gets the value of the contabilizzazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contabilizzazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContabilizzazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContabilizzazioneTipo }
     * 
     * 
     */
    public List<ContabilizzazioneTipo> getContabilizzazione() {
        if (contabilizzazione == null) {
            contabilizzazione = new ArrayList<ContabilizzazioneTipo>();
        }
        return this.contabilizzazione;
    }

}
