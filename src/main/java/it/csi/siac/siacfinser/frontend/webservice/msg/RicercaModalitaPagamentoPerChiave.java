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
 * L operazione esegue una ricerca della modalita di pagamento identificata dalla chiave passata o parametro.
 * Se non viene trovata nessuna modalita associata ad un specifico soggetto viene restituito un messaggio di errore
 * <COR_ERR_0004 Entita non trovata (entita : modalita di pagamento)
 * 
 * I parametri da inizializzare sono il codice del soggetto associato, il codice della modalita di pagamento da ricercare ed evenutalmente la sede secondaria associata
 * 
 * @author gvernile
 */




@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaModalitaPagamentoPerChiave extends AbstractSoggettoServiceRequest{

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
