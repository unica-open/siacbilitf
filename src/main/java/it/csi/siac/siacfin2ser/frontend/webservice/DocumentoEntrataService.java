/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmettiFatturaFelEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EmettiFatturaFelEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaEntrataResponse;


/**
 * SI del servizio Gestione Documento Entrata.
 * 
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "DocumentoEntrataService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentoEntrataService {

	/**
	 * Ricerca di dettaglio del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioDocumentoEntrataResponse ricercaDettaglioDocumentoEntrata(@WebParam RicercaDettaglioDocumentoEntrata parameters);
	
	/**
	 * Ricerca modulare del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaModulareDocumentoEntrataResponse ricercaModulareDocumentoEntrata(@WebParam RicercaModulareDocumentoEntrata parameters);

	/**
	 * Ricerca puntuale (per chiave logica) del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeDocumentoEntrataResponse ricercaPuntualeDocumentoEntrata(@WebParam RicercaPuntualeDocumentoEntrata parameters);

	/**
	 * Ricerca sintetica paginata del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaDocumentoEntrataResponse ricercaSinteticaDocumentoEntrata(@WebParam RicercaSinteticaDocumentoEntrata parameters);

	/**
	 * Ricerca sintetica paginata modulare del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareDocumentoEntrataResponse ricercaSinteticaModulareDocumentoEntrata(@WebParam RicercaSinteticaModulareDocumentoEntrata parameters);
	
	/**
	 * Ricerca sintetica della testata del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaDocumentoEntrataResponse ricercaSinteticaTestataDocumentoEntrata(@WebParam RicercaSinteticaDocumentoEntrata parameters);

	/**
	 * Inserimento del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceDocumentoEntrataResponse inserisceDocumentoEntrata(@WebParam InserisceDocumentoEntrata parameters);
	
	/**
	 * Inserimento del documento di entrata per provvisorio di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceDocumentoPerProvvisoriEntrataResponse inserisceDocumentoPerProvvisoriEntrata(@WebParam InserisceDocumentoPerProvvisoriEntrata parameters);

	/**
	 * Inserimento della testata del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceDocumentoEntrataResponse inserisceTestataDocumentoEntrata(@WebParam InserisceDocumentoEntrata parameters);

	/**
	 * Inserimento quota del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceQuotaDocumentoEntrataResponse inserisceQuotaDocumentoEntrata(@WebParam InserisceQuotaDocumentoEntrata parameters);

	/**
	 * Aggiornamento quota del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaQuotaDocumentoEntrataResponse aggiornaQuotaDocumentoEntrata(@WebParam AggiornaQuotaDocumentoEntrata parameters);

	/**
	 * Aggiornamento del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaDocumentoDiEntrataResponse aggiornaDocumentoDiEntrata(@WebParam AggiornaDocumentoDiEntrata parameters);
	
	/**
	 * Aggiornamento della testata del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaDocumentoDiEntrataResponse aggiornaTestataDocumentoDiEntrata(@WebParam AggiornaDocumentoDiEntrata parameters);

	/**
	 * Aggiornamento dell'importo quote del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaImportiQuoteDocumentoEntrataResponse aggiornaImportoQuoteDocumentoEntrata(@WebParam AggiornaImportiQuoteDocumentoEntrata parameters);
	
	/**
	 * Aggiornamento dell'importo da dedurre delle quote del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaImportiQuoteDocumentoEntrataResponse aggiornaImportoDaDedurreQuoteDocumentoEntrata(@WebParam AggiornaImportiQuoteDocumentoEntrata parameters);

	/**
	 * Inserimento della nota di credito di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceNotaCreditoEntrataResponse inserisceNotaCreditoEntrata(@WebParam InserisceNotaCreditoEntrata parameters);

	/**
	 * Aggiornamento della nota di credito di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaNotaCreditoEntrataResponse aggiornaNotaCreditoEntrata(@WebParam AggiornaNotaCreditoEntrata parameters);

	/**
	 * Aggiornamento dello stato del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoDocumentoDiEntrataResponse aggiornaStatoDocumentoDiEntrata(@WebParam AggiornaStatoDocumentoDiEntrata parameters);

	/**
	 * Annullamento del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaDocumentoEntrataResponse annullaDocumentoEntrata(@WebParam AnnullaDocumentoEntrata parameters);
	
	/**
	 * Annullamento della nota di credito di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaNotaCreditoEntrataResponse annullaNotaCreditoEntrata(@WebParam AnnullaNotaCreditoEntrata parameters);

	/**
	 * Eliminazione della quota del documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaQuotaDocumentoEntrataResponse eliminaQuotaDocumentoEntrata(@WebParam EliminaQuotaDocumentoEntrata parameters);

	/**
	 * Ricerca della quota di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuotaEntrataResponse ricercaQuotaEntrata(@WebParam RicercaQuotaEntrata parameters);

	/**
	 * Ricerca di dettaglio della quota di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioQuotaEntrataResponse ricercaDettaglioQuotaEntrata(@WebParam RicercaDettaglioQuotaEntrata parameters);
	
	/**
	 * Ricerca della quota afferente al documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuoteByDocumentoEntrataResponse ricercaQuoteByDocumentoEntrata(@WebParam RicercaQuoteByDocumentoEntrata parameters);
	
	/**
	 * Ricerca della quota di entrata da emettere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuoteDaEmettereEntrataResponse ricercaQuoteDaEmettereEntrata(@WebParam RicercaQuoteDaEmettereEntrata parameters);

	/**
	 * Ricerca dei documenti afferenti al documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDocumentiCollegatiByDocumentoEntrataResponse ricercaDocumentiCollegatiByDocumentoEntrata(@WebParam RicercaDocumentiCollegatiByDocumentoEntrata parameters);
	
	/**
	 * Attivazione delle registrazioni contabili di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AttivaRegistrazioniContabiliEntrataResponse attivaRegistrazioniContabiliEntrata(@WebParam AttivaRegistrazioniContabiliEntrata parameters);
	
	/**
	 * Ricerca delle quote per provvisorio di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuotePerProvvisorioEntrataResponse ricercaQuotePerProvvisorioEntrata(@WebParam RicercaQuotePerProvvisorioEntrata parameters);
	
	/**
	 * Associazione del provvisorio alle quote di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssociaProvvisorioQuoteEntrataResponse associaProvvisorioQuoteEntrata(@WebParam AssociaProvvisorioQuoteEntrata parameters);

	// SIAC-3965
	/**
	 * Ricerca sintetica paginata modulare delle quote afferenti al documento di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareQuoteByDocumentoEntrataResponse ricercaSinteticaModulareQuoteByDocumentoEntrata(@WebParam RicercaSinteticaModulareQuoteByDocumentoEntrata parameters);
	
	// SIAC-5043
	/**
	 * Spezzamento dell quota di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SpezzaQuotaEntrataResponse spezzaQuotaEntrata(@WebParam SpezzaQuotaEntrata parameters);
	
	// SIAC-6092
	/**
	 * Ricerca sintetica paginata modulare delle quote di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareQuoteEntrataResponse ricercaSinteticaModulareQuoteEntrata(@WebParam RicercaSinteticaModulareQuoteEntrata parameters);

	// SIAC-6565
	/**
	 * Emetti fattura verso FEL
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EmettiFatturaFelEntrataResponse emettiFatturaFelEntrata(@WebParam EmettiFatturaFelEntrata parameters);

}
