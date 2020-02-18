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
 * <p>Java class for listaOperazioneTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaOperazioneTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operazione" type="{http://www.tesoro.it/fatture}operazioneTipo" maxOccurs="240"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaOperazioneTipo", propOrder = {
    "operazione"
})
public class ListaOperazioneTipo {

    @XmlElement(required = true)
    protected List<OperazioneTipo> operazione;

    /**
     * Gets the value of the operazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperazioneTipo }
     * 
     * 
     */
    public List<OperazioneTipo> getOperazione() {
        if (operazione == null) {
            operazione = new ArrayList<OperazioneTipo>();
        }
        return this.operazione;
    }

}
