/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InformazioniAggiuntiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformazioniAggiuntiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Informazione" type="{http://www.csi.it/sirfel/services/SirfelService-1.0}InformazioneType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformazioniAggiuntiveType", propOrder = {
    "informazione"
})
public class InformazioniAggiuntiveType {

    @XmlElement(name = "Informazione", required = true)
    protected List<InformazioneType> informazione;

    /**
     * Gets the value of the informazione property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informazione property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformazione().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformazioneType }
     * 
     * 
     */
    public List<InformazioneType> getInformazione() {
        if (informazione == null) {
            informazione = new ArrayList<InformazioneType>();
        }
        return this.informazione;
    }

}
