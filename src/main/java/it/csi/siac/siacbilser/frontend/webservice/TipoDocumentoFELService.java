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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaTipoDocumentoFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaTipoDocumentoFELResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaTipoDocumentoFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaTipoDocumentoFELResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceTipoDocumentoFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceTipoDocumentoFELResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioTipoDocumentoFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioTipoDocumentoFELResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaTipoDocumentoFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaTipoDocumentoFELResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoComponenteImportiCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoComponenteImportiCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoDocFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoDocFELResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoDocumentoFEL;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoDocumentoFELPerTipoContabilia;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoDocumentoFELPerTipoContabiliaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipoDocumentoFELResponse;


@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "TipoDocumentoFELService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface TipoDocumentoFELService {
	
	/**
	 * Ricerca Tipo Documento della fattura elettronica
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoDocumentoFELResponse ricercaTipoDocumentoFEL(@WebParam RicercaTipoDocumentoFEL parameters);
	
	
	
	/**
	 * Ricerca della componente del capitolo
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoDocFELResponse ricercaTipoDocFEL(@WebParam RicercaTipoDocFEL request);
	
	
	
	/**
	 * Inserimento del tipo Documento FEL
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceTipoDocumentoFELResponse inserisceTipoDocumentoFEL(@WebParam InserisceTipoDocumentoFEL request);

	/**
	 * Aggiornamento del tipo Documento FEL
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaTipoDocumentoFELResponse aggiornaTipoDocumentoFEL(@WebParam AggiornaTipoDocumentoFEL request);
	
	
	/**
	 * Ricerca puntuale tipo documento
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoDocumentoFELResponse ricercaPuntualeTipoDocumentoFEL(@WebParam RicercaTipoDocumentoFEL request);

	
	
	/**
	 * Ricerca dettaglio tipo documento
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioTipoDocumentoFELResponse ricercaDettaglioTipoDocumentoFEL(@WebParam RicercaDettaglioTipoDocumentoFEL request);

	
	
	
	/**
	 * Ricerca sintetica tipo documento
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaTipoDocumentoFELResponse ricercaSinteticaTipoDocumentoFEL(@WebParam RicercaSinteticaTipoDocumentoFEL request);

	/**
	 * Ricerca tipo documento  per tipo contabilia
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoDocumentoFELPerTipoContabiliaResponse ricercaTipoDocumentoFELPerTipoContabilia(@WebParam RicercaTipoDocumentoFELPerTipoContabilia request);

	/**
	 * Annullamento del tipo Documento FEL
	 * @param request la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaTipoDocumentoFELResponse annullaTipoDocumentoFEL(@WebParam AnnullaTipoDocumentoFEL request);
	
	 
}
