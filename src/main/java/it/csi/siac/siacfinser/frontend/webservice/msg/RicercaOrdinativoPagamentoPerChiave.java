/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ric.RicercaOrdinativoPagamentoK;

/**
 * Richiesta al metodo FIN.OrdinativoService.ricercaOrdinativoPagamentoPerChiave()
 * 
 */

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaOrdinativoPagamentoPerChiave extends RicercaAttributiMovimentoGestione {

	private Ente ente;
	private RicercaOrdinativoPagamentoK pRicercaOrdinativoPagamentoK;
	
	/**
	 * Per indicare al servizio di caricare anche gli ordinativi 
	 * con la relazione da a nell'altro verso rispetto a quelli (da sempre
	 * caricati) in elencoOrdinativiCollegati, tali ordinativi
	 * saranno presenti in elencoOrdinativiACuiSonoCollegato
	 */
	private boolean caricaOrdinativiACuiSonoCollegato;
	
	private ParametriPaginazione paginazioneOrdinativiCollegati;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaOrdinativoPagamentoK getpRicercaOrdinativoPagamentoK() {
		return pRicercaOrdinativoPagamentoK;
	}

	public void setpRicercaOrdinativoPagamentoK(RicercaOrdinativoPagamentoK pRicercaOrdinativoPagamentoK) {
		this.pRicercaOrdinativoPagamentoK = pRicercaOrdinativoPagamentoK;
	}

	public boolean isCaricaOrdinativiACuiSonoCollegato() {
		return caricaOrdinativiACuiSonoCollegato;
	}

	public void setCaricaOrdinativiACuiSonoCollegato(boolean caricaOrdinativiACuiSonoCollegato) {
		this.caricaOrdinativiACuiSonoCollegato = caricaOrdinativiACuiSonoCollegato;
	}

	public ParametriPaginazione getPaginazioneOrdinativiCollegati() {
		return paginazioneOrdinativiCollegati;
	}

	public void setPaginazioneOrdinativiCollegati(ParametriPaginazione paginazioneOrdinativiCollegati) {
		this.paginazioneOrdinativiCollegati = paginazioneOrdinativiCollegati;
	}
}