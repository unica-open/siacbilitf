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

import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAliquotaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAliquotaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIvaLegateAGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIvaLegateAGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoRegistrazioneIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoRegistrazioneIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaValuta;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaValutaResponse;

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "DocumentoIvaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentoIvaService {
	
	/**
	 * Ricerca del tipo di registrazione iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoRegistrazioneIvaResponse ricercaTipoRegistrazioneIva(@WebParam RicercaTipoRegistrazioneIva parameters);
	
	/**
	 * Ricerca dell'attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAttivitaIvaResponse ricercaAttivitaIva(@WebParam RicercaAttivitaIva parameters);
	
	/**
	 * Ricerca dell'attivit&agrave; iva afferenti al gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAttivitaIvaLegateAGruppoAttivitaIvaResponse ricercaAttivitaIvaLegateAGruppoAttivitaIva(@WebParam RicercaAttivitaIvaLegateAGruppoAttivitaIva parameters);
	
	/**
	 * Ricerca dell'aliquota iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAliquotaIvaResponse ricercaAliquotaIva(@WebParam RicercaAliquotaIva parameters);
	
	/**
	 * Ricerca della valuta
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaValutaResponse ricercaValuta(@WebParam RicercaValuta parameters);
	
}
