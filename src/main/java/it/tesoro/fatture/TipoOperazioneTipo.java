/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.tesoro.fatture;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoOperazioneTipo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoOperazioneTipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CP"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="RF"/>
 *     &lt;enumeration value="RC"/>
 *     &lt;enumeration value="CCS"/>
 *     &lt;enumeration value="SC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoOperazioneTipo")
@XmlEnum
public enum TipoOperazioneTipo {


    /**
     * 
     *                     			OPERAZIONE DI PAGAMENTO
     *                 			
     * 
     */
    CP,

    /**
     * 
     *                     			OPERAZIONE DI STORNO PAGAMENTO
     *                 			
     * 
     */
    SP,

    /**
     * OPERAZIONE DI COMUNICAZIONE SCADENZA
     * 
     */
    CS,

    /**
     * OPERAZIONE DI CONTABILIZZAZIONE FATTURA
     * 
     */
    CO,

    /**
     * OPERAZIONE DI RIFIUTO FATTURA
     * 
     */
    RF,

    /**
     * OPERAZIONE DI RICEZIONE FATTURA
     * 
     */
    RC,

    /**
     * OPERAZIONE DI CANCELLAZIONE COMUNICAZIONI SCADENZA
     * 
     */
    CCS,

    /**
     * OPERAZIONE DI STORNO CONTABILIZZAZIONE
     * 
     */
    SC;

    public String value() {
        return name();
    }

    public static TipoOperazioneTipo fromValue(String v) {
        return valueOf(v);
    }

}
