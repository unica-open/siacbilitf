/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statoDocumentoTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statoDocumentoTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="RI"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="RE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statoDocumentoTipo")
@XmlEnum
public enum StatoDocumentoTipo {


    /**
     * IN LAVORAZIONE
     * 
     */
    IL,

    /**
     * BOZZA
     * 
     */
    BO,

    /**
     * PRESENTATA
     * 
     */
    PR,

    /**
     * RICEVUTA
     * 
     */
    RI,

    /**
     * LAVORATA
     * 
     */
    LA,

    /**
     * RESPINTA
     * 
     */
    RE;

    public String value() {
        return name();
    }

    public static StatoDocumentoTipo fromValue(String v) {
        return valueOf(v);
    }

}
