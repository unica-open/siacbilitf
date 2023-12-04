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

import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.RicercaAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.RicercaAccantonamentoFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.ImpostaDefaultAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.ImpostaDefaultAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.ModificaStatoAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.ModificaStatoAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.RicercaDettaglioAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.RicercaDettaglioAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.RicercaPuntualeAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.RicercaPuntualeAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.RicercaSinteticaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.RicercaSinteticaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.SalvaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.SalvaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioExcelReport;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.attributibilancio.AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioExcelReportResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.AggiornaAccantonamentoFondiDubbiaEsigibilitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.AggiornaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.EliminaAccantonamentoFondiDubbiaEsigibilitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.EliminaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.InserisceAccantonamentoFondiDubbiaEsigibilitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.InserisceAccantonamentoFondiDubbiaEsigibilitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.InserisceAccantonamentoFondiDubbiaEsigibilitaImportGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.InserisceAccantonamentoFondiDubbiaEsigibilitaImportGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.RipristinaAccantonamentoFondiDubbiaEsigibilitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.RipristinaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.gestione.SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.AggiornaAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.AggiornaAccantonamentoFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.EliminaAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.EliminaAccantonamentoFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.InserisceAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.InserisceAccantonamentoFondiDubbiaEsigibilitaImport;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.InserisceAccantonamentoFondiDubbiaEsigibilitaImportResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.InserisceAccantonamentoFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.RipristinaAccantonamentoFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.RipristinaAccantonamentoFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImport;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.previsione.SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.AggiornaAccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.AggiornaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.CalcolaImportiPerAllegatoArconet;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.CalcolaImportiPerAllegatoArconetResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.EliminaAccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.EliminaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.InserisceAccantonamentoFondiDubbiaEsigibilitaImportRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.InserisceAccantonamentoFondiDubbiaEsigibilitaImportRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.InserisceAccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.InserisceAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.RipristinaAccantonamentoFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.RipristinaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.fcde.rendiconto.SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportRendicontoResponse;

