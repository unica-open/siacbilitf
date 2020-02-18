/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaRendicontoCassaDaStampare;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaSinteticaRendicontoCassaDaStampareResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaStampeCassaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaStampeCassaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaUltimaStampaDefinitivaGiornaleCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaUltimaStampaDefinitivaGiornaleCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaUltimoRendicontoCassaStampato;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaUltimoRendicontoCassaStampatoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaUltimoRendicontoRichiestaEconomaleStampato;
import it.csi.siac.siaccecser.frontend.webservice.msg.RicercaUltimoRendicontoRichiestaEconomaleStampatoResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaGiornaleCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaGiornaleCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaRendicontoCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaRendicontoCassaResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaRicevutaRendicontoRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaRicevutaRendicontoRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaRicevutaRichiestaEconomale;
import it.csi.siac.siaccecser.frontend.webservice.msg.StampaRicevutaRichiestaEconomaleResponse;
import it.csi.siac.siaccecser.frontend.webservice.msg.VerificaStampaRendicontoCassa;
import it.csi.siac.siaccecser.frontend.webservice.msg.VerificaStampaRendicontoCassaResponse;

/**
 * SI del servizio Gestione STAMPE CASSA ECONOMALE
 * 
 * 
 */
@WebService(targetNamespace = CECSvcDictionary.NAMESPACE, name = "CassaEconomaleService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface StampaCassaEconomaleService {
	/**
	 * Stampa la ricevuta della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	StampaRicevutaRichiestaEconomaleResponse stampaRicevutaRichiestaEconomale(@WebParam StampaRicevutaRichiestaEconomale parameters);
	
	/**
	 * Stampa la ricevuta del rendiconto della richiesta economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	StampaRicevutaRendicontoRichiestaEconomaleResponse stampaRendicontoRicevutaRichiestaEconomale(
			@WebParam StampaRicevutaRendicontoRichiestaEconomale parameters);
	
	/**
	 * Stampa il rendiconto di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	StampaRendicontoCassaResponse stampaRendicontoCassa(@WebParam StampaRendicontoCassa parameters);
	
	/**
	 * Stampa del giornale di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	StampaGiornaleCassaResponse stampaGiornaleCassa(@WebParam StampaGiornaleCassa parameters);
	
	/**
	 * Ricerca dell'ultimo rendiconto di cassa stampato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaUltimoRendicontoCassaStampatoResponse ricercaUltimoRendicontoCassaStampato(@WebParam RicercaUltimoRendicontoCassaStampato parameters);
	
	/**
	 * Ricerca dell'ultima stampa in definitiva per il giornale di cassa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaUltimaStampaDefinitivaGiornaleCassaResponse ricercaDatiUltimaStampaDefinitivaGiornaleCassa(@WebParam RicercaUltimaStampaDefinitivaGiornaleCassa parameters);
	
	/**
	 * Ricerca delle stampe della cassa economale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaStampeCassaEconomaleResponse ricercaStampeCassaEconomale(@WebParam RicercaStampeCassaEconomale parameters);
	
	// Lotto M
	/**
	 * Ricerca dell'ultimo rendiconto richiesta stampato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaUltimoRendicontoRichiestaEconomaleStampatoResponse ricercaUltimoRendicontoRichiestaEconomaleStampato(@WebParam RicercaUltimoRendicontoRichiestaEconomaleStampato parameters);
	
	// SIAC-4799
	/**
	 * Verifica la stampa del rendiconto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaStampaRendicontoCassaResponse verificaStampaRendicontoCassa(@WebParam VerificaStampaRendicontoCassa parameters);
	
	/**
	 * Ricerca sintetica dei rendiconti di cassa da stampare
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaRendicontoCassaDaStampareResponse ricercaSinteticaRendicontoCassaDaStampare(@WebParam RicercaSinteticaRendicontoCassaDaStampare parameters);
}
