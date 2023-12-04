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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaVariazioneBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaVariazioneBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaDettaglioVariazioneImportoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaDettaglioVariazioneImportoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaVariazioneCodifiche;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaVariazioneCodificheResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.DefinisceAnagraficaVariazioneBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.DefinisceAnagraficaVariazioneBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.DefinisceVariazioneCodifiche;
import it.csi.siac.siacbilser.frontend.webservice.msg.DefinisceVariazioneCodificheResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaDettaglioVariazioneImportoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaDettaglioVariazioneImportoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.GestisciDettaglioVariazioneComponenteImportoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.GestisciDettaglioVariazioneComponenteImportoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaVariazioneBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaVariazioneBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceVariazioneCodifiche;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceVariazioneCodificheResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisciDettaglioVariazioneImportoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisciDettaglioVariazioneImportoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettagliVariazioneImportoCapitoloNellaVariazione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettagliVariazioneImportoCapitoloNellaVariazioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioAnagraficaVariazioneBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioAnagraficaVariazioneBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVariazioneCodifiche;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVariazioneCodificheResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVariazioneComponenteImportoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVariazioneComponenteImportoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSingoloDettaglioVariazioneImportoCapitoloNellaVariazione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSingoloDettaglioVariazioneImportoCapitoloNellaVariazioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoVariazione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoVariazioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioneBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioneBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioneCodifiche;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioneCodificheResponse;
import it.csi.siac.siacbilser.model.DettaglioVariazioneImportoCapitolo;
import it.csi.siac.siaccecser.frontend.webservice.msg.VariazioneBilancioExcelReport;
import it.csi.siac.siaccecser.frontend.webservice.msg.VariazioneBilancioExcelReportResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;

