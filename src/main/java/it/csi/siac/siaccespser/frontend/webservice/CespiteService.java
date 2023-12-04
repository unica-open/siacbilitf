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

import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaAnagraficaDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaAnagraficaDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaVariazioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.AggiornaVariazioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.CollegaCespiteDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.CollegaCespiteDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaVariazioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.EliminaVariazioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciAmmortamentoMassivoCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciAmmortamentoMassivoCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciAnagraficaDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciAnagraficaDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciAnteprimaAmmortamentoAnnuoCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciAnteprimaAmmortamentoAnnuoCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciPrimeNoteAmmortamentoAnnuoCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciPrimeNoteAmmortamentoAnnuoCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciPrimeNoteDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciPrimeNoteDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciVariazioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.InserisciVariazioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaCespitePerChiave;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaCespitePerChiaveResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioVariazioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaDettaglioVariazioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaScrittureInventarioByEntitaCollegata;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaScrittureInventarioByEntitaCollegataResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaDettaglioAmmortamentoAnnuoCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaDettaglioAmmortamentoAnnuoCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaDettaglioAnteprimaAmmortamentoAnnuoCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaDettaglioAnteprimaAmmortamentoAnnuoCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaDismissioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaRegistroACespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaRegistroACespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaScrittureRegistroAByCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaScrittureRegistroAByCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaVariazioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.RicercaSinteticaVariazioneCespiteResponse;
import it.csi.siac.siaccespser.frontend.webservice.msg.ScollegaCespiteDismissioneCespite;
import it.csi.siac.siaccespser.frontend.webservice.msg.ScollegaCespiteDismissioneCespiteResponse;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;

