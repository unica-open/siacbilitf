/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statoTransazioneTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statoTransazioneTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EL_AT : Transazione in attesa di elaborazione"/>
 *     &lt;enumeration value="EL_CO : Transazione in corso di elaborazione"/>
 *     &lt;enumeration value="EL_OK : Transazione elaborata con esito positivo"/>
 *     &lt;enumeration value="EL_KO : Transazione elaborata con esito negativo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statoTransazioneTipo")
@XmlEnum
public enum StatoTransazioneTipo {

    @XmlEnumValue("EL_AT : Transazione in attesa di elaborazione")
    EL_AT_TRANSAZIONE_IN_ATTESA_DI_ELABORAZIONE("EL_AT : Transazione in attesa di elaborazione"),
    @XmlEnumValue("EL_CO : Transazione in corso di elaborazione")
    EL_CO_TRANSAZIONE_IN_CORSO_DI_ELABORAZIONE("EL_CO : Transazione in corso di elaborazione"),
    @XmlEnumValue("EL_OK : Transazione elaborata con esito positivo")
    EL_OK_TRANSAZIONE_ELABORATA_CON_ESITO_POSITIVO("EL_OK : Transazione elaborata con esito positivo"),
    @XmlEnumValue("EL_KO : Transazione elaborata con esito negativo")
    EL_KO_TRANSAZIONE_ELABORATA_CON_ESITO_NEGATIVO("EL_KO : Transazione elaborata con esito negativo");
    private final String value;

    StatoTransazioneTipo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatoTransazioneTipo fromValue(String v) {
        for (StatoTransazioneTipo c: StatoTransazioneTipo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
