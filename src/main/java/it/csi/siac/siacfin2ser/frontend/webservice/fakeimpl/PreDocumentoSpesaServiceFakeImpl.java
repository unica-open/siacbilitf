/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.fakeimpl;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequestWrapper;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.PreDocumentoSpesaService;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaPreDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AggiornaStatoPreDocumentoDiSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AnnullaPreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.AssociaImputazioniContabiliVariatePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoDiSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesaPerElenco;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesaPerElencoResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DefiniscePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.DettaglioStoricoCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InserisceCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.InseriscePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiTesoreria;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiContiTesoreriaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.LeggiTipiCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaDettaglioPreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaPuntualePreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaCausaleSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.RicercaSinteticaPreDocumentoSpesaResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoSpesa;
import it.csi.siac.siacfin2ser.frontend.webservice.msg.ValidaStatoOperativoPreDocumentoSpesaResponse;

public class PreDocumentoSpesaServiceFakeImpl implements PreDocumentoSpesaService {

	@Override
	public InseriscePreDocumentoSpesaResponse inseriscePreDocumentoSpesa( InseriscePreDocumentoSpesa parameters) {
		return new InseriscePreDocumentoSpesaResponse();
	}

	@Override
	public ValidaStatoOperativoPreDocumentoSpesaResponse validaStatoOperativoPreDocumentoSpesa(ValidaStatoOperativoPreDocumentoSpesa parameters) {
		return new ValidaStatoOperativoPreDocumentoSpesaResponse();
	}

	@Override
	public RicercaPuntualePreDocumentoSpesaResponse ricercaPuntualePreDocumentoSpesa(RicercaPuntualePreDocumentoSpesa parameters) {
		return new RicercaPuntualePreDocumentoSpesaResponse();
	}

	@Override
	public RicercaSinteticaPreDocumentoSpesaResponse ricercaSinteticaPreDocumentoSpesa(RicercaSinteticaPreDocumentoSpesa parameters) {
		return new RicercaSinteticaPreDocumentoSpesaResponse();
	}

	@Override
	public RicercaDettaglioPreDocumentoSpesaResponse ricercaDettaglioPreDocumentoSpesa(RicercaDettaglioPreDocumentoSpesa parameters) {
		return new RicercaDettaglioPreDocumentoSpesaResponse();
	}

	@Override
	public AnnullaPreDocumentoSpesaResponse annullaPreDocumentoSpesa(AnnullaPreDocumentoSpesa parameters) {
		return new AnnullaPreDocumentoSpesaResponse();
	}

	@Override
	public void associaImputazioniContabiliPreDocumentoSpesa(AssociaImputazioniContabiliPreDocumentoSpesa parameters) {
		// One way
	}

	@Override
	public AggiornaPreDocumentoDiSpesaResponse aggiornaPreDocumentoDiSpesa(AggiornaPreDocumentoDiSpesa parameters) {
		return new AggiornaPreDocumentoDiSpesaResponse();
	}

	@Override
	public void definiscePreDocumentoDiSpesa(DefiniscePreDocumentoDiSpesa parameters) {
		// One way
	}

	@Override
	public InserisceCausaleSpesaResponse inserisceCausaleSpesa(InserisceCausaleSpesa parameters) {
		return new InserisceCausaleSpesaResponse();
	}

	@Override
	public AggiornaCausaleSpesaResponse aggiornaCausaleSpesa(AggiornaCausaleSpesa parameters) {
		return new AggiornaCausaleSpesaResponse();
	}

	@Override
	public AnnullaCausaleSpesaResponse annullaCausaleSpesa(AnnullaCausaleSpesa parameters) {
		return new AnnullaCausaleSpesaResponse();
	}

	@Override
	public RicercaDettaglioCausaleSpesaResponse ricercaDettaglioCausaleSpesa(RicercaDettaglioCausaleSpesa parameters) {
		return new RicercaDettaglioCausaleSpesaResponse();
	}

	@Override
	public RicercaSinteticaCausaleSpesaResponse ricercaSinteticaCausaleSpesa(RicercaSinteticaCausaleSpesa parameters) {
		return new RicercaSinteticaCausaleSpesaResponse();
	}

	@Override
	public LeggiTipiCausaleSpesaResponse leggiTipiCausaleSpesa(LeggiTipiCausaleSpesa parameters) {
		return new LeggiTipiCausaleSpesaResponse();
	}

	@Override
	public LeggiContiTesoreriaResponse leggiContiTesoreria(LeggiContiTesoreria parameters) {
		return new LeggiContiTesoreriaResponse();
	}

	@Override
	public AggiornaStatoPreDocumentoDiSpesaResponse aggiornaStatoPreDocumentoDiSpesa(AggiornaStatoPreDocumentoDiSpesa parameters) {
		return new AggiornaStatoPreDocumentoDiSpesaResponse();
	}

	@Override
	public DettaglioStoricoCausaleSpesaResponse dettaglioStoricoCausaleSpesa(DettaglioStoricoCausaleSpesa parameters) {
		return new DettaglioStoricoCausaleSpesaResponse();
	}

	@Override
	public AssociaImputazioniContabiliVariatePreDocumentoSpesaResponse associaImputazioniContabiliVariatePreDocumentoSpesa(AssociaImputazioniContabiliVariatePreDocumentoSpesa parameters) {
		return new AssociaImputazioniContabiliVariatePreDocumentoSpesaResponse();
	}

	@Override
	public AsyncServiceResponse associaImputazioniContabiliVariatePreDocumentoSpesaAsync(AsyncServiceRequestWrapper<AssociaImputazioniContabiliVariatePreDocumentoSpesa> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public DefiniscePreDocumentoSpesaResponse definiscePreDocumentoSpesa(DefiniscePreDocumentoSpesa parameters) {
		return new DefiniscePreDocumentoSpesaResponse();
	}

	@Override
	public AsyncServiceResponse definiscePreDocumentoSpesaAsync(AsyncServiceRequestWrapper<DefiniscePreDocumentoSpesa> parameters) {
		return new AsyncServiceResponse();
	}

	@Override
	public DefiniscePreDocumentoSpesaPerElencoResponse definiscePreDocumentoSpesaPerElenco(DefiniscePreDocumentoSpesaPerElenco parameters) {
		return new DefiniscePreDocumentoSpesaPerElencoResponse();
	}

	@Override
	public AsyncServiceResponse definiscePreDocumentoSpesaPerElencoAsync(AsyncServiceRequestWrapper<DefiniscePreDocumentoSpesaPerElenco> parameters) {
		return new AsyncServiceResponse();
	}

}
