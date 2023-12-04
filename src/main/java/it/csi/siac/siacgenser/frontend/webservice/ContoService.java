/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice;

import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConto;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaContoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaConto;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaContoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConto;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaContoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConto;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceContoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.LeggiTreeCodiceBilancio;
import it.csi.siac.siacgenser.frontend.webservice.msg.LeggiTreeCodiceBilancioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaClassiPianoAmmortamento;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaClassiPianoAmmortamentoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConto;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioContoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConto;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaContoFigli;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaContoFigliResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaContoResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione ContoService
 * 
 * 
 */
@WebService(targetNamespace = GENSvcDictionary.NAMESPACE, name = "ContoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ContoService {

	/**
	 * Inserimento del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceContoResponse inserisceConto(@WebParam InserisceConto parameters);

	/**
	 * Aggiornamento del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaContoResponse aggiornaConto(@WebParam AggiornaConto parameters);
	
	/**
	 * Annullamento del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaContoResponse annullaConto(@WebParam AnnullaConto parameters);
	
	/**
	 * Eliminazione del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaContoResponse eliminaConto(@WebParam EliminaConto parameters);
	
	/**
	 * Ricerca sintetica paginata del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaContoResponse ricercaSinteticaConto(@WebParam RicercaSinteticaConto parameters);
	
	/**
	 * Ricerca sintetica paginata dei figli del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaContoFigliResponse ricercaSinteticaContoFigli(@WebParam RicercaSinteticaContoFigli parameters);
	
	/**
	 * Ricerca di dettaglio del conto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioContoResponse ricercaDettaglioConto(@WebParam RicercaDettaglioConto parameters);
	
	/**
	 * Lettura dell'albero dei codici di bilancio
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiTreeCodiceBilancioResponse leggiTreeCodiceBilancio(@WebParam LeggiTreeCodiceBilancio parameters);
	
	/**
	 * Ricerca delle classi del piano d'ammortamento
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaClassiPianoAmmortamentoResponse ricercaClassiPianoAmmortamento(@WebParam RicercaClassiPianoAmmortamento parameters);
	
}
