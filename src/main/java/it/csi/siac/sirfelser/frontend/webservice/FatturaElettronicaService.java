/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.frontend.webservice;

import it.csi.siac.sirfelser.frontend.webservice.msg.RicercaDettaglioFatturaElettronica;
import it.csi.siac.sirfelser.frontend.webservice.msg.RicercaDettaglioFatturaElettronicaResponse;
import it.csi.siac.sirfelser.frontend.webservice.msg.RicercaSinteticaFatturaElettronica;
import it.csi.siac.sirfelser.frontend.webservice.msg.RicercaSinteticaFatturaElettronicaResponse;
import it.csi.siac.sirfelser.frontend.webservice.msg.SospendiFatturaElettronica;
import it.csi.siac.sirfelser.frontend.webservice.msg.SospendiFatturaElettronicaResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;


@WebService(targetNamespace = FELSvcDictionary.NAMESPACE, name = "FatturaElettronicaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface FatturaElettronicaService {
	
	/**
	 * Ricerca dettaglio della fattura elettronica
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioFatturaElettronicaResponse ricercaDettaglioFatturaElettronica(@WebParam RicercaDettaglioFatturaElettronica parameters);
	
	/**
	 * Ricerca sintetica della fattura elettronica
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaFatturaElettronicaResponse ricercaSinteticaFatturaElettronica(@WebParam RicercaSinteticaFatturaElettronica parameters);
	
	/**
	 * Sospensione della fattura elettronica
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SospendiFatturaElettronicaResponse sospendiFatturaElettronica(@WebParam SospendiFatturaElettronica parameters);
	
}
