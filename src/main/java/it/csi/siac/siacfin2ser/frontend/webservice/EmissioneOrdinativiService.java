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

import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaDisponibilitaCassaCapitoloByMovimento;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaDisponibilitaCassaCapitoloByMovimentoResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmetteOrdinativiDiIncassoDaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmetteOrdinativiDiIncassoDaElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmetteOrdinativiDiPagamentoDaElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmetteOrdinativiDiPagamentoDaElencoResponse;

/**
 * SI per Emissione Ordinativi.
 *
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "EmissioneOrdinativiService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface EmissioneOrdinativiService {
	
	/**
	 * Emette ordinativi di pagamento da elenco Async.
	 *
	 * @param parameters the parameters
	 * @return the async service response
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse emetteOrdinativiDiPagamentoDaElenco(
			@WebParam AsyncServiceRequestWrapper<EmetteOrdinativiDiPagamentoDaElenco> parameters);
	
	/**
	 * Emette ordinativi di incasso da elenco Async.
	 *
	 * @param parameters the parameters
	 * @return the async service response
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse emetteOrdinativiDiIncassoDaElenco(
			@WebParam AsyncServiceRequestWrapper<EmetteOrdinativiDiIncassoDaElenco> parameters);
	
	
	
	
	/**
	 * Emette ordinativi di pagamento da elenco.
	 *
	 * @param parameters the parameters
	 * @return the async service response
	 */
	@WebMethod
	@WebResult
	EmetteOrdinativiDiPagamentoDaElencoResponse emetteOrdinativiDiPagamentoDaElencoSync(
			@WebParam EmetteOrdinativiDiPagamentoDaElenco request);
	
	/**
	 * Emette ordinativi di incasso da elenco.
	 *
	 * @param parameters the parameters
	 * @return the async service response
	 */
	@WebMethod
	@WebResult
	EmetteOrdinativiDiIncassoDaElencoResponse emetteOrdinativiDiIncassoDaElencoSync(
			@WebParam EmetteOrdinativiDiIncassoDaElenco request);
	
	/**
	 * @param request
	 * @return
	 */
	@WebMethod
	@WebResult
	ControllaDisponibilitaCassaCapitoloByMovimentoResponse controllaDisponibilitaCassaCapitoloByMovimento(
			@WebParam ControllaDisponibilitaCassaCapitoloByMovimento request);
	
	
}
