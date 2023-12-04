/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.CausaleEP;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Valentina
 * @version 1.0.0 - 02/11/2015
 * @deprecated, usare ricercaConticonciliazionePerClasse
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
@Deprecated
public class RicercaContiConciliazionePerCausaleEP extends ServiceRequest {
	
	private CausaleEP causaleEP;
	private Capitolo<?,?> capitolo;
	private Soggetto soggetto;
	/**
	 * @return the causaleEP
	 */
	public CausaleEP getCausaleEP() {
		return causaleEP;
	}
	/**
	 * @param causaleEP the causaleEP to set
	 */
	public void setCausaleEP(CausaleEP causaleEP) {
		this.causaleEP = causaleEP;
	}
	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}
	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}
	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	
	
}
