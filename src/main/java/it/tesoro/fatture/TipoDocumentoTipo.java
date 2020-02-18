/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDocumentoTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoDocumentoTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TD01"/>
 *     &lt;enumeration value="TD02"/>
 *     &lt;enumeration value="TD03"/>
 *     &lt;enumeration value="TD04"/>
 *     &lt;enumeration value="TD05"/>
 *     &lt;enumeration value="TD06"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoDocumentoTipo")
@XmlEnum
public enum TipoDocumentoTipo {


    /**
     * FATTURA
     * 
     */
    @XmlEnumValue("TD01")
    TD_01("TD01"),

    /**
     * ACCONTO/ANTICIPO SU FATTURA
     * 
     */
    @XmlEnumValue("TD02")
    TD_02("TD02"),

    /**
     * ACCONTO/ANTICIPO SU PARCELLA
     * 
     */
    @XmlEnumValue("TD03")
    TD_03("TD03"),

    /**
     * NOTA DI CREDITO
     * 
     */
    @XmlEnumValue("TD04")
    TD_04("TD04"),

    /**
     * NOTA DI DEBITO
     * 
     */
    @XmlEnumValue("TD05")
    TD_05("TD05"),

    /**
     * PARCELLA
     * 
     */
    @XmlEnumValue("TD06")
    TD_06("TD06");
    private final String value;

    TipoDocumentoTipo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoDocumentoTipo fromValue(String v) {
        for (TipoDocumentoTipo c: TipoDocumentoTipo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
