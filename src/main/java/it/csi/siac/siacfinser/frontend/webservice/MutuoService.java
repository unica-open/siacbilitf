/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaMutuo;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaMutuoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceMutuo;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceMutuoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaMutuo;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaMutuoPerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaMutuoPerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaMutuoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaMutuo;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaMutuoResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio per la gestione dei mutui
 * 
 * @author 
 *
 */
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "MutuoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)

public interface MutuoService extends CommonServiceInterface {

	/**
	 * 
	 * Operazione: Inserisce Mutuo
	 * 
	 * Descrizione dell'operazione:
	 * 
	 * Consente di inserire un nuovo mutuo con i dati specificati in input.
	 * 
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	InserisceMutuoResponse inserisceMutuo(@WebParam InserisceMutuo request);

	/**
	 * 
	 * Operazione : Aggiorna Mutuo
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di Aggiornare :
	 * 	   Consente di aggiornare alcuni dati di un Mutuo e le entit&agrave; di secondo livello, con i dati specificati in input
	 *     senza effettuare i controlli di correttezza formale dei codici e duplicazione del mutuo.
	 *      
	 * Il servizio consente quindi di aggiornare un mutuo e, se l'input lo prevede, contemporaneamente:
	 *  - Gestire il mutuo per:
	 *     - Aggiornare un mutuo
	 *     
     *  - Gestire le voci di mutuo legate al mutuo permettendo di
	 *     - Inserire nuove voci di mutuo
	 *     - Aggiornare le operazioni sulle voci di mutuo esistenti
	 *     - Cancellare voci di mutuo esistenti     
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AggiornaMutuoResponse aggiornaMutuo(@WebParam AggiornaMutuo request);
	
	/**
	 * 
	 * Operazione : Ricerca Mutuo
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare pi&ugrave; mutui attraverso una ricerca aperta.
	 * Questa operazione restituir&agrave; un elenco di oggetti 'mutui' immagine dell'entit&agrave;.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaMutuoResponse ricercaMutuo(@WebParam RicercaMutuo request);	

	/**
	 * 
	 * Operazione : Ricerca Mutuo Per Chiave
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare un nuovo Mutuo e le entit&agrave; di secondo livello (voci di mutuo) attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave;:
	 * <ul>
	 *     <li>l'oggetto 'mutuo' completo anche di tutte le decodifiche e calcoli</li>
	 *     <li>un elenco di voci di mutuo (impegni finanziati da mutuo)</li>
	 * </ul>
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaMutuoPerChiaveResponse ricercaMutuoPerChiave(@WebParam RicercaMutuoPerChiave request);

	/**
	 * 
	 * Operazione : Annulla Mutuo
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di annullare un mutuo con i dati specificati in input.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaMutuoResponse annullaMutuo(@WebParam AnnullaMutuo request);	
}