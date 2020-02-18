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

import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaStampaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaStampaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaStampaIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaStampaIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaLiquidazioneIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaLiquidazioneIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaRegistriIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaRegistriIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaRegistroIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaRegistroIvaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaRiepilogoAnnualeIva;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.StampaRiepilogoAnnualeIvaResponse;

/**
 * SI del servizio Gestione StampaIvaService.
 */

@WebService(targetNamespace = FIN2SvcDictionary.NAMESPACE, name = "StampaIvaService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface StampaIvaService {

	/**
	 * Stampa registro iva.
	 *
	 * @param parameters the parameters
	 * @return the stampa registro iva response
	 */
	@WebMethod
	@WebResult
	StampaRegistroIvaResponse stampaRegistroIva(@WebParam StampaRegistroIva parameters);

	/**
	 * Stampa registri iva.
	 *
	 * @param parameters la request del servizio
	 * @return the stampa registri iva response
	 */
	@WebMethod
	StampaRegistriIvaResponse stampaRegistriIva(StampaRegistriIva request); 

	/**
	 * Stampa liquidazione iva.
	 *
	 * @param parameters la request del servizio
	 * @return the stampa liquidazione iva response
	 */
	@WebMethod
	@WebResult
	StampaLiquidazioneIvaResponse stampaLiquidazioneIva(@WebParam StampaLiquidazioneIva parameters);
	
	/**
	 * Stampa riepilogo annuale iva.
	 *
	 * @param parameters la request del servizio
	 * @return the stampa riepilogo annuale iva response
	 */
	@WebMethod
	@WebResult
	StampaRiepilogoAnnualeIvaResponse stampaRiepilogoAnnualeIva(@WebParam StampaRiepilogoAnnualeIva parameters);
	
	/**
	 * Ricerca puntuale stampa iva.
	 *
	 * @param parameters la request del servizio
	 * @return the stampa riepilogo annuale iva response
	 */
	@WebMethod
	@WebResult
	RicercaStampaIvaResponse ricercaStampaIva(@WebParam RicercaStampaIva parameters);

	/**
	 * Ricerca sintetica stampa iva.
	 * 
	 * @param parameters la request del servizio
	 * @return stampe iva
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaStampaIvaResponse ricercaSinteticaStampaIva(@WebParam RicercaSinteticaStampaIva parameters);
	
}
