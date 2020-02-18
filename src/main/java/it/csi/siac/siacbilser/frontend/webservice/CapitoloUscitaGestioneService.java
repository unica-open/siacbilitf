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

import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaCapitoloDiUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaMassivoCapitoloDiUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.EliminaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCapitoloDiUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioMassivaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioModulareCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDisponibilitaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDisponibilitaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDocumentiCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDocumentiCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaImpegniCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaImpegniCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaMovimentiCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaMassivaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaAnnullabilitaCapitoloUscitaGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloUscitaGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.VerificaEliminabilitaCapitoloUscitaGestioneResponse;

/**
 * SI del servizio Gestione CAPITOLO USCITA GESTIONE
 * 
 * @author rmontuori
 * 
 */
@WebService(targetNamespace = BILSvcDictionary.NAMESPACE, name = "CapitoloUscitaGestioneService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface CapitoloUscitaGestioneService {

	/**
	 * Inserimento del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	InserisceCapitoloDiUscitaGestioneResponse inserisceCapitoloDiUscitaGestione(@WebParam InserisceCapitoloDiUscitaGestione parameters);
	/**
	 * Aggiornamento del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaCapitoloDiUscitaGestioneResponse aggiornaCapitoloDiUscitaGestione(@WebParam AggiornaCapitoloDiUscitaGestione parameters);
	/**
	 * Aggiornamento massivo del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AggiornaMassivoCapitoloDiUscitaGestioneResponse aggiornaMassivoCapitoloDiUscitaGestione(@WebParam AggiornaMassivoCapitoloDiUscitaGestione parameters);

	/**
	 * Ricerca puntuale (per chiave logica) del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaPuntualeCapitoloUscitaGestioneResponse ricercaPuntualeCapitoloUscitaGestione(@WebParam RicercaPuntualeCapitoloUscitaGestione parameters);

	/**
	 * Ricerca sintetica paginata del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaCapitoloUscitaGestioneResponse ricercaSinteticaCapitoloUscitaGestione(@WebParam RicercaSinteticaCapitoloUscitaGestione parameters);
	
	/**
	 * Ricerca sintetica paginata massiva del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaSinteticaMassivaCapitoloUscitaGestioneResponse ricercaSinteticaMassivaCapitoloUscitaGestione(@WebParam RicercaSinteticaMassivaCapitoloUscitaGestione parameters);

	/**
	 * Ricerca dei dettaglio del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioCapitoloUscitaGestioneResponse ricercaDettaglioCapitoloUscitaGestione(@WebParam RicercaDettaglioCapitoloUscitaGestione parameters);

	/**
	 * Ricerca dei movimenti del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare il servizio condiviso
	 */
	@WebMethod
	@Deprecated
	@WebResult
	RicercaMovimentiCapitoloUscitaGestioneResponse ricercaMovimentiCapitoloUscitaGestione(@WebParam RicercaMovimentiCapitoloUscitaGestione parameters);

	/**
	 * Ricerca degli impegni afferenti al capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaImpegniCapitoloUscitaGestioneResponse ricercaImpegniCapitoloUscitaGestione(@WebParam RicercaImpegniCapitoloUscitaGestione parameters);

	/**
	 * Ricerca dei documenti afferenti al capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDocumentiCapitoloUscitaGestioneResponse ricercaDocumentiCapitoloUscitaGestione(@WebParam RicercaDocumentiCapitoloUscitaGestione parameters);
	
	/**
	 * Verifica dell'annullabilit&agrave; del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaAnnullabilitaCapitoloUscitaGestioneResponse verificaAnnullabilitaCapitoloUscitaGestione(@WebParam VerificaAnnullabilitaCapitoloUscitaGestione parameters);
	
	
	/**
	 * Annullamento del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	AnnullaCapitoloUscitaGestioneResponse annullaCapitoloUscitaGestione(@WebParam AnnullaCapitoloUscitaGestione parameters);
	
	/**
	 * Verifica dell'eliminabili&agrave; del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	VerificaEliminabilitaCapitoloUscitaGestioneResponse verificaEliminabilitaCapitoloUscitaGestione(@WebParam VerificaEliminabilitaCapitoloUscitaGestione parameters);

	/**
	 * Eliminazione del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	EliminaCapitoloUscitaGestioneResponse eliminaCapitoloUscitaGestione(@WebParam EliminaCapitoloUscitaGestione parameters);
	
	/**
	 * Ricerca delle variazioni del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 * @deprecated utilizzare il servizio condiviso
	 */
	@Deprecated
	@WebMethod
	@WebResult
	RicercaVariazioniCapitoloUscitaGestioneResponse ricercaVariazioniCapitoloUscitaGestione(@WebParam RicercaVariazioniCapitoloUscitaGestione parameters);

	
	/**
	 * Ricerca di dettaglio massiva del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioMassivaCapitoloUscitaGestioneResponse ricercaDettaglioMassivaCapitoloUscitaGestione(@WebParam RicercaDettaglioMassivaCapitoloUscitaGestione parameters);
	
	/**
	 * Ricerca di dettaglio modulare del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDettaglioModulareCapitoloUscitaGestioneResponse ricercaDettaglioModulareCapitoloUscitaGestione(@WebParam RicercaDettaglioModulareCapitoloUscitaGestione parameters);
	
	/**
	 * Ricerca della disponibilit&agrave; del capitolo di uscita gestione
	 * @param parameters la request del servizio
	 * @return la response del servizio
	 */
	@WebMethod
	@WebResult
	RicercaDisponibilitaCapitoloUscitaGestioneResponse ricercaDisponibilitaCapitoloUscitaGestione(@WebParam RicercaDisponibilitaCapitoloUscitaGestione parameters);
}
