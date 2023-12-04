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

import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaDatiDurcSoggetto;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaDatiDurcSoggettoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaLegameSoggetti;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaLegameSoggettiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSoggetto;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSoggettoProvvisorio;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSoggettoProvvisorioResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSoggettoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiungiSoggettoAllaClassificazione;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiungiSoggettoAllaClassificazioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaClasse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaClasseResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaLegameSoggetti;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaLegameSoggettiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaModalitaPagamentoInModifica;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaModalitaPagamentoInModificaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaSedeInModifica;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaSedeInModificaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaSoggettoInModifica;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaSoggettoInModificaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.CancellaSoggetto;
import it.csi.siac.siacfinser.frontend.webservice.msg.CancellaSoggettoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceClasse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceClasseResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceSoggetto;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceSoggettoProvvisorio;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceSoggettoProvvisorioResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceSoggettoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaSoggettiDellaClasse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaSoggettiDellaClasseResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListeGestioneSoggetto;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListeGestioneSoggettoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ModificaClasse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ModificaClasseResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaBanca;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaBancaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaModalitaPagamentoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaModalitaPagamentoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSedeSecondariaPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSedeSecondariaPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSoggetti;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSoggettiOttimizzato;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSoggettiOttimizzatoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSoggettiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSoggettoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSoggettoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RimuoviSoggettoDaClassificazione;
import it.csi.siac.siacfinser.frontend.webservice.msg.RimuoviSoggettoDaClassificazioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.VerificaIban;
import it.csi.siac.siacfinser.frontend.webservice.msg.VerificaIbanResponse;

