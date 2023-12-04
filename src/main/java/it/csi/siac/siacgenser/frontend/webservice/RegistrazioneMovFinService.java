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

import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaElementoPianoDeiContiRegistrazioneMovFin;
import it.csi.siac.siacgenser.frontend.webservice.msg.AggiornaElementoPianoDeiContiRegistrazioneMovFinResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.AssegnaContoEPRegistrazioneMovFin;
import it.csi.siac.siacgenser.frontend.webservice.msg.AssegnaContoEPRegistrazioneMovFinResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.CalcolaImportoMovimentoCollegato;
import it.csi.siac.siacgenser.frontend.webservice.msg.CalcolaImportoMovimentoCollegatoResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioRegistrazioneMovFin;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaDettaglioRegistrazioneMovFinResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaRegistrazioneMovFin;
import it.csi.siac.siacgenser.frontend.webservice.msg.RicercaSinteticaRegistrazioneMovFinResponse;

/**
 * SI del servizio Gestione Richieste Registrazione
 * 
 * 
 */
@WebService(targetNamespace = GENSvcDictionary.NAMESPACE, name = "RegistrazioneMovFinService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface RegistrazioneMovFinService {

	/**
	 * Ricerca sintetica paginata della registrazione movfin
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaRegistrazioneMovFinResponse ricercaSinteticaRegistrazioneMovFin(@WebParam RicercaSinteticaRegistrazioneMovFin parameters);
	
	/**
	 * Ricerca di dettaglio della registrazione movfin
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioRegistrazioneMovFinResponse ricercaDettaglioRegistrazioneMovFin(@WebParam RicercaDettaglioRegistrazioneMovFin parameters);
	
	/**
	 * Assegnazione del conto EP alla registrazione movfin
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssegnaContoEPRegistrazioneMovFinResponse assegnaContoEPRegistrazioneMovFin(@WebParam AssegnaContoEPRegistrazioneMovFin parameters);
	
	
	/**
	 * Aggiornamento ell'elemento piano dei conti alla registrazione movfin
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaElementoPianoDeiContiRegistrazioneMovFinResponse aggiornaElementoPianoDeiContiRegistrazioneMovFin(@WebParam AggiornaElementoPianoDeiContiRegistrazioneMovFin parameters);
	
	// SIAC-5802
	
	/**
	 * Calcolo dell'importo del movimento collegato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CalcolaImportoMovimentoCollegatoResponse calcolaImportoMovimentoCollegato(@WebParam CalcolaImportoMovimentoCollegato parameters);
}
