/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaPrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaPrimaNotaIntegrataManuale;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaPrimaNotaIntegrataManualeResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaPrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaRateo;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaRateoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaRisconto;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaRiscontoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaPrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.AnnullaPrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.CollegaPrimeNote;
import it.csi.siac.siacgenser.frontend.webservice.msg.CollegaPrimeNoteResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaCollegamentoPrimeNote;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaCollegamentoPrimeNoteResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InseriscePrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.InseriscePrimaNotaIntegrataManuale;
import it.csi.siac.siacgenser.frontend.webservice.msg.InseriscePrimaNotaIntegrataManualeResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InseriscePrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisciRateo;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisciRateoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisciRisconto;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisciRiscontoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.OttieniEntitaCollegatePrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.OttieniEntitaCollegatePrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RegistraMassivaPrimaNotaIntegrata;
import it.csi.siac.siacgenser.frontend.webservice.msg.RegistraMassivaPrimaNotaIntegrataResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RegistraPrimaNotaIntegrata;
import it.csi.siac.siacgenser.frontend.webservice.msg.RegistraPrimaNotaIntegrataResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioPrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioPrimaNotaIntegrata;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioPrimaNotaIntegrataResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioPrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaPrimeNote;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaPrimeNoteResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaIntegrata;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaIntegrataManuale;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaIntegrataManualeResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaIntegrataResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaIntegrataValidabile;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaIntegrataValidabileResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaPrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.ValidaPrimaNota;
import it.csi.siac.siacgenser.frontend.webservice.msg.ValidaPrimaNotaResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.ValidazioneMassivaPrimaNotaIntegrata;
import it.csi.siac.siacgenser.frontend.webservice.msg.ValidazioneMassivaPrimaNotaIntegrataResponse;

/**
 * SI del servizio Gestione PrimaNota
 * 
 * 
 */
@WebService(targetNamespace = GENSvcDictionary.NAMESPACE, name = "PrimaNotaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface PrimaNotaService {

	/**
	 * Inserimento della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InseriscePrimaNotaResponse inseriscePrimaNota(@WebParam InseriscePrimaNota parameters);

	/**
	 * Aggiornamento della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaPrimaNotaResponse aggiornaPrimaNota(@WebParam AggiornaPrimaNota parameters);
	
	/**
	 * Aggiornamento della prima nota GEN
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaPrimaNotaResponse aggiornaPrimaNotaGEN(@WebParam AggiornaPrimaNota parameters);
	
	/**
	 * Registrazione della prima nota integrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RegistraPrimaNotaIntegrataResponse registraPrimaNotaIntegrata(@WebParam RegistraPrimaNotaIntegrata parameters);
	
	/**
	 * Annullamento della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaPrimaNotaResponse annullaPrimaNota(@WebParam AnnullaPrimaNota parameters);
	
	/**
	 * Validazione della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ValidaPrimaNotaResponse validaPrimaNota(@WebParam ValidaPrimaNota parameters);
	
	/**
	 * Ricerca sintetica paginata della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaPrimaNotaResponse ricercaSinteticaPrimaNota(@WebParam RicercaSinteticaPrimaNota parameters);
	
	/**
	 * Ricerca sintetica paginata della prima nota integrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaPrimaNotaIntegrataResponse ricercaSinteticaPrimaNotaIntegrata(@WebParam RicercaSinteticaPrimaNotaIntegrata parameters);
	
	/**
	 * Ricerca sintetica paginata della prima nota integrata validabile
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaPrimaNotaIntegrataValidabileResponse ricercaSinteticaPrimaNotaIntegrataValidabile(@WebParam RicercaSinteticaPrimaNotaIntegrataValidabile parameters);
	
	/**
	 * Ricerca di dettaglio della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioPrimaNotaResponse ricercaDettaglioPrimaNota(@WebParam RicercaDettaglioPrimaNota parameters);
	
	/**
	 * Ricerca di dettaglio della prima nota integrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioPrimaNotaIntegrataResponse ricercaDettaglioPrimaNotaIntegrata(@WebParam RicercaDettaglioPrimaNotaIntegrata parameters);
	
	/**
	 * Validazione masiva della prima nota integrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ValidazioneMassivaPrimaNotaIntegrataResponse validazioneMassivaPrimaNotaIntegrata(@WebParam ValidazioneMassivaPrimaNotaIntegrata parameters);
	
	/**
	 * Validazione massiva della prima nota integrata asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #validazioneMassivaPrimaNotaIntegrata(ValidazioneMassivaPrimaNotaIntegrata)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse validazioneMassivaPrimaNotaIntegrataAsync(@WebParam AsyncServiceRequestWrapper<ValidazioneMassivaPrimaNotaIntegrata> parameters);
	
	/**
	 * Collegamento tra prime note
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CollegaPrimeNoteResponse collegaPrimeNote(@WebParam CollegaPrimeNote parameters);
	
	/**
	 * Eliminazione collegamento tra prime note
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaCollegamentoPrimeNoteResponse eliminaCollegamentoPrimeNote(@WebParam EliminaCollegamentoPrimeNote parameters);
	
	/**
	 * Ricerca della prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPrimeNoteResponse ricercaPrimeNote(@WebParam RicercaPrimeNote parameters);
	
	
	//Ratei-Risconti. Nuovi 11/07/2016
	/**
	 * Inserimento del rateo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisciRateoResponse inserisciRateo(@WebParam InserisciRateo parameters);
	
	/**
	 * Aggiornamento del rateo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRateoResponse aggiornaRateo(@WebParam AggiornaRateo parameters);
	
	/**
	 * Inserimento risconto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisciRiscontoResponse inserisciRisconto(@WebParam InserisciRisconto parameters);
	
	/**
	 * Aggiornamento risconto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRiscontoResponse aggiornaRisconto(@WebParam AggiornaRisconto parameters);
	
	// CR-4046
	
	/**
	 * Ricerca entit&agrave; collegate alla prima nota
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	OttieniEntitaCollegatePrimaNotaResponse ottieniEntitaCollegatePrimaNota(@WebParam OttieniEntitaCollegatePrimaNota parameters);
	
	// CR-4222
	/**
	 * Registrazione massiva della prima nota integrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RegistraMassivaPrimaNotaIntegrataResponse registraMassivaPrimaNotaIntegrata(@WebParam RegistraMassivaPrimaNotaIntegrata parameters);
	/**
	 * Registrazione massiva della prima nota integrata asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #registraMassivaPrimaNotaIntegrata(RegistraMassivaPrimaNotaIntegrata)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse registraMassivaPrimaNotaIntegrataAsync(@WebParam AsyncServiceRequestWrapper<RegistraMassivaPrimaNotaIntegrata> parameters);
	
	// SIAC-5344
	
	/**
	 * Inserimento della prima nota integrata manuale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InseriscePrimaNotaIntegrataManualeResponse inseriscePrimaNotaIntegrataManuale(@WebParam InseriscePrimaNotaIntegrataManuale parameters);
	
	/**
	 * Ricerca sintetica paginata della prima nota integrata manuale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaPrimaNotaIntegrataManualeResponse ricercaSinteticaPrimaNotaIntegrataManuale(@WebParam RicercaSinteticaPrimaNotaIntegrataManuale parameters);
	
	/**
	 * Aggiornamento della prima nota integrata manuale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaPrimaNotaIntegrataManualeResponse aggiornaPrimaNotaIntegrataManuale(@WebParam AggiornaPrimaNotaIntegrataManuale parameters);
}
