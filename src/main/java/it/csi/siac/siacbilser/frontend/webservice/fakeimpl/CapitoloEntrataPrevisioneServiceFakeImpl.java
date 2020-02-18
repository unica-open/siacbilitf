/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.CapitoloEntrataPrevisioneService;
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
 * Implementazione di default del servizio BIL.CapitoloEntrataPrevisioneService
 * 
 * @author rmontuori
 * 
 */
// @WebService(serviceName = "CapitoloEntrataPrevisioneService",
// portName = "CapitoloEntrataPrevisioneServicePort",
// targetNamespace = BILSvcDictionary.NAMESPACE,
// endpointInterface =
// "it.csi.siac.siacbilser.frontend.webservice.CapitoloEntrataPrevisioneService")
public class CapitoloEntrataPrevisioneServiceFakeImpl implements
		CapitoloEntrataPrevisioneService {

	@Override
	public InserisceCapitoloDiEntrataPrevisioneResponse inserisceCapitoloDiEntrataPrevisione(InserisceCapitoloDiEntrataPrevisione parameters) {
		return new InserisceCapitoloDiEntrataPrevisioneResponse();
	}

	@Override
	public AggiornaCapitoloDiEntrataPrevisioneResponse aggiornaCapitoloDiEntrataPrevisione(AggiornaCapitoloDiEntrataPrevisione parameters) {
		return new AggiornaCapitoloDiEntrataPrevisioneResponse();
	}

	@Override
	public RicercaPuntualeCapitoloEntrataPrevisioneResponse ricercaPuntualeCapitoloEntrataPrevisione(RicercaPuntualeCapitoloEntrataPrevisione parameters) {
		return new RicercaPuntualeCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaSinteticaCapitoloEntrataPrevisioneResponse ricercaSinteticaCapitoloEntrataPrevisione(RicercaSinteticaCapitoloEntrataPrevisione parameters) {
		return new RicercaSinteticaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaDettaglioCapitoloEntrataPrevisioneResponse ricercaDettaglioCapitoloEntrataPrevisione(RicercaDettaglioCapitoloEntrataPrevisione parameters) {
		return new RicercaDettaglioCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaMovimentiCapitoloEntrataPrevisioneResponse ricercaMovimentiCapitoloEntrataPrevisione(RicercaMovimentiCapitoloEntrataPrevisione parameters) {
		return new RicercaMovimentiCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaPuntualeMovimentiCapitoloEntrataPrevisioneResponse ricercaPuntualeMovimentiCapitoloEntrataPrevisione(RicercaPuntualeMovimentiCapitoloEntrataPrevisione parameters) {
		return new RicercaPuntualeMovimentiCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public VerificaAnnullabilitaCapitoloEntrataPrevisioneResponse verificaAnnullabilitaCapitoloEntrataPrevisione(VerificaAnnullabilitaCapitoloEntrataPrevisione parameters) {
		return new VerificaAnnullabilitaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public AnnullaCapitoloEntrataPrevisioneResponse annullaCapitoloEntrataPrevisione(AnnullaCapitoloEntrataPrevisione parameters) {
		return new AnnullaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public VerificaEliminabilitaCapitoloEntrataPrevisioneResponse verificaEliminabilitaCapitoloEntrataPrevisione(VerificaEliminabilitaCapitoloEntrataPrevisione parameters) {
		return new VerificaEliminabilitaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public EliminaCapitoloEntrataPrevisioneResponse eliminaCapitoloEntrataPrevisione(EliminaCapitoloEntrataPrevisione parameters) {
		return new EliminaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaVariazioniCapitoloEntrataPrevisioneResponse ricercaVariazioniCapitoloEntrataPrevisione(RicercaVariazioniCapitoloEntrataPrevisione parameters) {
		return new RicercaVariazioniCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public AggiornaMassivoCapitoloDiEntrataPrevisioneResponse aggiornaMassivoCapitoloDiEntrataPrevisione(AggiornaMassivoCapitoloDiEntrataPrevisione parameters) {
		return new AggiornaMassivoCapitoloDiEntrataPrevisioneResponse();
	}

	@Override
	public RicercaSinteticaMassivaCapitoloEntrataPrevisioneResponse ricercaSinteticaMassivaCapitoloEntrataPrevisione(RicercaSinteticaMassivaCapitoloEntrataPrevisione parameters) {
		return new RicercaSinteticaMassivaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaDettaglioMassivaCapitoloEntrataPrevisioneResponse ricercaDettaglioMassivaCapitoloEntrataPrevisione(RicercaDettaglioMassivaCapitoloEntrataPrevisione parameters) {
		return new RicercaDettaglioMassivaCapitoloEntrataPrevisioneResponse();
	}

	@Override
	public RicercaDettaglioModulareCapitoloEntrataPrevisioneResponse ricercaDettaglioModulareCapitoloEntrataPrevisione(RicercaDettaglioModulareCapitoloEntrataPrevisione parameters) {
		return new RicercaDettaglioModulareCapitoloEntrataPrevisioneResponse();
	}

}
