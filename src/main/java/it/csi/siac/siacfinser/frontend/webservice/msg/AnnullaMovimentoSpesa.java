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
import it.csi.siac.siacfinser.model.Impegno;

/**
 * Richiesta al metodo FIN.ImpegnoService.annullaMovimentoSpesa()
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaMovimentoSpesa extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private Impegno impegno;
	private boolean verificaImportiDopoAnnullamentoModifica = false;

	public Impegno getImpegno() {
		return impegno;
	}

	public void setImpegno(Impegno impegno) {
		this.impegno = impegno;
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

	public boolean isVerificaImportiDopoAnnullamentoModifica() {
		return verificaImportiDopoAnnullamentoModifica;
	}

	public void setVerificaImportiDopoAnnullamentoModifica(boolean verificaImportiDopoAnnullamentoModifica) {
		this.verificaImportiDopoAnnullamentoModifica = verificaImportiDopoAnnullamentoModifica;
	}

}
