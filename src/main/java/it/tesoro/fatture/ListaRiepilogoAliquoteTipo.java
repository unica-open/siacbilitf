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
 * <p>Java class for listaRiepilogoAliquoteTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaRiepilogoAliquoteTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="riepilogoAliquote" type="{http://www.tesoro.it/fatture}riepilogoAliquoteTipo" maxOccurs="240"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaRiepilogoAliquoteTipo", propOrder = {
    "riepilogoAliquote"
})
public class ListaRiepilogoAliquoteTipo {

    @XmlElement(required = true)
    protected List<RiepilogoAliquoteTipo> riepilogoAliquote;

    /**
     * Gets the value of the riepilogoAliquote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riepilogoAliquote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRiepilogoAliquote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RiepilogoAliquoteTipo }
     * 
     * 
     */
    public List<RiepilogoAliquoteTipo> getRiepilogoAliquote() {
        if (riepilogoAliquote == null) {
            riepilogoAliquote = new ArrayList<RiepilogoAliquoteTipo>();
        }
        return this.riepilogoAliquote;
    }

}