/**
 * SI del servizio per i Fondi a Dubbia e Difficile Esigibilit&agrave;
 * 
 * @author Alessandro Marchino
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "FondiDubbiaEsigibilitaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface FondiDubbiaEsigibilitaService {

	// SIAC-7858 - riscrittura servizi
	
	// Attributi bilancio
	/**
	 * Inizializzazine dell dettaglio per gli fcde
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ImpostaDefaultAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse initDefaultDettaglioAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(@WebParam ImpostaDefaultAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio parameters);
	/**
	 * Lettura attributi fcde per il dettaglio
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse ricercaDettaglioAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(@WebParam RicercaDettaglioAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio parameters);
	/**
	 * Lettura attributi fcde per il bilancio
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse ricercaPuntualeAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(@WebParam RicercaPuntualeAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio parameters);
	
	/**
	 * Lettura attributi fcde per il bilancio versionati
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse ricercaSinteticaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(@WebParam RicercaSinteticaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio parameters);
	
	/**
	 * Salvataggio attributi fcde per il bilancio
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SalvaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse salvaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(@WebParam SalvaAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio parameters);
	
	/**
	 * Modifica dello stato per gli attributi fcde per il bilancio
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ModificaStatoAccantonamentoFondiDubbiaEsigibilitaAttributiBilancioResponse modificaStatoAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio(@WebParam ModificaStatoAccantonamentoFondiDubbiaEsigibilitaAttributiBilancio parameters);
	/**
	 * Stampa degli attributi fcde per il bilancio
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioExcelReportResponse accantonamentoFondiDubbiaEsigibilitaAttributiBilancioExcelReport(@WebParam AccantonamentoFondiDubbiaEsigibilitaAttributiBilancioExcelReport parameters);
	
	// FCDE
	/**
	 * Ricerca dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAccantonamentoFondiDubbiaEsigibilitaResponse ricercaAccantonamentoFondiDubbiaEsigibilita(@WebParam RicercaAccantonamentoFondiDubbiaEsigibilita parameters);
	// Previsione
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAccantonamentoFondiDubbiaEsigibilitaResponse inserisceAccantonamentoFondiDubbiaEsigibilita(@WebParam InserisceAccantonamentoFondiDubbiaEsigibilita parameters);
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAccantonamentoFondiDubbiaEsigibilitaImportResponse inserisceAccantonamentoFondiDubbiaEsigibilitaImport(@WebParam InserisceAccantonamentoFondiDubbiaEsigibilitaImport parameters);
	/**
	 * Simulazione inserimento dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportResponse simulaInserisceAccantonamentoFondiDubbiaEsigibilitaImport(@WebParam SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImport parameters);
	
	/**
	 * Ripristino dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RipristinaAccantonamentoFondiDubbiaEsigibilitaResponse ripristinaAccantonamentoFondiDubbiaEsigibilita(@WebParam RipristinaAccantonamentoFondiDubbiaEsigibilita parameters);
	/**
	 * Eliminazione dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaAccantonamentoFondiDubbiaEsigibilitaResponse eliminaAccantonamentoFondiDubbiaEsigibilita(@WebParam EliminaAccantonamentoFondiDubbiaEsigibilita parameters);
	/**
	 * Aggiornamento dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAccantonamentoFondiDubbiaEsigibilitaResponse aggiornaAccantonamentoFondiDubbiaEsigibilita(@WebParam AggiornaAccantonamentoFondiDubbiaEsigibilita parameters);
	
	// Rendiconto
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse inserisceAccantonamentoFondiDubbiaEsigibilitaRendiconto(@WebParam InserisceAccantonamentoFondiDubbiaEsigibilitaRendiconto parameters);
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAccantonamentoFondiDubbiaEsigibilitaImportRendicontoResponse inserisceAccantonamentoFondiDubbiaEsigibilitaImportRendiconto(@WebParam InserisceAccantonamentoFondiDubbiaEsigibilitaImportRendiconto parameters);
	
	/**
	 * Ripristino dei fondi a dubbia e difficile esazionee, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RipristinaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse ripristinaAccantonamentoFondiDubbiaRendicontoEsigibilita(@WebParam RipristinaAccantonamentoFondiDubbiaEsigibilitaRendiconto parameters);
	/**
	 * Eliminazione dei fondi a dubbia e difficile esazionee, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse eliminaAccantonamentoFondiDubbiaEsigibilitaRendiconto(@WebParam EliminaAccantonamentoFondiDubbiaEsigibilitaRendiconto parameters);
	/**
	 * Aggiornamento dei fondi a dubbia e difficile esazionee, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAccantonamentoFondiDubbiaEsigibilitaRendicontoResponse aggiornaAccantonamentoFondiDubbiaEsigibilitaRendiconto(@WebParam AggiornaAccantonamentoFondiDubbiaEsigibilitaRendiconto parameters);
	/**
	 * Simulazione inserimento dei fondi a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportRendicontoResponse simulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportRendiconto(@WebParam SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportRendiconto parameters);
	// Gestione
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione, gestione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAccantonamentoFondiDubbiaEsigibilitaGestioneResponse inserisceAccantonamentoFondiDubbiaEsigibilitaGestione(@WebParam InserisceAccantonamentoFondiDubbiaEsigibilitaGestione parameters);
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione, gestione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAccantonamentoFondiDubbiaEsigibilitaImportGestioneResponse inserisceAccantonamentoFondiDubbiaEsigibilitaImportGestione(@WebParam InserisceAccantonamentoFondiDubbiaEsigibilitaImportGestione parameters);
	
	/**
	 * Ripristino dei fondi a dubbia e difficile esazionee, gestione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RipristinaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse ripristinaAccantonamentoFondiDubbiaGestioneEsigibilita(@WebParam RipristinaAccantonamentoFondiDubbiaEsigibilitaGestione parameters);
	/**
	 * Eliminazione dei fondi a dubbia e difficile esazionee, gestione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse eliminaAccantonamentoFondiDubbiaEsigibilitaGestione(@WebParam EliminaAccantonamentoFondiDubbiaEsigibilitaGestione parameters);
	/**
	 * Aggiornamento dei fondi a dubbia e difficile esazionee, gestione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAccantonamentoFondiDubbiaEsigibilitaGestioneResponse aggiornaAccantonamentoFondiDubbiaEsigibilitaGestione(@WebParam AggiornaAccantonamentoFondiDubbiaEsigibilitaGestione parameters);
	/**
	 * Simulazione inserimento dei fondi a dubbia e difficile esazione, gestione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportGestioneResponse simulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportGestione(@WebParam SimulaInserisceAccantonamentoFondiDubbiaEsigibilitaImportGestione parameters);
	/**
	 * Calcola gli importi per l'Allegato C (Report Arconet)
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CalcolaImportiPerAllegatoArconetResponse calcolaCampiAllegatoArconet(@WebParam CalcolaImportiPerAllegatoArconet parameters);
}
