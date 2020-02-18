/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacintegser.frontend.webservice.msg.ElaboraFile;
import it.csi.siac.siacintegser.frontend.webservice.msg.ElaboraFileResponse;

/**
 * The Interface ElaboraFileService.
 */
@WebService(targetNamespace = INTEGSvcDictionary.NAMESPACE)
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public abstract interface ElaboraFileService {
	
	/**
	 * Elabora file in modalit&agrave; sincrona.
	 *
	 * @param message the message
	 * @return the elabora file response
	 */
	@WebMethod
	@WebResult
	ElaboraFileResponse elaboraFile(@WebParam ElaboraFile message);
	
	/**
	 * Elabora file in modalit&agrave; asincrona.
	 *
	 * @param parameters the parameters
	 * @return the async service response
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse elaboraFileAsync(@WebParam AsyncServiceRequestWrapper<ElaboraFile> parameters);
	
	
	
	
	

}