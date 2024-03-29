/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.25 at 03:07:32 PM CEST 
//


package it.csi.epay.epaywso.rendicontazione;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.epay.epaywso.rendicontazione package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FlussoRiconciliazione_QNAME = new QName("http://www.csi.it/epay/epaywso/rendicontazione", "FlussoRiconciliazione");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.epay.epaywso.rendicontazione
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FlussoSintesiType }
     * 
     */
    public FlussoSintesiType createFlussoSintesiType() {
        return new FlussoSintesiType();
    }

    /**
     * Create an instance of {@link FlussoRiconciliazioneType }
     * 
     */
    public FlussoRiconciliazioneType createFlussoRiconciliazioneType() {
        return new FlussoRiconciliazioneType();
    }

    /**
     * Create an instance of {@link TestataFlussoRiconciliazioneType }
     * 
     */
    public TestataFlussoRiconciliazioneType createTestataFlussoRiconciliazioneType() {
        return new TestataFlussoRiconciliazioneType();
    }

    /**
     * Create an instance of {@link FlussoDettaglioType }
     * 
     */
    public FlussoDettaglioType createFlussoDettaglioType() {
        return new FlussoDettaglioType();
    }

    /**
     * Create an instance of {@link FlussoSintesiType.RigheDettaglio }
     * 
     */
    public FlussoSintesiType.RigheDettaglio createFlussoSintesiTypeRigheDettaglio() {
        return new FlussoSintesiType.RigheDettaglio();
    }

    /**
     * Create an instance of {@link FlussoRiconciliazioneType.RigheSintesi }
     * 
     */
    public FlussoRiconciliazioneType.RigheSintesi createFlussoRiconciliazioneTypeRigheSintesi() {
        return new FlussoRiconciliazioneType.RigheSintesi();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlussoRiconciliazioneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/epay/epaywso/rendicontazione", name = "FlussoRiconciliazione")
    public JAXBElement<FlussoRiconciliazioneType> createFlussoRiconciliazione(FlussoRiconciliazioneType value) {
        return new JAXBElement<FlussoRiconciliazioneType>(_FlussoRiconciliazione_QNAME, FlussoRiconciliazioneType.class, null, value);
    }

}
