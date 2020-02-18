/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.pcc.frontend.webservice;

import it.csi.siac.pcc.frontend.webservice.msg.InviaOperazioniPCC;
import it.csi.siac.pcc.frontend.webservice.msg.InviaOperazioniPCCResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI dei servizii di integrazione con PCC.
 * 
 * @author Domenico
 * 
 */
@WebService(targetNamespace = PCCSvcDictionary.NAMESPACE, name = "PCCService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface PCCService {
	
	/**
	 * Invio delle operazioni verso PCC
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod 
	public @WebResult InviaOperazioniPCCResponse inviaOperazioniPCC(@WebParam InviaOperazioniPCC parameters);


}
