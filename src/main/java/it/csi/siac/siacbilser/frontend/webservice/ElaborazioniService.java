/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacbilser.frontend.webservice.msg.EsisteElaborazioneAttiva;
import it.csi.siac.siacbilser.frontend.webservice.msg.EsisteElaborazioneAttivaResponse;

/**
 * @author AR
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "ElaborazioniService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ElaborazioniService {

	@WebMethod
	@WebResult
	EsisteElaborazioneAttivaResponse esisteElaborazioneAttiva(@WebParam EsisteElaborazioneAttiva request);
}

