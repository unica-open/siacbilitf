/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for naturaSpesaContabiliTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="naturaSpesaContabiliTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="NA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "naturaSpesaContabiliTipo")
@XmlEnum
public enum NaturaSpesaContabiliTipo {


    /**
     * Spesa Corrente o classificazione equivalente (es. spesa per beni di consumo)
     * 
     */
    CO,

    /**
     * Conto Capitale o classificazione equivalente (es. spesa per investimento)
     * 
     */
    CA,

    /**
     * negli altri casi
     * 
     */
    NA;

    public String value() {
        return name();
    }

    public static NaturaSpesaContabiliTipo fromValue(String v) {
        return valueOf(v);
    }

}
