/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoEntrataCollegaDocumento;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoEntrataCollegaDocumentoResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDataTrasmissionePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDataTrasmissionePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaDefiniscePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaDefiniscePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiCorrente;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiCorrenteResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTotaliPreDocumentoEntrataPerStato;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTotaliPreDocumentoEntrataPerStatoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoEntrataResponse;

/**
 * SI del servizio Gestione PreDocumento Entrata.
 * 
 * @author Domenico Lisi
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "PreDocumentoEntrataService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface PreDocumentoEntrataService {
	
	
	/**
	 * Inserimento del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InseriscePreDocumentoEntrataResponse inseriscePreDocumentoEntrata(@WebParam InseriscePreDocumentoEntrata parameters);
	
	/**
	 * Validazione dello stato operativo del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ValidaStatoOperativoPreDocumentoEntrataResponse validaStatoOperativoPreDocumentoEntrata(@WebParam ValidaStatoOperativoPreDocumentoEntrata parameters);
	
	/**
	 * Ricerca puntuale (per chiave logica) del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualePreDocumentoEntrataResponse ricercaPuntualePreDocumentoEntrata(@WebParam RicercaPuntualePreDocumentoEntrata parameters);
	
	/**
	 * Ricerca sintetica paginata del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaPreDocumentoEntrataResponse ricercaSinteticaPreDocumentoEntrata(@WebParam RicercaSinteticaPreDocumentoEntrata parameters);
	
	/**
	 * Ricerca di dettaglio del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioPreDocumentoEntrataResponse ricercaDettaglioPreDocumentoEntrata(@WebParam RicercaDettaglioPreDocumentoEntrata parameters);
	
	/**
	 * Annullamento del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaPreDocumentoEntrataResponse annullaPreDocumentoEntrata(@WebParam AnnullaPreDocumentoEntrata parameters);
	
	/**
	 * Associazione delle imputazioni contabili al predocumento di entrata
	 * @param parameters la request del servizio
	 */
	@WebMethod
	@Oneway
	void associaImputazioniContabiliPreDocumentoEntrata(@WebParam AssociaImputazioniContabiliPreDocumentoEntrata parameters);
	
		
	/**
	 * Aggiornamento del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaPreDocumentoDiEntrataResponse aggiornaPreDocumentoDiEntrata(@WebParam AggiornaPreDocumentoDiEntrata parameters);
	
	/**
	 * Definizione del predocumento di entrata
	 * @param parameters la request del servizio
	 * @deprecated utilizzare {@link #definiscePreDocumentoEntrata(DefiniscePreDocumentoEntrata)}
	 */
	@WebMethod
	@Oneway
	@Deprecated
	void definiscePreDocumentoDiEntrata(@WebParam DefiniscePreDocumentoDiEntrata parameters);
	
	/**
	 * Inserimento della causale di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCausaleEntrataResponse inserisceCausaleEntrata(@WebParam InserisceCausaleEntrata parameters);
	
	/**
	 * Aggiornamento della causale di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCausaleEntrataResponse aggiornaCausaleEntrata(@WebParam AggiornaCausaleEntrata parameters);
	
	/**
	 * Annullamento della causale di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCausaleEntrataResponse annullaCausaleEntrata(@WebParam AnnullaCausaleEntrata parameters);

	/**
	 * Ricerca di dettaglio della causale di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCausaleEntrataResponse ricercaDettaglioCausaleEntrata(@WebParam RicercaDettaglioCausaleEntrata parameters);
	
	/**
	 * Ricerca sintetica paginata della causale di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCausaleEntrataResponse ricercaSinteticaCausaleEntrata(@WebParam RicercaSinteticaCausaleEntrata parameters);
	
	
	/**
	 * Lettura dei tipi causale
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiTipiCausaleEntrataResponse leggiTipiCausaleEntrata(@WebParam LeggiTipiCausaleEntrata parameters);	

	/**
	 * Ricerca dei conti corrente
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiContiCorrenteResponse leggiContiCorrente(@WebParam LeggiContiCorrente parameters);
	
	/**
	 * Aggiornamento dello stato del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoPreDocumentoDiEntrataResponse aggiornaStatoPreDocumentoDiEntrata(@WebParam AggiornaStatoPreDocumentoDiEntrata parameters);
	
	/**
	 * Dettaglio dello storico della causale di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DettaglioStoricoCausaleEntrataResponse dettaglioStoricoCausaleEntrata(@WebParam DettaglioStoricoCausaleEntrata parameters);
	
	// CR-4280
	
	/**
	 * Associazione delle imputazioni contabili variate al predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssociaImputazioniContabiliVariatePreDocumentoEntrataResponse associaImputazioniContabiliVariatePreDocumentoEntrata(@WebParam AssociaImputazioniContabiliVariatePreDocumentoEntrata parameters);
	
	/**
	 * Associazione delle imputazioni contabili variate al predocumento di entrata asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #associaImputazioniContabiliVariatePreDocumentoEntrata(AssociaImputazioniContabiliVariatePreDocumentoEntrata)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse associaImputazioniContabiliVariatePreDocumentoEntrataAsync(@WebParam AsyncServiceRequestWrapper<AssociaImputazioniContabiliVariatePreDocumentoEntrata> parameters);
	
	// SIAC-4383
	
	/**
	 * Aggiornamento della data di trasmissione del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaDataTrasmissionePreDocumentoEntrataResponse aggiornaDataTrasmissionePreDocumentoEntrata(@WebParam AggiornaDataTrasmissionePreDocumentoEntrata parameters);
	
	/**
	 * Aggiornamento della data di trasmissione del predocumento di entrata asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #aggiornaDataTrasmissionePreDocumentoEntrata(AggiornaDataTrasmissionePreDocumentoEntrata)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse aggiornaDataTrasmissionePreDocumentoEntrataAsync(@WebParam AsyncServiceRequestWrapper<AggiornaDataTrasmissionePreDocumentoEntrata> parameters);
	
	// SIAC-5001
	/**
	 * Definizione del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DefiniscePreDocumentoEntrataResponse definiscePreDocumentoEntrata(@WebParam DefiniscePreDocumentoEntrata parameters);
	
	/**
	 * Definizione del predocumento di entrata asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #definiscePreDocumentoEntrata(DefiniscePreDocumentoEntrata)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse definiscePreDocumentoEntrataAsync(@WebParam AsyncServiceRequestWrapper<DefiniscePreDocumentoEntrata> parameters);
	
	// SIAC-6090
	
	/**
	 * Completamento e definizione del predocumento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	CompletaDefiniscePreDocumentoEntrataResponse completaDefiniscePreDocumentoEntrata(@WebParam CompletaDefiniscePreDocumentoEntrata parameters);
	
	/**
	 * Completamento e definizione del predocumento di entrata asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #completaDefiniscePreDocumentoEntrata(CompletaDefiniscePreDocumentoEntrata)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse completaDefiniscePreDocumentoEntrataAsync(@WebParam AsyncServiceRequestWrapper<CompletaDefiniscePreDocumentoEntrata> parameters);
	
	/**
	 * Ricerca dei totali dei predocumenti per stato
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTotaliPreDocumentoEntrataPerStatoResponse ricercaTotaliPreDocumentoEntrataPerStato(@WebParam RicercaTotaliPreDocumentoEntrataPerStato parameters);

	/**
	 * Ricerca dei totali dei predocumenti per stato per il riepilogo completa definisci predisposizione d'incasso
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTotaliPreDocumentoEntrataPerStatoResponse ricercaTotaliPreDocumentoEntrataPerStatoRiepilogo(@WebParam RicercaTotaliPreDocumentoEntrataPerStato req);

	@WebMethod
	@WebResult
	AggiornaPreDocumentoEntrataCollegaDocumentoResponse aggiornaPreDocumentoEntrataCollegaDocumento(@WebParam AggiornaPreDocumentoEntrataCollegaDocumento parameters);

}
