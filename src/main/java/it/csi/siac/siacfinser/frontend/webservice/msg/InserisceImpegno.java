/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;
import it.csi.siac.siacfinser.model.UnitaElementareGestioneUscita;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

/**
 * Richiesta al metodo FIN.ImpegnoService.inserisceImpegno()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceImpegno extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private Impegno impegno;
	
	
	private Capitolo capitolo;
	private Soggetto creditoreImpegno;
	// private AttoAmministrativo attoAmministrativo;
	private UnitaElementareGestioneUscita unitaElementareDiGestioneU;

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

	public Capitolo getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}

	public Soggetto getCreditoreImpegno() {
		return creditoreImpegno;
	}

	public void setCreditoreImpegno(Soggetto creditoreImpegno) {
		this.creditoreImpegno = creditoreImpegno;
	}

	public UnitaElementareGestioneUscita getUnitaElementareDiGestioneU() {
		return unitaElementareDiGestioneU;
	}

	public void setUnitaElementareDiGestioneU(
			UnitaElementareGestioneUscita unitaElementareDiGestioneU) {
		this.unitaElementareDiGestioneU = unitaElementareDiGestioneU;
	}

	// public AttoAmministrativo getAttoAmministrativo() {
	// return attoAmministrativo;
	// }
	//
	// public void setAttoAmministrativo(AttoAmministrativo attoAmministrativo)
	// {
	// this.attoAmministrativo = attoAmministrativo;
	// }

}
