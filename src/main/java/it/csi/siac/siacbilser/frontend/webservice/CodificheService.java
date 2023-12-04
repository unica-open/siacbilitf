/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCodifica;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCodificaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCodifiche;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCodificheResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio per la gestione delle Codifiches.
 *
 * @author Domenico
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "CodificheService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CodificheService {

	/**
	 * Ricerca generica delle codifiche per tipo.
	 *
	 * @param request the request
	 * @return elenco delle codifiche dei tipi specificati.
	 */
	@WebMethod
	@WebResult
	RicercaCodificheResponse ricercaCodifiche(@WebParam RicercaCodifiche request);
	
	/**
	 * Ricerca generica di una sola codifica per tipo.
	 *
	 * @param request the request
	 * @return elenco delle codifiche dei tipi specificati.
	 */
	@WebMethod
	@WebResult
	RicercaCodificaResponse ricercaCodifica(@WebParam RicercaCodifica request);
	
}

