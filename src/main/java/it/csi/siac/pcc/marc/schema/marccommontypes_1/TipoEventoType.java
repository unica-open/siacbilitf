/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.marccommontypes_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEventoType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEventoType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRASMISSIONE_RICHIESTA_A_PCC"/>
 *     &lt;enumeration value="LETTURA_ESITO_OPERAZIONE_PCC"/>
 *     &lt;enumeration value="AGGIORNA_STATO_RICHIESTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEventoType")
@XmlEnum
public enum TipoEventoType {

    TRASMISSIONE_RICHIESTA_A_PCC,
    LETTURA_ESITO_OPERAZIONE_PCC,
    AGGIORNA_STATO_RICHIESTA;

    public String value() {
        return name();
    }

    public static TipoEventoType fromValue(String v) {
        return valueOf(v);
    }

}
