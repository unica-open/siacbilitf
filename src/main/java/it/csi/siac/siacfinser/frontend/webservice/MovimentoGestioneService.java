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

import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaModificaImportoMovimentoGestioneEntrata;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaModificaImportoMovimentoGestioneEntrataResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaStoricoImpegnoAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaStoricoImpegnoAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaAggiornaMovimento;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaAggiornaMovimentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaMovimentoEntrata;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaMovimentoEntrataResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaMovimentoSpesa;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaMovimentoSpesaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ConsultaDettaglioAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.ConsultaDettaglioAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ConsultaDettaglioImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.ConsultaDettaglioImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ConsultaVincoliAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.ConsultaVincoliAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.EliminaStoricoImpegnoAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.EliminaStoricoImpegnoAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceAccertamenti;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceAccertamentiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceImpegni;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceImpegniResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceStoricoImpegnoAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceStoricoImpegnoAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisciModificaImportoMovimentoGestioneEntrata;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisciModificaImportoMovimentoGestioneEntrataResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisciModificaImportoMovimentoGestioneSpesa;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisciModificaImportoMovimentoGestioneSpesaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiStoricoAggiornamentoProvvedimentoMovimentoGestione;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiStoricoAggiornamentoProvvedimentoMovimentoGestioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestione;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ModificaImportoImpegnoSuAnniSuccessivi;
import it.csi.siac.siacfinser.frontend.webservice.msg.ModificaImportoImpegnoSuAnniSuccessiviResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamenti;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentiSubAccertamenti;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentiSubAccertamentiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiaveOttimizzato;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiaveOttimizzatoROR;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiaveOttimizzatoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccertamentoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAvanzovincolo;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAvanzovincoloResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDettaglioImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDettaglioImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegniGlobal;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegniGlobalResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegniSubImpegni;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegniSubimpegniResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoOSubPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoOSubPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiaveOttimizzato;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiaveOttimizzatoROR;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiaveOttimizzatoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaImpegnoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaModificaMovimentoGestioneSpesaDefault;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaModificaMovimentoGestioneSpesaDefaultResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaModulareModificaMovimentoSpesaCollegata;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaModulareModificaMovimentoSpesaCollegataResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaReversaliByAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaReversaliByAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaAccertamentiSubAccertamenti;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaAccertamentiSubAccertamentiRORResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaAccertamentiSubAccertamentiResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaImpegniSubImpegni;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaImpegniSubimpegniRORResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaImpegniSubimpegniResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaModulareVincoliAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaModulareVincoliAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaModulareVincoliImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSinteticaModulareVincoliImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaStoricoImpegnoAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaStoricoImpegnoAccertamentoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaStoricoImpegnoAccertamentoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaStoricoImpegnoAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSubAccertamentiDiUnAccertamento;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSubAccertamentiDiUnAccertamentoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSubImpegniDiUnImpegno;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaSubImpegniDiUnImpegnoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.VerificaLegameImpegnoLiquidazioni;
import it.csi.siac.siacfinser.frontend.webservice.msg.VerificaLegameImpegnoLiquidazioniResponse;

