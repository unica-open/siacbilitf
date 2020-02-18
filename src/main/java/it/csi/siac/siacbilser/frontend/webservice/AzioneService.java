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

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaAzionePerChiave;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaAzionePerChiaveResponse;

/**
 * SI del servizio Gestione AZIONE
 * 
 * @author Alessandro Marchino
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "AzioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface AzioneService {

	/**
	 * Ricerca dell'azione per chiave
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAzionePerChiaveResponse ricercaAzionePerChiave(@WebParam RicercaAzionePerChiave parameters);
	
}
