/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import it.csi.siac.siacfinser.frontend.webservice.msg.CaricaDatiVisibilitaSacCapitolo;
import it.csi.siac.siacfinser.frontend.webservice.msg.CaricaDatiVisibilitaSacCapitoloResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.EsistenzaProgetto;
import it.csi.siac.siacfinser.frontend.webservice.msg.EsistenzaProgettoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaComunePerNome;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaComunePerNomeResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaComuni;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaComuniResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaSedime;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListaSedimeResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.Liste;
import it.csi.siac.siacfinser.frontend.webservice.msg.ListeResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccountPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaAccountPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaGruppoTipoAccreditoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaGruppoTipoAccreditoPerChiaveResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI dei servizi generici
 * @author 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "GenericService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface GenericService extends CommonServiceInterface {
	
	
	
	/**
	 * Restituisce le liste a seconda degli oggetti richiesti
	 */
	@WebMethod
	@WebResult
	ListeResponse liste(@WebParam Liste request);
	
	
	/**
	 * Restituisce un elenco di sedimi con una ricerca Like con la parte iniziale del sedime stesso
	 */
	@WebMethod
	@WebResult
	ListaSedimeResponse listaSedime(@WebParam ListaSedime request);
	

	/**
	 * Restituisce una lista di comune con una ricerca like
	 */
	@WebMethod
	@WebResult
	ListaComunePerNomeResponse findComunePerNome(@WebParam ListaComunePerNome request);
	
	/**
	 * Ricerca i  dati di un account indicato
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	RicercaAccountPerChiaveResponse ricercaAccountPerChiave(@WebParam RicercaAccountPerChiave request);
	
	
	/**
	 * Verifica l'esistenza del codice del progetto sulla base dati
	 * 
	 * @param request
	 * @return EsistenzaProgettoResponse
	 */
	@WebMethod
	@WebResult
	EsistenzaProgettoResponse cercaProgetto(@WebParam EsistenzaProgetto request);
	
	@WebMethod
	@WebResult
	RicercaGruppoTipoAccreditoPerChiaveResponse findGruppoTipoAccreditoPerPk(@WebParam RicercaGruppoTipoAccreditoPerChiave request);
	
	/**
	 * Dato il nome del comune, la funzione deve ricercare sulle tabelle la rispettiva corrispondenza, effettuata tramite la clasusola LIKE.
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	ListaComuniResponse cercaComuni(@WebParam ListaComuni request);
	
	@WebMethod
	@WebResult
	CaricaDatiVisibilitaSacCapitoloResponse caricaDatiVisibilitaSacCapitolo(@WebParam CaricaDatiVisibilitaSacCapitolo request);

}
