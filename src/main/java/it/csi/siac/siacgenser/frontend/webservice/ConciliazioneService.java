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

import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConciliazionePerBeneficiario;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConciliazionePerBeneficiarioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConciliazionePerCapitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConciliazionePerCapitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConciliazionePerTitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaConciliazionePerTitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConciliazionePerBeneficiario;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConciliazionePerBeneficiarioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConciliazionePerCapitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConciliazionePerCapitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConciliazionePerTitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.EliminaConciliazionePerTitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazionePerBeneficiario;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazionePerBeneficiarioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazionePerCapitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazionePerCapitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazionePerTitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazionePerTitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazioniPerBeneficiario;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazioniPerBeneficiarioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazioniPerCapitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.InserisceConciliazioniPerCapitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaContiConciliazionePerClasse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaContiConciliazionePerClasseResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaContiConciliazionePerTitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaContiConciliazionePerTitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConciliazionePerBeneficiario;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConciliazionePerBeneficiarioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConciliazionePerCapitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConciliazionePerCapitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConciliazionePerTitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioConciliazionePerTitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConciliazionePerBeneficiario;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConciliazionePerBeneficiarioResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConciliazionePerCapitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConciliazionePerCapitoloResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConciliazionePerTitolo;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaConciliazionePerTitoloResponse;

@WebService(targetNamespace = GENSvcDictionary.NAMESPACE, name = "ConciliazioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ConciliazioneService {

	/**
	 * Inserimento della conciliazione per titolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceConciliazionePerTitoloResponse inserisceConciliazionePerTitolo(@WebParam InserisceConciliazionePerTitolo parameters);

	/**
	 * Aggiornamento della conciliazione per titolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaConciliazionePerTitoloResponse aggiornaConciliazionePerTitolo(@WebParam AggiornaConciliazionePerTitolo parameters);

	/**
	 * Eliminazione della conciliazione per titolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaConciliazionePerTitoloResponse eliminaConciliazionePerTitolo(@WebParam EliminaConciliazionePerTitolo parameters);

	/**
	 * Ricerca di dettaglio della conciliazione per titolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioConciliazionePerTitoloResponse ricercaDettaglioConciliazionePerTitolo(@WebParam RicercaDettaglioConciliazionePerTitolo parameters);
	
	/**
	 * Ricerca sintetica paginata della conciliazione per titolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaConciliazionePerTitoloResponse ricercaSinteticaConciliazionePerTitolo(@WebParam RicercaSinteticaConciliazionePerTitolo parameters);

	/**
	 * Ricerca dei conti per la conciliazione per titolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaContiConciliazionePerTitoloResponse ricercaContiConciliazionePerTitolo(@WebParam RicercaContiConciliazionePerTitolo parameters);

	/**
	 * Inserimento della conciliazione per capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceConciliazionePerCapitoloResponse inserisceConciliazionePerCapitolo(@WebParam InserisceConciliazionePerCapitolo parameters);
	
	/**
	 * Inserimento multiplo della conciliazione per capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceConciliazioniPerCapitoloResponse inserisceConciliazioniPerCapitolo(@WebParam InserisceConciliazioniPerCapitolo parameters);

	/**
	 * Aggiornamento della conciliazione per capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaConciliazionePerCapitoloResponse aggiornaConciliazionePerCapitolo(@WebParam AggiornaConciliazionePerCapitolo parameters);

	/**
	 * Eliminiazione della conciliazione per capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaConciliazionePerCapitoloResponse eliminaConciliazionePerCapitolo(@WebParam EliminaConciliazionePerCapitolo parameters);

	/**
	 * Ricerca di dettaglio della conciliazione per capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioConciliazionePerCapitoloResponse ricercaDettaglioConciliazionePerCapitolo(@WebParam RicercaDettaglioConciliazionePerCapitolo parameters);
	
	/**
	 * Ricerca sintetica paginata della conciliazione per capitolo
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaConciliazionePerCapitoloResponse ricercaSinteticaConciliazionePerCapitolo(@WebParam RicercaSinteticaConciliazionePerCapitolo parameters);


	/**
	 * Inserimento della conciliazione per beneficiario
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceConciliazionePerBeneficiarioResponse inserisceConciliazionePerBeneficiario(@WebParam InserisceConciliazionePerBeneficiario parameters);

	/**
	 * Inserimento multiplo della conciliazione per beneficiario
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceConciliazioniPerBeneficiarioResponse inserisceConciliazioniPerBeneficiario(@WebParam InserisceConciliazioniPerBeneficiario parameters);

	/**
	 * Aggiornamento della conciliazione per beneficiario
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaConciliazionePerBeneficiarioResponse aggiornaConciliazionePerBeneficiario(@WebParam AggiornaConciliazionePerBeneficiario parameters);

	/**
	 * Eliminazione della conciliazione per beneficiario
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaConciliazionePerBeneficiarioResponse eliminaConciliazionePerBeneficiario(@WebParam EliminaConciliazionePerBeneficiario parameters);

	/**
	 * Ricerca edttaglio della conciliazione per beneficiario
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioConciliazionePerBeneficiarioResponse ricercaDettaglioConciliazionePerBeneficiario(@WebParam RicercaDettaglioConciliazionePerBeneficiario parameters);
	
	/**
	 * Ricerca sintetica paginata della conciliazione per beneficiario
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaConciliazionePerBeneficiarioResponse ricercaSinteticaConciliazionePerBeneficiario(@WebParam RicercaSinteticaConciliazionePerBeneficiario parameters);

	//SIAC-4956 sostituito con ricercaContiConciliazionePerClasse
	//@WebMethod
	//@WebResult RicercaContiConciliazionePerCausaleEPResponse ricercaContiConciliazionePerCausaleEP(@WebParam RicercaContiConciliazionePerCausaleEP parameters);
	
	/**
	 * Ricerca dei conti di conciliazione per classe
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaContiConciliazionePerClasseResponse ricercaContiConciliazionePerClasse(@WebParam RicercaContiConciliazionePerClasse parameters);
}
