/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import it.csi.siac.siacbilser.frontend.webservice.ProgettoService;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaAnagraficaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRigaSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.AnnullaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDeltaTraCronoprogrammi;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDeltaTraCronoprogrammiResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoComplessivo;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoComplessivoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloProspettoRiassuntivoCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloProspettoRiassuntivoCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CambiaFlagUsatoPerFpvCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.CambiaFlagUsatoPerFpvCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRigaSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceAnagraficaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaEntrata;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaEntrataResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaSpesa;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRigaSpesaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.OttieniFondoPluriennaleVincolatoCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.OttieniFondoPluriennaleVincolatoCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.PreparazioneCronoprogrammaDiGestione;
import it.csi.siac.siacbilser.frontend.webservice.msg.PreparazioneCronoprogrammaDiGestioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RiattivaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RiattivaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancioResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCronoprogramma;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioCronoprogrammaResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaDettaglioProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaPuntualeProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaProgetto;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaProgettoResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipiAmbito;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaTipiAmbitoResponse;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProvvedimento;
import it.csi.siac.siacfinser.frontend.webservice.msg.RicercaDeiCronoprogrammiCollegatiAlProvvedimentoResponse;

public class ProgettoServiceFakeImpl implements ProgettoService {

	@Override
	public InserisceAnagraficaProgettoResponse inserisceAnagraficaProgetto(InserisceAnagraficaProgetto parameters) {
		return new InserisceAnagraficaProgettoResponse();
	}

	@Override
	public AggiornaAnagraficaProgettoResponse aggiornaAnagraficaProgetto(AggiornaAnagraficaProgetto parameters) {
		return new AggiornaAnagraficaProgettoResponse();
	}

	@Override
	public RicercaPuntualeProgettoResponse ricercaPuntualeProgetto(RicercaPuntualeProgetto parameters) {
		return new RicercaPuntualeProgettoResponse();
	}

	@Override
	public RicercaDettaglioProgettoResponse ricercaDettaglioProgetto(RicercaDettaglioProgetto parameters) {
		return new RicercaDettaglioProgettoResponse();
	}

	@Override
	public AnnullaProgettoResponse annullaProgetto(AnnullaProgetto parameters) {
		return new AnnullaProgettoResponse();
	}

	@Override
	public RiattivaProgettoResponse riattivaProgetto(RiattivaProgetto parameters) {
		return new RiattivaProgettoResponse();
	}

	@Override
	public InserisceCronoprogrammaResponse inserisceCronoprogramma(InserisceCronoprogramma parameters) {
		return new InserisceCronoprogrammaResponse();
	}

	@Override
	public RicercaDeiCronoprogrammiCollegatiAlProgettoResponse ricercaDeiCronoprogrammiCollegatiAlProgetto(RicercaDeiCronoprogrammiCollegatiAlProgetto parameters) {
		return new RicercaDeiCronoprogrammiCollegatiAlProgettoResponse();
	}

	@Override
	public RicercaCronoprogrammaResponse ricercaCronoprogramma(RicercaCronoprogramma parameters) {
		return new RicercaCronoprogrammaResponse();
	}

	@Override
	public AggiornaAnagraficaCronoprogrammaResponse aggiornaAnagraficaCronoprogramma(AggiornaAnagraficaCronoprogramma parameters) {
		return new AggiornaAnagraficaCronoprogrammaResponse();
	}

	@Override
	public AnnullaCronoprogrammaResponse annullaCronoprogramma(AnnullaCronoprogramma parameters) {
		return new AnnullaCronoprogrammaResponse();
	}

	@Override
	public AggiornaRigaEntrataResponse aggiornaRigaEntrata(AggiornaRigaEntrata parameters) {
		return new AggiornaRigaEntrataResponse();
	}

	@Override
	public InserisceRigaEntrataResponse inserisceRigaEntrata(InserisceRigaEntrata parameters) {
		return new InserisceRigaEntrataResponse();
	}

	@Override
	public CancellaRigaEntrataResponse cancellaRigaEntrata(CancellaRigaEntrata parameters) {
		return new CancellaRigaEntrataResponse();
	}

