/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pcc.marc.services.webservices_1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import it.csi.siac.pcc.marc.schema.marccommontypes_1.ResultType;
import it.tesoro.fatture.ProxyOperazioneContabileRichiestaTipo;

/**
 *  Interfaccia del servizio MARC invioOperazioneContabile.
 *  
 *  @version 1.0.0
 */

@WebService(name = "MarcWSPortType", targetNamespace = "http://www.csi.it/marc/services/webservices-1.0", portName="MarcProxyServiceHttpSoap11Endpoint")
@XmlSeeAlso({
    it.csi.siac.pcc.marc.schema.marcservicestypes_1.ObjectFactory.class,
    it.csi.siac.pcc.marc.schema.marccommontypes_1.ObjectFactory.class,
    it.tesoro.fatture.ObjectFactory.class
})
public interface MarcWSPortType {


    /**
     * 
     * @param datiRichiestaOperazioneContabile
     * @return
     *     returns it.csi.siac.pcc.marc.schema.marccommontypes_1.ResultType
     */
    @WebMethod(operationName = "InvioOperazioneContabile", action = "http://www.csi.it/marc/webservices/InvioOperazioneContabile")
    @WebResult(name = "Result", targetNamespace = "http://www.csi.it/marc/schema/MarcCommonTypes-1.0")
    @RequestWrapper(localName = "InvioOperazioneContabile", targetNamespace = "http://www.csi.it/marc/schema/MarcServicesTypes-1.0", className = "it.csi.siac.pcc.marc.schema.marcservicestypes_1.InvioOperazioneContabile")
    @ResponseWrapper(localName = "MarcServicesResponse", targetNamespace = "http://www.csi.it/marc/schema/MarcServicesTypes-1.0", className = "it.csi.siac.pcc.marc.schema.marccommontypes_1.ResponseType")
    public ResultType invioOperazioneContabile(
        @WebParam(name = "DatiRichiestaOperazioneContabile", targetNamespace = "http://www.csi.it/marc/schema/MarcServicesTypes-1.0")
        ProxyOperazioneContabileRichiestaTipo datiRichiestaOperazioneContabile);

}