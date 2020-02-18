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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeMovimentiCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeMovimentiCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloEntrataPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloEntrataPrevisioneResponse;

/**
 * SI del servizio Gestione CAPITOLO ENTRATA PREVISIONE
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "CapitoloEntrataPrevisioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CapitoloEntrataPrevisioneService {

	/**
	 * Inserimento del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCapitoloDiEntrataPrevisioneResponse inserisceCapitoloDiEntrataPrevisione(@WebParam InserisceCapitoloDiEntrataPrevisione parameters);

	/**
	 * Aggiornamento del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCapitoloDiEntrataPrevisioneResponse aggiornaCapitoloDiEntrataPrevisione(@WebParam AggiornaCapitoloDiEntrataPrevisione parameters);
	
	/**
	 * Aggiornamento massivo del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaMassivoCapitoloDiEntrataPrevisioneResponse aggiornaMassivoCapitoloDiEntrataPrevisione(@WebParam AggiornaMassivoCapitoloDiEntrataPrevisione parameters);

	/**
	 * Ricerca puntuale (per chiave logica) del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeCapitoloEntrataPrevisioneResponse ricercaPuntualeCapitoloEntrataPrevisione(@WebParam RicercaPuntualeCapitoloEntrataPrevisione parameters);

	/**
	 * Ricerca sintetica paginata del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCapitoloEntrataPrevisioneResponse ricercaSinteticaCapitoloEntrataPrevisione(@WebParam RicercaSinteticaCapitoloEntrataPrevisione parameters);
	
	/**
	 * Ricerca sintetica paginata massiva del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaMassivaCapitoloEntrataPrevisioneResponse ricercaSinteticaMassivaCapitoloEntrataPrevisione(@WebParam RicercaSinteticaMassivaCapitoloEntrataPrevisione parameters);

	/**
	 * Ricerca di dettaglio del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCapitoloEntrataPrevisioneResponse ricercaDettaglioCapitoloEntrataPrevisione(@WebParam RicercaDettaglioCapitoloEntrataPrevisione parameters);

	/**
	 * Ricerca dei movimenti afferenti il capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare il serivizio {@link #ricercaPuntualeMovimentiCapitoloEntrataPrevisione(RicercaPuntualeMovimentiCapitoloEntrataPrevisione)}
	 */
	@WebMethod
	@Deprecated
	@WebResult
	RicercaMovimentiCapitoloEntrataPrevisioneResponse ricercaMovimentiCapitoloEntrataPrevisione(@WebParam RicercaMovimentiCapitoloEntrataPrevisione parameters);
	
	/**
	 * Ricerca puntuale dei movimenti del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeMovimentiCapitoloEntrataPrevisioneResponse ricercaPuntualeMovimentiCapitoloEntrataPrevisione(@WebParam RicercaPuntualeMovimentiCapitoloEntrataPrevisione parameters);
	
	/**
	 * Verifica l'annullabilit&agrave; del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaAnnullabilitaCapitoloEntrataPrevisioneResponse verificaAnnullabilitaCapitoloEntrataPrevisione(@WebParam VerificaAnnullabilitaCapitoloEntrataPrevisione parameters);
	
	
	/**
	 * Annullamento del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCapitoloEntrataPrevisioneResponse annullaCapitoloEntrataPrevisione(@WebParam AnnullaCapitoloEntrataPrevisione parameters);
	
	/**
	 * Verifica dell'eliminabilit&agrave; del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaEliminabilitaCapitoloEntrataPrevisioneResponse verificaEliminabilitaCapitoloEntrataPrevisione(@WebParam VerificaEliminabilitaCapitoloEntrataPrevisione parameters);

	/**
	 * Eliminazione del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaCapitoloEntrataPrevisioneResponse eliminaCapitoloEntrataPrevisione(@WebParam EliminaCapitoloEntrataPrevisione parameters);
	
	/**
	 * Ricerca delle variazioni afferenti al capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated non utilizzare
	 */
	@Deprecated
	@WebMethod
	@WebResult
	RicercaVariazioniCapitoloEntrataPrevisioneResponse ricercaVariazioniCapitoloEntrataPrevisione(@WebParam RicercaVariazioniCapitoloEntrataPrevisione parameters);

	/**
	 * Ricerca di dettaglio massiva del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioMassivaCapitoloEntrataPrevisioneResponse ricercaDettaglioMassivaCapitoloEntrataPrevisione(@WebParam RicercaDettaglioMassivaCapitoloEntrataPrevisione parameters);
	
	/**
	 * Ricerca di dettaglio modulare del capitolo di entrata previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioModulareCapitoloEntrataPrevisioneResponse ricercaDettaglioModulareCapitoloEntrataPrevisione(@WebParam RicercaDettaglioModulareCapitoloEntrataPrevisione parameters);
}
