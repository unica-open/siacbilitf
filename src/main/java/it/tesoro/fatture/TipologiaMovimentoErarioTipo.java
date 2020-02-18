/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipologiaMovimentoErarioTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipologiaMovimentoErarioTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pagamento"/>
 *     &lt;enumeration value="Storno"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipologiaMovimentoErarioTipo")
@XmlEnum
public enum TipologiaMovimentoErarioTipo {


    /**
     * 
     *                     			identifica un movimento di pagamento IVA
     *                 			
     * 
     */
    @XmlEnumValue("Pagamento")
    PAGAMENTO("Pagamento"),

    /**
     * 
     *                     			identifica un movimento di storno pagamento IVA
     *                 			
     * 
     */
    @XmlEnumValue("Storno")
    STORNO("Storno");
    private final String value;

    TipologiaMovimentoErarioTipo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipologiaMovimentoErarioTipo fromValue(String v) {
        for (TipologiaMovimentoErarioTipo c: TipologiaMovimentoErarioTipo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
