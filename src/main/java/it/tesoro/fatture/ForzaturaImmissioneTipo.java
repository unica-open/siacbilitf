/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forzaturaImmissioneTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="forzaturaImmissioneTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AG"/>
 *     &lt;enumeration value="SO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "forzaturaImmissioneTipo")
@XmlEnum
public enum ForzaturaImmissioneTipo {


    /**
     * Aggiungi la fattura come nuova
     * 
     */
    AG,

    /**
     * Sovrascrivi la fattura gia' presente
     * 
     */
    SO;

    public String value() {
        return name();
    }

    public static ForzaturaImmissioneTipo fromValue(String v) {
        return valueOf(v);
    }

}
