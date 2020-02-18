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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoComponenteImportiCapitoloPerCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoComponenteImportiCapitoloPerCapitolo;

 
/**
 * TipoComponenteImportiCapitoloService
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "TipoComponenteImportiCapitoloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface TipoComponenteImportiCapitoloService {

	/**
	 * Inserimento della componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceTipoComponenteImportiCapitoloResponse inserisceTipoComponenteImportiCapitolo(@WebParam InserisceTipoComponenteImportiCapitolo request);

	/**
	 * Aggiornamento della componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaTipoComponenteImportiCapitoloResponse aggiornaTipoComponenteImportiCapitolo(@WebParam AggiornaTipoComponenteImportiCapitolo request);
	
	
	/**
	 * Ricerca della componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoComponenteImportiCapitoloResponse ricercaTipoComponenteImportiCapitolo(@WebParam RicercaTipoComponenteImportiCapitolo request);

	
	/**
	 * Ricerca dettaglio componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioTipoComponenteImportiCapitoloResponse ricercaDettaglioTipoComponenteImportiCapitolo(@WebParam RicercaDettaglioTipoComponenteImportiCapitolo request);

	
	/**
	 * Ricerca sintetica componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaTipoComponenteImportiCapitoloResponse ricercaSinteticaTipoComponenteImportiCapitolo(@WebParam RicercaSinteticaTipoComponenteImportiCapitolo request);

	/**
	 * Ricerca tipo componenti per tipo e categoria capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoComponenteImportiCapitoloPerCapitoloResponse ricercaTipoComponenteImportiCapitoloPerCapitolo(@WebParam RicercaTipoComponenteImportiCapitoloPerCapitolo request);

	/**
	 * Annullamento della componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaTipoComponenteImportiCapitoloResponse annullaTipoComponenteImportiCapitolo(@WebParam AnnullaTipoComponenteImportiCapitolo request);
	
	
}
