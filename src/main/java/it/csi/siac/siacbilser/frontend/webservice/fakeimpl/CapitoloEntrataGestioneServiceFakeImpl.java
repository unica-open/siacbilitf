/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.CapitoloEntrataGestioneService;
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
 * Implementazione di default del servizio BIL.CapitoloEntrataPrevisioneService
 * 
 * @author rmontuori
 * 
 */
public class CapitoloEntrataGestioneServiceFakeImpl implements
		CapitoloEntrataGestioneService {

	@Override
	public InserisceCapitoloDiEntrataGestioneResponse inserisceCapitoloDiEntrataGestione(InserisceCapitoloDiEntrataGestione parameters) {
		return new InserisceCapitoloDiEntrataGestioneResponse();
	}

	@Override
	public RicercaPuntualeCapitoloEntrataGestioneResponse ricercaPuntualeCapitoloEntrataGestione(RicercaPuntualeCapitoloEntrataGestione parameters) {
		return new RicercaPuntualeCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaSinteticaCapitoloEntrataGestioneResponse ricercaSinteticaCapitoloEntrataGestione(RicercaSinteticaCapitoloEntrataGestione parameters) {
		return new RicercaSinteticaCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaDettaglioCapitoloEntrataGestioneResponse ricercaDettaglioCapitoloEntrataGestione(RicercaDettaglioCapitoloEntrataGestione parameters) {
		return new RicercaDettaglioCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaMovimentiCapitoloEntrataGestioneResponse ricercaMovimentiCapitoloEntrataGestione(RicercaMovimentiCapitoloEntrataGestione parameters) {
		return new RicercaMovimentiCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaAccertamentiCapitoloEntrataGestioneResponse ricercaAccertamentiCapitoloEntrataGestione(RicercaAccertamentiCapitoloEntrataGestione parameters) {
		return new RicercaAccertamentiCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaDocumentiCapitoloEntrataGestioneResponse ricercaDocumentiCapitoloEntrataGestione(RicercaDocumentiCapitoloEntrataGestione parameters) {
		return new RicercaDocumentiCapitoloEntrataGestioneResponse();
	}

	@Override
	public AggiornaCapitoloDiEntrataGestioneResponse aggiornaCapitoloDiEntrataGestione(AggiornaCapitoloDiEntrataGestione parameters) {
		return new AggiornaCapitoloDiEntrataGestioneResponse();
	}

	@Override
	public 
	VerificaAnnullabilitaCapitoloEntrataGestioneResponse verificaAnnullabilitaCapitoloEntrataGestione(VerificaAnnullabilitaCapitoloEntrataGestione parameters) {
		return new VerificaAnnullabilitaCapitoloEntrataGestioneResponse();
	}

	@Override
	public 
	AnnullaCapitoloEntrataGestioneResponse annullaCapitoloEntrataGestione(AnnullaCapitoloEntrataGestione parameters) {
		return new AnnullaCapitoloEntrataGestioneResponse();
	}

	@Override
	public VerificaEliminabilitaCapitoloEntrataGestioneResponse verificaEliminabilitaCapitoloEntrataGestione(VerificaEliminabilitaCapitoloEntrataGestione parameters) {
		return new VerificaEliminabilitaCapitoloEntrataGestioneResponse();
	}

	@Override
	public EliminaCapitoloEntrataGestioneResponse eliminaCapitoloEntrataGestione(EliminaCapitoloEntrataGestione parameters) {
		return new EliminaCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaVariazioniCapitoloEntrataGestioneResponse ricercaVariazioniCapitoloEntrataGestione(RicercaVariazioniCapitoloEntrataGestione parameters) {
		return new RicercaVariazioniCapitoloEntrataGestioneResponse();
	}

	@Override
	public AggiornaMassivoCapitoloDiEntrataGestioneResponse aggiornaMassivoCapitoloDiEntrataGestione(AggiornaMassivoCapitoloDiEntrataGestione parameters) {
		return new AggiornaMassivoCapitoloDiEntrataGestioneResponse();
	}

	@Override
	public RicercaSinteticaMassivaCapitoloEntrataGestioneResponse ricercaSinteticaMassivaCapitoloEntrataGestione(RicercaSinteticaMassivaCapitoloEntrataGestione parameters) {
		return new RicercaSinteticaMassivaCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaDettaglioMassivaCapitoloEntrataGestioneResponse ricercaDettaglioMassivaCapitoloEntrataGestione(RicercaDettaglioMassivaCapitoloEntrataGestione parameters) {
		return new RicercaDettaglioMassivaCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaDettaglioModulareCapitoloEntrataGestioneResponse ricercaDettaglioModulareCapitoloEntrataGestione(RicercaDettaglioModulareCapitoloEntrataGestione parameters) {
		return new RicercaDettaglioModulareCapitoloEntrataGestioneResponse();
	}

	@Override
	public RicercaDisponibilitaCapitoloEntrataGestioneResponse ricercaDisponibilitaCapitoloEntrataGestione(RicercaDisponibilitaCapitoloEntrataGestione parameters) {
		return new RicercaDisponibilitaCapitoloEntrataGestioneResponse();
	}

}
