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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaAccertamentiCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaAccertamentiCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDisponibilitaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDisponibilitaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDocumentiCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDocumentiCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloEntrataGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloEntrataGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloEntrataGestioneResponse;

/**
 * SI del servizio Gestione CAPITOLO ENTRATA GESTIONE
 * 
 * @author rmontuori
 * @version $Id: $
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "CapitoloEntrataGestioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CapitoloEntrataGestioneService {

	/**
	 * Inserimento del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCapitoloDiEntrataGestioneResponse inserisceCapitoloDiEntrataGestione(@WebParam InserisceCapitoloDiEntrataGestione parameters);

	/**
	 * Aggiornamento del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCapitoloDiEntrataGestioneResponse aggiornaCapitoloDiEntrataGestione(@WebParam AggiornaCapitoloDiEntrataGestione parameters);
	
	/**
	 * Aggiornamento massivo dei capitoli di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaMassivoCapitoloDiEntrataGestioneResponse aggiornaMassivoCapitoloDiEntrataGestione(@WebParam AggiornaMassivoCapitoloDiEntrataGestione parameters);
	
	/**
	 * Ricerca puntuale (per chiave logica) del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeCapitoloEntrataGestioneResponse ricercaPuntualeCapitoloEntrataGestione(@WebParam RicercaPuntualeCapitoloEntrataGestione parameters);

	/**
	 * Ricerca sintetica paginata del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCapitoloEntrataGestioneResponse ricercaSinteticaCapitoloEntrataGestione(@WebParam RicercaSinteticaCapitoloEntrataGestione parameters);
	
	/**
	 * Ricerca sintetica massiva del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaMassivaCapitoloEntrataGestioneResponse ricercaSinteticaMassivaCapitoloEntrataGestione(@WebParam RicercaSinteticaMassivaCapitoloEntrataGestione parameters);

	/**
	 * Ricerca di dettaglio del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCapitoloEntrataGestioneResponse ricercaDettaglioCapitoloEntrataGestione(@WebParam RicercaDettaglioCapitoloEntrataGestione parameters);

	/**
	 * Ricerca degli accertamento afferenti al capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaAccertamentiCapitoloEntrataGestioneResponse ricercaAccertamentiCapitoloEntrataGestione(
			@WebParam RicercaAccertamentiCapitoloEntrataGestione parameters);

	/**
	 * Ricerca dei documenti afferenti al capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDocumentiCapitoloEntrataGestioneResponse ricercaDocumentiCapitoloEntrataGestione(@WebParam RicercaDocumentiCapitoloEntrataGestione parameters);

	/**
	 * Ricerca dei movimenti del capitolo di entrata gestine
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare i servizi separati {@link #ricercaAccertamentiCapitoloEntrataGestione(RicercaAccertamentiCapitoloEntrataGestione)},
	 *             {@link #ricercaDocumentiCapitoloEntrataGestione(RicercaDocumentiCapitoloEntrataGestione)}
	 */
	@WebMethod
	@Deprecated
	@WebResult
	RicercaMovimentiCapitoloEntrataGestioneResponse ricercaMovimentiCapitoloEntrataGestione(@WebParam RicercaMovimentiCapitoloEntrataGestione parameters);
	
	/**
	 * Verifica l'annillabilit&agrave; del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaAnnullabilitaCapitoloEntrataGestioneResponse verificaAnnullabilitaCapitoloEntrataGestione(@WebParam VerificaAnnullabilitaCapitoloEntrataGestione parameters);
	
	
	/**
	 * Annullamento del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCapitoloEntrataGestioneResponse annullaCapitoloEntrataGestione(@WebParam AnnullaCapitoloEntrataGestione parameters);
	
	/**
	 * Verifica dell'eliminabilit&agrave; del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaEliminabilitaCapitoloEntrataGestioneResponse verificaEliminabilitaCapitoloEntrataGestione(@WebParam VerificaEliminabilitaCapitoloEntrataGestione parameters);

	/**
	 * Eliminazione del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaCapitoloEntrataGestioneResponse eliminaCapitoloEntrataGestione(@WebParam EliminaCapitoloEntrataGestione parameters);

	/**
	 * Ricerca delle variazioni afferenti al capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated non richiamare
	 */
	@Deprecated
	@WebMethod
	@WebResult
	RicercaVariazioniCapitoloEntrataGestioneResponse ricercaVariazioniCapitoloEntrataGestione(@WebParam RicercaVariazioniCapitoloEntrataGestione parameters);

	/**
	 * Ricerca di dettaglio massiva del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioMassivaCapitoloEntrataGestioneResponse ricercaDettaglioMassivaCapitoloEntrataGestione(@WebParam RicercaDettaglioMassivaCapitoloEntrataGestione parameters);
	/**
	 * Ricerca di dettaglo modulare del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioModulareCapitoloEntrataGestioneResponse ricercaDettaglioModulareCapitoloEntrataGestione(@WebParam RicercaDettaglioModulareCapitoloEntrataGestione parameters);
	
	/**
	 * Ricerca della disponibilit&agrave; del capitolo di entrata gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDisponibilitaCapitoloEntrataGestioneResponse ricercaDisponibilitaCapitoloEntrataGestione(@WebParam RicercaDisponibilitaCapitoloEntrataGestione parameters);

}
