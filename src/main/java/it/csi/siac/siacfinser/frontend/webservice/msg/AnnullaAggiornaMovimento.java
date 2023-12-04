/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

/**
 * Richiesta al metodo FIN.ImpegnoService.aggiornaAnnullaImpegno()
 * 
 * @author mricevuto
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaAggiornaMovimento extends ServiceRequest{
	
	private AnnullaMovimentoSpesa annullaMovimento;
	private AggiornaImpegno aggiornaImpegno;
	private AnnullaMovimentoEntrata annullaMovimentoEntrata;
	private AggiornaAccertamento aggiornaAccertamento;
	
	private String numeroSub;
	private Integer annoMovimento;
	private BigDecimal numeroMovimento;
	private Bilancio bilancio;
	private int idMovimento;
	private String tipoMovimento;
	private Ente ente;
	
	public AnnullaMovimentoEntrata getAnnullaMovimentoEntrata() {
		return annullaMovimentoEntrata;
	}

	public void setAnnullaMovimentoEntrata(AnnullaMovimentoEntrata annullaMovimentoEntrata) {
		this.annullaMovimentoEntrata = annullaMovimentoEntrata;
	}

	public AggiornaAccertamento getAggiornaAccertamento() {
		return aggiornaAccertamento;
	}

	public void setAggiornaAccertamento(AggiornaAccertamento aggiornaAccertamento) {
		this.aggiornaAccertamento = aggiornaAccertamento;
	}

	private boolean flagAnnullaConsentito;
	private boolean flagAggiornaConsentito;

	public boolean isFlagAggiornaConsentito() {
		return flagAggiornaConsentito;
	}

	public void setFlagAggiornaConsentito(boolean flagAggiornaConsentito) {
		this.flagAggiornaConsentito = flagAggiornaConsentito;
	}

	public boolean isFlagAnnullaConsentito() {
		return flagAnnullaConsentito;
	}

	public void setFlagAnnullaConsentito(boolean flagAnnullaConsentito) {
		this.flagAnnullaConsentito = flagAnnullaConsentito;
	}

	public AggiornaImpegno getAggiornaImpegno() {
		return aggiornaImpegno;
	}

	public void setAggiornaImpegno(AggiornaImpegno aggiornaImpegno) {
		this.aggiornaImpegno = aggiornaImpegno;
	}

	public AnnullaMovimentoSpesa getAnnullaMovimento() {
		return annullaMovimento;
	}

	public void setAnnullaMovimento(AnnullaMovimentoSpesa annullaMovimento) {
		this.annullaMovimento = annullaMovimento;
	}

	public String getNumeroSub() {
		return numeroSub;
	}

	public void setNumeroSub(String numeroSub) {
		this.numeroSub = numeroSub;
	}

	public Integer getAnnoMovimento() {
		return annoMovimento;
	}

	public void setAnnoMovimento(Integer annoMovimento) {
		this.annoMovimento = annoMovimento;
	}

	public BigDecimal getNumeroMovimento() {
		return numeroMovimento;
	}

	public void setNumeroMovimento(BigDecimal numeroMovimento) {
		this.numeroMovimento = numeroMovimento;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public int getIdMovimento() {
		return idMovimento;
	}

	public void setIdMovimento(int idMovimento) {
		this.idMovimento = idMovimento;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	

}
