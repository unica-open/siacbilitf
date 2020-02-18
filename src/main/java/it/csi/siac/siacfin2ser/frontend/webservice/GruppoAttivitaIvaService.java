/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIvaEProrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIvaEProrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaProrataEChiusuraGruppoIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaProrataEChiusuraGruppoIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIvaEProrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIvaEProrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceProrataEChiusuraGruppoIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceProrataEChiusuraGruppoIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioAnnualizzataGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioAnnualizzataGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaGruppoAttivitaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaGruppoAttivitaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaGruppoAttivitaIvaResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "GruppoAttivitaIvaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface GruppoAttivitaIvaService {
	
	/**
	 * Ricerca del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaGruppoAttivitaIvaResponse ricercaGruppoAttivitaIva(@WebParam RicercaGruppoAttivitaIva parameters);
	
	/**
	 * Ricerca sintetica paginata del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaGruppoAttivitaIvaResponse ricercaSinteticaGruppoAttivitaIva(@WebParam RicercaSinteticaGruppoAttivitaIva parameters);
	
	/**
	 * Ricerca di dettaglio del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioGruppoAttivitaIvaResponse ricercaDettaglioGruppoAttivitaIva(@WebParam RicercaDettaglioGruppoAttivitaIva parameters);
	
	/**
	 * Ricerca di dettaglio annualizzata del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioAnnualizzataGruppoAttivitaIvaResponse ricercaDettaglioAnnualizzataGruppoAttivitaIva(@WebParam RicercaDettaglioAnnualizzataGruppoAttivitaIva parameters);
	
	/**
	 * Inserimento del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceGruppoAttivitaIvaResponse inserisceGruppoAttivitaIva(@WebParam InserisceGruppoAttivitaIva parameters);
	
	/**
	 * Inserimento prorata e chiusura del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceProrataEChiusuraGruppoIvaResponse inserisceProrataEChiusuraGruppoIva(@WebParam InserisceProrataEChiusuraGruppoIva parameters);
	
	/**
	 * Inserimento gruppo attivit&agrave; iva e prorata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceGruppoAttivitaIvaEProrataResponse inserisceGruppoAttivitaIvaEProrata(@WebParam InserisceGruppoAttivitaIvaEProrata parameters);
	
	/**
	 * Aggiornamento del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaGruppoAttivitaIvaResponse aggiornaGruppoAttivitaIva(@WebParam AggiornaGruppoAttivitaIva parameters);
	
	/**
	 * Aggiornamento prorata e chiusura del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaProrataEChiusuraGruppoIvaResponse aggiornaProrataEChiusuraGruppoIva(@WebParam AggiornaProrataEChiusuraGruppoIva parameters);
	
	/**
	 * Aggiornamento gruppo attivit&agrave; iva e prorata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaGruppoAttivitaIvaEProrataResponse aggiornaGruppoAttivitaIvaEProrata(@WebParam AggiornaGruppoAttivitaIvaEProrata parameters);
	
	/**
	 * Eliminazione del gruppo attivit&agrave; iva
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaGruppoAttivitaIvaResponse eliminaGruppoAttivitaIva(@WebParam EliminaGruppoAttivitaIva parameters);
	
	
	
}
