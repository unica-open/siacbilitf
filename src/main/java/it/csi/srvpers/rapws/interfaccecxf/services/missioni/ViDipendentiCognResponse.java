/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.srvpers.rapws.interfaccecxf.services.missioni;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for viDipendentiCognResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="viDipendentiCognResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="missioneDataTypeList" type="{http://missioni.services.interfaccecxf.rapws.srvpers.csi.it/}missioneDataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viDipendentiCognResponse", propOrder = {
    "missioneDataTypeList"
})
public class ViDipendentiCognResponse {

    protected List<MissioneDataType> missioneDataTypeList;

    /**
     * Gets the value of the missioneDataTypeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missioneDataTypeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissioneDataTypeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissioneDataType }
     * 
     * 
     */
    public List<MissioneDataType> getMissioneDataTypeList() {
        if (missioneDataTypeList == null) {
            missioneDataTypeList = new ArrayList<MissioneDataType>();
        }
        return this.missioneDataTypeList;
    }

}
