/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice;

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaVincoloCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaVincoloCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaVincoloCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaVincoloCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AssociaCapitoloAlVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AssociaCapitoloAlVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVincoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ScollegaCapitoloAlVincolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ScollegaCapitoloAlVincoloResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione VincoloCapitoloService
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "VincoloCapitoloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface VincoloCapitoloService {

	/**
	 * Inserimento dell'anagrafica del vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAnagraficaVincoloResponse inserisceAnagraficaVincolo(@WebParam InserisceAnagraficaVincolo parameters);

	/**
	 * Ricerca del vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaVincoloResponse ricercaVincolo(@WebParam RicercaVincolo parameters);

	/**
	 * Ricerca dettaglio del vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioVincoloResponse ricercaDettaglioVincolo(@WebParam RicercaDettaglioVincolo parameters);
	
	
	/**
	 * Annullamento del vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaVincoloCapitoloResponse annullaVincoloCapitolo(@WebParam AnnullaVincoloCapitolo parameters);
	
	/**
	 * Aggiornamento del vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaVincoloCapitoloResponse aggiornaVincoloCapitolo(@WebParam AggiornaVincoloCapitolo parameters);
	
	/**
	 * Associazione del capitolo al vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssociaCapitoloAlVincoloResponse associaCapitoloAlVincolo(@WebParam AssociaCapitoloAlVincolo parameters);
	
	/**
	 * Scollegamento del capitolo dal vincolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ScollegaCapitoloAlVincoloResponse scollegaCapitoloAlVincolo(@WebParam ScollegaCapitoloAlVincolo parameters);
	
}
