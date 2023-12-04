/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/

package it.csi.siac.sirfelser.frontend.webservice.msg.inviofatturapa.services.sirfelservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.csi.sirfel.services.sirfelservice_1 package. 
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
public class ObjectFactoryServ {

    private static final QName _SmistaMessaggioResponse_QNAME = new QName("http://www.csi.it/sirfel/services/SirfelService-1.0", "SmistaMessaggioResponse");
    private static final QName _SmistaMessaggio_QNAME = new QName("http://www.csi.it/sirfel/services/SirfelService-1.0", "SmistaMessaggio");
    private static final QName _SmistaFatturaPA_QNAME = new QName("http://www.csi.it/sirfel/services/SirfelService-1.0", "SmistaFatturaPA");
    private static final QName _SmistaFatturaPAResponse_QNAME = new QName("http://www.csi.it/sirfel/services/SirfelService-1.0", "SmistaFatturaPAResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.csi.sirfel.services.sirfelservice_1
     */
    public ObjectFactoryServ() {
    	// Default empty constructor (only for javadoc)
    }

    /**
     * Create an instance of {@link ConfigurazioneEnteType }
     * 
     */
    public ConfigurazioneEnteType createConfigurazioneEnteType() {
        return new ConfigurazioneEnteType();
    }

    /**
     * Create an instance of {@link DatiPortaleFattureType }
     * 
     */
    public DatiPortaleFattureType createDatiPortaleFattureType() {
        return new DatiPortaleFattureType();
    }

    /**
     * Create an instance of {@link DatiPortaleFattureType.EstremiEsito }
     * 
     */
    public DatiPortaleFattureType.EstremiEsito createDatiPortaleFattureTypeEstremiEsito() {
        return new DatiPortaleFattureType.EstremiEsito();
    }

    /**
     * Create an instance of {@link ServiceResponseType }
     * 
     */
    public ServiceResponseType createServiceResponseType() {
        return new ServiceResponseType();
    }

    /**
     * Create an instance of {@link SmistaMessaggioType }
     * 
     */
    public SmistaMessaggioType createSmistaMessaggioType() {
        return new SmistaMessaggioType();
    }

    /**
     * Create an instance of {@link SmistaFatturaPAType }
     * 
     */
    public SmistaFatturaPAType createSmistaFatturaPAType() {
        return new SmistaFatturaPAType();
    }

    /**
     * Create an instance of {@link InformazioniAggiuntiveType }
     * 
     */
    public InformazioniAggiuntiveType createInformazioniAggiuntiveType() {
        return new InformazioniAggiuntiveType();
    }

    /**
     * Create an instance of {@link EmbeddedXMLType }
     * 
     */
    public EmbeddedXMLType createEmbeddedXMLType() {
        return new EmbeddedXMLType();
    }

    /**
     * Create an instance of {@link DatiMessaggioPFType }
     * 
     */
    public DatiMessaggioPFType createDatiMessaggioPFType() {
        return new DatiMessaggioPFType();
    }

    /**
     * Create an instance of {@link InformazioneType }
     * 
     */
    public InformazioneType createInformazioneType() {
        return new InformazioneType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link ConfigurazioneEnteType.Params }
     * 
     */
    public ConfigurazioneEnteType.Params createConfigurazioneEnteTypeParams() {
        return new ConfigurazioneEnteType.Params();
    }

    /**
     * Create an instance of {@link DatiPortaleFattureType.EstremiEsito.Utente }
     * 
     */
    public DatiPortaleFattureType.EstremiEsito.Utente createDatiPortaleFattureTypeEstremiEsitoUtente() {
        return new DatiPortaleFattureType.EstremiEsito.Utente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/sirfel/services/SirfelService-1.0", name = "SmistaMessaggioResponse")
    public JAXBElement<ServiceResponseType> createSmistaMessaggioResponse(ServiceResponseType value) {
        return new JAXBElement<ServiceResponseType>(_SmistaMessaggioResponse_QNAME, ServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmistaMessaggioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/sirfel/services/SirfelService-1.0", name = "SmistaMessaggio")
    public JAXBElement<SmistaMessaggioType> createSmistaMessaggio(SmistaMessaggioType value) {
        return new JAXBElement<SmistaMessaggioType>(_SmistaMessaggio_QNAME, SmistaMessaggioType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmistaFatturaPAType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/sirfel/services/SirfelService-1.0", name = "SmistaFatturaPA")
    public JAXBElement<SmistaFatturaPAType> createSmistaFatturaPA(SmistaFatturaPAType value) {
        return new JAXBElement<SmistaFatturaPAType>(_SmistaFatturaPA_QNAME, SmistaFatturaPAType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.csi.it/sirfel/services/SirfelService-1.0", name = "SmistaFatturaPAResponse")
    public JAXBElement<ServiceResponseType> createSmistaFatturaPAResponse(ServiceResponseType value) {
        return new JAXBElement<ServiceResponseType>(_SmistaFatturaPAResponse_QNAME, ServiceResponseType.class, null, value);
    }

}
