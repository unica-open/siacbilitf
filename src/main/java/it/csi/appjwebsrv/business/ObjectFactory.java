/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.appjwebsrv.business;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.appjwebsrv.business package. 
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

    private final static QName _VerificaEvasioneResponse_QNAME = new QName("http://business.appjwebsrv.csi.it/", "verificaEvasioneResponse");
    private final static QName _VerificaOutput_QNAME = new QName("http://business.appjwebsrv.csi.it/", "VerificaOutput");
    private final static QName _VerificaEvasione_QNAME = new QName("http://business.appjwebsrv.csi.it/", "verificaEvasione");
    private final static QName _VerificaInput_QNAME = new QName("http://business.appjwebsrv.csi.it/", "VerificaInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.appjwebsrv.business
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Evasioni }
     * 
     */
    public Evasioni createEvasioni() {
        return new Evasioni();
    }

    /**
     * Create an instance of {@link VerificaEvasioneResponse }
     * 
     */
    public VerificaEvasioneResponse createVerificaEvasioneResponse() {
        return new VerificaEvasioneResponse();
    }

    /**
     * Create an instance of {@link Impegno }
     * 
     */
    public Impegno createImpegno() {
        return new Impegno();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link EsitoServizio }
     * 
     */
    public EsitoServizio createEsitoServizio() {
        return new EsitoServizio();
    }

    /**
     * Create an instance of {@link VerificaEvasione }
     * 
     */
    public VerificaEvasione createVerificaEvasione() {
        return new VerificaEvasione();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaEvasioneResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.appjwebsrv.csi.it/", name = "verificaEvasioneResponse")
    public JAXBElement<VerificaEvasioneResponse> createVerificaEvasioneResponse(VerificaEvasioneResponse value) {
        return new JAXBElement<VerificaEvasioneResponse>(_VerificaEvasioneResponse_QNAME, VerificaEvasioneResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsitoServizio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.appjwebsrv.csi.it/", name = "VerificaOutput")
    public JAXBElement<EsitoServizio> createVerificaOutput(EsitoServizio value) {
        return new JAXBElement<EsitoServizio>(_VerificaOutput_QNAME, EsitoServizio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificaEvasione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.appjwebsrv.csi.it/", name = "verificaEvasione")
    public JAXBElement<VerificaEvasione> createVerificaEvasione(VerificaEvasione value) {
        return new JAXBElement<VerificaEvasione>(_VerificaEvasione_QNAME, VerificaEvasione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evasioni }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://business.appjwebsrv.csi.it/", name = "VerificaInput")
    public JAXBElement<Evasioni> createVerificaInput(Evasioni value) {
        return new JAXBElement<Evasioni>(_VerificaInput_QNAME, Evasioni.class, null, value);
    }

}
