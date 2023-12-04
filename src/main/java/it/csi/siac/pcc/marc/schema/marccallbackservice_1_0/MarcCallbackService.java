/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pcc.marc.schema.marccallbackservice_1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 
 * Interfaccia di callback del servizio MARC.
 * 
 * This class was generated by Apache CXF 2.4.6
 * 2015-11-03T12:13:21.034+01:00
 * Generated source version: 2.4.6
 * 
 */
@WebService(targetNamespace = "http://www.csi.it/marc/schema/MarcCallbackService-1.0", name = "MarcCallbackService")
@XmlSeeAlso({it.tesoro.fatture.ObjectFactory.class, 
	it.csi.siac.pcc.marc.schema.callbackservicetypes_1.ObjectFactory.class, 
	it.csi.siac.pcc.marc.schema.marccommontypes_1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MarcCallbackService {

    @WebResult(name = "AggiornamentoStatoRichiestaResponse", targetNamespace = "http://www.csi.it/marc/schema/CallbackServiceTypes-1.0", partName = "parameters")
    @WebMethod(operationName = "AggiornamentoStatoRichiesta", action = "http://www.csi.it/marc/types/MarcCallbackService-1.0/AggiornamentoStatoRichiesta")
    public it.csi.siac.pcc.marc.schema.marccommontypes_1.ResponseType aggiornamentoStatoRichiesta(
        @WebParam(partName = "parameters", name = "AggiornamentoStatoRichiestaRequest", targetNamespace = "http://www.csi.it/marc/schema/CallbackServiceTypes-1.0")
        it.csi.siac.pcc.marc.schema.callbackservicetypes_1.AggiornamentoStatoRichiestaRequest parameters
    );
}
