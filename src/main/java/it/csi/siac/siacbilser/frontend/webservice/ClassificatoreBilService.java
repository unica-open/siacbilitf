/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacbilser.frontend.webservice.msg.ContaClassificatoriERestituisciSeSingolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaClassificatoriERestituisciSeSingoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnno;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnnoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdFiglio;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdFiglioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdPadre;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriBilByIdPadreResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByRelazione;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByRelazioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipoElementoBil;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipoElementoBilResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipologieClassificatori;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriByTipologieClassificatoriResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoElementoBil;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiClassificatoriGenericiByTipoElementoBilResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiElementoPianoDeiContiByCodiceAndAnno;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiElementoPianoDeiContiByCodiceAndAnnoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreePianoDeiConti;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreePianoDeiContiResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreeSiope;
import it.csi.siac.siacbilser.frontend.webservice.msg.LeggiTreeSiopeResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeClassificatore;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeClassificatoreResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaClassificatore;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaClassificatoreResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatore;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatoreGenerico;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatoreGenericoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoClassificatoreResponse;

/**
 * SI del servizio per la gestione dei Classificatori
 * 
 * @author rmontuori
 * @version $Id: $
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "ClassificatoreBilService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ClassificatoreBilService {


	/**
	 * Lettura dei classificatori per id del padre
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoriBilByIdPadreResponse leggiClassificatoriByIdPadre(@WebParam LeggiClassificatoriBilByIdPadre request);
	
	/**
	 * Lettura dei classificatori per id del figlio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoriBilByIdFiglioResponse leggiClassificatoriByIdFiglio(@WebParam LeggiClassificatoriBilByIdFiglio request);
	

	/**
	 * Lettura dei classificatori generici per tipologia dell'elemento di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoriGenericiByTipoElementoBilResponse leggiClassificatoriGenericiByTipoElementoBil(@WebParam LeggiClassificatoriGenericiByTipoElementoBil request);
	
	/**
	 * Lettura dei classificatori per tipologia dell'elemento di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoriByTipoElementoBilResponse leggiClassificatoriByTipoElementoBil(@WebParam LeggiClassificatoriByTipoElementoBil request);
	
	/**
	 * Lettura dell'albero del piano dei conti
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiTreePianoDeiContiResponse leggiTreePianoDeiConti(@WebParam LeggiTreePianoDeiConti request);
	
	/**
	 * Lettura dell'albero del SIOPE spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiTreeSiopeResponse leggiTreeSiopeSpesa(@WebParam LeggiTreeSiope request);
	
	/**
	 * Lettura dell'albero del SIOPE di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiTreeSiopeResponse leggiTreeSiopeEntrata(@WebParam LeggiTreeSiope request);
	
	/**
	 * Lettura dei classificatori per relazione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoriByRelazioneResponse leggiClassificatoriByRelazione(@WebParam LeggiClassificatoriByRelazione request);
	
	/**
	 * Lettura del classificatore gerarchico per codice, tipo e anno
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnnoResponse leggiClassificatoreGerarchicoByCodiceAndTipoAndAnno(@WebParam LeggiClassificatoreGerarchicoByCodiceAndTipoAndAnno request);
	
	/**
	 * Lettura del piano dei conti per codice e anno
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiElementoPianoDeiContiByCodiceAndAnnoResponse leggiElementoPianoDeiContiByCodiceAndAnno(@WebParam LeggiElementoPianoDeiContiByCodiceAndAnno request);

	/**
	 * Ricerca sintetica paginata del classificatore
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaClassificatoreResponse ricercaSinteticaClassificatore(@WebParam RicercaSinteticaClassificatore request);
	
	/**
	 * Conta dei classificatori e restituzione del classificatore se singolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ContaClassificatoriERestituisciSeSingoloResponse contaClassificatoriERestituisciSeSingolo(@WebParam ContaClassificatoriERestituisciSeSingolo request);
	
	/**
	 * Lettura dei classificatori per tipologia
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiClassificatoriByTipologieClassificatoriResponse leggiClassificatoriByTipologieClassificatori(@WebParam LeggiClassificatoriByTipologieClassificatori request);
	
	/**
	 * Ricerca puntuale (per chiave logica) del classificatore
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeClassificatoreResponse ricercaPuntualeClassificatore(@WebParam RicercaPuntualeClassificatore request);
	
	// SIAC-5169
	/**
	 * Ricerca del tipo di classificatore
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoClassificatoreResponse ricercaTipoClassificatore(@WebParam RicercaTipoClassificatore request);
	
	/**
	 * Ricerca del tipo di classificatore generico
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoClassificatoreGenericoResponse ricercaTipoClassificatoreGenerico(@WebParam RicercaTipoClassificatoreGenerico request);
}

