/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccecser.frontend.webservice.msg.InviaAllegatoAtto;
import it.csi.siac.siaccecser.frontend.webservice.msg.InviaAllegatoAttoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaAllegatoAtto;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaAllegatoAttoResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDatiSoggettoAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDatiSoggettoAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaMassivaDatiSoggettoAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaMassivaDatiSoggettoAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaAllegatoAttoMultiplo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaAllegatoAttoMultiploResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ControlloImportiImpegniVincolati;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ControlloImportiImpegniVincolatiResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ConvalidaAllegatoAttoPerElenchi;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ConvalidaAllegatoAttoPerElenchiMultiplo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ConvalidaAllegatoAttoPerElenchiMultiploResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ConvalidaAllegatoAttoPerElenchiResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ConvalidaAllegatoAttoPerProvvisorio;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ConvalidaAllegatoAttoPerProvvisorioResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DisassociaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DisassociaElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDaElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiAllegatoAttoChecklist;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiAllegatoAttoChecklistResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RiCompletaAllegatoAttoPerElenchi;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RiCompletaAllegatoAttoPerElenchiResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDatiSoggettoAllegato;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDatiSoggettoAllegatoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDatiSospensioneAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDatiSospensioneAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaElenchiPerAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaElenchiPerAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaElencoDaEmettere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaElencoDaEmettereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaQuoteElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaQuoteElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaStampaAllegatoAtto;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaStampaAllegatoAttoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RifiutaElenchi;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RifiutaElenchiResponse;


