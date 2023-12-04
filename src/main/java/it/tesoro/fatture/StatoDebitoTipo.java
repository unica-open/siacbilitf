/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statoDebitoTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statoDebitoTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LIQ"/>
 *     &lt;enumeration value="SOSP"/>
 *     &lt;enumeration value="NOLIQ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statoDebitoTipo")
@XmlEnum
public enum StatoDebitoTipo {


    /**
     * LIQUIDATO
     * 
     */
    LIQ,

    /**
     * SOSPESO
     * 
     */
    SOSP,

    /**
     * NO LIQUIDATO
     * 
     */
    NOLIQ;

    public String value() {
        return name();
    }

    public static StatoDebitoTipo fromValue(String v) {
        return valueOf(v);
    }

}
