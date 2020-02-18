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

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AllineaProtocolloRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AllineaProtocolloRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.BloccaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.BloccaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RecuperaProtocolloRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RecuperaProtocolloRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SbloccaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SbloccaRegistroIvaResponse;

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "RegistroIvaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface RegistroIvaService {
	
	/**
	 * Inserimento del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRegistroIvaResponse inserisceRegistroIva(@WebParam InserisceRegistroIva parameters);
	
	/**
	 * Aggiornamento del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRegistroIvaResponse aggiornaRegistroIva(@WebParam AggiornaRegistroIva parameters);
	
	/**
	 * Ricerca del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaRegistroIvaResponse ricercaRegistroIva(@WebParam RicercaRegistroIva parameters);
	
	/**
	 * Ricerca di dettaglio del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioRegistroIvaResponse ricercaDettaglioRegistroIva(@WebParam RicercaDettaglioRegistroIva parameters);
	
	/**
	 * Ricerca sintetica paginata del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaRegistroIvaResponse ricercaSinteticaRegistroIva(@WebParam RicercaSinteticaRegistroIva parameters);
	
	/**
	 * Eliminazione del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaRegistroIvaResponse eliminaRegistroIva(@WebParam EliminaRegistroIva parameters);
	
	// CR-3791
	/**
	 * Blocco del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	BloccaRegistroIvaResponse bloccaRegistroIva(@WebParam BloccaRegistroIva parameters);
	
	/**
	 * Sblocco del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SbloccaRegistroIvaResponse sbloccaRegistroIva(@WebParam SbloccaRegistroIva parameters);
	
	/**
	 * Allineamento protocollo del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AllineaProtocolloRegistroIvaResponse allineaProtocolloRegistroIva(@WebParam AllineaProtocolloRegistroIva parameters);
	
	/**
	 * Allineamento del protocollo del registro iva asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #allineaProtocolloRegistroIva(AllineaProtocolloRegistroIva)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse allineaProtocolloRegistroIvaAsync(@WebParam AsyncServiceRequestWrapper<AllineaProtocolloRegistroIva> parameters);
	
	/**
	 * Recupero del protocollo del registro iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RecuperaProtocolloRegistroIvaResponse recuperaProtocolloRegistroIva(@WebParam RecuperaProtocolloRegistroIva parameters);
	
	/**
	 * Recupero del protocollo del registro iva asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #recuperaProtocolloRegistroIva(RecuperaProtocolloRegistroIva)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse recuperaProtocolloRegistroIvaAsync(@WebParam AsyncServiceRequestWrapper<RecuperaProtocolloRegistroIva> parameters);
}
