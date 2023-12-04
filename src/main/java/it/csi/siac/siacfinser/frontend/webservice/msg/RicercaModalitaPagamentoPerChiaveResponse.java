/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;

public class RicercaModalitaPagamentoPerChiaveResponse extends ServiceResponse {

	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggettoInModifica;
	
	
	
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}
	public void setModalitaPagamentoSoggetto(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggettoInModifica() {
		return modalitaPagamentoSoggettoInModifica;
	}
	public void setModalitaPagamentoSoggettoInModifica(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggettoInModifica) {
		this.modalitaPagamentoSoggettoInModifica = modalitaPagamentoSoggettoInModifica;
	}
	
	
	
}
