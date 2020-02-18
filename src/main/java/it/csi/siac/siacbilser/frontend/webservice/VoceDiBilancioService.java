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

import it.csi.siac.siacbilser.frontend.webservice.msg.UpdateVdB;
import it.csi.siac.siacbilser.frontend.webservice.msg.UpdateVdBResponse;

/**
 * Servizio costruito per TEST
 * 
 * @author alagna
 * @version $Id: $
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "VoceDiBilancioService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface VoceDiBilancioService {

	/**
	 * Update della voce di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	UpdateVdBResponse updateVdB(@WebParam UpdateVdB parameters);

}