/**
 * SI del servizio Gestione VincoloCapitoloService
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "VariazioneDiBilancioService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface VariazioneDiBilancioService {

	/**
	 * Inserimento dello storno UEB di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated da eliminare con le UEB
	 */
	@Deprecated
	@WebMethod
	@WebResult
	it.csi.siac.siacbilser.frontend.webservice.msg.InserisceStornoUEBResponse inserisceStornoUEBEntrata(@WebParam it.csi.siac.siacbilser.frontend.webservice.msg.InserisceStornoUEB parameters);

	/**
	 * Inserimento dello storno UEB di uscita
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated da eliminare con le UEB
	 */
	@Deprecated
	@WebMethod
	@WebResult
	it.csi.siac.siacbilser.frontend.webservice.msg.InserisceStornoUEBResponse inserisceStornoUEBUscita(@WebParam it.csi.siac.siacbilser.frontend.webservice.msg.InserisceStornoUEB parameters);
	
	
	/**
	 * Aggiornamento dello storno UEB di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated da eliminare con le UEB
	 */
	@Deprecated
	@WebMethod
	@WebResult
	it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStornoUEBResponse aggiornaStornoUEBEntrata(@WebParam it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStornoUEB parameters);

	/**
	 * Aggiornamento dello storno UEB di uscita
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated da eliminare con le UEB
	 */
	@Deprecated
	@WebMethod
	@WebResult
	it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStornoUEBResponse aggiornaStornoUEBUscita(@WebParam it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStornoUEB parameters);
	
	/**
	 * Ricerca dello storno UEB
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated da eliminare con le UEB
	 */
	@Deprecated
	@WebMethod
	@WebResult
	it.csi.siac.siacbilser.frontend.webservice.msg.RicercaStornoUEBResponse ricercaStornoUEB(@WebParam it.csi.siac.siacbilser.frontend.webservice.msg.RicercaStornoUEB parameters);

	/**
	 * Ricerca della variazione di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaVariazioneBilancioResponse ricercaVariazioneBilancio(@WebParam RicercaVariazioneBilancio parameters);
	
	/**
	 * Inserimento della variazione di codifiche
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceVariazioneCodificheResponse inserisceVariazioneCodifiche(@WebParam InserisceVariazioneCodifiche parameters);
	
	/**
	 * Aggiornamento della variazione di codifiche
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaVariazioneCodificheResponse aggiornaVariazioneCodifiche(@WebParam AggiornaVariazioneCodifiche parameters);
	
	/**
	 * Definizione della variazione di codifiche
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DefinisceVariazioneCodificheResponse definisceVariazioneCodifiche(@WebParam DefinisceVariazioneCodifiche parameters);
	
	/**
	 * Ricerca della variazione di codifiche
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaVariazioneCodificheResponse ricercaVariazioneCodifiche(@WebParam RicercaVariazioneCodifiche parameters);
	
	/**
	 * Ricerca di dettaglio della variazione di codifiche
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioVariazioneCodificheResponse ricercaDettaglioVariazioneCodifiche(@WebParam RicercaDettaglioVariazioneCodifiche parameters);
	
	/**
	 * Ricerca del tipo di variazione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoVariazioneResponse ricercaTipoVariazione(@WebParam RicercaTipoVariazione parameters);
	
	
	//######################### New 2016/05/17 ############################//
	
	/**
	 * Inserimento del dettaglio capitolo della variazione di importo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod 
	@WebResult
	InserisciDettaglioVariazioneImportoCapitoloResponse inserisciDettaglioVariazioneImportoCapitolo(@WebParam InserisciDettaglioVariazioneImportoCapitolo parameters);
	
	/**
	 * Aggiornamento del dettaglio capitolo della variazione di importo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod 
	@WebResult
	AggiornaDettaglioVariazioneImportoCapitoloResponse aggiornaDettaglioVariazioneImportoCapitolo(@WebParam AggiornaDettaglioVariazioneImportoCapitolo parameters);
	
	/**
	 * Eliminazione del dettaglio capitolo della variazione di importo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod 
	@WebResult
	EliminaDettaglioVariazioneImportoCapitoloResponse eliminaDettaglioVariazioneImportoCapitolo(@WebParam EliminaDettaglioVariazioneImportoCapitolo parameters);
	/**
	 * Nuovo servizio di aggiornamento della Variazione di Bilancio.
	 * Non aggiorna i dettagli della variazione che andranno aggiornati dai tre nuovi servizi
	 * <ul>
	 * <li>{@link #inserisciDettaglioVariazioneImportoCapitolo(InserisciDettaglioVariazioneImportoCapitolo)},</li>
	 * <li>{@link #aggiornaDettaglioVariazioneImportoCapitolo(AggiornaDettaglioVariazioneImportoCapitolo)} ed</li>
	 * <li>{@link #eliminaDettaglioVariazioneImportoCapitolo(EliminaDettaglioVariazioneImportoCapitolo)}.</li>
	 * </ul>
	 * Inoltre utilizza una function ad hoc per il controllo di quadratura.
	 * 
	 * @param parameters
	 * @return variazione aggiornata.
	 */
	@WebMethod
	@WebResult
	AggiornaAnagraficaVariazioneBilancioResponse aggiornaAnagraficaVariazioneBilancio(@WebParam AggiornaAnagraficaVariazioneBilancio parameters);
	
	/**
	 * Versione Async del servizio {@link #aggiornaAnagraficaVariazioneBilancio(AggiornaAnagraficaVariazioneBilancio)}.
	 * @param parameters
	 * @return AsyncServiceResponse
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse aggiornaAnagraficaVariazioneBilancioAsync(@WebParam AsyncServiceRequestWrapper<AggiornaAnagraficaVariazioneBilancio> parameters);
	
	
	/**
	 * Inserisce l'anagrafica della variazione di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAnagraficaVariazioneBilancioResponse inserisceAnagraficaVariazioneBilancio(@WebParam InserisceAnagraficaVariazioneBilancio parameters);
	
	
	/**
	 * Definizione dell'anagrafica della variazione di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DefinisceAnagraficaVariazioneBilancioResponse definisceAnagraficaVariazioneBilancio(@WebParam DefinisceAnagraficaVariazioneBilancio parameters);
	
	
	/**
	 * Versione asincrona di {@link #definisceAnagraficaVariazioneBilancio(DefinisceAnagraficaVariazioneBilancio)}
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse definisceAnagraficaVariazioneBilancioAsync(@WebParam AsyncServiceRequestWrapper<DefinisceAnagraficaVariazioneBilancio> parameters);
	
	/**
	 * Restituisce solo il dettaglio dell'anagrafica della variazione di bilancio.
	 * Questo servizio non  restituisce i singoli {@link DettaglioVariazioneImportoCapitolo}
	 * della Variazione. In questo modo &eacute; possibile consultare variazioni con un eleveato numero di {@link DettaglioVariazioneImportoCapitolo}.
	 * 
	 * @param parameters
	 * @return variazione
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioAnagraficaVariazioneBilancioResponse ricercaDettaglioAnagraficaVariazioneBilancio(@WebParam RicercaDettaglioAnagraficaVariazioneBilancio parameters);
	
	/**
	 * Ricerca paginata dell'elenco dei {@link DettaglioVariazioneImportoCapitolo} contenuti in una Variazione di bilancio.
	 * 
	 * @param parameters
	 * @return dettagli variazione
	 */
	@WebMethod
	@WebResult
	RicercaDettagliVariazioneImportoCapitoloNellaVariazioneResponse ricercaDettagliVariazioneImportoCapitoloNellaVariazione(@WebParam RicercaDettagliVariazioneImportoCapitoloNellaVariazione parameters);
	
	/**
	 * Ricerca paginata dell'elenco dei {@link DettaglioVariazioneImportoCapitolo} contenuti in una Variazione di bilancio.
	 * 
	 * @param parameters
	 * @return dettagli variazione
	 */
	@WebMethod
	@WebResult
	RicercaSingoloDettaglioVariazioneImportoCapitoloNellaVariazioneResponse ricercaSingoloDettaglioVariazioneImportoCapitoloNellaVariazione(@WebParam RicercaSingoloDettaglioVariazioneImportoCapitoloNellaVariazione parameters);
	
	/**
	 * Stampa su excel della variazione di bilancio
	 * @param parameters i parametri di stampa
	 * @return la stampa della variazione
	 */
	@WebMethod
	@WebResult
	VariazioneBilancioExcelReportResponse variazioneBilancioExcelReport(@WebParam VariazioneBilancioExcelReport parameters);
	
	/**
	 * Inserisci dettaglio componente variazione importo.
	 *
	 * @param parameters the parameters
	 * @return the stampa excel variazione di bilancio response
	 */
	//SIAC-6881
	@WebMethod
	@WebResult
	GestisciDettaglioVariazioneComponenteImportoCapitoloResponse gestisciDettaglioVariazioneComponenteImportoCapitolo(@WebParam GestisciDettaglioVariazioneComponenteImportoCapitolo parameters);
	
	/**
	 * Ricerca dettaglio componente variazione importo.
	 *
	 * @param parameters the parameters
	 * @return the stampa excel variazione di bilancio response
	 */
	//SIAC-6881
	@WebMethod
	@WebResult
	RicercaDettaglioVariazioneComponenteImportoCapitoloResponse ricercaDettaglioVariazioneComponenteImportoCapitolo(@WebParam RicercaDettaglioVariazioneComponenteImportoCapitolo parameters);
	
	
	/**
	 * Ricerca il primo capitolo inserito nella variazione.
	 *
	 * @param parameters the parameters
	 * @return the stampa excel variazione di bilancio response
	 */
	//SIAC-6884
	@WebMethod
	@WebResult
	RicercaDettagliVariazioneImportoCapitoloNellaVariazioneResponse ricercaDettagloVariazionePrimoCapitoloNellaVariazione(
			RicercaDettagliVariazioneImportoCapitoloNellaVariazione parameters);

}
