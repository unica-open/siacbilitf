/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.PreDocumentoEntrataService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDataTrasmissionePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaDataTrasmissionePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoDiEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaDefiniscePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.CompletaDefiniscePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiCorrente;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiCorrenteResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoEntrataResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTotaliPreDocumentoEntrataPerStato;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaTotaliPreDocumentoEntrataPerStatoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoEntrata;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoEntrataResponse;

public class PreDocumentoEntrataServiceFakeImpl implements PreDocumentoEntrataService {

	@Override
	public InseriscePreDocumentoEntrataResponse inseriscePreDocumentoEntrata(InseriscePreDocumentoEntrata parameters) {
		return new InseriscePreDocumentoEntrataResponse();
	}

	@Override
	public ValidaStatoOperativoPreDocumentoEntrataResponse validaStatoOperativoPreDocumentoEntrata(ValidaStatoOperativoPreDocumentoEntrata parameters) {
		return new ValidaStatoOperativoPreDocumentoEntrataResponse();
	}

	@Override
	public RicercaPuntualePreDocumentoEntrataResponse ricercaPuntualePreDocumentoEntrata(RicercaPuntualePreDocumentoEntrata parameters) {
		return new RicercaPuntualePreDocumentoEntrataResponse();
	}

	@Override
	public RicercaSinteticaPreDocumentoEntrataResponse ricercaSinteticaPreDocumentoEntrata(RicercaSinteticaPreDocumentoEntrata parameters) {
		return new RicercaSinteticaPreDocumentoEntrataResponse();
	}

	@Override
	public RicercaDettaglioPreDocumentoEntrataResponse ricercaDettaglioPreDocumentoEntrata(RicercaDettaglioPreDocumentoEntrata parameters) {
		return new RicercaDettaglioPreDocumentoEntrataResponse();
	}

	@Override
	public AnnullaPreDocumentoEntrataResponse annullaPreDocumentoEntrata(AnnullaPreDocumentoEntrata parameters) {
		return new AnnullaPreDocumentoEntrataResponse();
	}

	@Override
	public void associaImputazioniContabiliPreDocumentoEntrata(AssociaImputazioniContabiliPreDocumentoEntrata parameters) {
		// One way
	}

	@Override
	public AggiornaPreDocumentoDiEntrataResponse aggiornaPreDocumentoDiEntrata(AggiornaPreDocumentoDiEntrata parameters) {
		return new AggiornaPreDocumentoDiEntrataResponse();
	}

	@Override
	public void definiscePreDocumentoDiEntrata(DefiniscePreDocumentoDiEntrata parameters) {
		// One way
	}

	@Override
	public InserisceCausaleEntrataResponse inserisceCausaleEntrata(InserisceCausaleEntrata parameters) {
		return new InserisceCausaleEntrataResponse();
	}

	@Override
	public AggiornaCausaleEntrataResponse aggiornaCausaleEntrata(AggiornaCausaleEntrata parameters) {
		return new AggiornaCausaleEntrataResponse();
	}

	@Override
	public AnnullaCausaleEntrataResponse annullaCausaleEntrata(AnnullaCausaleEntrata parameters) {
		return new AnnullaCausaleEntrataResponse();
	}

	@Override
	public RicercaDettaglioCausaleEntrataResponse ricercaDettaglioCausaleEntrata(RicercaDettaglioCausaleEntrata parameters) {
		return new RicercaDettaglioCausaleEntrataResponse();
	}

	@Override
	public RicercaSinteticaCausaleEntrataResponse ricercaSinteticaCausaleEntrata(RicercaSinteticaCausaleEntrata parameters) {
		return new RicercaSinteticaCausaleEntrataResponse();
	}

	@Override
	public LeggiTipiCausaleEntrataResponse leggiTipiCausaleEntrata(LeggiTipiCausaleEntrata parameters) {
		return new LeggiTipiCausaleEntrataResponse();
	}

	@Override
	public LeggiContiCorrenteResponse leggiContiCorrente(LeggiContiCorrente parameters) {
		return new LeggiContiCorrenteResponse();
	}

	@Override
	public AggiornaStatoPreDocumentoDiEntrataResponse aggiornaStatoPreDocumentoDiEntrata(AggiornaStatoPreDocumentoDiEntrata parameters) {
		return new AggiornaStatoPreDocumentoDiEntrataResponse();
	}

	@Override
	public DettaglioStoricoCausaleEntrataResponse dettaglioStoricoCausaleEntrata(DettaglioStoricoCausaleEntrata parameters) {
		return new DettaglioStoricoCausaleEntrataResponse();
	}

	@Override
	public AssociaImputazioniContabiliVariatePreDocumentoEntrataResponse associaImputazioniContabiliVariatePreDocumentoEntrata(AssociaImputazioniContabiliVariatePreDocumentoEntrata parameters) {
		return new AssociaImputazioniContabiliVariatePreDocumentoEntrataResponse();
	}

	@Override
	public AsyncServiceResponse associaImputazioniContabiliVariatePreDocumentoEntrataAsync(AsyncServiceRequestWrapper<AssociaImputazioniContabiliVariatePreDocumentoEntrata> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public AggiornaDataTrasmissionePreDocumentoEntrataResponse aggiornaDataTrasmissionePreDocumentoEntrata(AggiornaDataTrasmissionePreDocumentoEntrata parameters) {
		return new AggiornaDataTrasmissionePreDocumentoEntrataResponse();
	}

	@Override
	public AsyncServiceResponse aggiornaDataTrasmissionePreDocumentoEntrataAsync(AsyncServiceRequestWrapper<AggiornaDataTrasmissionePreDocumentoEntrata> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public DefiniscePreDocumentoEntrataResponse definiscePreDocumentoEntrata(DefiniscePreDocumentoEntrata parameters) {
		return new DefiniscePreDocumentoEntrataResponse();
	}

	@Override
	public AsyncServiceResponse definiscePreDocumentoEntrataAsync(AsyncServiceRequestWrapper<DefiniscePreDocumentoEntrata> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public CompletaDefiniscePreDocumentoEntrataResponse completaDefiniscePreDocumentoEntrata(CompletaDefiniscePreDocumentoEntrata parameters) {
		return new CompletaDefiniscePreDocumentoEntrataResponse();
	}

	@Override
	public AsyncServiceResponse completaDefiniscePreDocumentoEntrataAsync(AsyncServiceRequestWrapper<CompletaDefiniscePreDocumentoEntrata> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public RicercaTotaliPreDocumentoEntrataPerStatoResponse ricercaTotaliPreDocumentoEntrataPerStato(RicercaTotaliPreDocumentoEntrataPerStato parameters) {
		return new RicercaTotaliPreDocumentoEntrataPerStatoResponse();
	}

}