	@Override
	public AggiornaRigaSpesaResponse aggiornaRigaSpesa(AggiornaRigaSpesa parameters) {
		return new AggiornaRigaSpesaResponse();
	}

	@Override
	public InserisceRigaSpesaResponse inserisceRigaSpesa(InserisceRigaSpesa parameters) {
		return new InserisceRigaSpesaResponse();
	}

	@Override
	public CancellaRigaSpesaResponse cancellaRigaSpesa(CancellaRigaSpesa parameters) {
		return new CancellaRigaSpesaResponse();
	}

	@Override
	public CalcoloProspettoRiassuntivoCronoprogrammaResponse calcoloProspettoRiassuntivoCronoprogramma(CalcoloProspettoRiassuntivoCronoprogramma parameters) {
		return new CalcoloProspettoRiassuntivoCronoprogrammaResponse();
	}

	@Override
	public CalcoloDeltaTraCronoprogrammiResponse calcoloDeltaTraCronoprogrammi(CalcoloDeltaTraCronoprogrammi parameters) {
		return new CalcoloDeltaTraCronoprogrammiResponse();
	}

	@Override
	public PreparazioneCronoprogrammaDiGestioneResponse preparazioneCronoprogrammaDiGestione(PreparazioneCronoprogrammaDiGestione parameters) {
		return new PreparazioneCronoprogrammaDiGestioneResponse();
	}

	@Override
	public RicercaSinteticaProgettoResponse ricercaSinteticaProgetto(RicercaSinteticaProgetto parameters) {
		return new RicercaSinteticaProgettoResponse();
	}

	@Override
	public RicercaTipiAmbitoResponse ricercaTipiAmbito(RicercaTipiAmbito parameters) {
		return new RicercaTipiAmbitoResponse();
	}

	@Override
	public RicercaDettaglioCronoprogrammaResponse ricercaDettaglioCronoprogramma(RicercaDettaglioCronoprogramma parameters) {
		return new RicercaDettaglioCronoprogrammaResponse();
	}

	@Override
	@Deprecated
	public it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoCronoprogrammaResponse calcoloFondoPluriennaleVincolatoCronoprogramma(it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoCronoprogramma parameters) {
		return new it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloFondoPluriennaleVincolatoCronoprogrammaResponse();
	}

	@Override
	public CalcoloFondoPluriennaleVincolatoComplessivoResponse calcoloFondoPluriennaleVincolatoComplessivo(CalcoloFondoPluriennaleVincolatoComplessivo parameters) {
		return new CalcoloFondoPluriennaleVincolatoComplessivoResponse();
	}

	@Override
	public CalcoloFondoPluriennaleVincolatoEntrataResponse calcoloFondoPluriennaleVincolatoEntrata(CalcoloFondoPluriennaleVincolatoEntrata parameters) {
		return new CalcoloFondoPluriennaleVincolatoEntrataResponse();
	}

	@Override
	public CalcoloFondoPluriennaleVincolatoSpesaResponse calcoloFondoPluriennaleVincolatoSpesa(CalcoloFondoPluriennaleVincolatoSpesa parameters) {
		return new CalcoloFondoPluriennaleVincolatoSpesaResponse();
	}

	@Override
	public CambiaFlagUsatoPerFpvCronoprogrammaResponse cambiaFlagUsatoPerFpvCronoprogramma(CambiaFlagUsatoPerFpvCronoprogramma parameters) {
		return new CambiaFlagUsatoPerFpvCronoprogrammaResponse();
	}

	@Override
	public OttieniFondoPluriennaleVincolatoCronoprogrammaResponse ottieniFondoPluriennaleVincolatoCronoprogramma(OttieniFondoPluriennaleVincolatoCronoprogramma parameters) {
		return new OttieniFondoPluriennaleVincolatoCronoprogrammaResponse();
	}

	@Override
	public RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancioResponse ricercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio(RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio parameters) {
		return new RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancioResponse();
	}

	@Override
	public RicercaDeiCronoprogrammiCollegatiAlProvvedimentoResponse ricercaDeiCronoprogrammiCollegatiAlProvvedimento(
			RicercaDeiCronoprogrammiCollegatiAlProvvedimento parameters) {
		// TODO Auto-generated method stub
		return null;
	}

}
