/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaOrdine;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaOrdineResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaOrdine;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaOrdineResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceOrdine;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceOrdineResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaOrdiniDocumento;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaOrdiniDocumentoResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione Ordine.
 * 
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "OrdineService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface OrdineService {
	
	
	/**
	 * Inserimento dell'ordine
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceOrdineResponse inserisceOrdine(@WebParam InserisceOrdine parameters);
	
	/**
	 * Aggiornamento dell'ordine
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaOrdineResponse aggiornaOrdine(@WebParam AggiornaOrdine parameters);
	
	
	/**
	 * Eliminazione dell'ordine
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaOrdineResponse eliminaOrdine(@WebParam EliminaOrdine parameters);
	
	/**
	 * Ricerca degli ordini afferenti al documento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaOrdiniDocumentoResponse ricercaOrdiniDocumento(@WebParam RicercaOrdiniDocumento parameters);
	
}

