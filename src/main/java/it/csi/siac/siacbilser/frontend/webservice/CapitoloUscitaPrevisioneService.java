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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeMovimentiCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeMovimentiCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloUscitaPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloUscitaPrevisioneResponse;

/**
 * SI del servizio Gestione CAPITOLO USCITA PREVISIONE
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "CapitoloUscitaPrevisioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CapitoloUscitaPrevisioneService {

	
	/**
	 * Inserimento del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCapitoloDiUscitaPrevisioneResponse inserisceCapitoloDiUscitaPrevisione(@WebParam InserisceCapitoloDiUscitaPrevisione parameters);

	/**
	 * Aggiornamento del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCapitoloDiUscitaPrevisioneResponse aggiornaCapitoloDiUscitaPrevisione(@WebParam AggiornaCapitoloDiUscitaPrevisione parameters);
	/**
	 * Aggiornamento massivo del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaMassivoCapitoloDiUscitaPrevisioneResponse aggiornaMassivoCapitoloDiUscitaPrevisione(@WebParam AggiornaMassivoCapitoloDiUscitaPrevisione parameters);

	/**
	 * Ricerca puntuale del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeCapitoloUscitaPrevisioneResponse ricercaPuntualeCapitoloUscitaPrevisione(@WebParam RicercaPuntualeCapitoloUscitaPrevisione parameters);

	/**
	 * Ricerca sintetica paginata del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCapitoloUscitaPrevisioneResponse ricercaSinteticaCapitoloUscitaPrevisione(@WebParam RicercaSinteticaCapitoloUscitaPrevisione parameters);
	
	/**
	 * Ricerca sintetica paginata massiva del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaMassivaCapitoloUscitaPrevisioneResponse ricercaSinteticaMassivaCapitoloUscitaPrevisione(@WebParam RicercaSinteticaMassivaCapitoloUscitaPrevisione parameters);
	
	/**
	 * Ricerca di dettaglio massiva del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioMassivaCapitoloUscitaPrevisioneResponse ricercaDettaglioMassivaCapitoloUscitaPrevisione(@WebParam RicercaDettaglioMassivaCapitoloUscitaPrevisione parameters);

	/**
	 * Ricerca di dettaglio del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCapitoloUscitaPrevisioneResponse ricercaDettaglioCapitoloUscitaPrevisione(@WebParam RicercaDettaglioCapitoloUscitaPrevisione parameters);

	/**
	 * Ricerca dei movimenti afferenti al capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare il servizio condiviso
	 */
	@WebMethod
	@Deprecated
	@WebResult
	RicercaMovimentiCapitoloUscitaPrevisioneResponse ricercaMovimentiCapitoloUscitaPrevisione(@WebParam RicercaMovimentiCapitoloUscitaPrevisione parameters);
	

	/**
	 * Ricerca puntuale dei movimenti afferenti al capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeMovimentiCapitoloUscitaPrevisioneResponse ricercaPuntualeMovimentiCapitoloUscitaPrevisione(@WebParam RicercaPuntualeMovimentiCapitoloUscitaPrevisione parameters);

	/**
	 * Verifica dell'annullabilit&agrave; del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaAnnullabilitaCapitoloUscitaPrevisioneResponse verificaAnnullabilitaCapitoloUscitaPrevisione(@WebParam VerificaAnnullabilitaCapitoloUscitaPrevisione parameters);
	
	
	/**
	 * Annullamento del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCapitoloUscitaPrevisioneResponse annullaCapitoloUscitaPrevisione(@WebParam AnnullaCapitoloUscitaPrevisione parameters);
	
	/**
	 * Verifica dell'eliminabilit&agrave; del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaEliminabilitaCapitoloUscitaPrevisioneResponse verificaEliminabilitaCapitoloUscitaPrevisione(@WebParam VerificaEliminabilitaCapitoloUscitaPrevisione parameters);

	/**
	 * Eliminazione del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaCapitoloUscitaPrevisioneResponse eliminaCapitoloUscitaPrevisione(@WebParam EliminaCapitoloUscitaPrevisione parameters);
	
	/**
	 * Ricerca delle variazioni del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare il servizio condiviso
	 */
	@Deprecated
	@WebMethod
	@WebResult
	RicercaVariazioniCapitoloUscitaPrevisioneResponse ricercaVariazioniCapitoloUscitaPrevisione(@WebParam RicercaVariazioniCapitoloUscitaPrevisione parameters);
	
	/**
	 * Ricerca di dettaglio modulare del capitolo di uscita previsione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioModulareCapitoloUscitaPrevisioneResponse ricercaDettaglioModulareCapitoloUscitaPrevisione(@WebParam RicercaDettaglioModulareCapitoloUscitaPrevisione parameters);
}
