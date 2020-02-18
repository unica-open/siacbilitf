/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.fakeimpl;

import javax.jws.WebParam;

import it.csi.siac.siacbilser.frontend.webservice.CapitoloService;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStanziamentiCapitoliVariati;
import it.csi.siac.siacbilser.frontend.webservice.msg.AggiornaStanziamentiCapitoliVariatiResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcolaTotaliStanziamentiDiPrevisione;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcolaTotaliStanziamentiDiPrevisioneResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDisponibilitaDiUnCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.CalcoloDisponibilitaDiUnCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.CancellaRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaMovimentiAssociatiACapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ContaMovimentiAssociatiACapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaAttributiModificabiliCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaAttributiModificabiliCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaClassificatoriModificabiliCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.ControllaClassificatoriModificabiliCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.InserisceRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCategoriaCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaCategoriaCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaRelazioneAttoDiLeggeCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaRelazioneAttoDiLeggeCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaVariazioniSingoloCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaVariazioniSingoloCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaStoricoVariazioniCodificheCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaStoricoVariazioniCodificheCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloPerAggiornamentoCapitolo;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloPerAggiornamentoCapitoloResponse;
import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaVariazioniCapitoloResponse;

/**
 * Implementazione di default del servizio BIL.CapitoloService
 * 
 * @author rmontuori
 * 
 */
// @WebService(serviceName = "CapitoloService",
// portName = "CapitoloServicePort",
// targetNamespace = BILSvcDictionary.NAMESPACE,
// endpointInterface =
// "it.csi.siac.siacbilser.frontend.webservice.CapitoloService")
public class CapitoloServiceFakeImpl implements CapitoloService {

	@Override
	public CalcoloDisponibilitaDiUnCapitoloResponse calcoloDisponibilitaDiUnCapitolo(CalcoloDisponibilitaDiUnCapitolo parameters) {
		return new CalcoloDisponibilitaDiUnCapitoloResponse();
	}

	@Override
	public AggiornaStanziamentiCapitoliVariatiResponse aggiornaStanziamentiCapitoliVariati(AggiornaStanziamentiCapitoliVariati parameters) {
		return new AggiornaStanziamentiCapitoliVariatiResponse();
	}

	@Override
	public CalcolaTotaliStanziamentiDiPrevisioneResponse calcolaTotaliStanziamentiDiPrevisione(CalcolaTotaliStanziamentiDiPrevisione parameters) {
		return new CalcolaTotaliStanziamentiDiPrevisioneResponse();
	}
	
	@Override
	public ControllaClassificatoriModificabiliCapitoloResponse controllaClassificatoriModificabiliCapitolo(ControllaClassificatoriModificabiliCapitolo parameters){
		return new ControllaClassificatoriModificabiliCapitoloResponse();
	}

	@Override
	public InserisceRelazioneAttoDiLeggeCapitoloResponse inserisceRelazioneAttoDiLeggeCapitolo(InserisceRelazioneAttoDiLeggeCapitolo parameters) {
		return new InserisceRelazioneAttoDiLeggeCapitoloResponse();
	}

	@Override
	public AggiornaRelazioneAttoDiLeggeCapitoloResponse aggiornaRelazioneAttoDiLeggeCapitolo(AggiornaRelazioneAttoDiLeggeCapitolo parameters) {
		return new AggiornaRelazioneAttoDiLeggeCapitoloResponse();
	}

	@Override
	public RicercaRelazioneAttoDiLeggeCapitoloResponse ricercaRelazioneAttoDiLeggeCapitolo(RicercaRelazioneAttoDiLeggeCapitolo parameters) {
		return new RicercaRelazioneAttoDiLeggeCapitoloResponse();
	}

	@Override
	public CancellaRelazioneAttoDiLeggeCapitoloResponse cancellaRelazioneAttoDiLeggeCapitolo(CancellaRelazioneAttoDiLeggeCapitolo parameters) {
		return new CancellaRelazioneAttoDiLeggeCapitoloResponse();
	}

	@Override
	public RicercaRelazioneAttoDiLeggeCapitoloResponse ricercaPuntualeRelazioneAttoDiLeggeCapitolo(@WebParam RicercaRelazioneAttoDiLeggeCapitolo parameters) {
		return new RicercaRelazioneAttoDiLeggeCapitoloResponse();
	}

	@Override
	public ControllaAttributiModificabiliCapitoloResponse controllaAttributiModificabiliCapitolo(ControllaAttributiModificabiliCapitolo arg) {
		return new ControllaAttributiModificabiliCapitoloResponse();
	}
	
	
	@Override
	public RicercaCategoriaCapitoloResponse ricercaCategoriaCapitolo (RicercaCategoriaCapitolo parameters){
		return new RicercaCategoriaCapitoloResponse();
	}

	@Override
	public RicercaVariazioniCapitoloPerAggiornamentoCapitoloResponse ricercaVariazioniCapitoloPerAggiornamentoCapitolo(RicercaVariazioniCapitoloPerAggiornamentoCapitolo parameters) {
		return new RicercaVariazioniCapitoloPerAggiornamentoCapitoloResponse();
	}

	@Override
	public ContaMovimentiAssociatiACapitoloResponse contaMovimentiAssociatiACapitolo(ContaMovimentiAssociatiACapitolo parameters) {
		return new ContaMovimentiAssociatiACapitoloResponse();
	}

	@Override
	public RicercaVariazioniCapitoloResponse ricercaVariazioniCapitolo(RicercaVariazioniCapitolo parameters) {
		return new RicercaVariazioniCapitoloResponse();
	}

	@Override
	public RicercaSinteticaVariazioniSingoloCapitoloResponse ricercaSinteticaVariazioniSingoloCapitolo(RicercaSinteticaVariazioniSingoloCapitolo parameters) {
		return new RicercaSinteticaVariazioniSingoloCapitoloResponse();
	}

	@Override
	public RicercaStoricoVariazioniCodificheCapitoloResponse ricercaStoricoVariazioniCodificheCapitolo(RicercaStoricoVariazioniCodificheCapitolo parameters) {
		return new RicercaStoricoVariazioniCodificheCapitoloResponse();
	}
}
