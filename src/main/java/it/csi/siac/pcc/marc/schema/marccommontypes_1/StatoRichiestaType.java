/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.marccommontypes_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatoRichiestaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatoRichiestaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_CORSO_DI_ACQUISIZIONE"/>
 *     &lt;enumeration value="ERRORE_IN_FASE_DI_ACQUISIZIONE"/>
 *     &lt;enumeration value="DA_ELABORARE"/>
 *     &lt;enumeration value="ERRORE_IN_FASE_DI_ELABORAZIONE"/>
 *     &lt;enumeration value="INVIATA_A_PCC"/>
 *     &lt;enumeration value="ESEGUITA"/>
 *     &lt;enumeration value="ERRORE_PCC_IN_FASE_DI_TRASMISSIONE"/>
 *     &lt;enumeration value="ERRORE_PCC_IN_FASE_DI_ELABORAZIONE"/>
 *     &lt;enumeration value="SOSPESA"/>
 *     &lt;enumeration value="NON_TRATTATA"/>
 *     &lt;enumeration value="ERRORE_IN_FASE_DI_INVIO_A_PCC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatoRichiestaType")
@XmlEnum
public enum StatoRichiestaType {

    IN_CORSO_DI_ACQUISIZIONE,
    ERRORE_IN_FASE_DI_ACQUISIZIONE,
    DA_ELABORARE,
    ERRORE_IN_FASE_DI_ELABORAZIONE,
    INVIATA_A_PCC,
    ESEGUITA,
    ERRORE_PCC_IN_FASE_DI_TRASMISSIONE,
    ERRORE_PCC_IN_FASE_DI_ELABORAZIONE,
    SOSPESA,
    NON_TRATTATA,
    ERRORE_IN_FASE_DI_INVIO_A_PCC;

    public String value() {
        return name();
    }

    public static StatoRichiestaType fromValue(String v) {
        return valueOf(v);
    }

}
