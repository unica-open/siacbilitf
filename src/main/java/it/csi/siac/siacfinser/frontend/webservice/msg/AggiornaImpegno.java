/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.SubImpegno;
import it.csi.siac.siacfinser.model.UnitaElementareGestione;
import it.csi.siac.siacfinser.model.ordinativo.SubOrdinativoPagamento;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Richiesta al metodo FIN.ImpegnoService.aggiornaImpegno()
 * I parametri necessari sono la chiave primaria dell'impegno e tutte le informazioni da modificare necessarie all'applicativo.
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaImpegno extends ServiceRequest {

	private Ente ente;
	private Impegno impegno;
	private Bilancio bilancio;
	private Soggetto creditoreImpegno;
	// TODO (modulo ATT in definizione):
	// private AttoAutorizzatorio provvedimentoImpegno;
	private UnitaElementareGestione unitaElementareDiGestione;
	
	private List<SubOrdinativoPagamento> elencoSubOrdinativiPagamento;
	
	//MODIFICHE IN SEGUITO A PAGINAZIONE SUB, PER ELIMINARE DEI SUB OCCORRE INDICARLI ESPLICITAMENTE QUI:
	private List<SubImpegno> elencoSubImpegniDaEliminare;
	//
	//SIAC-5943
	private boolean saltaInserimentoPrimaNotaSuSub;
	
	private boolean saltaInserimentoPrimaNota;

	public List<SubOrdinativoPagamento> getElencoSubOrdinativiPagamento() {
		return elencoSubOrdinativiPagamento;
	}

	public void setElencoSubOrdinativiPagamento(
			List<SubOrdinativoPagamento> elencoSubOrdinativiPagamento) {
		this.elencoSubOrdinativiPagamento = elencoSubOrdinativiPagamento;
	}

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
	}

	public Soggetto getCreditoreImpegno() {
		return creditoreImpegno;
	}

	public void setCreditoreImpegno(Soggetto creditoreImpegno) {
		this.creditoreImpegno = creditoreImpegno;
	}

	public UnitaElementareGestione getUnitaElementareDiGestione() {
		return unitaElementareDiGestione;
	}

	public void setUnitaElementareDiGestione(
			UnitaElementareGestione unitaElementareDiGestione) {
		this.unitaElementareDiGestione = unitaElementareDiGestione;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public List<SubImpegno> getElencoSubImpegniDaEliminare() {
		return elencoSubImpegniDaEliminare;
	}

	public void setElencoSubImpegniDaEliminare(
			List<SubImpegno> elencoSubImpegniDaEliminare) {
		this.elencoSubImpegniDaEliminare = elencoSubImpegniDaEliminare;
	}

	/**
	 * @return the saltaInserimentoPrimaNota
	 */
	public boolean isSaltaInserimentoPrimaNotaSuSub() {
		return saltaInserimentoPrimaNotaSuSub;
	}

	/**
	 * @param saltaInserimentoPrimaNota the saltaInserimentoPrimaNota to set
	 */
	public void setSaltaInserimentoPrimaNotaSuSub(boolean saltaInserimentoPrimaNota) {
		this.saltaInserimentoPrimaNotaSuSub = saltaInserimentoPrimaNota;
	}

	public boolean isSaltaInserimentoPrimaNota() {
		return saltaInserimentoPrimaNota;
	}

	public void setSaltaInserimentoPrimaNota(boolean saltaInserimentoPrimaNota) {
		this.saltaInserimentoPrimaNota = saltaInserimentoPrimaNota;
	}
	
}
