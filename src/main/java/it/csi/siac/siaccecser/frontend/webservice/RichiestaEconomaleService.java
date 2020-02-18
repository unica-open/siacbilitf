/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaRendicontoRichiesta;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaRendicontoRichiestaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.ControllaAggiornabilitaRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.ControllaAggiornabilitaRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceRendicontoRichiesta;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceRendicontoRichiestaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaClassificatoriGenericiCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaClassificatoriGenericiCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioRendicontoRichiesta;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioRendicontoRichiestaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioRichiestaAnticipoMissioneNonErogata;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioRichiestaAnticipoMissioneNonErogataResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaMezziDiTrasporto;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaMezziDiTrasportoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaRichiesteAnticipoMissioniNonErogate;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaRichiesteAnticipoMissioniNonErogateResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaModulareRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaModulareRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaTipoGiustificativo;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaTipoGiustificativoResponse;

/**
 * SI del servizio Gestione RICHIESTA ECONOMALE
 * 
 * 
 */
@WebService(targetNamespace = CECSvcDictionary.NAMESPACE, name = "RichiestaEconomaleService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface RichiestaEconomaleService {

	/**
	 * Inserimento della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomale(@WebParam InserisceRichiestaEconomale parameters);
	
	/**
	 * Inserimento della richiesta economale di rimborso spese
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomaleRimborsoSpese(@WebParam InserisceRichiestaEconomale parameters);

	/**
	 * Inserimento della richiesta economale di pagamento fatture
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomalePagamentoFatture(@WebParam InserisceRichiestaEconomale parameters);

	/**
	 * Inserimento della richiesta economale di anticipo spese
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomaleAnticipoSpese(@WebParam InserisceRichiestaEconomale parameters);

	/**
	 * Inserimento della della richiesta economale di anticipo per trasferta dipendenti
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomaleAnticipoPerTrasfertaDipendenti(@WebParam InserisceRichiestaEconomale parameters);

	/**
	 * Inserimento della richiesta economale di anticipo per missione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomaleAnticipoSpesePerMissione(@WebParam InserisceRichiestaEconomale parameters);
	
	/**
	 * Inserimento della richiesta economale per pagamento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRichiestaEconomaleResponse inserisceRichiestaEconomalePagamento(@WebParam InserisceRichiestaEconomale parameters);
	
	/**
	 * Aggiornamento della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomale(@WebParam AggiornaRichiestaEconomale parameters);
	
	/**
	 * Aggiornamento della richiesta economale per il rimborso spese
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomaleRimborsoSpese(@WebParam AggiornaRichiestaEconomale parameters);

	/**
	 * Aggiornamento della richiesta economale per il pagamento fatture
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomalePagamentoFatture(@WebParam AggiornaRichiestaEconomale parameters);

	/**
	 * Aggiornamento della della richiesta economale per l'anticipo spese
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomaleAnticipoSpese(@WebParam AggiornaRichiestaEconomale parameters);
	
	/**
	 * Aggiornamento della richiesta economale per l'anticipo per trasferta dipendenti
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomaleAnticipoPerTrasfertaDipendenti(@WebParam AggiornaRichiestaEconomale parameters);
	
	/**
	 * Aggiornamento della richiesta economale per l'anticipo di spesa per missione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomaleAnticipoSpesePerMissione(@WebParam AggiornaRichiestaEconomale parameters);
	/**
	 * Aggiornamento della richiesta economale per pagamento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRichiestaEconomaleResponse aggiornaRichiestaEconomalePagamento(@WebParam AggiornaRichiestaEconomale parameters);
	
	
	
	/**
	 * Ricerca dettaglio della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioRichiestaEconomaleResponse ricercaDettaglioRichiestaEconomale(@WebParam RicercaDettaglioRichiestaEconomale parameters);
	
	/**
	 * Ricerca sintetica paginata della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaRichiestaEconomaleResponse ricercaSinteticaRichiestaEconomale(@WebParam RicercaSinteticaRichiestaEconomale parameters);
	
	/**
	 * Ricerca sintetica paginata modulare della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareRichiestaEconomaleResponse ricercaSinteticaModulareRichiestaEconomale(@WebParam RicercaSinteticaModulareRichiestaEconomale parameters);
	
	/***
	 * Ricerca l'elenco delle Richieste economali di Anticipo Spese Missione autorizzate ma non ancora erogate.
	 * <br/>
	 * Utilizza il servizio di HR: vm140: Elenca le trasferte con richiesta anticipo.
	 * 
	 * @param parameters
	 * @return le richieste
	 */
	@WebMethod
	@WebResult
	RicercaRichiesteAnticipoMissioniNonErogateResponse ricercaRichiesteAnticipoMissioniNonErogate(@WebParam RicercaRichiesteAnticipoMissioniNonErogate parameters);
	
	/**
	 * Annullamento della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaRichiestaEconomaleResponse annullaRichiestaEconomale(@WebParam AnnullaRichiestaEconomale parameters);
	
	/**
	 * Inserimento del rendiconto richiesta
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRendicontoRichiestaResponse inserisceRendicontoRichiesta(@WebParam InserisceRendicontoRichiesta parameters);
	
	/**
	 * Aggiornamento del rendiconto richiesta
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRendicontoRichiestaResponse aggiornaRendicontoRichiesta(@WebParam AggiornaRendicontoRichiesta parameters);
	
	/**
	 * Ricerca di dettaglio del del rendiconto richiesta
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioRendicontoRichiestaResponse ricercaDettaglioRendicontoRichiesta(@WebParam RicercaDettaglioRendicontoRichiesta parameters);
	
	
	/**
	 * Ricerca dei mezzi di trasporto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaMezziDiTrasportoResponse ricercaMezziDiTrasporto(@WebParam RicercaMezziDiTrasporto parameters);
	
	/**
	 * Ricerca del tipo giustificativo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoGiustificativoResponse ricercaTipoGiustificativo(@WebParam RicercaTipoGiustificativo parameters);
	
	/**
	 * Ricerca dei classificatori generici per cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaClassificatoriGenericiCassaEconomaleResponse ricercaClassificatoriGenericiCassaEconomale(@WebParam RicercaClassificatoriGenericiCassaEconomale parameters);
	
	
	// Lotto M
	/**
	 * Controllo di aggiornabilit&agrave; della richiest economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ControllaAggiornabilitaRichiestaEconomaleResponse controllaAggiornabilitaRichiestaEconomale(@WebParam ControllaAggiornabilitaRichiestaEconomale parameters);
	
	// Lotto P
	/**
	 * Ricerca di dettaglio della richiesta di anticipo missione non erogata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioRichiestaAnticipoMissioneNonErogataResponse ricercaDettaglioRichiesaAnticipoMissioneNonErogata(@WebParam RicercaDettaglioRichiestaAnticipoMissioneNonErogata parameters);
}
