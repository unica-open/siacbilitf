/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice;

import it.csi.siac.siacattser.frontend.webservice.msg.AggiornaProvvedimento;
import it.csi.siac.siacattser.frontend.webservice.msg.AggiornaProvvedimentoResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.InserisceProvvedimento;
import it.csi.siac.siacattser.frontend.webservice.msg.InserisceProvvedimentoResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaProvvedimento;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaProvvedimentoResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaSinteticaProvvedimento;
import it.csi.siac.siacattser.frontend.webservice.msg.RicercaSinteticaProvvedimentoResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.TipiProvvedimento;
import it.csi.siac.siacattser.frontend.webservice.msg.TipiProvvedimentoResponse;
import it.csi.siac.siacattser.frontend.webservice.msg.VerificaAnnullabilitaProvvedimento;
import it.csi.siac.siacattser.frontend.webservice.msg.VerificaAnnullabilitaProvvedimentoResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione PROVVEDIMENTO
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = ATTSvcDictionary.NAMESPACE, name = "ProvvedimentoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ProvvedimentoService {

	/**
	 * Inserimento del provvedimento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceProvvedimentoResponse inserisceProvvedimento(@WebParam InserisceProvvedimento parameters);
	
	/**
	 * Aggiornamento del provvedimento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaProvvedimentoResponse aggiornaProvvedimento(@WebParam AggiornaProvvedimento parameters);

	/**
	 * Ricerca del provvedimento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaProvvedimentoResponse ricercaProvvedimento(@WebParam RicercaProvvedimento parameters);
	
	/**
	 * Verifica dell'annullabilit&agrave; del provvedimento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaAnnullabilitaProvvedimentoResponse verificaAnnullabilitaProvvedimento(@WebParam VerificaAnnullabilitaProvvedimento parameters);
	
	/**
	 * Ricerca dei tipi di provvedimento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	TipiProvvedimentoResponse getTipiProvvedimento(@WebParam TipiProvvedimento parameters);
	
	/**
	 * Ricerca sintetica paginata del provvedimento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaProvvedimentoResponse ricercaSinteticaProvvedimento(@WebParam RicercaSinteticaProvvedimento parameters);
	
}
