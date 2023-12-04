/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

/**
 * Richiesta al metodo FIN.ImpegnoService.annullaMovimentoEntrata()
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaMovimentoEntrata extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private Accertamento accertamento;
	private boolean verificaImportiDopoAnnullamentoModifica = false;

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

	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

	public boolean isVerificaImportiDopoAnnullamentoModifica() {
		return verificaImportiDopoAnnullamentoModifica;
	}

	public void setVerificaImportiDopoAnnullamentoModifica(boolean verificaImportiDopoAnnullamentoModifica) {
		this.verificaImportiDopoAnnullamentoModifica = verificaImportiDopoAnnullamentoModifica;
	}
}