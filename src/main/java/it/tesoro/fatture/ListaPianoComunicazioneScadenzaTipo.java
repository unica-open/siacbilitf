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
 * <p>Java class for listaPianoComunicazioneScadenzaTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listaPianoComunicazioneScadenzaTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comunicazioneScadenza" type="{http://www.tesoro.it/fatture}pianoComunicazioneScadenzaTipo" maxOccurs="240"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaPianoComunicazioneScadenzaTipo", propOrder = {
    "comunicazioneScadenza"
})
public class ListaPianoComunicazioneScadenzaTipo {

    @XmlElement(required = true)
    protected List<PianoComunicazioneScadenzaTipo> comunicazioneScadenza;

    /**
     * Gets the value of the comunicazioneScadenza property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comunicazioneScadenza property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComunicazioneScadenza().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PianoComunicazioneScadenzaTipo }
     * 
     * 
     */
    public List<PianoComunicazioneScadenzaTipo> getComunicazioneScadenza() {
        if (comunicazioneScadenza == null) {
            comunicazioneScadenza = new ArrayList<PianoComunicazioneScadenzaTipo>();
        }
        return this.comunicazioneScadenza;
    }

}
