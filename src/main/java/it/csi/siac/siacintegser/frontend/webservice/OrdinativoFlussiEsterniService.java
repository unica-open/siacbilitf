/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacintegser.frontend.webservice.msg.GeneraFlussoOrdinativo;


@WebService(targetNamespace = INTEGSvcDictionary.NAMESPACE, name = "OrdinativoFlussiEsterniService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface OrdinativoFlussiEsterniService {
	/**
	 * Generazione del flusso ordinativi
	 * @param parameters la request del servizio
	 */
	@WebMethod
	@Oneway
	void generaFlussoOrdinativo(@WebParam GeneraFlussoOrdinativo request);
}