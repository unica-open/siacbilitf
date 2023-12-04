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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioBilancioResponse;

/**
 * SI del servizio Gestione BILANCIO
 * 
 * @author Alessandro Marchino
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "BilancioService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface BilancioService {

	/**
	 * Ricerca di dettaglio del bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioBilancioResponse ricercaDettaglioBilancio(@WebParam RicercaDettaglioBilancio parameters);
	
	/**
	 * Ricerca degli attributi del bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAttributiBilancioResponse ricercaAttributiBilancio(@WebParam RicercaAttributiBilancio parameters);
	
	/**
	 * Aggiornamento degli attributi del bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAttributiBilancioResponse aggiornaAttributiBilancio(@WebParam AggiornaAttributiBilancio parameters);
}
