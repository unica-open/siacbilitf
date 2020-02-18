/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaProvvisorioDiCassa;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaProvvisorioDiCassaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSacProvvisoriDiCassa;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSacProvvisoriDiCassaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisciProvvisorioDiCassa;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisciProvvisorioDiCassaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaProvvisoriDiCassa;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaProvvisoriDiCassaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaProvvisorioDiCassaPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaProvvisorioDiCassaPerChiaveResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio per la gestione dei provvisori di cassa
 * 
 * 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "ProvvisorioService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ProvvisorioService  extends CommonServiceInterface {
	
	@WebMethod
	@WebResult
	RicercaProvvisoriDiCassaResponse ricercaProvvisoriDiCassa(@WebParam RicercaProvvisoriDiCassa request);
	
	@WebMethod
	@WebResult
	RicercaProvvisorioDiCassaPerChiaveResponse ricercaProvvisorioDiCassaPerChiave(@WebParam RicercaProvvisorioDiCassaPerChiave request);
	
	@WebMethod
	@WebResult
	InserisciProvvisorioDiCassaResponse inserisciProvvisorioDiCassa(@WebParam InserisciProvvisorioDiCassa request);
	
	@WebMethod
	@WebResult
	AggiornaProvvisorioDiCassaResponse aggiornaProvvisorioDiCassa(@WebParam AggiornaProvvisorioDiCassa request);

	@WebMethod
	@WebResult
	AggiornaSacProvvisoriDiCassaResponse aggiornaSacProvvisoriDiCassa(@WebParam AggiornaSacProvvisoriDiCassa request);

}
