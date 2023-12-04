/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.epay.epaywso.riconciliazione_versamenti_psp.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import it.csi.epay.epaywso.types.ResponseType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.epay.epaywso.riconciliazione_versamenti_psp.types package. 
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

    private final static QName _TrasmettiFlussiPagoPAResponse_QNAME = new QName("http://www.csi.it/epay/epaywso/riconciliazione-versamenti-psp/types", "TrasmettiFlussiPagoPAResponse");
    private final static QName _EsitoFlussiPagoPARequest_QNAME = new QName("http://www.csi.it/epay/epaywso/riconciliazione-versamenti-psp/types", "EsitoFlussiPagoPARequest");
    private final static QName _TrasmettiFlussiInErrorePagoPAResponse_QNAME = new QName("http://www.csi.it/epay/epaywso/riconciliazione-versamenti-psp/types", "TrasmettiFlussiInErrorePagoPAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.epay.epaywso.riconciliazione_versamenti_psp.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RicercaProvvisoriPagoPARequest }
     * 
     */
    public RicercaProvvisoriPagoPARequest createRicercaProvvisoriPagoPARequest() {
        return new RicercaProvvisoriPagoPARequest();
    }

    /**
     * Create an instance of {@link RicercaProvvisoriPagoPAResponse }
     * 
     */
    public RicercaProvvisoriPagoPAResponse createRicercaProvvisoriPagoPAResponse() {
        return new RicercaProvvisoriPagoPAResponse();
    }

    /**
     * Create an instance of {@link EsitoFlussiPagoPAResponse }
     * 
     */
    public EsitoFlussiPagoPAResponse createEsitoFlussiPagoPAResponse() {
        return new EsitoFlussiPagoPAResponse();
    }

    /**
     * Create an instance of {@link TrasmettiFlussiPagoPARequest }
     * 
     */
    public TrasmettiFlussiPagoPARequest createTrasmettiFlussiPagoPARequest() {
        return new TrasmettiFlussiPagoPARequest();
    }

    /**
     * Create an instance of {@link TestataTrasmissioneFlussiType }
     * 
     */
    public TestataTrasmissioneFlussiType createTestataTrasmissioneFlussiType() {
        return new TestataTrasmissioneFlussiType();
    }

    /**
     * Create an instance of {@link TrasmettiFlussiInErrorePagoPARequest }
     * 
     */
    public TrasmettiFlussiInErrorePagoPARequest createTrasmettiFlussiInErrorePagoPARequest() {
        return new TrasmettiFlussiInErrorePagoPARequest();
    }

    /**
     * Create an instance of {@link TestataFlussiInErrore }
     * 
     */
    public TestataFlussiInErrore createTestataFlussiInErrore() {
        return new TestataFlussiInErrore();
    }

    /**
     * Create an instance of {@link RicercaProvvisoriPagoPARequest.ElencoCausaliVersamenti }
     * 
     */
    public RicercaProvvisoriPagoPARequest.ElencoCausaliVersamenti createRicercaProvvisoriPagoPARequestElencoCausaliVersamenti() {
        return new RicercaProvvisoriPagoPARequest.ElencoCausaliVersamenti();
    }

    /**
     * Create an instance of {@link RicercaProvvisoriPagoPAResponse.ElencoProvvisori }
     * 
     */
    public RicercaProvvisoriPagoPAResponse.ElencoProvvisori createRicercaProvvisoriPagoPAResponseElencoProvvisori() {
        return new RicercaProvvisoriPagoPAResponse.ElencoProvvisori();
    }

    /**
     * Create an instance of {@link ProvvisorioType }
     * 
     */
    public ProvvisorioType createProvvisorioType() {
        return new ProvvisorioType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/epay/epaywso/riconciliazione-versamenti-psp/types", name = "TrasmettiFlussiPagoPAResponse")
    public JAXBElement<ResponseType> createTrasmettiFlussiPagoPAResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_TrasmettiFlussiPagoPAResponse_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestataTrasmissioneFlussiType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/epay/epaywso/riconciliazione-versamenti-psp/types", name = "EsitoFlussiPagoPARequest")
    public JAXBElement<TestataTrasmissioneFlussiType> createEsitoFlussiPagoPARequest(TestataTrasmissioneFlussiType value) {
        return new JAXBElement<TestataTrasmissioneFlussiType>(_EsitoFlussiPagoPARequest_QNAME, TestataTrasmissioneFlussiType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/epay/epaywso/riconciliazione-versamenti-psp/types", name = "TrasmettiFlussiInErrorePagoPAResponse")
    public JAXBElement<ResponseType> createTrasmettiFlussiInErrorePagoPAResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_TrasmettiFlussiInErrorePagoPAResponse_QNAME, ResponseType.class, null, value);
    }

}
