/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codiceEsenzioneIVATipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="codiceEsenzioneIVATipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="N1"/>
 *     &lt;enumeration value="N2"/>
 *     &lt;enumeration value="N3"/>
 *     &lt;enumeration value="N4"/>
 *     &lt;enumeration value="N5"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codiceEsenzioneIVATipo")
@XmlEnum
public enum CodiceEsenzioneIVATipo {


    /**
     * NON APPLICABILE
     * 
     */
    NA("NA"),

    /**
     * ESCLUSE EX ART. 15
     * 
     */
    @XmlEnumValue("N1")
    N_1("N1"),

    /**
     * NON SOGGETTE
     * 
     */
    @XmlEnumValue("N2")
    N_2("N2"),

    /**
     * NON IMPONIBILI
     * 
     */
    @XmlEnumValue("N3")
    N_3("N3"),

    /**
     * ESENTI
     * 
     */
    @XmlEnumValue("N4")
    N_4("N4"),

    /**
     * REGIME DEL MARGINE
     * 
     */
    @XmlEnumValue("N5")
    N_5("N5");
    private final String value;

    CodiceEsenzioneIVATipo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodiceEsenzioneIVATipo fromValue(String v) {
        for (CodiceEsenzioneIVATipo c: CodiceEsenzioneIVATipo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
