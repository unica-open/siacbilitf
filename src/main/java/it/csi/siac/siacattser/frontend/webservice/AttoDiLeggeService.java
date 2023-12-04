/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice;

import it.csi.siac.siacattser.frontend.webservice.msg.AggiornaAttoDiLegge;
import it.csi.siac.siacattser.frontend.webservice.msg.AggiornaAttoDiLeggeResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.CancellaAttoDiLegge;
import it.csi.siac.siacattser.frontend.webservice.msg.CancellaAttoDiLeggeResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.InserisceAttoDiLegge;
import it.csi.siac.siacattser.frontend.webservice.msg.InserisceAttoDiLeggeResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaAttoDiLegge;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaAttoDiLeggeResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaTipiAttoDiLegge;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaTipiAttoDiLeggeResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione ATTO DI LEGGE
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = ATTSvcDictionary.NAMESPACE, name = "AttoDiLeggeService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface AttoDiLeggeService {

	/**
	 * Inserimento dell'atto di legge
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAttoDiLeggeResponse inserisceAttoDiLegge(@WebParam InserisceAttoDiLegge parameters);
	
	/**
	 * Aggiornamento dell'atto di legge
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAttoDiLeggeResponse aggiornaAttoDiLegge(@WebParam AggiornaAttoDiLegge parameters);

	/**
	 * Ricerca dell'atto di legge
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAttoDiLeggeResponse ricercaAttoDiLegge(@WebParam RicercaAttoDiLegge parameters);
	
	/**
	 * Ricerca puntuale dell'atto di legge
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAttoDiLeggeResponse ricercaPuntualeAttoDiLegge(@WebParam RicercaAttoDiLegge parameters);
	
	/**
	 * Cancellazione dell'atto di legge
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CancellaAttoDiLeggeResponse cancellaAttoDiLegge(@WebParam CancellaAttoDiLegge parameters);
	
	/**
	 * Ricerca dei tipi di atto di legge
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipiAttoDiLeggeResponse getTipiAttoLegge(@WebParam RicercaTipiAttoDiLegge parameters);
	
}
