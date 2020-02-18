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

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaControregistrazione;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaControregistrazioneResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceControregistrazione;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceControregistrazioneResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaEntrataResponse;

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "DocumentoIvaEntrataService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentoIvaEntrataService {
	
	/**
	 * Ricerca puntuale (per chiave logica) del subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeSubdocumentoIvaEntrataResponse ricercaPuntualeSubdocumentoIvaEntrata(@WebParam RicercaPuntualeSubdocumentoIvaEntrata parameters);
	
	/**
	 * Ricerca sintetica paginata del subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaSubdocumentoIvaEntrataResponse ricercaSinteticaSubdocumentoIvaEntrata(@WebParam RicercaSinteticaSubdocumentoIvaEntrata parameters);
	
	/**
	 * Ricerca di dettaglio del subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioSubdocumentoIvaEntrataResponse ricercaDettaglioSubdocumentoIvaEntrata(@WebParam RicercaDettaglioSubdocumentoIvaEntrata parameters);
	
	/**
	 * Inserimento del subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceSubdocumentoIvaEntrataResponse inserisceSubdocumentoIvaEntrata(@WebParam InserisceSubdocumentoIvaEntrata parameters);
	
	/**
	 * Aggiornamento del subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaSubdocumentoIvaEntrataResponse aggiornaSubdocumentoIvaEntrata(@WebParam AggiornaSubdocumentoIvaEntrata parameters);
	
	/**
	 * Inserimento della nota credito iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceNotaCreditoIvaEntrataResponse inserisceNotaCreditoIvaEntrata(@WebParam InserisceNotaCreditoIvaEntrata parameters);
	
	/**
	 * Aggiornamento della nota credito iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaNotaCreditoIvaEntrataResponse aggiornaNotaCreditoIvaEntrata(@WebParam AggiornaNotaCreditoIvaEntrata parameters);
	
	/**
	 * Inserimento della quota iva differita di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceQuotaIvaDifferitaEntrataResponse inserisceQuotaIvaDifferitaEntrata(@WebParam InserisceQuotaIvaDifferitaEntrata parameters);
	
	/**
	 * Aggiornamento della quota iva differita di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaQuotaIvaDifferitaEntrataResponse aggiornaQuotaIvaDifferitaEntrata(@WebParam AggiornaQuotaIvaDifferitaEntrata parameters);
	
	/**
	 * Aggiornamento dello stato del subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoSubdocumentoIvaEntrataResponse aggiornaStatoSubdocumentoIvaEntrata(@WebParam AggiornaStatoSubdocumentoIvaEntrata parameters);
	
	/**
	 * Inserimento della controregistrazione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceControregistrazioneResponse inserisceControregistrazione(@WebParam InserisceControregistrazione parameters);
	
	/**
	 * Aggiornamento della controregistrazione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaControregistrazioneResponse aggiornaControregistrazione(@WebParam AggiornaControregistrazione parameters);
	
	/**
	 * Ricerca delle note credito iva afferenti al documenti di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaNoteCreditoIvaDocumentoEntrataResponse ricercaNoteCreditoIvaDocumentoEntrata(@WebParam RicercaNoteCreditoIvaDocumentoEntrata parameters);
	
	/**
	 * Conto dei dati collegati al subdocumento iva di entrata
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ContaDatiCollegatiSubdocumentoIvaEntrataResponse contaDatiCollegatiSubdocumentoIvaEntrata(@WebParam ContaDatiCollegatiSubdocumentoIvaEntrata parameters);
}
