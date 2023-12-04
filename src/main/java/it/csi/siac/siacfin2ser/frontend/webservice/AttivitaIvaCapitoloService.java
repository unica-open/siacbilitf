/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRelazioneAttivitaIvaCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRelazioneAttivitaIvaCapitoloResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRelazioneAttivitaIvaCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceRelazioneAttivitaIvaCapitoloResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRelazioneAttivitaIvaCapitolo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRelazioneAttivitaIvaCapitoloResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "AttivitaIvaCapitoloService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface AttivitaIvaCapitoloService {
	
	/**
	 * Ricerca della relazione tra attivit&agrave; iva e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaRelazioneAttivitaIvaCapitoloResponse ricercaRelazioneAttivitaIvaCapitolo(@WebParam RicercaRelazioneAttivitaIvaCapitolo parameters);
	
	/**
	 * Inserimento della relazione tra attivit&agrave; iva e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRelazioneAttivitaIvaCapitoloResponse inserisceRelazioneAttivitaIvaCapitolo(@WebParam InserisceRelazioneAttivitaIvaCapitolo parameters);
	
	/**
	 * Eliminazione della relazione tra attivit&agrave; iva e capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaRelazioneAttivitaIvaCapitoloResponse eliminaRelazioneAttivitaIvaCapitolo(@WebParam EliminaRelazioneAttivitaIvaCapitolo parameters);
	
}