/**
 * The Interface ClassificazioneCespiteService.
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 */
@WebService(targetNamespace = CESPSvcDictionary.NAMESPACE, name = "CespiteService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CespiteService {

	/**************** CESPITE ******************/
	@WebMethod
	@WebResult
	InserisciCespiteResponse inserisciCespite(@WebParam InserisciCespite parameters);
	
	@WebMethod
	@WebResult
	AggiornaCespiteResponse aggiornaCespite(@WebParam AggiornaCespite parameters);
	
	@WebMethod
	@WebResult
	RicercaDettaglioCespiteResponse ricercaDettaglioCespite(@WebParam RicercaDettaglioCespite parameters);
	
	@WebMethod
	@WebResult
	RicercaCespitePerChiaveResponse ricercaCespitePerChiave(@WebParam RicercaCespitePerChiave parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaCespiteResponse ricercaSinteticaCespite(@WebParam RicercaSinteticaCespite parameters);
	
	@WebMethod
	@WebResult
	EliminaCespiteResponse eliminaCespite(@WebParam EliminaCespite parameters);
	
	/********************************* DISMISSIONI ************************************** */
	
	@WebMethod
	@WebResult
	InserisciAnagraficaDismissioneCespiteResponse inserisciAnagraficaDismissioneCespite(@WebParam InserisciAnagraficaDismissioneCespite parameters);
	
	@WebMethod
	@WebResult
	AggiornaAnagraficaDismissioneCespiteResponse aggiornaAnagraficaDismissioneCespite(@WebParam AggiornaAnagraficaDismissioneCespite parameters);
	
	@WebMethod
	@WebResult
	RicercaDettaglioDismissioneCespiteResponse ricercaDettaglioDismissioneCespite(@WebParam RicercaDettaglioDismissioneCespite parameters);
	
//	@WebMethod
//	@WebResult
//	RicercaDismissioneCespitePerChiaveResponse ricercaDismissioneCespitePerChiave(@WebParam RicercaDismissioneCespitePerChiave parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaDismissioneCespiteResponse ricercaSinteticaDismissioneCespite(@WebParam RicercaSinteticaDismissioneCespite parameters);
	
	@WebMethod
	@WebResult
	EliminaDismissioneCespiteResponse eliminaDismissioneCespite(@WebParam EliminaDismissioneCespite parameters);
	
	@WebMethod
	@WebResult
	CollegaCespiteDismissioneCespiteResponse collegaCespiteDismissioneCespite(@WebParam CollegaCespiteDismissioneCespite parameters);
	
	@WebMethod
	@WebResult
	ScollegaCespiteDismissioneCespiteResponse scollegaCespiteDismissioneCespite(@WebParam ScollegaCespiteDismissioneCespite parameters);
	@WebMethod
	@WebResult
	InserisciPrimeNoteDismissioneCespiteResponse inserisciPrimeNoteDismissioneCespite(@WebParam InserisciPrimeNoteDismissioneCespite parameters);

	/******* VARIAZIONE CESPITE *******/
	@WebMethod
	@WebResult
	InserisciVariazioneCespiteResponse inserisciVariazioneCespite(@WebParam InserisciVariazioneCespite parameters);
	@WebMethod
	@WebResult
	AggiornaVariazioneCespiteResponse aggiornaVariazioneCespite(@WebParam AggiornaVariazioneCespite parameters);
	@WebMethod
	@WebResult
	EliminaVariazioneCespiteResponse eliminaVariazioneCespite(@WebParam EliminaVariazioneCespite parameters);
	@WebMethod
	@WebResult
	RicercaDettaglioVariazioneCespiteResponse ricercaDettaglioVariazioneCespite(@WebParam RicercaDettaglioVariazioneCespite parameters);
	@WebMethod
	@WebResult
	RicercaSinteticaVariazioneCespiteResponse ricercaSinteticaVariazioneCespite(@WebParam RicercaSinteticaVariazioneCespite parameters);
	
	/**SCRITTURE**/
	@WebMethod
	@WebResult
	RicercaScrittureInventarioByEntitaCollegataResponse ricercaScrittureInventarioByEntitaCollegata(@WebParam RicercaScrittureInventarioByEntitaCollegata parameters);
	
	/********************************* AMMORTAMENTO ************************************** */
	@WebMethod
	@WebResult
	InserisciAmmortamentoMassivoCespiteResponse inserisciAmmortamentoMassivoCespite(@WebParam InserisciAmmortamentoMassivoCespite parameters);
	
	@WebMethod
	@WebResult
	AsyncServiceResponse inserisciAmmortamentoMassivoCespiteAsync(@WebParam AsyncServiceRequestWrapper<InserisciAmmortamentoMassivoCespite> parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaDettaglioAmmortamentoAnnuoCespiteResponse ricercaSinteticaDettaglioAmmortamentoAnnuoCespite(@WebParam RicercaSinteticaDettaglioAmmortamentoAnnuoCespite parameters); 
	
	@WebMethod
	@WebResult
	RicercaSinteticaDettaglioAnteprimaAmmortamentoAnnuoCespiteResponse ricercaSinteticaDettaglioAnteprimaAmmortamentoAnnuoCespite(@WebParam RicercaSinteticaDettaglioAnteprimaAmmortamentoAnnuoCespite parameters); 
	
	@WebMethod
	@WebResult
	InserisciAnteprimaAmmortamentoAnnuoCespiteResponse inserisciAnteprimaAmmortamentoAnnuoCespite(@WebParam InserisciAnteprimaAmmortamentoAnnuoCespite parameters);
	
	@WebMethod
	@WebResult
	InserisciPrimeNoteAmmortamentoAnnuoCespiteResponse inserisciPrimeNoteAmmortamentoAnnuoCespite(@WebParam InserisciPrimeNoteAmmortamentoAnnuoCespite parameters);
	
	@WebMethod
	@WebResult
	AsyncServiceResponse inserisciPrimeNoteAmmortamentoAnnuoCespiteAsync(@WebParam AsyncServiceRequestWrapper<InserisciPrimeNoteAmmortamentoAnnuoCespite> parameters);
	
	@WebMethod
	@WebResult
	RicercaSinteticaScrittureRegistroAByCespiteResponse ricercaSinteticaScrittureRegistroAByCespite(@WebParam RicercaSinteticaScrittureRegistroAByCespite parameters);
	
	/* ************ REGISTRO A ************ */
	@WebMethod
	@WebResult
	RicercaSinteticaRegistroACespiteResponse ricercaSinteticaRegistroACespite(@WebParam RicercaSinteticaRegistroACespite parameters);
}
