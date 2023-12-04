/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.ClasseDiConciliazione;

/**
 * @author Elisa Chiari
 * @version 1.0.0 - 04/04/2017
 */
@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class RicercaContiConciliazionePerClasse extends ServiceRequest {

	//SIAC-4596
	private ClasseDiConciliazione classeDiConciliazione;
	private Capitolo<?,?> capitolo;
	private Soggetto soggetto;

	
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
	/**
	 * @return the classe di conciliazione
	 * */
	public ClasseDiConciliazione getClasseDiConciliazione() {
		return classeDiConciliazione;
	}
	/**
	 * @param the classeDiConciliazione the classeDiConciliazione to set
	 * */
	public void setClasseDiConciliazione(ClasseDiConciliazione classeDiConciliazione) {
		this.classeDiConciliazione = classeDiConciliazione;
	}
	
	
}
