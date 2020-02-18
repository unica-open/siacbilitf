/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.fel.eis.bilanciotofel.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.fel.eis.types.ResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.fel.eis.bilanciotofel.types package. 
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

    private final static QName _InvioFatturaAttivaResponse_QNAME = new QName("http://www.csi.it/fel/eis/bilancioToFel/types", "InvioFatturaAttivaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.fel.eis.bilanciotofel.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvioFatturaAttivaRequest }
     * 
     */
    public InvioFatturaAttivaRequest createInvioFatturaAttivaRequest() {
        return new InvioFatturaAttivaRequest();
    }

    /**
     * Create an instance of {@link TestataInvioFatturaAttivaType }
     * 
     */
    public TestataInvioFatturaAttivaType createTestataInvioFatturaAttivaType() {
        return new TestataInvioFatturaAttivaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/fel/eis/bilancioToFel/types", name = "InvioFatturaAttivaResponse")
    public JAXBElement<ResponseType> createInvioFatturaAttivaResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_InvioFatturaAttivaResponse_QNAME, ResponseType.class, null, value);
    }

}
