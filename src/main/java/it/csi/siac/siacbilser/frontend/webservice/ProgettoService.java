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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDeltaTraCronoprogrammi;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDeltaTraCronoprogrammiResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoComplessivo;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoComplessivoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CambiaFlagUsatoPerFpvCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.CambiaFlagUsatoPerFpvCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.OttieniFondoPluriennaleVincolatoCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.OttieniFondoPluriennaleVincolatoCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.PreparazioneCronoprogrammaDiGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.PreparazioneCronoprogrammaDiGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RiattivaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RiattivaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipiAmbito;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipiAmbitoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.progetto.CalcoloProspettoRiassuntivoCronoprogrammaAggiorna;
import it.csi.siac.siacbilser.frontend.webservice.msg.progetto.CalcoloProspettoRiassuntivoCronoprogrammaAggiornaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.progetto.CalcoloProspettoRiassuntivoCronoprogrammaConsulta;
import it.csi.siac.siacbilser.frontend.webservice.msg.progetto.CalcoloProspettoRiassuntivoCronoprogrammaConsultaResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProvvedimento;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProvvedimentoResponse;

/**
 * SI del servizio Gestione ProgettoService
 * 
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "ProgettoService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ProgettoService {

	/**
	 * Inserimento dell'anagrafica del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceAnagraficaProgettoResponse inserisceAnagraficaProgetto(@WebParam InserisceAnagraficaProgetto parameters);

	/**
	 * Aggiornamento dell'anagrafica del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAnagraficaProgettoResponse aggiornaAnagraficaProgetto(@WebParam AggiornaAnagraficaProgetto parameters);
	
	/**
	 * Ricerca puntuale (per chiave logica) del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeProgettoResponse ricercaPuntualeProgetto(@WebParam RicercaPuntualeProgetto parameters);
	
	/**
	 * Ricerca sintetica paginata del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaProgettoResponse ricercaSinteticaProgetto(@WebParam RicercaSinteticaProgetto parameters);
	
	/**
	 * Ricerca di dettaglio del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult 
	RicercaDettaglioProgettoResponse ricercaDettaglioProgetto(@WebParam RicercaDettaglioProgetto parameters);
	
	/**
	 * Annullamento del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaProgettoResponse annullaProgetto(@WebParam AnnullaProgetto parameters);
		
	/**
	 * Riattivazione del progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RiattivaProgettoResponse riattivaProgetto(@WebParam RiattivaProgetto parameters);
	
	// Servizi del cronoprogramma
	
	/**
	 * Inserimento del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCronoprogrammaResponse inserisceCronoprogramma(@WebParam InserisceCronoprogramma parameters);
	
	/**
	 * Ricerca dei cronoprogrammi afferenti al progetto
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDeiCronoprogrammiCollegatiAlProgettoResponse ricercaDeiCronoprogrammiCollegatiAlProgetto(@WebParam RicercaDeiCronoprogrammiCollegatiAlProgetto parameters);	
	
	@WebMethod
	@WebResult
	RicercaDeiCronoprogrammiCollegatiAlProvvedimentoResponse ricercaDeiCronoprogrammiCollegatiAlProvvedimento(@WebParam RicercaDeiCronoprogrammiCollegatiAlProvvedimento parameters);	
	
	/**
	 * Ricerca del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaCronoprogrammaResponse ricercaCronoprogramma(@WebParam RicercaCronoprogramma parameters);
	
	/**
	 * Ricerca di dettaglio del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCronoprogrammaResponse ricercaDettaglioCronoprogramma(@WebParam RicercaDettaglioCronoprogramma parameters);
	
	/**
	 * Aggiornamento dell'anagrafica del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAnagraficaCronoprogrammaResponse aggiornaAnagraficaCronoprogramma(@WebParam AggiornaAnagraficaCronoprogramma parameters);
	
	/**
	 * Annullamento del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCronoprogrammaResponse annullaCronoprogramma(@WebParam AnnullaCronoprogramma parameters);
	
	/**
	 * Aggiornamento della riga di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRigaEntrataResponse aggiornaRigaEntrata(@WebParam AggiornaRigaEntrata parameters);
	
	/**
	 * Inserimento della riga di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRigaEntrataResponse inserisceRigaEntrata(@WebParam InserisceRigaEntrata parameters);
	
	/**
	 * Cancellazione della riga di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CancellaRigaEntrataResponse cancellaRigaEntrata(@WebParam CancellaRigaEntrata parameters);
	
	/**
	 * Aggiornamento della riga di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaRigaSpesaResponse aggiornaRigaSpesa(@WebParam AggiornaRigaSpesa parameters);
	
	/**
	 * Inserimento della riga di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceRigaSpesaResponse inserisceRigaSpesa(@WebParam InserisceRigaSpesa parameters);
	
	/**
	 * Cancellazione della riga di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CancellaRigaSpesaResponse cancellaRigaSpesa(@WebParam CancellaRigaSpesa parameters);
	
	/**
	 * Calcolo del delta tra cronoprogrammi
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CalcoloDeltaTraCronoprogrammiResponse calcoloDeltaTraCronoprogrammi(@WebParam CalcoloDeltaTraCronoprogrammi parameters);
	
	/**
	 * Preparazione del cronoprogramma di gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	PreparazioneCronoprogrammaDiGestioneResponse preparazioneCronoprogrammaDiGestione(@WebParam PreparazioneCronoprogrammaDiGestione parameters);
	
	/**
	 * Ricerca dei tipi ambito
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipiAmbitoResponse ricercaTipiAmbito(@WebParam RicercaTipiAmbito parameters);
	
	/**
	 * Calcolo del fondo pluriennale vincolato del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare i metodi puntuali
	 */
	@WebMethod
	@Deprecated
	@WebResult
	it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoCronoprogrammaResponse calcoloFondoPluriennaleVincolatoCronoprogramma(@WebParam it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoCronoprogramma parameters);
	
	/**
	 * Ricerca del fondo pluriennale vincolato del cronoprogramma
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	OttieniFondoPluriennaleVincolatoCronoprogrammaResponse ottieniFondoPluriennaleVincolatoCronoprogramma(@WebParam OttieniFondoPluriennaleVincolatoCronoprogramma parameters);
	
	/**
	 * Calcola l'FPV complessivo.
	 * <br/>
	 * Aggancia la function <code>fnc_siac_fpv_totale</code>
	 *
	 * @param parameters the parameters
	 * @return the calcolo fondo pluriennale vincolato complessivo response
	 */
	@WebMethod
	@WebResult
	CalcoloFondoPluriennaleVincolatoComplessivoResponse calcoloFondoPluriennaleVincolatoComplessivo(CalcoloFondoPluriennaleVincolatoComplessivo parameters);
	
	/**
	 * Calcola l'FPV complessivo.
	 * <br/>
	 * Aggancia la function <code>fnc_siac_fpv_entrata</code>
	 *
	 * @param parameters the parameters
	 * @return the calcolo fondo pluriennale vincolato entrata response
	 */
	@WebMethod
	@WebResult
	CalcoloFondoPluriennaleVincolatoEntrataResponse calcoloFondoPluriennaleVincolatoEntrata(CalcoloFondoPluriennaleVincolatoEntrata parameters);

	/**
	 * Calcola l'FPV complessivo.
	 * <br/>
	 * Aggancia la function <code>fnc_siac_fpv_spesa</code>
	 *
	 * @param parameters the parameters
	 * @return the calcolo fondo pluriennale vincolato spesa response
	 */
	@WebMethod
	@WebResult
	CalcoloFondoPluriennaleVincolatoSpesaResponse calcoloFondoPluriennaleVincolatoSpesa(CalcoloFondoPluriennaleVincolatoSpesa parameters);
	
	/**
	 * Calcola il prospetto riassuntivo cronoprogramma.
	 * <br/>
	 * Aggancia la function <code>fnc_siac_cronoprogramma_spesa_entrata</code>
	 *
	 * @param parameters the parameters
	 * @return the calcolo prospetto riassuntivo crnoprogramma response 
	 */
	@WebMethod
	@WebResult
	CalcoloProspettoRiassuntivoCronoprogrammaAggiornaResponse calcoloProspettoRiassuntivoCronoprogrammaAggiorna(CalcoloProspettoRiassuntivoCronoprogrammaAggiorna parameters);
	
	@WebMethod
	@WebResult
	CalcoloProspettoRiassuntivoCronoprogrammaConsultaResponse calcoloProspettoRiassuntivoCronoprogrammaConsulta(CalcoloProspettoRiassuntivoCronoprogrammaConsulta parameters);
	
	/**
	 * Cambia il flag usato per fpv relativo ad un certo cronoprogramma a true o a false  
	 * @param parameters the parameters
	 * @return la response
	 */
	@WebMethod
	@WebResult
	CambiaFlagUsatoPerFpvCronoprogrammaResponse cambiaFlagUsatoPerFpvCronoprogramma(@WebParam CambiaFlagUsatoPerFpvCronoprogramma parameters);
	
	/**
	 * Ricerca dei cronoprogrammi afferenti al progetto per il bilancio in corso
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancioResponse ricercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio(@WebParam RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio parameters);
}
