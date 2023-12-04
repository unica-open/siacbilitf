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

import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaTipoBeneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.AnnullaCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.AnnullaCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.AnnullaTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AnnullaTipoBeneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaTipoBeneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciTipoBeneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioTipoBeneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaTipoBeneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.VerificaAnnullabilitaCategoriaCespiti;
import it.csi.siac.siaccespser.frontend.webservice.msg.VerificaAnnullabilitaCategoriaCespitiResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.VerificaAnnullabilitaTipoBeneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.VerificaAnnullabilitaTipoBeneCespiteResponse;

/**
 * The Interface ClassificazioneCespiteService.
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 */
@WebService(targetNamespace = CESPSvcDictionary.NAMESPACE, name = "ClassificazioneCespiteService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface ClassificazioneCespiteService {

	/**************** CATEGORIA CESPITE ******************/
	@WebMethod
	@WebResult
	InserisciCategoriaCespitiResponse inserisciCategoriaCespiti(InserisciCategoriaCespiti parameters);
	
	@WebMethod
	@WebResult
	AggiornaCategoriaCespitiResponse aggiornaCategoriaCespiti(@WebParam AggiornaCategoriaCespiti parameters);
	
	@WebMethod
	@WebResult
	RicercaDettaglioCategoriaCespitiResponse ricercaDettaglioCategoriaCespiti(@WebParam RicercaDettaglioCategoriaCespiti parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaCategoriaCespitiResponse ricercaSinteticaCategoriaCespiti(@WebParam RicercaSinteticaCategoriaCespiti parameters);
	
	@WebMethod
	@WebResult
	EliminaCategoriaCespitiResponse eliminaCategoriaCespiti(@WebParam EliminaCategoriaCespiti parameters);
	
	@WebMethod
	@WebResult
	AnnullaCategoriaCespitiResponse annullaCategoriaCespiti(@WebParam AnnullaCategoriaCespiti parameters);
	
	@WebMethod
	@WebResult
	VerificaAnnullabilitaCategoriaCespitiResponse verificaAnnullabilitaCategoriaCespiti(@WebParam VerificaAnnullabilitaCategoriaCespiti parameters);
	
	
	/**************** TIPO BENE ******************/
	@WebMethod
	@WebResult
	InserisciTipoBeneCespiteResponse inserisciTipoBeneCespite(@WebParam InserisciTipoBeneCespite parameters);
	
	@WebMethod
	@WebResult
	AggiornaTipoBeneCespiteResponse aggiornaTipoBeneCespite(@WebParam AggiornaTipoBeneCespite parameters);
	
	@WebMethod
	@WebResult
	RicercaDettaglioTipoBeneCespiteResponse ricercaDettaglioTipoBeneCespite(@WebParam RicercaDettaglioTipoBeneCespite parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaTipoBeneCespiteResponse ricercaSinteticaTipoBeneCespite(@WebParam RicercaSinteticaTipoBeneCespite parameters);
	
	@WebMethod
	@WebResult
	EliminaTipoBeneCespiteResponse eliminaTipoBeneCespite(@WebParam EliminaTipoBeneCespite parameters);
	
	@WebMethod
	@WebResult
	AnnullaTipoBeneCespiteResponse annullaTipoBeneCespite(@WebParam AnnullaTipoBeneCespite parameters);
	
	@WebMethod
	@WebResult
	VerificaAnnullabilitaTipoBeneCespiteResponse verificaAnnullabilitaTipoBeneCespite(@WebParam VerificaAnnullabilitaTipoBeneCespite parameters);

}
