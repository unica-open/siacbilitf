/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.BindingType;

import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaImportoCespiteRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaImportoCespiteRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaPrimaNotaSuRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaPrimaNotaSuRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.CollegaCespiteRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.CollegaCespiteRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciPrimaNotaSuRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciPrimaNotaSuRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaCespiteDaPrimaNota;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaCespiteDaPrimaNotaResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaMovimentoDettaglioRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaMovimentoDettaglioRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RifiutaPrimaNotaCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RifiutaPrimaNotaCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RifiutaPrimaNotaSuRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RifiutaPrimaNotaSuRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.ScollegaCespiteRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.ScollegaCespiteRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.ValidaPrimaNotaCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.ValidaPrimaNotaCespiteResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.msg.OttieniDatiPrimeNoteFatturaConNotaCredito;
import it.csi.siac.siacgenser.frontend.webservice.msg.OttieniDatiPrimeNoteFatturaConNotaCreditoResponse;

/**
 * The Interface PrimaNotaCespiteService.
 * @author elisa
 * @version 1.0.0 - 23-10-2018
 */
@WebService(targetNamespace = CESPSvcDictionary.NAMESPACE, name = "PrimaNotaCespiteService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface PrimaNotaCespiteService {

	/**************** REGISTRO B ******************/
	@WebMethod
	@WebResult
	ValidaPrimaNotaCespiteResponse validaPrimaNotaCespite(@WebParam ValidaPrimaNotaCespite parameters);
	
	@WebMethod
	@WebResult
	RifiutaPrimaNotaCespiteResponse rifiutaPrimaNotaCespite(@WebParam RifiutaPrimaNotaCespite parameters);
	
	@WebMethod
	@WebResult
	RicercaCespiteDaPrimaNotaResponse ricercaCespiteDaPrimaNota(@WebParam RicercaCespiteDaPrimaNota parameters);
	
	/**************** REGISTRO A ******************/
	
	@WebMethod
	@WebResult
	InserisciPrimaNotaSuRegistroACespiteResponse inserisciPrimaNotaSuRegistroACespite(@WebParam InserisciPrimaNotaSuRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	RifiutaPrimaNotaSuRegistroACespiteResponse rifiutaPrimaNotaSuRegistroACespite(@WebParam RifiutaPrimaNotaSuRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	@Deprecated
	it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaMovimentoEPRegistroACespiteResponse ricercaSinteticaMovimentoEPRegistroACespite(@WebParam it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaMovimentoEPRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaMovimentoDettaglioRegistroACespiteResponse ricercaSinteticaMovimentoDettaglioRegistroACespite(@WebParam RicercaSinteticaMovimentoDettaglioRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	CollegaCespiteRegistroACespiteResponse collegaCespitePRegistroACespite(@WebParam CollegaCespiteRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	ScollegaCespiteRegistroACespiteResponse scollegaCespitePRegistroACespite(@WebParam ScollegaCespiteRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	AggiornaPrimaNotaSuRegistroACespiteResponse aggiornaPrimaNotaSuRegistroACespite(@WebParam AggiornaPrimaNotaSuRegistroACespite parameters);
	
	@WebMethod
	@WebResult
	AsyncServiceResponse aggiornaPrimaNotaSuRegistroACespiteAsync(@WebParam AsyncServiceRequestWrapper<AggiornaPrimaNotaSuRegistroACespite> parameters);
	
	@WebMethod
	@WebResult
	AggiornaImportoCespiteRegistroACespiteResponse aggiornaImportoCespiteRegistroACespite(@WebParam AggiornaImportoCespiteRegistroACespite parameters);
	
	
	@WebMethod
	@WebResult
	OttieniDatiPrimeNoteFatturaConNotaCreditoResponse ottieniDatiPrimeNoteFatturaConNotaCredito(@WebParam OttieniDatiPrimeNoteFatturaConNotaCredito parameters);
}
