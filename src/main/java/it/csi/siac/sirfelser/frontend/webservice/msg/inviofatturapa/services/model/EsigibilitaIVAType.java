/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.24 at 03:03:54 PM CET 
//


package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EsigibilitaIVAType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EsigibilitaIVAType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="S"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EsigibilitaIVAType")
@XmlEnum
public enum EsigibilitaIVAType {


    /**
     * esigibilit&agrave; differita
     * 
     */
    D,

    /**
     * esigibilit&agrave; immediata
     * 
     */
    I,

    /**
     * scissione dei pagamenti
     * 
     */
    S;

    public String value() {
        return name();
    }

    public static EsigibilitaIVAType fromValue(String v) {
        return valueOf(v);
    }

}
