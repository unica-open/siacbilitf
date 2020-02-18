/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceQuotaDocumentoSpesa extends ServiceRequest {
	
	private Bilancio bilancio;
	
	private SubdocumentoSpesa subdocumentoSpesa;
	private boolean aggiornaStatoDocumento = true;
	private boolean quotaContestuale = false;
	private boolean senzaModalitaPagamento = false;

	private boolean forzaRicalcolaDisponibilitaLiquidare = false;
	// SIAC-5115
	private boolean gestisciSospensioni = false;
	// SIAC-5393
	private boolean preventInserimentoLiquidazione = false;

	
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the subdocumentoSpesa
	 */
	public SubdocumentoSpesa getSubdocumentoSpesa() {
		return subdocumentoSpesa;
	}

	/**
	 * @param subdocumentoSpesa the subdocumentoSpesa to set
	 */
	public void setSubdocumentoSpesa(SubdocumentoSpesa subdocumentoSpesa) {
		this.subdocumentoSpesa = subdocumentoSpesa;
	}

	/**
	 * @return the aggiornaStatoDocumento
	 */
	@XmlTransient
	public boolean isAggiornaStatoDocumento() {
		return aggiornaStatoDocumento;
	}

	/**
	 * @param aggiornaStatoDocumento the aggiornaStatoDocumento to set
	 */
	public void setAggiornaStatoDocumento(boolean aggiornaStatoDocumento) {
		this.aggiornaStatoDocumento = aggiornaStatoDocumento;
	}


	/**
	 * @return the quotaContestuale
	 */
	public boolean isQuotaContestuale() {
		return quotaContestuale;
	}

	/**
	 * @param quotaContestuale the quotaContestuale to set
	 */
	public void setQuotaContestuale(boolean quotaContestuale) {
		this.quotaContestuale = quotaContestuale;
	}

	/**
	 * @return the senzaModalitaPagamento
	 */
	public boolean isSenzaModalitaPagamento() {
		return senzaModalitaPagamento;
	}

	/**
	 * @param senzaModalitaPagamento the senzaModalitaPagamento to set
	 */
	public void setSenzaModalitaPagamento(boolean senzaModalitaPagamento) {
		this.senzaModalitaPagamento = senzaModalitaPagamento;
	}

	/**
	 * @return the forzaRicalcolaDisponibilitaLiquidare
	 */
	@XmlTransient
	public boolean isForzaRicalcolaDisponibilitaLiquidare() {
		return forzaRicalcolaDisponibilitaLiquidare;
	}

	/**
	 * @param forzaRicalcolaDisponibilitaLiquidare the forzaRicalcolaDisponibilitaLiquidare to set
	 */
	public void setForzaRicalcolaDisponibilitaLiquidare(boolean forzaRicalcolaDisponibilitaLiquidare) {
		this.forzaRicalcolaDisponibilitaLiquidare = forzaRicalcolaDisponibilitaLiquidare;
	}

	/**
	 * @return the gestisciSospensioni
	 */
	public boolean isGestisciSospensioni() {
		return gestisciSospensioni;
	}

	/**
	 * @param gestisciSospensioni the gestisciSospensioni to set
	 */
	public void setGestisciSospensioni(boolean gestisciSospensioni) {
		this.gestisciSospensioni = gestisciSospensioni;
	}

	/**
	 * @return the preventInserimentoLiquidazione
	 */
	@XmlTransient
	public boolean isPreventInserimentoLiquidazione() {
		return preventInserimentoLiquidazione;
	}

	/**
	 * @param preventInserimentoLiquidazione the preventInserimentoLiquidazione to set
	 */
	public void setPreventInserimentoLiquidazione(boolean preventInserimentoLiquidazione) {
		this.preventInserimentoLiquidazione = preventInserimentoLiquidazione;
	}


}
