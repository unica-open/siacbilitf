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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStanziamentiCapitoliVariati;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStanziamentiCapitoliVariatiResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcolaTotaliStanziamentiDiPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcolaTotaliStanziamentiDiPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDisponibilitaDiUnCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDisponibilitaDiUnCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaMovimentiAssociatiACapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaMovimentiAssociatiACapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaAttributiModificabiliCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaAttributiModificabiliCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaClassificatoriModificabiliCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaClassificatoriModificabiliCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCategoriaCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCategoriaCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaVariazioniSingoloCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaVariazioniSingoloCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaStoricoVariazioniCodificheCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaStoricoVariazioniCodificheCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloPerAggiornamentoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloPerAggiornamentoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloResponse;

/**
 * SI del servizio Gestione CAPITOLO DI BILANCIO
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "CapitoloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CapitoloService {

	/**
	 * Calcolo della disponibilit&agrave; di un capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CalcoloDisponibilitaDiUnCapitoloResponse calcoloDisponibilitaDiUnCapitolo(@WebParam CalcoloDisponibilitaDiUnCapitolo parameters);

	/**
	 * Aggiornamento degli stanziamenti dei capitoli variati
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStanziamentiCapitoliVariatiResponse aggiornaStanziamentiCapitoliVariati(@WebParam AggiornaStanziamentiCapitoliVariati parameters);

	/**
	 * Calcolo del totale degli stanziamenti di previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CalcolaTotaliStanziamentiDiPrevisioneResponse calcolaTotaliStanziamentiDiPrevisione(@WebParam CalcolaTotaliStanziamentiDiPrevisione parameters);
	
	/**
	 * Controlla i classificatori modificabili per il capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ControllaClassificatoriModificabiliCapitoloResponse controllaClassificatoriModificabiliCapitolo(@WebParam ControllaClassificatoriModificabiliCapitolo parameters);
	
	/**
	 * Controlla gli attributi modificabili per il capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ControllaAttributiModificabiliCapitoloResponse controllaAttributiModificabiliCapitolo(@WebParam ControllaAttributiModificabiliCapitolo arg);
	
	/**
	 * Inserisce una relazione tra atto di legge e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRelazioneAttoDiLeggeCapitoloResponse inserisceRelazioneAttoDiLeggeCapitolo(@WebParam InserisceRelazioneAttoDiLeggeCapitolo parameters);
	
	/**
	 * Aggiorna la relazione tra atto di legge e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRelazioneAttoDiLeggeCapitoloResponse aggiornaRelazioneAttoDiLeggeCapitolo(@WebParam AggiornaRelazioneAttoDiLeggeCapitolo parameters);

	/**
	 * Ricerca la relazione tra atto di legge e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaRelazioneAttoDiLeggeCapitoloResponse ricercaRelazioneAttoDiLeggeCapitolo(@WebParam RicercaRelazioneAttoDiLeggeCapitolo parameters);
	
	/**
	 * Ricerca puntuale della relazione tra atto di legge e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaRelazioneAttoDiLeggeCapitoloResponse ricercaPuntualeRelazioneAttoDiLeggeCapitolo(@WebParam RicercaRelazioneAttoDiLeggeCapitolo parameters);
	
	/**
	 * Cancellazione della relazione tra atto di legge e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CancellaRelazioneAttoDiLeggeCapitoloResponse cancellaRelazioneAttoDiLeggeCapitolo(@WebParam CancellaRelazioneAttoDiLeggeCapitolo parameters);

	/**
	 * Ricerca della categoria del capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaCategoriaCapitoloResponse ricercaCategoriaCapitolo(@WebParam RicercaCategoriaCapitolo parameters);
	
	/**
	 * Ricerca delle variazioni per l'aggiornamento capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaVariazioniCapitoloPerAggiornamentoCapitoloResponse ricercaVariazioniCapitoloPerAggiornamentoCapitolo(@WebParam RicercaVariazioniCapitoloPerAggiornamentoCapitolo parameters);

	/**
	 * Conta dei movimenti associati al capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ContaMovimentiAssociatiACapitoloResponse contaMovimentiAssociatiACapitolo(@WebParam ContaMovimentiAssociatiACapitolo parameters);

	// SIAC-3885
	/**
	 * Ricerca delle variazioni afferenti al capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaVariazioniCapitoloResponse ricercaVariazioniCapitolo(@WebParam RicercaVariazioniCapitolo parameters);
	
	/**
	 * Ricerca sintetica paginata delle variazioni afferenti al capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaVariazioniSingoloCapitoloResponse ricercaSinteticaVariazioniSingoloCapitolo(@WebParam RicercaSinteticaVariazioniSingoloCapitolo parameters);

	
	/**
	 * Ricerca dello storico delle variazioni codifiche afferenti al capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaStoricoVariazioniCodificheCapitoloResponse ricercaStoricoVariazioniCodificheCapitolo(@WebParam RicercaStoricoVariazioniCodificheCapitolo parameters);


}
