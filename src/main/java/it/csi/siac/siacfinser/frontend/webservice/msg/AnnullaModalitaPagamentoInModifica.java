/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacfinser.model.soggetto.modpag.ModalitaPagamentoSoggetto;
import it.csi.siac.siacfinser.model.soggetto.sedesecondaria.SedeSecondariaSoggetto;


/**
 * L'operazione si occupa di ricercare una modalita pagamento in modifica in base alla chiave primaria associata e di annullarla
 * Il parametro richiesto e la chiave primaria associata alla modalita di pagamento in modifica da annullare
 * 
 * 
 * 
 */


@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaModalitaPagamentoInModifica extends AbstractSoggettoServiceRequest {

	private Ente ente;
	private Soggetto soggetto;
	private ModalitaPagamentoSoggetto modalitaPagamentoSoggetto;
	private SedeSecondariaSoggetto sedeSecondariaSoggetto;
	
	
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public Soggetto getSoggetto() {
		return soggetto;
	}
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	public ModalitaPagamentoSoggetto getModalitaPagamentoSoggetto() {
		return modalitaPagamentoSoggetto;
	}
	public void setModalitaPagamentoSoggetto(
			ModalitaPagamentoSoggetto modalitaPagamentoSoggetto) {
		this.modalitaPagamentoSoggetto = modalitaPagamentoSoggetto;
	}
	public SedeSecondariaSoggetto getSedeSecondariaSoggetto() {
		return sedeSecondariaSoggetto;
	}
	public void setSedeSecondariaSoggetto(
			SedeSecondariaSoggetto sedeSecondariaSoggetto) {
		this.sedeSecondariaSoggetto = sedeSecondariaSoggetto;
	}
	
	
	
	
}
