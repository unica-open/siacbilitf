/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaCartaContabile;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaCartaContabileResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaCartaContabile;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaCartaContabileResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.CollegaQuotaDocumentoARigaCarta;
import it.csi.siac.siacfinser.frontend.webservice.msg.CollegaQuotaDocumentoARigaCartaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceCartaContabile;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceCartaContabileResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RegolarizzaCartaContabile;
import it.csi.siac.siacfinser.frontend.webservice.msg.RegolarizzaCartaContabileResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaCartaContabile;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaCartaContabilePerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaCartaContabilePerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaCartaContabileResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDocumentiCarta;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDocumentiCartaResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio per la gestione delle carte contabili
 * 
 * @author 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "CartaContabileService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)

public interface CartaContabileService extends CommonServiceInterface {
	
	/**
	 * 
	 * Operazione : Inserisce Carta Contabile
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di inserire una carta contabile.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	InserisceCartaContabileResponse inserisceCartaContabile(@WebParam InserisceCartaContabile request);
	
	/**
	 * 
	 * Operazione : Aggiorna Carta Contabile
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di aggiornare una carta contabile.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AggiornaCartaContabileResponse aggiornaCartaContabile(@WebParam AggiornaCartaContabile request);
	
	/**
	 * 
	 * Operazione : Ricerca Carta Contabile
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare pi&ugrave; carte contabili attraverso una ricerca aperta.
	 * Questa operazione restituir&agrave; un elenco di oggetti 'carta contabile' immagine dell'entit&agrave;.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaCartaContabileResponse ricercaCartaContabile(@WebParam RicercaCartaContabile request);
	
	/**
	 * 
	 * Operazione : Regolarizza Carta Contabile
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di regolarizzare le carte contabili o parti di esse ( PreDocumentoCarta ) passate nella 'Lista PreDocumentiCarta da regolarizzare'.
     * La regolarizzazione consiste nel predisporre i dati per la futura emissione di ordinativi di regolarizzazione
     * (detti anche a copertura dell'uscita di cassa gi&agrave; avvenuta),
     * con la creazione di documenti di spesa VALIDI di tipo CCN (Carta Contabile). 
	 *
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RegolarizzaCartaContabileResponse regolarizzaCartaContabile(@WebParam RegolarizzaCartaContabile request);
	
	/**
	 * 
	 * Operazione : Annulla Carta Contabile
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di annullare una Carta Contabile 
     * L'annullamento della carta dovr tenere conto dei documenti collegati e dello stato di partenza.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaCartaContabileResponse annullaCartaContabile(@WebParam AnnullaCartaContabile request);
	
	/**
	 * 
	 * Operazione : Ricerca Carta Contabile Per Chiave
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare una Carta Contabile attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave;:
	 * <ul>
	 *     <li>l'oggetto 'carta contabile' completo anche di tutte le decodifiche e calcoli</li>
	 * </ul>
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult 
	RicercaCartaContabilePerChiaveResponse ricercaCartaContabilePerChiave(@WebParam RicercaCartaContabilePerChiave request);
	
	
	/**
	 * Operazione : ricercaDocumentiCarta
	 * 
	 * Servizio che richiama il servizio Operazione Ricerca quote spesa e ne filtra ulteriormente i risultati in base a queste regole:
	 * 
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult 
	RicercaDocumentiCartaResponse ricercaDocumentiCarta(@WebParam RicercaDocumentiCarta request);
	
	/**
	 * 
	 * Operazione : Collega Quota Documento A RigaCarta
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Collegare la quota documento alla riga carta contabile agganciando
	 * alla carta anche l'impegno (cosi' come viene fatto nell'inserimento riga da documento)
	 *
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	CollegaQuotaDocumentoARigaCartaResponse collegaQuotaDocumentoARigaCarta(@WebParam CollegaQuotaDocumentoARigaCarta request);
	
	
}