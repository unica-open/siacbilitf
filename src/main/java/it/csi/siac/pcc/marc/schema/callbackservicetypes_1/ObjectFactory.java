/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.pcc.marc.schema.callbackservicetypes_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.siac.pcc.marc.schema.marccommontypes_1.ResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.siac.pcc.marc.schema.callbackservicetypes_1 package. 
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

    private final static QName _AggiornamentoStatoRichiestaResponse_QNAME = new QName("http://www.csi.it/marc/schema/CallbackServiceTypes-1.0", "AggiornamentoStatoRichiestaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.siac.pcc.marc.schema.callbackservicetypes_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiornamentoStatoRichiestaRequest }
     * 
     */
    public AggiornamentoStatoRichiestaRequest createAggiornamentoStatoRichiestaRequest() {
        return new AggiornamentoStatoRichiestaRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/marc/schema/CallbackServiceTypes-1.0", name = "AggiornamentoStatoRichiestaResponse")
    public JAXBElement<ResponseType> createAggiornamentoStatoRichiestaResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_AggiornamentoStatoRichiestaResponse_QNAME, ResponseType.class, null, value);
    }

}
