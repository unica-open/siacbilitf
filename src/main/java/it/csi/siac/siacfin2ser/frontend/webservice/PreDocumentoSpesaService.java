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

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesaPerElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesaPerElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiTesoreria;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiTesoreriaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoSpesaResponse;

/**
 * SI del servizio Gestione PreDocumento Spesa.
 * 
 * @author Domenico Lisi
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "PreDocumentoSpesaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface PreDocumentoSpesaService {
	
	
	/**
	 * Inserimento del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InseriscePreDocumentoSpesaResponse inseriscePreDocumentoSpesa(@WebParam InseriscePreDocumentoSpesa parameters);
	
	/**
	 * Validazione dello stato operativo del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ValidaStatoOperativoPreDocumentoSpesaResponse validaStatoOperativoPreDocumentoSpesa(@WebParam ValidaStatoOperativoPreDocumentoSpesa parameters);
	
		
	/**
	 * Ricerca puntuale (per chiave logica) del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualePreDocumentoSpesaResponse ricercaPuntualePreDocumentoSpesa(@WebParam RicercaPuntualePreDocumentoSpesa parameters);
	
	/**
	 * Ricerca sintetica paginata del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaPreDocumentoSpesaResponse ricercaSinteticaPreDocumentoSpesa(@WebParam RicercaSinteticaPreDocumentoSpesa parameters);
	
	/**
	 * Ricerca di dettaglio del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioPreDocumentoSpesaResponse ricercaDettaglioPreDocumentoSpesa(@WebParam RicercaDettaglioPreDocumentoSpesa parameters);
	
	/**
	 * Annullamento del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaPreDocumentoSpesaResponse annullaPreDocumentoSpesa(@WebParam AnnullaPreDocumentoSpesa parameters);
	
	/**
	 * Associazione delle imputazioni contabili al predocumento di spesa
	 * @param parameters la request del servizio
	 */
	@WebMethod
	@Oneway
	void associaImputazioniContabiliPreDocumentoSpesa(@WebParam AssociaImputazioniContabiliPreDocumentoSpesa parameters);
	
	/**
	 * Aggiornamento del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaPreDocumentoDiSpesaResponse aggiornaPreDocumentoDiSpesa(@WebParam AggiornaPreDocumentoDiSpesa parameters);
	
	/**
	 * Definizione del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare {@link #definiscePreDocumentoSpesa(DefiniscePreDocumentoSpesa)}
	 */
	@WebMethod
	@Oneway
	@Deprecated
	void definiscePreDocumentoDiSpesa(@WebParam DefiniscePreDocumentoDiSpesa parameters);
	
		
	/**
	 * Inserimento della causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCausaleSpesaResponse inserisceCausaleSpesa(@WebParam InserisceCausaleSpesa parameters);
	
	/**
	 * Aggiornamento della causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCausaleSpesaResponse aggiornaCausaleSpesa(@WebParam AggiornaCausaleSpesa parameters);
	
	/**
	 * Annullamento della causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCausaleSpesaResponse annullaCausaleSpesa(@WebParam AnnullaCausaleSpesa parameters);
	

	/**
	 * Ricerca di dettaglio della causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCausaleSpesaResponse ricercaDettaglioCausaleSpesa(
			@WebParam RicercaDettaglioCausaleSpesa parameters);
	
	/**
	 * Ricerca sintetica paginata della causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCausaleSpesaResponse ricercaSinteticaCausaleSpesa(@WebParam RicercaSinteticaCausaleSpesa parameters);
	
	
	/**
	 * Ricerca dei tipi di causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	LeggiTipiCausaleSpesaResponse leggiTipiCausaleSpesa(@WebParam LeggiTipiCausaleSpesa parameters);
	
	/**
	 * Aggiornamento dello stato del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoPreDocumentoDiSpesaResponse aggiornaStatoPreDocumentoDiSpesa(@WebParam AggiornaStatoPreDocumentoDiSpesa parameters);
	
	/**
	 * Dettaglio dello storico della causale di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DettaglioStoricoCausaleSpesaResponse dettaglioStoricoCausaleSpesa(@WebParam DettaglioStoricoCausaleSpesa parameters);

	// CR-4280
	
	/**
	 * Associazione delle imputazioni contabili variate al predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssociaImputazioniContabiliVariatePreDocumentoSpesaResponse associaImputazioniContabiliVariatePreDocumentoSpesa(@WebParam AssociaImputazioniContabiliVariatePreDocumentoSpesa parameters);
	
	/**
	 * Associazione delle imputazioni contabili variate al predocumento di spesa asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #associaImputazioniContabiliVariatePreDocumentoSpesa(AssociaImputazioniContabiliVariatePreDocumentoSpesa)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse associaImputazioniContabiliVariatePreDocumentoSpesaAsync(@WebParam AsyncServiceRequestWrapper<AssociaImputazioniContabiliVariatePreDocumentoSpesa> parameters);
	
	// SIAC-5001
	/**
	 * Definizione del predocumento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DefiniscePreDocumentoSpesaResponse definiscePreDocumentoSpesa(@WebParam DefiniscePreDocumentoSpesa parameters);
	
	/**
	 * Definizione del predocumento di spesa asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #definiscePreDocumentoSpesa(DefiniscePreDocumentoSpesa)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse definiscePreDocumentoSpesaAsync(@WebParam AsyncServiceRequestWrapper<DefiniscePreDocumentoSpesa> parameters);
	
	// SIAC-4996
	
	/**
	 * Definizione del predocumento di spesa per elenco
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DefiniscePreDocumentoSpesaPerElencoResponse definiscePreDocumentoSpesaPerElenco(@WebParam DefiniscePreDocumentoSpesaPerElenco parameters);
	
	/**
	 * Definizione del predocumento di spesa per elenco asincrono
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @see #definiscePreDocumentoSpesaPerElenco(DefiniscePreDocumentoSpesaPerElenco)
	 */
	@WebMethod
	@WebResult
	AsyncServiceResponse definiscePreDocumentoSpesaPerElencoAsync(@WebParam AsyncServiceRequestWrapper<DefiniscePreDocumentoSpesaPerElenco> parameters);
	
}