/**
 * SI del servizio Gestione AllegatoAttoService
 * 
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "AllegatoAttoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface AllegatoAttoService {

	/**
	 * Inserimento dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAllegatoAttoResponse inserisceAllegatoAtto(@WebParam InserisceAllegatoAtto parameters);

	/**
	 * Aggiornamento dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAllegatoAttoResponse aggiornaAllegatoAtto(@WebParam AggiornaAllegatoAtto parameters);
	
	/**
	 * Annullamento dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaAllegatoAttoResponse annullaAllegatoAtto(@WebParam AnnullaAllegatoAtto parameters);
	
	/**
	 * Ricerca dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAllegatoAttoResponse ricercaAllegatoAtto(@WebParam RicercaAllegatoAtto parameters);
	
	/**
	 * Ricerca di dettaglio dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioAllegatoAttoResponse ricercaDettaglioAllegatoAtto(@WebParam RicercaDettaglioAllegatoAtto parameters);
	
	/**
	 * Inserimento dell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceElencoResponse inserisceElenco(@WebParam  InserisceElenco parameters);
	
	/**
	 * Aggiornamento dell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaElencoResponse aggiornaElenco(@WebParam AggiornaElenco parameters);
	
	/**
	 * Ricerca dell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaElencoResponse ricercaElenco(@WebParam RicercaElenco parameters);
	
	/**
	 * Ricerca dell'elenco da emettere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaElencoDaEmettereResponse ricercaElencoDaEmettere(@WebParam RicercaElencoDaEmettere parameters);
	
	
	//--- Aggiunti rispetto all'analisi
	
	/**
	 * Associazione dell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssociaElencoResponse associaElenco(@WebParam AssociaElenco parameters);
	
	/**
	 * Disassociazione dell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DisassociaElencoResponse disassociaElenco(@WebParam DisassociaElenco parameters);
	
	/**
	 * Aggiornamento dei dati soggetto allegato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaDatiSoggettoAllegatoAttoResponse aggiornaDatiSoggettoAllegatoAtto(@WebParam AggiornaDatiSoggettoAllegatoAtto parameters);
	
	/**
	 * Ricerca di dettaglio dell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioElencoResponse ricercaDettaglioElenco(@WebParam RicercaDettaglioElenco parameters);
	
	/**
	 * Eliminazione della quota dall'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaQuotaDaElencoResponse eliminaQuotaDaElenco(@WebParam EliminaQuotaDaElenco parameters);
	
	/**
	 * Inserimento dell'elenco con documenti e quote
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceElencoResponse inserisceElencoConDocumentiConQuote(@WebParam InserisceElenco parameters);
	
	/**
	 * Ricerca dei dati soggetto allegato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDatiSoggettoAllegatoResponse ricercaDatiSoggettoAllegato(@WebParam RicercaDatiSoggettoAllegato parameters);
	
	
	// --- Asincroni
	
	/**
	 * Completamento dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CompletaAllegatoAttoResponse completaAllegatoAtto(@WebParam CompletaAllegatoAtto parameters);
	
	/**
	 * Completamento dell'allegato atto asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #completaAllegatoAtto(CompletaAllegatoAtto)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse completaAllegatoAttoAsync(@WebParam AsyncServiceRequestWrapper<CompletaAllegatoAtto> parameters);
	
	/**
	 * Convalida dell'allegato atto per elenchi
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ConvalidaAllegatoAttoPerElenchiResponse convalidaAllegatoAttoPerElenchi(@WebParam ConvalidaAllegatoAttoPerElenchi parameters);
	
	/**
	 * Convalida dell'allegato atto per elenchi asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #convalidaAllegatoAttoPerElenchi(ConvalidaAllegatoAttoPerElenchi)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse convalidaAllegatoAttoPerElenchiAsync(@WebParam AsyncServiceRequestWrapper<ConvalidaAllegatoAttoPerElenchi> parameters);
	
	/**
	 * Ricompletamento dell'allegato atto per elenchi
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RiCompletaAllegatoAttoPerElenchiResponse riCompletaAllegatoAttoPerElenchi(@WebParam RiCompletaAllegatoAttoPerElenchi parameters);
	
	/**
	 * Ricompletamento dell'allegato atto per elenchi asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #riCompletaAllegatoAttoPerElenchi(RiCompletaAllegatoAttoPerElenchi)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse riCompletaAllegatoAttoPerElenchiAsync(@WebParam AsyncServiceRequestWrapper<RiCompletaAllegatoAttoPerElenchi> parameters);
	
	/**
	 * Rifiuto degli elenchi
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RifiutaElenchiResponse rifiutaElenchi(@WebParam RifiutaElenchi parameters);
	
	/**
	 * Rifiuto degli elenchi asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #rifiutaElenchi(RifiutaElenchi)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse rifiutaElenchiAsync(@WebParam AsyncServiceRequestWrapper<RifiutaElenchi> parameters);
	
	/**
	 * Convalida dell'allegato atto per provvisorio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ConvalidaAllegatoAttoPerProvvisorioResponse convalidaAllegatoAttoPerProvvisorio(@WebParam ConvalidaAllegatoAttoPerProvvisorio parameters);
	
	/**
	 * Convalida dell'allegato atto per provvisorio asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #convalidaAllegatoAttoPerProvvisorio(ConvalidaAllegatoAttoPerProvvisorio)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse convalidaAllegatoAttoPerProvvisorioAsync(@WebParam AsyncServiceRequestWrapper<ConvalidaAllegatoAttoPerProvvisorio> parameters);
	
	// --- Lotto L
	
	/**
	 * Stampa dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	StampaAllegatoAttoResponse stampaAllegatoAtto(@WebParam StampaAllegatoAtto parameters);
	
	/**
	 * Stampa dell'allegato atto asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #stampaAllegatoAtto(StampaAllegatoAtto)
	 */
	@WebMethod
	@WebResult
	StampaAllegatoAttoResponse stampaAllegatoAttoAsync(@WebParam StampaAllegatoAtto parameters);
	
	/**
	 * Invio dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InviaAllegatoAttoResponse inviaAllegatoAtto(@WebParam InviaAllegatoAtto parameters);
	
	/**
	 * Invio dell'allegato atto asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #inviaAllegatoAtto(InviaAllegatoAtto)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse inviaAllegatoAttoAsync(@WebParam AsyncServiceRequestWrapper<InviaAllegatoAtto> parameters);
	
	@WebMethod
	@WebResult
	CompletaAllegatoAttoMultiploResponse completaAllegatoAttoMultiplo(@WebParam CompletaAllegatoAttoMultiplo parameters);
	
	/**
	 * Completamento dell'allegato atto asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #completaAllegatoAtto(CompletaAllegatoAtto)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse completaAllegatoAttoMultiploAsync(@WebParam AsyncServiceRequestWrapper<CompletaAllegatoAttoMultiplo> parameters);
	
	/**
	 * Convalida dell'allegato atto per elenchi
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ConvalidaAllegatoAttoPerElenchiMultiploResponse convalidaAllegatoAttoPerElenchiMultiplo(@WebParam ConvalidaAllegatoAttoPerElenchiMultiplo parameters);
	
	/**
	 * Convalida dell'allegato atto per elenchi asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #convalidaAllegatoAttoPerElenchi(ConvalidaAllegatoAttoPerElenchi)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse convalidaAllegatoAttoPerElenchiMultiploAsync(@WebParam AsyncServiceRequestWrapper<ConvalidaAllegatoAttoPerElenchiMultiplo> parameters);
	
	// --- Lotto O
	/**
	 * Ricerca elenchi per allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaElenchiPerAllegatoAttoResponse ricercaElenchiPerAllegatoAtto(@WebParam RicercaElenchiPerAllegatoAtto parameters);


	// --- CR 2705
	/**
	 * Ricerca sintetica paginata delle stampe dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaStampaAllegatoAttoResponse ricercaSinteticaStampaAllegatoAtto(@WebParam RicercaSinteticaStampaAllegatoAtto parameters);
	
	/**
	 * Ricerca di dettaglio delle quote nell'elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaQuoteElencoResponse ricercaSinteticaQuoteElenco(@WebParam RicercaSinteticaQuoteElenco parameters);
	
	// SIAC-5172
	/**
	 * Aggiornamento massivo dei dati soggetto allegato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaMassivaDatiSoggettoAllegatoAttoResponse aggiornaMassivaDatiSoggettoAllegatoAtto(@WebParam AggiornaMassivaDatiSoggettoAllegatoAtto parameters);
	
	/**
	 * Ricerca dei dati sospensione soggetto dell'allegato atto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDatiSospensioneAllegatoAttoResponse ricercaDatiSospensioneAllegatoAtto(@WebParam RicercaDatiSospensioneAllegatoAtto parameters);
	
	/**
	 * Controllo che l'impegno vincolato sia finanziato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ControlloImportiImpegniVincolatiResponse controlloImportiImpegniVincolati(@WebParam ControlloImportiImpegniVincolati parameters);

	@WebMethod
	@WebResult
	LeggiAllegatoAttoChecklistResponse leggiAllegatoAttoChecklist(@WebParam LeggiAllegatoAttoChecklist parameters);



	
	
}	