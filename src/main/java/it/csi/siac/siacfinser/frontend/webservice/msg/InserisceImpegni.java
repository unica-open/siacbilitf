/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Impegno;

/**
 * Richiesta al metodo FIN.MovimentoGestioneService.inserisceImpegni()
 * 
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisceImpegni extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private Impegno primoImpegnoDaInserire;
	private List<Impegno> altriImpegniDaInserire;
	private boolean saltaInserimentoPrimaNota = false;
	
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
	public Impegno getPrimoImpegnoDaInserire() {
		return primoImpegnoDaInserire;
	}
	public void setPrimoImpegnoDaInserire(Impegno primoImpegnoDaInserire) {
		this.primoImpegnoDaInserire = primoImpegnoDaInserire;
	}
	public List<Impegno> getAltriImpegniDaInserire() {
		return altriImpegniDaInserire;
	}
	public void setAltriImpegniDaInserire(List<Impegno> altriImpegniDaInserire) {
		this.altriImpegniDaInserire = altriImpegniDaInserire;
	}
	/**
	 * @return the saltaInserimentoPrimaNota
	 */
	public boolean isSaltaInserimentoPrimaNota() {
		return saltaInserimentoPrimaNota;
	}
	/**
	 * @param saltaInserimentoPrimaNota the saltaInserimentoPrimaNota to set
	 */
	public void setSaltaInserimentoPrimaNota(boolean saltaInserimentoPrimaNota) {
		this.saltaInserimentoPrimaNota = saltaInserimentoPrimaNota;
	}
	
}