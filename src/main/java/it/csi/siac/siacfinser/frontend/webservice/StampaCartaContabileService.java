/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import it.csi.siac.siacfinser.frontend.webservice.msg.StampaRiepilogoCartaContabile;
import it.csi.siac.siacfinser.frontend.webservice.msg.StampaRiepilogoCartaContabileResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio per la gestione delle carte contabili
 * 
 * @author 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "StampaCartaContabileService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)

public interface StampaCartaContabileService extends CommonServiceInterface {
	
	/**
	 * Operazione di stampa del record relativo ad una carta contabile
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult 
	StampaRiepilogoCartaContabileResponse stampaRiepilogoCartaContabile(@WebParam StampaRiepilogoCartaContabile request);
	
	
}