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

import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.AggiornaQuadroEconomico;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.AggiornaQuadroEconomicoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.AnnullaQuadroEconomico;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.AnnullaQuadroEconomicoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.InserisceQuadroEconomico;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.InserisceQuadroEconomicoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.RicercaQuadroEconomicoValido;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.RicercaQuadroEconomicoValidoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.RicercaSinteticaQuadroEconomico;
import it.csi.siac.siacbilser.frontend.webservice.msg.quadroeconomico.RicercaSinteticaQuadroEconomicoResponse;

/**
 * SI del servizio Gestione QuadroEconomicoService
 * 
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "QuadroEconomicoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface QuadroEconomicoService {

	/**
	 * Inserimento del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceQuadroEconomicoResponse inserisceQuadroEconomico(@WebParam InserisceQuadroEconomico parameters);

	/**
	 * Aggiornamento del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaQuadroEconomicoResponse aggiornaQuadroEconomico(@WebParam AggiornaQuadroEconomico parameters);
	
	/**
	 * Annullamento del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaQuadroEconomicoResponse annullaQuadroEconomico(@WebParam AnnullaQuadroEconomico parameters);

	/**
	 * Ricerca sintetica paginata del classificatore GSA
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaQuadroEconomicoResponse ricercaSinteticaQuadroEconomico(@WebParam RicercaSinteticaQuadroEconomico parameters);
	
	/**
	 * Ricerca del classificatore GSA
	 * <br/>
	 * Il servizio restituisce tutti i classificatori GSA non annullati e tutti i figli non annullati dei classificatori
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuadroEconomicoValidoResponse ricercaQuadroEconomicoValido(@WebParam RicercaQuadroEconomicoValido parameters);
	
}
