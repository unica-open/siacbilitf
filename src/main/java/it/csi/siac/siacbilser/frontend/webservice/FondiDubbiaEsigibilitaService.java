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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaFondoDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaFondoDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaFondoDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaFondoDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaFondiDubbiaEsigibilitaAnnoPrecedente;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaFondiDubbiaEsigibilitaAnnoPrecedenteResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaFondiDubbiaEsigibilitaRendicontoAnnoCorrente;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaFondiDubbiaEsigibilitaRendicontoAnnoCorrenteResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaFondiDubbiaEsigibilitaRendicontoAnnoPrecedente;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaFondiDubbiaEsigibilitaRendicontoAnnoPrecedenteResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaFondoDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaFondoDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaFondoDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaFondoDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceFondiDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaDaAnnoPrecedente;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaDaAnnoPrecedenteResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedenteResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoCorrente;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente;
import it.csi.siac.siacbilser.frontend.webservice.msg.PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedenteResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaFondiDubbiaEsigibilita;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaFondiDubbiaEsigibilitaRendiconto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaFondiDubbiaEsigibilitaRendicontoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaFondiDubbiaEsigibilitaResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;

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

	/**
	 * Inserimento dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceFondiDubbiaEsigibilitaResponse inserisceFondiDubbiaEsigibilita(@WebParam InserisceFondiDubbiaEsigibilita parameters);
	
	/**
	 * Aggiornamento del fondo a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaFondoDubbiaEsigibilitaResponse aggiornaFondoDubbiaEsigibilita(@WebParam AggiornaFondoDubbiaEsigibilita parameters);
	
	/**
	 * Eliminazione del fondo a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaFondoDubbiaEsigibilitaResponse eliminaFondoDubbiaEsigibilita(@WebParam EliminaFondoDubbiaEsigibilita parameters);

	/**
	 * Ricerca sintetica dei fondi a dubbia e difficile esazione
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaFondiDubbiaEsigibilitaResponse ricercaSinteticaFondiDubbiaEsigibilita(@WebParam RicercaSinteticaFondiDubbiaEsigibilita parameters);
	
	/**
	 * Popolamento dei fondi a dubbia e difficile esazione a partire dall'anno precedente
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	PopolaFondiDubbiaEsigibilitaDaAnnoPrecedenteResponse popolaFondiDubbiaEsigibilitaDaAnnoPrecedente(@WebParam PopolaFondiDubbiaEsigibilitaDaAnnoPrecedente parameters);
	
	/**
	 * Versione Async del servizio {@link #popolaFondiDubbiaEsigibilitaDaAnnoPrecedente(PopolaFondiDubbiaEsigibilitaDaAnnoPrecedente)}.
	 * @param parameters il wrapper asincrono della request per il servizio
	 * @return la risposta del servizio asincrono
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse popolaFondiDubbiaEsigibilitaDaAnnoPrecedenteAsync(@WebParam AsyncServiceRequestWrapper<PopolaFondiDubbiaEsigibilitaDaAnnoPrecedente> parameters);
	
	// SIAC-4422
	
	/**
	 * Inserimento dei fondi a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceFondiDubbiaEsigibilitaRendicontoResponse inserisceFondiDubbiaEsigibilitaRendiconto(@WebParam InserisceFondiDubbiaEsigibilitaRendiconto parameters);
	
	/**
	 * Aggiornamento del fondo a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaFondoDubbiaEsigibilitaRendicontoResponse aggiornaFondoDubbiaEsigibilitaRendiconto(@WebParam AggiornaFondoDubbiaEsigibilitaRendiconto parameters);
	
	/**
	 * Eliminazione del fondo a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaFondoDubbiaEsigibilitaRendicontoResponse eliminaFondoDubbiaEsigibilitaRendiconto(@WebParam EliminaFondoDubbiaEsigibilitaRendiconto parameters);

	/**
	 * Ricerca sintetica dei fondi a dubbia e difficile esazione, rendiconto
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaFondiDubbiaEsigibilitaRendicontoResponse ricercaSinteticaFondiDubbiaEsigibilitaRendiconto(@WebParam RicercaSinteticaFondiDubbiaEsigibilitaRendiconto parameters);
	
	/**
	 * Popolamento dei fondi a dubbia e difficile esazione, rendiconto, a partire dall'anno precedente
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedenteResponse popolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente(@WebParam PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente parameters);
	
	/**
	 * Versione Async del servizio {@link #popolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente(PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente)}.
	 * @param parameters il wrapper asincrono della request per il servizio
	 * @return la risposta del servizio asincrono
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse popolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedenteAsync(@WebParam AsyncServiceRequestWrapper<PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoPrecedente> parameters);
	
	
	// SIAC-6040

	@WebMethod
	@WebResult
	AsyncServiceResponse popolaFondiDubbiaEsigibilitaRendicontoDaAnnoCorrenteAsync(AsyncServiceRequestWrapper<PopolaFondiDubbiaEsigibilitaRendicontoDaAnnoCorrente> wrapRequestToAsync);
	

	@WebMethod
	@WebResult
	ControllaFondiDubbiaEsigibilitaRendicontoAnnoCorrenteResponse controllaFondiDubbiaEsigibilitaRendicontoAnnoCorrente(@WebParam ControllaFondiDubbiaEsigibilitaRendicontoAnnoCorrente parameters);

	// SIAC-4469
	
	/**
	 * Controlla se vi siano fondi a dusbbia e difficile esazione nell'anno precedente a quello di bilancio
	 * @param parameters la request per il servizio
	 * @return la response 
	 */
	@WebMethod
	@WebResult
	ControllaFondiDubbiaEsigibilitaAnnoPrecedenteResponse controllaFondiDubbiaEsigibilitaAnnoPrecedente(@WebParam ControllaFondiDubbiaEsigibilitaAnnoPrecedente parameters);
	
	/**
	 * Controlla se vi siano fondi a dusbbia e difficile esazione nell'anno precedente a quello di bilancio
	 * @param parameters la request per il servizio
	 * @return la response 
	 */
	@WebMethod
	@WebResult
	ControllaFondiDubbiaEsigibilitaRendicontoAnnoPrecedenteResponse controllaFondiDubbiaEsigibilitaRendicontoAnnoPrecedente(@WebParam ControllaFondiDubbiaEsigibilitaRendicontoAnnoPrecedente parameters);
	
	// SIAC-5481
	/**
	 * Popolamento dei fondi a dubbia e difficile esazione, gestione, a partire dall'anno precedente
	 * @param parameters la request per il servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	PopolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedenteResponse popolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente(@WebParam PopolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente parameters);
	
	/**
	 * Versione Async del servizio {@link #popolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente(PopolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente)}.
	 * @param parameters il wrapper asincrono della request per il servizio
	 * @return la risposta del servizio asincrono
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse popolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedenteAsync(@WebParam AsyncServiceRequestWrapper<PopolaFondiDubbiaEsigibilitaDaGestioneAnnoPrecedente> parameters);

}
