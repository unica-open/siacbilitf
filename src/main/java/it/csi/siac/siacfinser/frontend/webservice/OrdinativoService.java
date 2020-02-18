/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaOrdinativoIncasso;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaOrdinativoIncassoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaOrdinativoPagamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaOrdinativoPagamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaOrdinativoIncasso;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaOrdinativoIncassoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaOrdinativoPagamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaOrdinativoPagamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.CollegaReversaliOrdinativoPagamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.CollegaReversaliOrdinativoPagamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceOrdinativoIncasso;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceOrdinativoIncassoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceOrdinativoPagamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceOrdinativoPagamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ReintroitoOrdinativoPagamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.ReintroitoOrdinativoPagamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaOrdinativo;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaOrdinativoIncassoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaOrdinativoIncassoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaOrdinativoPagamentoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaOrdinativoPagamentoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaOrdinativoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSubOrdinativo;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSubOrdinativoResponse;



/**
 * SI del servizio per la gestione degli ordinativi
 * 
 * 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "OrdinativoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface OrdinativoService  extends CommonServiceInterface {
	
	@WebMethod
	@WebResult
	InserisceOrdinativoPagamentoResponse inserisceOrdinativoPagamento(@WebParam InserisceOrdinativoPagamento request);
	
	@WebMethod
	@WebResult
	InserisceOrdinativoIncassoResponse inserisceOrdinativoIncasso(@WebParam InserisceOrdinativoIncasso request);
	
	@WebMethod
	@WebResult
	RicercaOrdinativoResponse ricercaOrdinativoPagamento(@WebParam RicercaOrdinativo request);
	
	@WebMethod
	@WebResult
	RicercaOrdinativoResponse ricercaOrdinativoIncasso(@WebParam RicercaOrdinativo request);
	
	@WebMethod
	@WebResult
	RicercaSubOrdinativoResponse ricercaSubOrdinativoPagamento(@WebParam RicercaSubOrdinativo request);
	
	@WebMethod
	@WebResult
	RicercaSubOrdinativoResponse ricercaSubOrdinativoIncasso(@WebParam RicercaSubOrdinativo request);

	@WebMethod
	@WebResult
	AggiornaOrdinativoPagamentoResponse aggiornaOrdinativoPagamento(@WebParam AggiornaOrdinativoPagamento request);
	
	@WebMethod
	@WebResult
	AggiornaOrdinativoIncassoResponse aggiornaOrdinativoIncasso(@WebParam AggiornaOrdinativoIncasso request);
	
	/**
	 * 
	 * Operazione : Ricerca Ordinativo Pagamento Per Chiave
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare un Ordinativo Pagamento attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave;:
	 * <ul>
	 *     <li>l'oggetto 'ordinativo pagamento' completo anche di tutte le decodifiche e calcoli</li>
	 * </ul>
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaOrdinativoPagamentoPerChiaveResponse ricercaOrdinativoPagamentoPerChiave(@WebParam RicercaOrdinativoPagamentoPerChiave request);
	
	/**
	 * 
	 * Operazione : Ricerca Ordinativo Incasso Per Chiave
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare un Ordinativo Incasso attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave;:
	 * <ul>
	 *     <li>l'oggetto 'ordinativo incasso' completo anche di tutte le decodifiche e calcoli</li>
	 * </ul>
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult 
	RicercaOrdinativoIncassoPerChiaveResponse ricercaOrdinativoIncassoPerChiave(@WebParam RicercaOrdinativoIncassoPerChiave request);

	/**
	 * 
	 * Operazione : Annulla Ordinativo Pagamento
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di annullare un Ordinativo Pagamento con i dati specificati in input.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaOrdinativoPagamentoResponse annullaOrdinativoPagamento(@WebParam  AnnullaOrdinativoPagamento request);

	/**
	 * 
	 * Operazione : Annulla Ordinativo Incasso
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di annullare un Ordinativo Incasso con i dati specificati in input.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaOrdinativoIncassoResponse annullaOrdinativoIncasso(@WebParam  AnnullaOrdinativoIncasso request);
	
	/**
	 * Operazione : Reintroito Ordinativo Pagamento
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Gestisce il reintroito di un dato ordinativo di pagamento
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	ReintroitoOrdinativoPagamentoResponse reintroitoOrdinativoPagamento(@WebParam ReintroitoOrdinativoPagamento request);
	
	/**
	 * Versione asincrona di {@link #reintroitoOrdinativoPagamento(ReintroitoOrdinativoPagamento)}
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse reintroitoOrdinativoPagamentoAsync(@WebParam AsyncServiceRequestWrapper<ReintroitoOrdinativoPagamento> request);

	@WebMethod
	@WebResult
	CollegaReversaliOrdinativoPagamentoResponse collegaReversaliOrdinativoPagamento(
			@WebParam CollegaReversaliOrdinativoPagamento request);

}