/**
 * SI del servizio per la gestione dei soggetti
 * 
 * @author paolo
 * @version
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "SoggettoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface SoggettoService extends CommonServiceInterface {

	/**
	 * Consente di inserire un nuovo Soggetto con i dati specificati in input
	 * senza effettuare i controlli di correttezza formale dei codici e
	 * duplicazione del soggetto. Le operazioni effettuate hanno immediata
	 * validit&agrave;, ci&ograve; non necessitano di operazioni di validazione per essere
	 * effettive.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	InserisceSoggettoResponse inserisceSoggetto(@WebParam InserisceSoggetto request);

	/**
	 * Consente di ricercare uno o pi&ugrave; Soggetti utilizzando diversi criteri di
	 * ricerca. Restituisce una lista sintetica degli attributi del soggetto.
	 * Usato per: 1. ricerca del creditore da abbinare ad un
	 * impegno/accertamento o ad un documento o ad una fattura; 2. ricerca
	 * presenza di soggetti con il medesimo codice. 3. Ricerca dei soggetti che
	 * hanno un legame di precedenza o successione con un soggetto
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaSoggettiResponse ricercaSoggetti(@WebParam RicercaSoggetti request);
	
	
	@WebMethod
	@WebResult
	RicercaSoggettiOttimizzatoResponse ricercaSoggettiOttimizzato(@WebParam RicercaSoggettiOttimizzato request);

	/**
	 * Consente di ricercare un Soggetto attraverso la sua chiave unica. Questa
	 * operazione restituisce l'anagrafica del Soggetto completa o di dettaglio
	 * e i dati dell'eventuale istanza IN
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaSoggettoPerChiaveResponse ricercaSoggettoPerChiave(@WebParam RicercaSoggettoPerChiave request);

	/**
	 * Consente di ricercare un Sede Secondaria per identificativo univoco e ne
	 * visualizza i dati correnti e, se presenti, quelli in aggiornamento.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaSedeSecondariaPerChiaveResponse ricercaSedeSecondariaPerChiave(@WebParam RicercaSedeSecondariaPerChiave request);

	/**
	 * Consente di ricercare una Modalita di Pagamento per identificativo
	 * univoco e ne visualizza i dati correnti e, se presenti quelli in
	 * aggiornamento.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaModalitaPagamentoPerChiaveResponse ricercaModalitaPagamentoPerChiave(@WebParam RicercaModalitaPagamentoPerChiave request);

	/**
	 * Al servizio vengono inviati i dati dell'entit&agrave; SOGGETTO Il servizio
	 * restituisce un Messaggio di OUTPUT.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	CancellaSoggettoResponse cancellaSoggetto(@WebParam CancellaSoggetto request);

	/**
	 * Al servizio vengono inviati i tutti i dati dell'entit&agrave; SOGGETTO Il
	 * servizio restituir&agrave; come dato di OUTPUT l'oggetto Soggetto
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AggiornaSoggettoResponse aggiornaSoggetto(@WebParam AggiornaSoggetto request);
	
	
	@WebMethod
	@WebResult
	RimuoviSoggettoDaClassificazioneResponse rimuoviSoggettoDaClassificazione(@WebParam RimuoviSoggettoDaClassificazione request);
	
	@WebMethod
	@WebResult
	AggiungiSoggettoAllaClassificazioneResponse aggiungiSoggettoAllaClassificazione(@WebParam AggiungiSoggettoAllaClassificazione request);

	/**
	 * Consente di inserire una proposta di nuovo Soggetto effettuando tutti i
	 * controlli di coerenza richiesti dal sistema, in particolare impedisce di
	 * inserire un Soggetto se &eacute; gi&agrave; censito il codice fiscale o la partita
	 * IVA abbinati al nuovo Soggetto. il servizio restituir&agrave; in output
	 * l'oggetto Soggetto inserito.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	InserisceSoggettoProvvisorioResponse inserisceSoggettoProvvisorio(@WebParam InserisceSoggettoProvvisorio request);

	/**
	 * Il servizio si occuper&agrave; di annullare la proposta di aggiornamento di un
	 * soggetto, e restituir&agrave; come OUTPUT l'oggetto Soggetto.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AnnullaSoggettoInModificaResponse annullaSoggettoInModifica(@WebParam AnnullaSoggettoInModifica request);

	/**
	 * Il servizio si occuper&agrave; di annullare la proposta di aggiornamento di una
	 * sede, e restituir&agrave; come OUTPUT l'oggetto Soggetto.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AnnullaSedeInModificaResponse annullaSedeInModifica(@WebParam AnnullaSedeInModifica request);

	/**
	 * Il servizio provveder&agrave; ad annullare la proposta di aggiornamento di una
	 * modalit&agrave; di pagamento e restituir&agrave; come OUTPUT l'oggetto
	 * ModalitaDiPagamentoSoggetto
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AnnullaModalitaPagamentoInModificaResponse annullaModalitaPagamentoInModifica(@WebParam AnnullaModalitaPagamentoInModifica request);

	/**
	 * Il servizio provveder&agrave; ad aggiornare i parametri dell'oggetto Soggetto
	 * preso in considerazione. Restituir&agrave; come OUTPUT l'oggetto Soggetto
	 * modificato
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AggiornaSoggettoProvvisorioResponse aggiornaSoggettoProvvisorio(@WebParam AggiornaSoggettoProvvisorio request);

	/**
	 * Aggiorna il legame che un soggetto ha con altri soggetti censiti in
	 * archivio. Al termine del servizio verr&agrave; inviata la risposta al fruitore.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AggiornaLegameSoggettiResponse aggiornaLegameSoggetti(@WebParam AggiornaLegameSoggetti request);

	/**
	 * Annulla il legame che un soggetto ha con altri soggetti censiti in
	 * archivio. Al termine del servizio verr&agrave; inviata la risposta al fruitore.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AnnullaLegameSoggettiResponse annullaLegameSoggetti(@WebParam AnnullaLegameSoggetti request);

	@WebMethod
	@WebResult
	ListeGestioneSoggettoResponse listeGestioneSoggetto(@WebParam ListeGestioneSoggetto request);

	@WebMethod
	@WebResult
	RicercaBancaResponse ricercaBanca(@WebParam RicercaBanca request);

	@WebMethod
	@WebResult
	VerificaIbanResponse verificaIban(@WebParam VerificaIban verificaIban);

	@WebMethod
	@WebResult
	AnnullaClasseResponse annullaClasse(@WebParam AnnullaClasse request);
	
	@WebMethod
	@WebResult
	InserisceClasseResponse inserisceClasse(@WebParam InserisceClasse request);
	
	@WebMethod
	@WebResult
	ModificaClasseResponse modificaClasse(@WebParam ModificaClasse request);	
	
	@WebMethod
	@WebResult
	ListaSoggettiDellaClasseResponse listaSoggettiDellaClasse(@WebParam ListaSoggettiDellaClasse request);	
	
	@WebMethod
	@WebResult
	AggiornaDatiDurcSoggettoResponse aggiornaDatiDurcSoggetto(AggiornaDatiDurcSoggetto parameters);	
	
}
