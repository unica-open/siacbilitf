/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSdiDocumento;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSdiDocumentoResponse;

/**
 * SI del servizio SDI Documento Entrata.
 * 
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "SdiDocumentoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface SdiDocumentoService {
	
	/**
	 * Aggiorna lo stato SDI del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoSdiDocumentoResponse aggiornaStatoSdiDocumento(@WebParam AggiornaStatoSdiDocumento parameters);


}
