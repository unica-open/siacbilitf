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

import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaAddebitiContoCorrente;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaAddebitiContoCorrenteResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSaldoInizialeContoCorrente;
import it.csi.siac.siacfinser.frontend.webservice.msg.AggiornaSaldoInizialeContoCorrenteResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.CalcolaSaldoCassaData;
import it.csi.siac.siacfinser.frontend.webservice.msg.CalcolaSaldoCassaDataResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiVociContoCorrente;
import it.csi.siac.siacfinser.frontend.webservice.msg.LeggiVociContoCorrenteResponse;

@WebService(targetNamespace = FINSvcDictionary.NAMESPACE, name = "SaldoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface SaldoService extends CommonServiceInterface {
	@WebMethod
	@WebResult
	LeggiVociContoCorrenteResponse leggiVociContoCorrente(@WebParam LeggiVociContoCorrente request);

	@WebMethod
	@WebResult
	AggiornaSaldoInizialeContoCorrenteResponse aggiornaSaldoInizialeContoCorrente(@WebParam AggiornaSaldoInizialeContoCorrente request);

	@WebMethod
	@WebResult
	AggiornaAddebitiContoCorrenteResponse aggiornaAddebitiContoCorrente(@WebParam AggiornaAddebitiContoCorrente request);

	@WebMethod
	@WebResult
	CalcolaSaldoCassaDataResponse calcolaSaldoCassaData(@WebParam CalcolaSaldoCassaData request);
}
