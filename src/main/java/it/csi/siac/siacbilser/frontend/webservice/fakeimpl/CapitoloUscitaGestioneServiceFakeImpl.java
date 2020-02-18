/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.CapitoloUscitaGestioneService;
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
 * Implementazione di default del servizio BIL.CapitoloUscitaGestioneService
 * 
 * @author rmontuori
 * 
 */
public class CapitoloUscitaGestioneServiceFakeImpl implements
		CapitoloUscitaGestioneService {

	@Override
	public InserisceCapitoloDiUscitaGestioneResponse inserisceCapitoloDiUscitaGestione(InserisceCapitoloDiUscitaGestione parameters) {
		return new InserisceCapitoloDiUscitaGestioneResponse();
	}

	@Override
	public RicercaPuntualeCapitoloUscitaGestioneResponse ricercaPuntualeCapitoloUscitaGestione(RicercaPuntualeCapitoloUscitaGestione parameters) {
		return new RicercaPuntualeCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaSinteticaCapitoloUscitaGestioneResponse ricercaSinteticaCapitoloUscitaGestione(RicercaSinteticaCapitoloUscitaGestione parameters) {
		return new RicercaSinteticaCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaDettaglioCapitoloUscitaGestioneResponse ricercaDettaglioCapitoloUscitaGestione(RicercaDettaglioCapitoloUscitaGestione parameters) {
		return new RicercaDettaglioCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaMovimentiCapitoloUscitaGestioneResponse ricercaMovimentiCapitoloUscitaGestione(RicercaMovimentiCapitoloUscitaGestione parameters) {
		return new RicercaMovimentiCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaImpegniCapitoloUscitaGestioneResponse ricercaImpegniCapitoloUscitaGestione(RicercaImpegniCapitoloUscitaGestione parameters) {
		return new RicercaImpegniCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaDocumentiCapitoloUscitaGestioneResponse ricercaDocumentiCapitoloUscitaGestione(RicercaDocumentiCapitoloUscitaGestione parameters) {
		return new RicercaDocumentiCapitoloUscitaGestioneResponse();
	}

	@Override 
	public AggiornaCapitoloDiUscitaGestioneResponse aggiornaCapitoloDiUscitaGestione(AggiornaCapitoloDiUscitaGestione parameters) {
		return new AggiornaCapitoloDiUscitaGestioneResponse();
	}

	@Override
	public VerificaAnnullabilitaCapitoloUscitaGestioneResponse verificaAnnullabilitaCapitoloUscitaGestione(VerificaAnnullabilitaCapitoloUscitaGestione parameters) {
		return new VerificaAnnullabilitaCapitoloUscitaGestioneResponse();
	}

	@Override
	public AnnullaCapitoloUscitaGestioneResponse annullaCapitoloUscitaGestione(AnnullaCapitoloUscitaGestione parameters) {
		return new AnnullaCapitoloUscitaGestioneResponse();
	}

	@Override
	public VerificaEliminabilitaCapitoloUscitaGestioneResponse verificaEliminabilitaCapitoloUscitaGestione(VerificaEliminabilitaCapitoloUscitaGestione parameters) {
		return new VerificaEliminabilitaCapitoloUscitaGestioneResponse();
	}

	@Override
	public EliminaCapitoloUscitaGestioneResponse eliminaCapitoloUscitaGestione(EliminaCapitoloUscitaGestione parameters) {
		return new EliminaCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaVariazioniCapitoloUscitaGestioneResponse ricercaVariazioniCapitoloUscitaGestione(RicercaVariazioniCapitoloUscitaGestione parameters) {
		return new RicercaVariazioniCapitoloUscitaGestioneResponse();
	}

	@Override
	public AggiornaMassivoCapitoloDiUscitaGestioneResponse aggiornaMassivoCapitoloDiUscitaGestione(AggiornaMassivoCapitoloDiUscitaGestione parameters) {
		return new AggiornaMassivoCapitoloDiUscitaGestioneResponse();
	}

	@Override
	public RicercaSinteticaMassivaCapitoloUscitaGestioneResponse ricercaSinteticaMassivaCapitoloUscitaGestione(RicercaSinteticaMassivaCapitoloUscitaGestione parameters) {
		return new RicercaSinteticaMassivaCapitoloUscitaGestioneResponse();
	}

	@Override
	public
	RicercaDettaglioMassivaCapitoloUscitaGestioneResponse ricercaDettaglioMassivaCapitoloUscitaGestione(RicercaDettaglioMassivaCapitoloUscitaGestione parameters) {
		return new RicercaDettaglioMassivaCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaDettaglioModulareCapitoloUscitaGestioneResponse ricercaDettaglioModulareCapitoloUscitaGestione(RicercaDettaglioModulareCapitoloUscitaGestione parameters) {
		return new RicercaDettaglioModulareCapitoloUscitaGestioneResponse();
	}

	@Override
	public RicercaDisponibilitaCapitoloUscitaGestioneResponse ricercaDisponibilitaCapitoloUscitaGestione(RicercaDisponibilitaCapitoloUscitaGestione parameters) {
		return new RicercaDisponibilitaCapitoloUscitaGestioneResponse();
	}

}
