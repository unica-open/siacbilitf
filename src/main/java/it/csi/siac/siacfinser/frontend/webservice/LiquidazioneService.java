/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;



import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaLiquidazione;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaLiquidazioneModulare;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaLiquidazioneModulareResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaLiquidazioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaLiquidazione;
import it.csi.siac.siacfinser.frontend.webservice.msg.AnnullaLiquidazioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.CalcolaDisponibilitaALiquidare;
import it.csi.siac.siacfinser.frontend.webservice.msg.CalcolaDisponibilitaALiquidareResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceLiquidazione;
import it.csi.siac.siacfinser.frontend.webservice.msg.InserisceLiquidazioneResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaLiquidazioneConAllegatoAtto;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaLiquidazioneConAllegatoAttoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaLiquidazionePerChiave;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaLiquidazionePerChiaveResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaLiquidazioni;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaLiquidazioniResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
* SI del servizio per la gestione dei Liquidazioni
* 
* @author 
*
*/
@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "LiquidazioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)


public interface LiquidazioneService extends CommonServiceInterface {
	
	/**
	 * 
	 * Operazione : Ricerca Liquidazione
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare pi&ugrave; liquidazioni attraverso una ricerca aperta.
	 * Questa operazione restituir&agrave; un elenco di oggetti 'liquidazioni' immagine dell'entit&agrave;.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaLiquidazioniResponse ricercaLiquidazioni(@WebParam RicercaLiquidazioni request);	
	
	/**
	 * 
	 * Operazione : Inserisce Liquidazione
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di inserire una  liquidazione.
	 * Questa operazione restituir&agrave; la liquidazione inserita.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	InserisceLiquidazioneResponse inserisceLiquidazione(@WebParam InserisceLiquidazione request);
	
	/**
	 * 
	 * Operazione : Ricerca Liquidazione Per Chiave
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di ricercare un nuovo Liquidazione e le entit&agrave; di secondo livello attraverso la sua chiave unica.
	 * Questa operazione cos&igrave; puntuale restituir&agrave;:
	 * <ul>
	 *     <li>l'oggetto 'Liquidazione' completo anche di tutte le decodifiche e calcoli</li>
	 * </ul> 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	RicercaLiquidazionePerChiaveResponse ricercaLiquidazionePerChiave(@WebParam RicercaLiquidazionePerChiave request);

	/**
	 * 
	 * Operazione : Annulla Liquidazione
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di annullare una Liquidazione con i dati specificati in input.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	@WebMethod
	@WebResult
	AnnullaLiquidazioneResponse annullaLiquidazione(@WebParam AnnullaLiquidazione request);	
	
	
	/**
	 * 
	 * Operazione : Aggiorna Liquidazione
	 * 
	 * Descrizione dell'operazione :
	 * 
	 * Consente di aggiornare una Liquidazione con i dati specificati in input.
	 * 
	 * @param request
	 * @return
	 * 
	 */
	
	@WebMethod
	@WebResult 
	AggiornaLiquidazioneResponse aggiornaLiquidazione(@WebParam AggiornaLiquidazione request);
	
	
	@WebMethod
	@WebResult 
	AggiornaLiquidazioneModulareResponse aggiornaLiquidazioneModulare(@WebParam AggiornaLiquidazioneModulare request);
	
		
	@WebMethod
	@WebResult
	RicercaLiquidazioneConAllegatoAttoResponse ricercaLiquidazioneConAllegatoAtto(@WebParam RicercaLiquidazioneConAllegatoAtto request);	
	
	@WebMethod
	@WebResult
	CalcolaDisponibilitaALiquidareResponse calcolaDisponibilitaALiquidare(@WebParam CalcolaDisponibilitaALiquidare request);
}
