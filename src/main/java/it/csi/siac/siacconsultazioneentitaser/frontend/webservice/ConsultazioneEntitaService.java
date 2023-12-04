/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg.OttieniNavigazioneTipoEntitaConsultabile;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg.OttieniNavigazioneTipoEntitaConsultabileResponse;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg.RicercaFigliEntitaConsultabile;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg.RicercaFigliEntitaConsultabileResponse;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg.RicercaSinteticaEntitaConsultabile;
import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg.RicercaSinteticaEntitaConsultabileResponse;

/**
 * Servizi per la consultazione Entita.
 * 
 * @author Domenico
 *
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "ConsultazioneEntitaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ConsultazioneEntitaService {

	/**
	 * Caricamento della navigazione tra i tipi di entit&agrave; consultabile
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	OttieniNavigazioneTipoEntitaConsultabileResponse ottieniNavigazioneTipoEntitaConsultabile(@WebParam OttieniNavigazioneTipoEntitaConsultabile parameters);

	/**
	 * Ricerca delle entit&agrave; figlie a partire da un entit&agrave; padre.
	 * @param parameters la request del servizio
	 * @return figli dell'entita richiesta
	 */ 
	@WebMethod
	@WebResult
	RicercaFigliEntitaConsultabileResponse ricercaFigliEntitaConsultabile(@WebParam RicercaFigliEntitaConsultabile parameters);
	
	/**
	 * Ricerca sintetica con i parametri delle entit&agrave; di partenza.
	 * @param parameters la request del servizio
	 * @return entita consultabile
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaEntitaConsultabileResponse ricercaSinteticaEntitaConsultabile(@WebParam RicercaSinteticaEntitaConsultabile parameters);
	
	
}
