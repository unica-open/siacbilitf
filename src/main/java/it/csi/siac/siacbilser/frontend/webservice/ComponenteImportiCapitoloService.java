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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaComponenteImportiCapitoloResponse;

 
/**
 * ComponenteImportiCapitoloService
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "ComponenteImportiCapitoloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ComponenteImportiCapitoloService {

	/**
	 * Inserimento della componente del capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceComponenteImportiCapitoloResponse inserisceComponenteImportiCapitolo(@WebParam InserisceComponenteImportiCapitolo parameters);

	/**
	 * Aggiornamento della componente del capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaComponenteImportiCapitoloResponse aggiornaComponenteImportiCapitolo(@WebParam AggiornaComponenteImportiCapitolo parameters);
	
	
	/**
	 * Ricerca della componente del capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaComponenteImportiCapitoloResponse ricercaComponenteImportiCapitolo(@WebParam RicercaComponenteImportiCapitolo parameters);


	
	/**
	 * Annullamento della componente del capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaComponenteImportiCapitoloResponse annullaComponenteImportiCapitolo(@WebParam AnnullaComponenteImportiCapitolo parameters);
	
	/**
	 * Aggiornamento degli importi capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaImportiCapitoloResponse aggiornaImportiCapitolo(@WebParam AggiornaImportiCapitolo parameters);

}
