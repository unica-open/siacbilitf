/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pagopa.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.pagopa.frontend.webservice.msg.AggiornaAccertamentoModaleResponse;
import it.csi.siac.pagopa.frontend.webservice.msg.ElaboraFlussoRiconciliazione;
import it.csi.siac.pagopa.frontend.webservice.msg.ElaboraFlussoRiconciliazioneResponse;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaAccertamentoResponse;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaElaborazioni;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaElaborazioniResponse;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaRiconciliazioni;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaRiconciliazioniDoc;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaRiconciliazioniDocResponse;
import it.csi.siac.pagopa.frontend.webservice.msg.RicercaRiconciliazioniResponse;

@WebService(targetNamespace = PagoPASvcDictionary.NAMESPACE, name = "PagoPAService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface PagoPAService {
	
	@WebMethod 
	public @WebResult ElaboraFlussoRiconciliazioneResponse elaboraFlussoRiconciliazione(@WebParam ElaboraFlussoRiconciliazione parameters);
	
	
	@WebMethod
	@WebResult
	RicercaElaborazioniResponse ricercaElaborazioni(@WebParam RicercaElaborazioni req);

	@WebMethod
	@WebResult
	RicercaRiconciliazioniResponse ricercaRiconciliazioni(@WebParam RicercaRiconciliazioni req);
	
	@WebMethod
	@WebResult
	RicercaRiconciliazioniDocResponse ricercaRiconciliazioniDoc(@WebParam RicercaRiconciliazioniDoc req);
	
	/*@WebMethod
	@WebResult
	RicercaRiconciliazioniDocResponse ricercaRiconciliazioniConDettagli(@WebParam RicercaRiconciliazioniDoc req);*/
	
	//SIAC-8046 Task 2.2 CM 31/03/2021
	@WebMethod
	@WebResult
	RicercaAccertamentoResponse ricercaAccertamento(@WebParam RicercaRiconciliazioniDoc req);
	
	//SIAC-8046 Task 2.2 CM 13/04/2021
	@WebMethod
	@WebResult
	AggiornaAccertamentoModaleResponse aggiornaAccertamento(@WebParam RicercaRiconciliazioniDoc req);

}
