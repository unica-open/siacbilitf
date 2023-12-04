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

import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaClassificatoreGSA;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaClassificatoreGSAResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaClassificatoreGSA;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaClassificatoreGSAResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceClassificatoreGSA;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceClassificatoreGSAResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaClassificatoreGSAValido;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaClassificatoreGSAValidoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaClassificatoreGSA;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaClassificatoreGSAResponse;

/**
 * SI del servizio Gestione ClassificatoreGSAService
 * 
 * 
 */
@WebService(targetNamespace = GENSvcDictionary.NAMESPACE, name = "ClassificatoreGSAService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ClassificatoreGSAService {

	/**
	 * Inserimento del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceClassificatoreGSAResponse inserisceClassificatoreGSA(@WebParam InserisceClassificatoreGSA parameters);

	/**
	 * Aggiornamento del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaClassificatoreGSAResponse aggiornaClassificatoreGSA(@WebParam AggiornaClassificatoreGSA parameters);
	
	/**
	 * Annullamento del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaClassificatoreGSAResponse annullaClassificatoreGSA(@WebParam AnnullaClassificatoreGSA parameters);

	/**
	 * Ricerca sintetica paginata del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaClassificatoreGSAResponse ricercaSinteticaClassificatoreGSA(@WebParam RicercaSinteticaClassificatoreGSA parameters);
	
	/**
	 * Ricerca del classificatore GSA
	 * <br/>
	 * Il servizio restituisce tutti i classificatori GSA non annullati e tutti i figli non annullati dei classificatori
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaClassificatoreGSAValidoResponse ricercaClassificatoreGSAValido(@WebParam RicercaClassificatoreGSAValido parameters);
	
}
