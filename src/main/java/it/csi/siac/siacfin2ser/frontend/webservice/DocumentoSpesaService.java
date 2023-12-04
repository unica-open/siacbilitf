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

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaAttributiQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaAttributiQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaImportiQuoteDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaOnereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaOnereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaNotaCreditoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaProvvisorioQuoteSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AttivaRegistrazioniContabiliSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaOnereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaOnereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.EliminaQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoPerProvvisoriSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisciOnereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisciOnereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ProporzionaImportiSplitReverse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ProporzionaImportiSplitReverseResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioQuotaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDocumentiCollegatiByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaModulareDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaOnereByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaOnereByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuoteDaEmettereSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaQuotePerProvvisorioSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteByDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaModulareQuoteSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.SpezzaQuotaSpesaResponse;

/**
 * SI del servizio Gestione Documento Spesa.
 * 
 * @author Alessandro Marchino
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "DocumentoSpesaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentoSpesaService {

	/**
	 * Ricerca puntuale (per chiave logica) del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeDocumentoSpesaResponse ricercaPuntualeDocumentoSpesa(@WebParam RicercaPuntualeDocumentoSpesa parameters);

	/**
	 * Ricerca sintetica paginata del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaDocumentoSpesaResponse ricercaSinteticaDocumentoSpesa(@WebParam RicercaSinteticaDocumentoSpesa parameters);
	
	/**
	 * Ricerca sintetica paginata e modulare del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareDocumentoSpesaResponse ricercaSinteticaModulareDocumentoSpesa(@WebParam RicercaSinteticaModulareDocumentoSpesa parameters);
	
	/**
	 * Ricerca sintetica paginata della testata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaDocumentoSpesaResponse ricercaSinteticaTestataDocumentoSpesa(@WebParam RicercaSinteticaDocumentoSpesa parameters);

	/**
	 * Ricerca di dettaglio del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioDocumentoSpesaResponse ricercaDettaglioDocumentoSpesa(@WebParam RicercaDettaglioDocumentoSpesa parameters);
	
	/**
	 * Ricerca di dettaglio modulare del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaModulareDocumentoSpesaResponse ricercaModulareDocumentoSpesa(@WebParam RicercaModulareDocumentoSpesa parameters);

	/**
	 * Inserimento del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceDocumentoSpesaResponse inserisceDocumentoSpesa(@WebParam InserisceDocumentoSpesa parameters);

	/**
	 * Inserimento della testata del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceDocumentoSpesaResponse inserisceTestataDocumentoSpesa(@WebParam InserisceDocumentoSpesa parameters);

	/**
	 * Inserimento della nota di credito di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceNotaCreditoSpesaResponse inserisceNotaCreditoSpesa(@WebParam InserisceNotaCreditoSpesa parameters);

	/**
	 * Aggiornamento della nota di credito di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaNotaCreditoSpesaResponse aggiornaNotaCreditoSpesa(@WebParam AggiornaNotaCreditoSpesa parameters);

	/**
	 * Inserimento della quota del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceQuotaDocumentoSpesaResponse inserisceQuotaDocumentoSpesa(@WebParam InserisceQuotaDocumentoSpesa parameters);

	/**
	 * Aggiornamento della quota del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaQuotaDocumentoSpesaResponse aggiornaQuotaDocumentoSpesa(@WebParam AggiornaQuotaDocumentoSpesa parameters);

	/**
	 * Aggiornamento del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaDocumentoDiSpesaResponse aggiornaDocumentoDiSpesa(@WebParam AggiornaDocumentoDiSpesa parameters);
	
	/**
	 * Aggiornamento della testata del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaDocumentoDiSpesaResponse aggiornaTestataDocumentoDiSpesa(@WebParam AggiornaDocumentoDiSpesa parameters);

	/**
	 * Aggiornamento dell'importo delle quote del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaImportiQuoteDocumentoSpesaResponse aggiornaImportoQuoteDocumentoSpesa(@WebParam AggiornaImportiQuoteDocumentoSpesa parameters);
	
	/**
	 * Aggiornamento dell'importo da dedurre delle quote del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaImportiQuoteDocumentoSpesaResponse aggiornaImportoDaDedurreQuoteDocumentoSpesa(@WebParam AggiornaImportiQuoteDocumentoSpesa parameters);

	/**
	 * Aggiornamento dello stato del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoDocumentoDiSpesaResponse aggiornaStatoDocumentoDiSpesa(@WebParam AggiornaStatoDocumentoDiSpesa parameters);

	/**
	 * Annullamento del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaDocumentoSpesaResponse annullaDocumentoSpesa(@WebParam AnnullaDocumentoSpesa parameters);
	
	/**
	 * Annullamento della nora di credito di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaNotaCreditoSpesaResponse annullaNotaCreditoSpesa(@WebParam AnnullaNotaCreditoSpesa parameters);

	/**
	 * Eliminazione della quota del documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaQuotaDocumentoSpesaResponse eliminaQuotaDocumentoSpesa(@WebParam EliminaQuotaDocumentoSpesa parameters);

	/**
	 * Ricerca sintetica paginata delle quote di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuotaSpesaResponse ricercaQuotaSpesa(@WebParam RicercaQuotaSpesa parameters);
	
	/**
	 * Ricerca sintetica paginata delle quote di spesa da emettere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuoteDaEmettereSpesaResponse ricercaQuoteDaEmettereSpesa(@WebParam RicercaQuoteDaEmettereSpesa parameters);
	
	/**
	 * Ricerca di dettaglio della quota di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioQuotaSpesaResponse ricercaDettaglioQuotaSpesa(@WebParam RicercaDettaglioQuotaSpesa parameters);

	/**
	 * Ricerca delle quote afferenti al documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuoteByDocumentoSpesaResponse ricercaQuoteByDocumentoSpesa(@WebParam RicercaQuoteByDocumentoSpesa parameters);

	/**
	 * Inserimento degli oneri di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisciOnereSpesaResponse inserisciOnereSpesa(@WebParam InserisciOnereSpesa parameters);

	/**
	 * Aggiornamento degli oneri di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaOnereSpesaResponse aggiornaOnereSpesa(@WebParam AggiornaOnereSpesa parameters);

	/**
	 * Eliminazione degli oneri di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaOnereSpesaResponse eliminaOnereSpesa(@WebParam EliminaOnereSpesa parameters);

	/**
	 * Ricerca degli oneri afferenti al documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaOnereByDocumentoSpesaResponse ricercaOnereByDocumentoSpesa(@WebParam RicercaOnereByDocumentoSpesa parameters);

	/**
	 * Ricerca dei documenti collegati al documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDocumentiCollegatiByDocumentoSpesaResponse ricercaDocumentiCollegatiByDocumentoSpesa(@WebParam RicercaDocumentiCollegatiByDocumentoSpesa parameters);
	
	/**
	 * Aggiornamento degli attributi della quota di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaAttributiQuotaDocumentoSpesaResponse aggiornaAttributiQuotaDocumentoSpesa(@WebParam AggiornaAttributiQuotaDocumentoSpesa parameters);
	
	/**
	 * Attivazione delle registrazioni contabili di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AttivaRegistrazioniContabiliSpesaResponse attivaRegistrazioniContabiliSpesa(@WebParam AttivaRegistrazioniContabiliSpesa parameters);
	
	/**
	 * Proporzione degli importi split/reverse
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ProporzionaImportiSplitReverseResponse proporzionaImportiSplitReverse(@WebParam ProporzionaImportiSplitReverse parameters);
	
	/**
	 * Ricerca delle quote afferenti al provvisorio di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaQuotePerProvvisorioSpesaResponse ricercaQuotePerProvvisorioSpesa(@WebParam RicercaQuotePerProvvisorioSpesa parameters);
	
	/**
	 * Inserimento del documento per il provvisorio di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceDocumentoPerProvvisoriSpesaResponse inserisceDocumentoPerProvvisoriSpesa(@WebParam InserisceDocumentoPerProvvisoriSpesa parameters);
	
	/**
	 * Associazione del provvisorio alle quote di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AssociaProvvisorioQuoteSpesaResponse associaProvvisorioQuoteSpesa(@WebParam AssociaProvvisorioQuoteSpesa parameters);
	
	// SIAC-3965
	/**
	 * Ricerca sintetica paginata modulare delle quote afferenti al documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareQuoteByDocumentoSpesaResponse ricercaSinteticaModulareQuoteByDocumentoSpesa(@WebParam RicercaSinteticaModulareQuoteByDocumentoSpesa parameters);

	// SIAC-5043
	/**
	 * Spezzamento della quota di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	SpezzaQuotaSpesaResponse spezzaQuotaSpesa(@WebParam SpezzaQuotaSpesa parameters);
	
	// SIAC-6092
	
	/**
	 * Ricerca sintetica paginata modulare delle quote di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaModulareQuoteSpesaResponse ricercaSinteticaModulareQuoteSpesa(@WebParam RicercaSinteticaModulareQuoteSpesa parameters);
}
