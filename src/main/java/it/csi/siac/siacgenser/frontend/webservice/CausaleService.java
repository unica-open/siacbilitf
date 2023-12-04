/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaClassificatoriEP;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaClassificatoriEPResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioModulareCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioModulareCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaEventiPerTipo;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaEventiPerTipoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaMinimaCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaMinimaCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaModulareCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaModulareCausaleResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.ValidaCausale;
import it.csi.siac.siacgenser.frontend.webservice.msg.ValidaCausaleResponse;

/**
 * SI del servizio Gestione CausaleService
 * 
 * 
 */
@WebService(targetNamespace = GENSvcDictionary.NAMESPACE, name = "CausaleService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CausaleService {

	/**
	 * Inserimento della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCausaleResponse inserisceCausale(@WebParam InserisceCausale parameters);

	/**
	 * Aggiornamento della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCausaleResponse aggiornaCausale(@WebParam AggiornaCausale parameters);
	
	/**
	 * Annullamento della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCausaleResponse annullaCausale(@WebParam AnnullaCausale parameters);
	
	/**
	 * Eliminazione della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaCausaleResponse eliminaCausale(@WebParam EliminaCausale parameters);
	
	/**
	 * Validazione della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ValidaCausaleResponse validaCausale(@WebParam ValidaCausale parameters);
	
	/**
	 * Ricerca sintetica paginata della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCausaleResponse ricercaSinteticaCausale(@WebParam RicercaSinteticaCausale parameters);
	
	/**
	 * Ricerca minima della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaMinimaCausaleResponse ricercaMinimaCausale(@WebParam RicercaMinimaCausale parameters);
	
	/**
	 * Ricerca di dettaglio della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCausaleResponse ricercaDettaglioCausale(@WebParam RicercaDettaglioCausale parameters);
	
	/**
	 * Ricerca degli eventi per tipo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaEventiPerTipoResponse ricercaEventiPerTipo(@WebParam  RicercaEventiPerTipo parameters);
	
	/**
	 * Ricerca dei classificatori EP
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaClassificatoriEPResponse ricercaClassificatoriEP(@WebParam RicercaClassificatoriEP parameters);
	
	/**
	 * Ricerca sintetica paginata modulare della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareCausaleResponse ricercaSinteticaModulareCausale(@WebParam RicercaSinteticaModulareCausale parameters);
	
	/**
	 * Ricerca dettaglio modulare della causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioModulareCausaleResponse ricercaDettaglioModulareCausale(@WebParam RicercaDettaglioModulareCausale parameters);
}
