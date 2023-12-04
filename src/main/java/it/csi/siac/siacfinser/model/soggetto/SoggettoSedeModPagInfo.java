/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SoggettoSedeModPagInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Soggetto soggetto;
	private SedeSecondariaSoggetto sedeSecondaria;
	private ModalitaPagamentoSoggetto modalitaPagamento;
	public Soggetto getSoggetto() {
		return soggetto;
	}
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	public SedeSecondariaSoggetto getSedeSecondaria() {
		return sedeSecondaria;
	}
	public void setSedeSecondaria(SedeSecondariaSoggetto sedeSecondaria) {
		this.sedeSecondaria = sedeSecondaria;
	}
	public ModalitaPagamentoSoggetto getModalitaPagamento() {
		return modalitaPagamento;
	}
	public void setModalitaPagamento(ModalitaPagamentoSoggetto modalitaPagamento) {
		this.modalitaPagamento = modalitaPagamento;
	}
	
}
