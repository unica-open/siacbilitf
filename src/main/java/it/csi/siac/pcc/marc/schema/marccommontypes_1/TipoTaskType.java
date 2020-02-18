/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.marccommontypes_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTaskType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTaskType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LETTURA_ESITI_OPERAZIONI_PCC"/>
 *     &lt;enumeration value="TRATTAMENTO_RICHIESTE_SOSPESE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoTaskType")
@XmlEnum
public enum TipoTaskType {

    LETTURA_ESITI_OPERAZIONI_PCC,
    TRATTAMENTO_RICHIESTE_SOSPESE;

    public String value() {
        return name();
    }

    public static TipoTaskType fromValue(String v) {
        return valueOf(v);
    }

}
