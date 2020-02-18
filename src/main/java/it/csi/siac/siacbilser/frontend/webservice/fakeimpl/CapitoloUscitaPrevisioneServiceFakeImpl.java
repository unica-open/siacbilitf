/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.CapitoloUscitaPrevisioneService;
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
 * Implementazione di default del servizio BIL.CapitoloUscitaPrevisioneService
 * 
 * @author rmontuori
 * 
 */
// @WebService(serviceName = "CapitoloUscitaPrevisioneService",
// portName = "CapitoloUscitaPrevisioneServicePort",
// targetNamespace = BILSvcDictionary.NAMESPACE,
// endpointInterface =
// "it.csi.siac.siacbilser.frontend.webservice.CapitoloUscitaPrevisioneService")
public class CapitoloUscitaPrevisioneServiceFakeImpl implements
		CapitoloUscitaPrevisioneService {

	@Override
	public InserisceCapitoloDiUscitaPrevisioneResponse inserisceCapitoloDiUscitaPrevisione(InserisceCapitoloDiUscitaPrevisione parameters) {
		return new InserisceCapitoloDiUscitaPrevisioneResponse();
	}

	@Override
	public AggiornaCapitoloDiUscitaPrevisioneResponse aggiornaCapitoloDiUscitaPrevisione(AggiornaCapitoloDiUscitaPrevisione parameters) {
		return new AggiornaCapitoloDiUscitaPrevisioneResponse();
	}

	@Override
	public RicercaPuntualeCapitoloUscitaPrevisioneResponse ricercaPuntualeCapitoloUscitaPrevisione(RicercaPuntualeCapitoloUscitaPrevisione parameters) {
		return new RicercaPuntualeCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaSinteticaCapitoloUscitaPrevisioneResponse ricercaSinteticaCapitoloUscitaPrevisione(RicercaSinteticaCapitoloUscitaPrevisione parameters) {
		return new RicercaSinteticaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaDettaglioCapitoloUscitaPrevisioneResponse ricercaDettaglioCapitoloUscitaPrevisione(RicercaDettaglioCapitoloUscitaPrevisione parameters) {
		return new RicercaDettaglioCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaMovimentiCapitoloUscitaPrevisioneResponse ricercaMovimentiCapitoloUscitaPrevisione(RicercaMovimentiCapitoloUscitaPrevisione parameters) {
		return new RicercaMovimentiCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaPuntualeMovimentiCapitoloUscitaPrevisioneResponse ricercaPuntualeMovimentiCapitoloUscitaPrevisione(RicercaPuntualeMovimentiCapitoloUscitaPrevisione parameters) {
		return new RicercaPuntualeMovimentiCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public VerificaAnnullabilitaCapitoloUscitaPrevisioneResponse verificaAnnullabilitaCapitoloUscitaPrevisione(VerificaAnnullabilitaCapitoloUscitaPrevisione parameters) {
		return new VerificaAnnullabilitaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public AnnullaCapitoloUscitaPrevisioneResponse annullaCapitoloUscitaPrevisione(AnnullaCapitoloUscitaPrevisione parameters) {
		return new AnnullaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public VerificaEliminabilitaCapitoloUscitaPrevisioneResponse verificaEliminabilitaCapitoloUscitaPrevisione(VerificaEliminabilitaCapitoloUscitaPrevisione parameters) {
		return new VerificaEliminabilitaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public EliminaCapitoloUscitaPrevisioneResponse eliminaCapitoloUscitaPrevisione(EliminaCapitoloUscitaPrevisione parameters) {
		return new EliminaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaVariazioniCapitoloUscitaPrevisioneResponse ricercaVariazioniCapitoloUscitaPrevisione(RicercaVariazioniCapitoloUscitaPrevisione parameters) {
		return new RicercaVariazioniCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public AggiornaMassivoCapitoloDiUscitaPrevisioneResponse aggiornaMassivoCapitoloDiUscitaPrevisione(AggiornaMassivoCapitoloDiUscitaPrevisione parameters) {
		return new AggiornaMassivoCapitoloDiUscitaPrevisioneResponse();
	}

	@Override
	public RicercaSinteticaMassivaCapitoloUscitaPrevisioneResponse ricercaSinteticaMassivaCapitoloUscitaPrevisione(RicercaSinteticaMassivaCapitoloUscitaPrevisione parameters) {
		return new RicercaSinteticaMassivaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaDettaglioMassivaCapitoloUscitaPrevisioneResponse ricercaDettaglioMassivaCapitoloUscitaPrevisione(RicercaDettaglioMassivaCapitoloUscitaPrevisione parameters) {
		return new RicercaDettaglioMassivaCapitoloUscitaPrevisioneResponse();
	}

	@Override
	public RicercaDettaglioModulareCapitoloUscitaPrevisioneResponse ricercaDettaglioModulareCapitoloUscitaPrevisione(RicercaDettaglioModulareCapitoloUscitaPrevisione parameters) {
		return new RicercaDettaglioModulareCapitoloUscitaPrevisioneResponse();
	}

}
