/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRelazioneDocumenti;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaRelazioneDocumentiResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaAttivitaOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCausale770;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCausale770Response;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceBollo;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceBolloResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodicePCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodicePCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceUfficioDestinatarioPCC;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaCodiceUfficioDestinatarioPCCResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNaturaOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNaturaOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteTesoriere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteTesoriereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaAssociare;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaAssociareResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSommaNonSoggetta;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSommaNonSoggettaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoAvviso;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoAvvisoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoDocumento;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoDocumentoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoImpresa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoImpresaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoOnereResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione Documento.
 * 
 * @author Alessandro Marchino
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "DocumentoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentoService {
	
	/**
	 * Ricerca del tipo documento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoDocumentoResponse ricercaTipoDocumento(@WebParam RicercaTipoDocumento parameters);
	
	/**
	 * Ricerca del codice bollo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaCodiceBolloResponse ricercaCodiceBollo(@WebParam RicercaCodiceBollo parameters);
	
	/**
	 * Ricerca del tipo impresa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoImpresaResponse ricercaTipoImpresa(@WebParam RicercaTipoImpresa parameters);
	
	/**
	 * Ricerca del tipo avviso
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoAvvisoResponse ricercaTipoAvviso(@WebParam RicercaTipoAvviso parameters);
	
	/**
	 * Ricerca della natura onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaNaturaOnereResponse ricercaNaturaOnere(@WebParam RicercaNaturaOnere parameters);
	
	/**
	 * Ricerca del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoOnereResponse ricercaTipoOnere(@WebParam RicercaTipoOnere parameters);
	
	/**
	 * Ricerca dell'attivit&agrave; onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAttivitaOnereResponse ricercaAttivitaOnere(@WebParam RicercaAttivitaOnere parameters);
	
	/**
	 * Ricerca della causale 770
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaCausale770Response ricercaCausale770(@WebParam RicercaCausale770 parameters);
	
	/**
	 * Ricerca della somma non soggetta
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSommaNonSoggettaResponse ricercaSommaNonSoggetta(@WebParam RicercaSommaNonSoggetta parameters);
	
	/**
	 * Ricerca delle note al tesoriere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaNoteTesoriereResponse ricercaNoteTesoriere(@WebParam RicercaNoteTesoriere parameters);
	
	/**
	 * Ricerca del codice PCC
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaCodicePCCResponse ricercaCodicePCC(@WebParam RicercaCodicePCC parameters);
	
	/**
	 * Ricerca del codice ufficio destinatario PCC
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaCodiceUfficioDestinatarioPCCResponse ricercaCodiceUfficioDestinatarioPCC(@WebParam RicercaCodiceUfficioDestinatarioPCC parameters);
	
	/**
	 * Ricerca delle quote da associare
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuoteDaAssociareResponse ricercaQuoteDaAssociare(@WebParam RicercaQuoteDaAssociare parameters);
	
	/**
	 * Collegamento tra documenti
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRelazioneDocumentiResponse collegaDocumenti(@WebParam AggiornaRelazioneDocumenti parameters);
	
	/**
	 * Scollegamento documenti
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRelazioneDocumentiResponse scollegaDocumenti(@WebParam AggiornaRelazioneDocumenti parameters);

}
