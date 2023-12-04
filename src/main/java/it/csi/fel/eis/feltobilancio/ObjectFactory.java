/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.feltobilancio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.fel.eis.types.ResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.fel.eis.feltobilancio package. 
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

    private final static QName _EsitoFatturaAttivaResponse_QNAME = new QName("http://www.csi.it/fel/eis/FelToBilancio", "EsitoFatturaAttivaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.fel.eis.feltobilancio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EsitoFatturaAttivaRequest }
     * 
     */
    public EsitoFatturaAttivaRequest createEsitoFatturaAttivaRequest() {
        return new EsitoFatturaAttivaRequest();
    }

    /**
     * Create an instance of {@link TestataEsitoFatturaAttivaType }
     * 
     */
    public TestataEsitoFatturaAttivaType createTestataEsitoFatturaAttivaType() {
        return new TestataEsitoFatturaAttivaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/fel/eis/FelToBilancio", name = "EsitoFatturaAttivaResponse")
    public JAXBElement<ResponseType> createEsitoFatturaAttivaResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_EsitoFatturaAttivaResponse_QNAME, ResponseType.class, null, value);
    }

}
