/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.feltobilancio;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatoFatturaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatoFatturaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DA_CONSEGNARE"/>
 *     &lt;enumeration value="CONSEGNATO"/>
 *     &lt;enumeration value="IN_ERRORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatoFatturaType")
@XmlEnum
public enum StatoFatturaType {

    DA_CONSEGNARE,
    CONSEGNATO,
    IN_ERRORE;

    public String value() {
        return name();
    }

    public static StatoFatturaType fromValue(String v) {
        return valueOf(v);
    }

}
