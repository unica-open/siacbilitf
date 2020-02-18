/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacfinser.frontend.webservice.msg.CountOrdinativiMif;
import it.csi.siac.siacfinser.frontend.webservice.msg.CountOrdinativiMifResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.CountOrdinativiMifSiopePlusResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.GeneraXmlOrdinativiMif;
import it.csi.siac.siacfinser.frontend.webservice.msg.GeneraXmlOrdinativiMifResponse;

@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "OilService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface OilService {
	@WebMethod
	@WebResult
	GeneraXmlOrdinativiMifResponse generaXmlOrdinativiMif(@WebParam GeneraXmlOrdinativiMif req);
	
	@WebMethod
	@WebResult
	CountOrdinativiMifResponse countOrdinativiMif(@WebParam CountOrdinativiMif req);

	@WebMethod
	@WebResult
	CountOrdinativiMifSiopePlusResponse countOrdinativiMifSiopePlus(@WebParam CountOrdinativiMif req);
}
