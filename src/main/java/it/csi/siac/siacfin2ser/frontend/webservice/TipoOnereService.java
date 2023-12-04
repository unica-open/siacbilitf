/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice;

import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaTipoOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoTipoOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceTipoOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioTipoOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaTipoOnereResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoOnere;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTipoOnereResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

/**
 * SI del servizio TipoOnere
 * 
 * 
 */
@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "TipoOnereService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface TipoOnereService {	
	
	/**
	 * Inserimento del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceTipoOnereResponse inserisceTipoOnere(@WebParam InserisceTipoOnere parameters);
	
	/**
	 * Aggiornamento del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaTipoOnereResponse aggiornaTipoOnere(@WebParam AggiornaTipoOnere parameters);
	
	/**
	 * Ricerca del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaTipoOnereResponse ricercaTipoOnere(@WebParam RicercaTipoOnere parameters);
	
	/**
	 * Ricerca sintetica paginata del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaTipoOnereResponse ricercaSinteticaTipoOnere(@WebParam RicercaSinteticaTipoOnere parameters);
	
	/**
	 * Ricerca di dettaglio del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioTipoOnereResponse ricercaDettaglioTipoOnere(@WebParam RicercaDettaglioTipoOnere parameters);
	
	/**
	 * Dettaglio dello storico del tipo onere
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	DettaglioStoricoTipoOnereResponse dettaglioStoricoTipoOnere(@WebParam DettaglioStoricoTipoOnere parameters);
	
}
