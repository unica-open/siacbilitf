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

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRegistroComunicazioniPCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRegistroComunicazioniPCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRegistroComunicazioniPCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaRegistroComunicazioniPCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisciRegistroComunicazioniPCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisciRegistroComunicazioniPCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRegistriComunicazioniPCCSubdocumento;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaRegistriComunicazioniPCCSubdocumentoResponse;

/**
 * SI del servizio Gestione Registro Comunicazioni PCC
 * 
 * @author Alessandro Marchino
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "RegistroComunicazioniPCCService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface RegistroComunicazioniPCCService {
	
	/**
	 * Ricerca del registro comunicazioni PCC afferenti al subdocumento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaRegistriComunicazioniPCCSubdocumentoResponse ricercaRegistriComunicazioniPCCSubdocumento (@WebParam RicercaRegistriComunicazioniPCCSubdocumento parameters);
	
	/**
	 * Inserimento del registro comunicazioni PCC
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisciRegistroComunicazioniPCCResponse inserisciRegistroComunicazioniPCC (@WebParam InserisciRegistroComunicazioniPCC parameters);
	
	/**
	 * Aggiornamento del registro comunicazioni PCC
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRegistroComunicazioniPCCResponse aggiornaRegistroComunicazioniPCC (@WebParam AggiornaRegistroComunicazioniPCC parameters);
	
	/**
	 * Eliminazione del registro comunicazioni PCC
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaRegistroComunicazioniPCCResponse eliminaRegistroComunicazioniPCC (@WebParam EliminaRegistroComunicazioniPCC parameters);
	
}
