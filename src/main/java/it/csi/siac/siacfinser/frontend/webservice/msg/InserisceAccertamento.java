/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;
import it.csi.siac.siacfinser.model.UnitaElementareGestioneEntrata;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Richiesta al metodo FIN.AccertamentoService.inserisceAccertamento()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceAccertamento extends ServiceRequest {

	private Accertamento accertamento;
	private Bilancio bilancio;
	private Capitolo capitolo;

	private Soggetto soggetto;
	// private AttoAmministrativo atto;
	private UnitaElementareGestioneEntrata unitaElementareGestioneE;

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public Capitolo getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}

	public Soggetto getSoggetto() {
		return soggetto;
	}

	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}

	// public AttoAmministrativo getAtto() {
	// return atto;
	// }
	//
	// public void setAtto(AttoAmministrativo atto) {
	// this.atto = atto;
	// }

	public UnitaElementareGestioneEntrata getUnitaElementareGestioneE() {
		return unitaElementareGestioneE;
	}

	public void setUnitaElementareGestioneE(
			UnitaElementareGestioneEntrata unitaElementareGestioneE) {
		this.unitaElementareGestioneE = unitaElementareGestioneE;
	}

	public Accertamento getAccertamento() {
		return accertamento;
	}

	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}

}
