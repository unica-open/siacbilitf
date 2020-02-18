/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice;

import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaTipoGiustificativo;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaTipoGiustificativoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaTipoOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.AggiornaTipoOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaTipoGiustificativo;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaTipoGiustificativoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaTipoOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.AnnullaTipoOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.CalcolaDisponibilitaCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.CalcolaDisponibilitaCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceTipoGiustificativo;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceTipoGiustificativoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceTipoOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.InserisceTipoOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioTipoGiustificativo;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioTipoGiustificativoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioTipoOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaDettaglioTipoOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaModalitaPagamentoCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaModalitaPagamentoCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaTipoGiustificativo;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaTipoGiustificativoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaTipoOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaTipoOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaTipoOperazioneDiCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaTipoOperazioneDiCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaTipoRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaTipoRichiestaEconomaleResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio Gestione CASSA ECONOMALE
 * 
 * 
 */
@WebService(targetNamespace = CECSvcDictionary.NAMESPACE, name = "CassaEconomaleService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CassaEconomaleService {

	/**
	 * Aggiornamento della cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCassaEconomaleResponse aggiornaCassaEconomale(@WebParam AggiornaCassaEconomale parameters);
	
	/**
	 * Ricerca sintetica della cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCassaEconomaleResponse ricercaSinteticaCassaEconomale(@WebParam RicercaSinteticaCassaEconomale parameters);
	
	/**
	 * Ricerca di dettaglio della cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCassaEconomaleResponse ricercaDettaglioCassaEconomale(@WebParam RicercaDettaglioCassaEconomale parameters);
	
	/**
	 * Annullamento della cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCassaEconomaleResponse annullaCassaEconomale(@WebParam AnnullaCassaEconomale parameters);
	
	/**
	 * Calcolo della disponibilit&agrave; della cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CalcolaDisponibilitaCassaEconomaleResponse calcolaDisponibilitaCassaEconomale(@WebParam CalcolaDisponibilitaCassaEconomale parameters);
	
	/**
	 * Inserimento del tipo di giustificativo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceTipoGiustificativoResponse inserisceTipoGiustificativo(@WebParam InserisceTipoGiustificativo parameters);
	
	/**
	 * Aggiornamento del tipo di giustificativo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaTipoGiustificativoResponse aggiornaTipoGiustificativo(@WebParam AggiornaTipoGiustificativo parameters);
	
	/**
	 * Ricerca sintetica paginata del tipo di giustificativo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaTipoGiustificativoResponse ricercaSinteticaTipoGiustificativo(@WebParam RicercaSinteticaTipoGiustificativo parameters);
	
	/**
	 * Ricerca di dettaglio del tipo di giustificativo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioTipoGiustificativoResponse ricercaDettaglioTipoGiustificativo(@WebParam RicercaDettaglioTipoGiustificativo parameters);
	
	/**
	 * Annullamento del tipo di giustificativo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaTipoGiustificativoResponse annullaTipoGiustificativo(@WebParam AnnullaTipoGiustificativo parameters);
	
	/**
	 * Inserimento dell'operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceOperazioneDiCassaResponse inserisceOperazioneDiCassa(@WebParam InserisceOperazioneDiCassa parameters);
	
	/**
	 * Aggiornamento dell'operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaOperazioneDiCassaResponse aggiornaOperazioneDiCassa(@WebParam AggiornaOperazioneDiCassa parameters);
			
	/**
	 * Annullamento dell'operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaOperazioneDiCassaResponse annullaOperazioneDiCassa(@WebParam AnnullaOperazioneDiCassa parameters);
	
	/**
	 * Ricerca sintetica paginata dell'operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaOperazioneDiCassaResponse ricercaSinteticaOperazioneDiCassa(@WebParam RicercaSinteticaOperazioneDiCassa parameters);
	
	/**
	 * Ricerca di dettaglio dell'operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioOperazioneDiCassaResponse ricercaDettaglioOperazioneDiCassa(@WebParam RicercaDettaglioOperazioneDiCassa parameters);
	
	/**
	 * Inserimento del tipo di operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceTipoOperazioneDiCassaResponse inserisceTipoOperazioneDiCassa(@WebParam InserisceTipoOperazioneDiCassa parameters);
	
	/**
	 * Aggiornamento del tipo di operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaTipoOperazioneDiCassaResponse aggiornaTipoOperazioneDiCassa(@WebParam AggiornaTipoOperazioneDiCassa parameters);
	
	/**
	 * Annullamento del tipo di operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaTipoOperazioneDiCassaResponse annullaTipoOperazioneDiCassa(@WebParam AnnullaTipoOperazioneDiCassa parameters);
		
	/**
	 * Ricerca sintetica paginata del tipo di operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaTipoOperazioneDiCassaResponse ricercaSinteticaTipoOperazioneDiCassa(@WebParam RicercaSinteticaTipoOperazioneDiCassa parameters);
	
	/**
	 * Ricerca di dettaglio del tipo di operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioTipoOperazioneDiCassaResponse ricercaDettaglioTipoOperazioneDiCassa(@WebParam RicercaDettaglioTipoOperazioneDiCassa parameters);
	
	/**
	 * Ricerca del tipo di richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoRichiestaEconomaleResponse ricercaTipoRichiestaEconomale(@WebParam RicercaTipoRichiestaEconomale parameters);
	
	/**
	 * Ricerca del tipo di operazione di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoOperazioneDiCassaResponse ricercaTipoOperazioneDiCassa(@WebParam RicercaTipoOperazioneDiCassa parameters);
	
	/**
	 * Ricerca della modalit&agrave; di pagamento cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaModalitaPagamentoCassaResponse ricercaModalitaPagamentoCassa(@WebParam RicercaModalitaPagamentoCassa parameters);

}
