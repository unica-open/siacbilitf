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

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaNotaCreditoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaQuotaIvaDifferitaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ContaDatiCollegatiSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceNotaCreditoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceQuotaIvaDifferitaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaNoteCreditoIvaDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualeSubdocumentoIvaSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaSubdocumentoIvaSpesaResponse;

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "DocumentoIvaSpesaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface DocumentoIvaSpesaService {
	
	/**
	 * Ricerca puntuale (per chiave logica) del subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeSubdocumentoIvaSpesaResponse ricercaPuntualeSubdocumentoIvaSpesa(@WebParam RicercaPuntualeSubdocumentoIvaSpesa parameters);
	
	/**
	 * Ricerca sintetica del subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaSubdocumentoIvaSpesaResponse ricercaSinteticaSubdocumentoIvaSpesa(
			@WebParam RicercaSinteticaSubdocumentoIvaSpesa parameters);
	
	/**
	 * Ricerca di dettaglio del subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioSubdocumentoIvaSpesaResponse ricercaDettaglioSubdocumentoIvaSpesa(@WebParam RicercaDettaglioSubdocumentoIvaSpesa parameters);
	
	/**
	 * Inserimento del subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceSubdocumentoIvaSpesaResponse inserisceSubdocumentoIvaSpesa(@WebParam InserisceSubdocumentoIvaSpesa parameters);
	
	/**
	 * Aggiornamento del subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaSubdocumentoIvaSpesaResponse aggiornaSubdocumentoIvaSpesa(@WebParam AggiornaSubdocumentoIvaSpesa parameters);
	
	/**
	 * Inserimento della nota credito iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceNotaCreditoIvaSpesaResponse inserisceNotaCreditoIvaSpesa(@WebParam InserisceNotaCreditoIvaSpesa parameters);
	
	/**
	 * Aggiornamento della nota credito iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaNotaCreditoIvaSpesaResponse aggiornaNotaCreditoIvaSpesa(@WebParam AggiornaNotaCreditoIvaSpesa parameters);
	
	
	/**
	 * Inserimento della quota iva differita di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceQuotaIvaDifferitaSpesaResponse inserisceQuotaIvaDifferitaSpesa(@WebParam InserisceQuotaIvaDifferitaSpesa parameters);
	
	/**
	 * Aggiornamento della quota iva differita di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaQuotaIvaDifferitaSpesaResponse aggiornaQuotaIvaDifferitaSpesa(@WebParam AggiornaQuotaIvaDifferitaSpesa parameters);
	
	
	/**
	 * Aggiornamento dello stato del subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaStatoSubdocumentoIvaSpesaResponse aggiornaStatoSubdocumentoIvaSpesa(@WebParam AggiornaStatoSubdocumentoIvaSpesa parameters);
	
	/**
	 * Ricerca della nota credito iva afferente al documento di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaNoteCreditoIvaDocumentoSpesaResponse ricercaNoteCreditoIvaDocumentoSpesa(@WebParam RicercaNoteCreditoIvaDocumentoSpesa parameters);
	
	/**
	 * Conta dei dati collegati al subdocumento iva di spesa
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	ContaDatiCollegatiSubdocumentoIvaSpesaResponse contaDatiCollegatiSubdocumentoIvaSpesa(@WebParam ContaDatiCollegatiSubdocumentoIvaSpesa parameters);
}