/**
 * SI del servizio per la gestione dei soggetti
 * 
 * @author 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "MovimentoGestioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)

public interface MovimentoGestioneService extends CommonServiceInterface {

	/**
	* Operazione: Inserisce Accertamenti
	*
	* Consente di inserire:
	* <ul>
	*     <li>Un accertamento</li>
	*     <li>Uno o pi&ugrave; Subaccertamenti legati all'accertamento</li>
	*     <li>Altri accertamenti con i dati specificati in input.
	*     Per altri accertamenti si intendono gli eventuali accertamenti pluriennali legati all'accertamento principale.
	*     Si assume che tali accertamenti non siano caratterizzati da sub-accertamenti,
	*     qualora questo fosse richiesto, &eacute; necessario procedere all'aggiornamento dell'accertamento con una transazione ad hoc.</li>
	* </ul>
	*/
	@WebMethod
	@WebResult
	InserisceAccertamentiResponse inserisceAccertamenti(@WebParam InserisceAccertamenti request);

	/**
	 * 
	 * Consente di ricercare  un nuovo accertamento attraverso la sua chiave unica.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaAccertamentoPerChiaveResponse ricercaAccertamentoPerChiave(@WebParam RicercaAccertamentoPerChiave request);

	/**
	 * Consente di annullare: un accertamento, uno o pi&ugrave; sub-accertamenti, una o pi&ugrave; modifiche di movimento di entrata.
	 * Per poter effettuare la gestione, il servizio:
	 * 
	 * <ul>
	 *     <li>Annulla l'accertamento</li>
	 *     <li>Annulla i sub-accertamenti</li>
	 *     <li>Annulla le modifiche di accertamento/<li>
	 *     <li>Aggiorna l'importo dell'accertamento</li>
	 *     <li>Annulla le modifiche di sub-accertamento:</li>
	 *     <li>Aggiorna l'importo del sub-accertamento</li>
	 * </ul>
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaMovimentoEntrataResponse annullaMovimentoEntrata(@WebParam AnnullaMovimentoEntrata request);
	
	/**
	 * 
	 * Consente di ricercare una lista di accertamenti.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaAccertamentiResponse ricercaAccertamenti(@WebParam RicercaAccertamenti request);

	
	/**
	 * Operazione: Inserisce Impegni
	 * 
	 * Consente di inserire:
	 * <ul>
	 *     <li>Un impegno</li>
	 *     <li>Uno o pi&ugrave; Subimpegni legati all'impegno</li>
	 *     <li>Altri impegni con i dati specificati in input. Per altri impegni si intendono gli eventuali impegni pluriennali
	 *     legati all'impegno principale. Si assume che tali impegni non siano caratterizzati da sub-impegni,
	 *     qualora questo fosse richiesto, &eacute; necessario procedere all'aggiornamentodell'impegno con una transazione ad hoc. /<li>
	 * </ul>
	 *
	 * Questa operazione effettua la chiamata alla Operazione Interna: Inserisce Impegno quindi i controlli principale
	 * (capienza, esistenza, e validit&agrave;) sono demandati a quest'ultima.
	 * Anche l'eventuale ribaltamento residuo viene gestito dall'operazione interna.
	 *
	 * I controlli previsti in questa operazione sono:
	 * <ul>
	 *     <li>Blocco elaborazione per impegni futuri in predisposizione consuntivo</li>
	 *     <li>Blocco di inserimento impegni residui come ulteriore impegno</li>
	 * </ul>
     *
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	InserisceImpegniResponse inserisceImpegni(@WebParam InserisceImpegni request);
	
	
	
	/**
	 * Operazione : Ricerca Impegni
	 * 
	 * Consente di ricercare una serie specifica di impegni in base ai vari parametri di input inseriti.
	 * 
	 * Questa operazione effettua la chiamata alla Operazione Interna : Ricerca Impegni
	 * 
	 * I controlli previsti in quest operazione sono : 
	 * <ul>
	 *     <li>Blocco elaborazione per una ricerca che superi i 51 elementi trovati con messaggio di errore : Ricerca Troppo Ampia</li>
	 * </ul>
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaImpegniGlobalResponse ricercaImpegni(@WebParam RicercaImpegniGlobal request);
	
	/**
	 * Operazione : Aggiorna Impegno
	 * 
	 * Consente di Aggiornare :
	 * <ul>
	 *     <li>Un Impegno</li>
	 *     <li>Inserire / Modificare / Annullare un Sub Impegno</li>
	 *     <li>Inserire / Modificare / Annullare una Modifica di Gestione Spesa</li>
	 * </ul>
	 * 
	 * Questa operazione effettua la chiamata alla Operazione Interna : Aggiorna Impegno
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	AggiornaImpegnoResponse aggiornaImpegno(@WebParam AggiornaImpegno request);
	
	
	/**
	 * Service Wrapper per effettuare aggiornamenti di impegni*/
	@WebMethod
	@WebResult
	AnnullaAggiornaMovimentoResponse annullaAggiornaImpegno(@WebParam AnnullaAggiornaMovimento request);
	
	@WebMethod
	@WebResult
	AggiornaAccertamentoResponse aggiornaAccertamento(@WebParam AggiornaAccertamento request);
	
	@WebMethod
	@WebResult
	RicercaSubImpegniDiUnImpegnoResponse ricercaSubImpegniDiUnImpegno(@WebParam RicercaSubImpegniDiUnImpegno request);
	
	@WebMethod
	@WebResult
	RicercaSubAccertamentiDiUnAccertamentoResponse ricercaSubAccertamentiDiUnAccertamento(@WebParam RicercaSubAccertamentiDiUnAccertamento request);
	
	/**
	 * 
	 * Consente di ricercare  un nuovo impegno attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave; l'oggetto impegno completo anche di tutte le decodifiche e calcoli.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaImpegnoPerChiaveResponse ricercaImpegnoPerChiave(@WebParam RicercaImpegnoPerChiave request);
	
	/**
	 * 
	 * Consente di ricercare  un nuovo impegno attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave; l'oggetto impegno completo anche di tutte le decodifiche e calcoli.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaImpegnoPerChiaveOttimizzatoResponse ricercaImpegnoPerChiaveOttimizzato(@WebParam RicercaImpegnoPerChiaveOttimizzato request);

	@WebMethod
	@WebResult
	RicercaAccertamentoPerChiaveOttimizzatoResponse ricercaAccertamentoPerChiaveOttimizzato(@WebParam RicercaAccertamentoPerChiaveOttimizzato request);

	
	@WebMethod
	@WebResult
	ConsultaDettaglioImpegnoResponse consultaDettaglioImpegno(@WebParam ConsultaDettaglioImpegno request);
	
	@WebMethod
	@WebResult
	ConsultaDettaglioAccertamentoResponse consultaDettaglioAccertamento(@WebParam ConsultaDettaglioAccertamento request);
	
	@WebMethod
	@WebResult
	ConsultaVincoliAccertamentoResponse consultaVincoliAccertamento(@WebParam ConsultaVincoliAccertamento request);
	
	
	/**
	 * Metodo temporaneo per ovviare ad alcuni problemi di performance in attesa del porting da RB99.1 delle vere ottimizzazioni
	 * sul ricerca impegno per chiave, andr&agrave; eliminato a regime
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaImpegnoOSubPerChiaveResponse ricercaImpegnoOSubPerChiave(@WebParam RicercaImpegnoOSubPerChiave request);
	
	
	
	@WebMethod
	@WebResult
	RicercaDettaglioImpegnoResponse ricercaDettaglioImpegno(@WebParam RicercaDettaglioImpegno request);
	
	/**
	 * Consente di annullare, un impegno uno o pi&ugrave; subimpegni e una o pi&ugrave; Modifiche di Movimento di Spesa.
	 * Per poter effettuare la gestione, il servizio:
	 * 
	 * <ul>
	 *     <li>Annulla l'impegno</li>
	 *     <li>Annulla i subimpegni</li>
	 *     <li>Annulla le modifiche di impegno</li>
	 *     <li>Aggiorna l'importo dell'impegno</li>
	 *     <li>Annulla le modifiche di subimpegno:</li>
	 *     <li>Aggiorna l'importo del subimpegno</li>
	 * </ul>
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaMovimentoSpesaResponse annullaMovimentoSpesa(@WebParam AnnullaMovimentoSpesa request);
	
	
	/**
	 * Consente di ricercare pi&ugrave; impegni e pi&ugrave; subImpegni attraverso una ricerca aperta
	 * Questa operazione restituir&agrave; un elenco di oggetti impegno immagine dell'entit&agrave;
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaImpegniSubimpegniResponse ricercaImpegniSubimpegni(@WebParam RicercaImpegniSubImpegni request);
	
	
	/**
	 * Consente di ricercare pi&ugrave; impegni e pi&ugrave; subImpegni attraverso una ricerca aperta
	 * Questa operazione restituir&agrave; un elenco di oggetti impegno
	 * 
	 * versione ottimizzata
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaImpegniSubimpegniResponse ricercaSinteticaImpegniSubimpegni(@WebParam RicercaSinteticaImpegniSubImpegni request);
	
	

	/**
	 * Consente di ricercare pi&ugrave; accertamenti e pi&ugrave; sub-accertamenti attraverso una ricerca aperta
	 * Questa operazione restituir&agrave; un elenco di oggetti accertamento immagine dell'entit&agrave;
	 * 
	 */
	@WebMethod
	public @WebResult
	RicercaAccertamentiSubAccertamentiResponse ricercaAccertamentiSubAccertamenti(@WebParam RicercaAccertamentiSubAccertamenti request);
	
	
	/**
	 * Consente di ricercare piu' accertamenti e piu' sub-accertamenti attraverso una ricerca aperta
	 * Questa operazione restituira' un elenco di oggetti accertamento immagine dell'entita'
	 * Versione ottimizzata
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaAccertamentiSubAccertamentiResponse ricercaSinteticaAccertamentiSubAccertamenti(@WebParam RicercaSinteticaAccertamentiSubAccertamenti request);

	/**
	 * Consente di ricercare pi&ugrave; accertamenti e pi&ugrave; sub-accertamenti attraverso una ricerca aperta
	 * Questa operazione restituir&agrave; un elenco di oggetti accertamento immagine dell'entit&agrave;
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaAccertamentiSubAccertamentiResponse ricercaAccertamentiSubAccertamentiPerOrdinativoIncasso(@WebParam RicercaAccertamentiSubAccertamenti request);
	
	/**
	 * legge lo storico dei cambiamenti del provvedimento sul movgest
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	LeggiStoricoAggiornamentoProvvedimentoMovimentoGestioneResponse leggiStoricoAggiornamentoProvvedimentoMovimentoGestione(@WebParam LeggiStoricoAggiornamentoProvvedimentoMovimentoGestione request);
	
	//SIAC-6997
	/**
	 * legge lo storico dei cambiamenti della Struttura competente sul movgest
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	LeggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestioneResponse leggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestione(@WebParam LeggiStoricoAggiornamentoStrutturaCompetenteMovimentoGestione request);
	
	/**
	 * Ricerca eventuali reversali dato il movimento gestione
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaReversaliByAccertamentoResponse ricercaReversaliByAccertamento(@WebParam RicercaReversaliByAccertamento request);
	
	
	
	/**
	 * Ricerca eventuali liquidazioni dato il movimento gestione
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	VerificaLegameImpegnoLiquidazioniResponse verificaLegameImpegnoLiquidazioni(@WebParam VerificaLegameImpegnoLiquidazioni request);
	
	/**
	 * 
	 * Consente di ricercare una lista di avanzo vincolo.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaAvanzovincoloResponse ricercaAvanzovincolo(@WebParam RicercaAvanzovincolo request);
	
	/**
	 * Consente di inserire una modifica di importo di entrata
	 * 
	 */
	@WebMethod
	@WebResult
	InserisciModificaImportoMovimentoGestioneEntrataResponse inserisciModificaImportoMovimentoGestioneEntrata(@WebParam InserisciModificaImportoMovimentoGestioneEntrata request);
	
	/**
	 * Consente di inserire una modifica di importo di spesa
	 * 
	 */
	@WebMethod
	@WebResult
	InserisciModificaImportoMovimentoGestioneSpesaResponse inserisciModificaImportoMovimentoGestioneSpesa(@WebParam InserisciModificaImportoMovimentoGestioneSpesa request);
	
	/**
	 * Consente di aggiornare una modifica di importo di entrata
	 * 
	 */
	@WebMethod
	@WebResult
	AggiornaModificaImportoMovimentoGestioneEntrataResponse aggiornaModificaImportoMovimentoGestioneEntrata(@WebParam AggiornaModificaImportoMovimentoGestioneEntrata request);
	
	
	/*
	 * storico
	 * /
	 */
	/**
	* Operazione: Inserisce Accertamenti
	*
	* Consente di inserire:
	* <ul>
	*     <li>Un accertamento</li>
	*     <li>Uno o pi&ugrave; Subaccertamenti legati all'accertamento</li>
	*     <li>Altri accertamenti con i dati specificati in input.
	*     Per altri accertamenti si intendono gli eventuali accertamenti pluriennali legati all'accertamento principale.
	*     Si assume che tali accertamenti non siano caratterizzati da sub-accertamenti,
	*     qualora questo fosse richiesto, &eacute; necessario procedere all'aggiornamento dell'accertamento con una transazione ad hoc.</li>
	* </ul>
	*/
	@WebMethod
	@WebResult
	InserisceStoricoImpegnoAccertamentoResponse inserisceStoricoImpegnoAccertamento(@WebParam InserisceStoricoImpegnoAccertamento request);

	@WebMethod
	@WebResult
	AggiornaStoricoImpegnoAccertamentoResponse aggiornaStoricoImpegnoAccertamento(@WebParam AggiornaStoricoImpegnoAccertamento request);

	
	/**
	 * 
	 * Consente di ricercare  un nuovo accertamento attraverso la sua chiave unica.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaStoricoImpegnoAccertamentoPerChiaveResponse ricercaStoricoImpegnoPerChiaveAccertamento(@WebParam RicercaStoricoImpegnoAccertamentoPerChiave request);

	
	/**
	 * 
	 * Consente di ricercare una lista di StoricoImpegnoAccertamento.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaStoricoImpegnoAccertamentoResponse ricercaStoricoImpegnoAccertamento(@WebParam RicercaStoricoImpegnoAccertamento request);

	@WebMethod
	@WebResult
	EliminaStoricoImpegnoAccertamentoResponse eliminaStoricoImpegnoAccertamento(@WebParam EliminaStoricoImpegnoAccertamento request);


	@WebMethod
	@WebResult
	ModificaImportoImpegnoSuAnniSuccessiviResponse modificaImportoImpegnoSuAnniSuccessivi(@WebParam ModificaImportoImpegnoSuAnniSuccessivi request);

	@WebMethod
	@WebResult
	RicercaSinteticaImpegniSubimpegniRORResponse ricercaSinteticaImpegniSubimpegniROR(RicercaSinteticaImpegniSubImpegni request);
	
	@WebMethod
	@WebResult
	RicercaSinteticaAccertamentiSubAccertamentiRORResponse ricercaSinteticaAccertamentiSubAccertamentiROR(@WebParam RicercaSinteticaAccertamentiSubAccertamenti request);
	
	@WebMethod
	@WebResult
	RicercaImpegnoPerChiaveOttimizzatoResponse ricercaImpegnoPerChiaveOttimizzatoROR(@WebParam RicercaImpegnoPerChiaveOttimizzatoROR request);
	
	
	@WebMethod
	@WebResult
	RicercaAccertamentoPerChiaveOttimizzatoResponse ricercaAccertamentoPerChiaveOttimizzatoROR(@WebParam RicercaAccertamentoPerChiaveOttimizzatoROR request);
	
	
	@WebMethod
	@WebResult
	RicercaModulareModificaMovimentoSpesaCollegataResponse ricercaModulareModificaMovimentoSpesaCollegata(@WebParam RicercaModulareModificaMovimentoSpesaCollegata request);

	@WebMethod
	@WebResult
	RicercaModificaMovimentoGestioneSpesaDefaultResponse ricercaModificaMovimentoGestioneSpesaDefault(@WebParam RicercaModificaMovimentoGestioneSpesaDefault request);

	@WebMethod
	@WebResult
	RicercaSinteticaModulareVincoliAccertamentoResponse ricercaSinteticaModulareVincoliAccertamento(@WebParam RicercaSinteticaModulareVincoliAccertamento request);

	@WebMethod
	@WebResult
	RicercaSinteticaModulareVincoliImpegnoResponse ricercaSinteticaModulareVincoliImpegno(@WebParam RicercaSinteticaModulareVincoliImpegno request);
}