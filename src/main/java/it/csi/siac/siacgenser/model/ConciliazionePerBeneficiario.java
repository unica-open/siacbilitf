/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ConciliazionePerBeneficiario extends EntitaEnte {
	
	private static final long serialVersionUID = 5209370501987861015L;

	private ClasseDiConciliazione classeDiConciliazione;
	
	@XmlElements({
		@XmlElement(name="capitoloEntrataGestione", type=CapitoloEntrataGestione.class),
		@XmlElement(name="capitoloUscitaGestione", type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitolo", type=Capitolo.class)
	})
	private Capitolo<?, ?> capitolo;
	private Soggetto soggetto;
	private Conto conto;
	
	/**
	 * @return the classeDiConciliazione
	 */
	public ClasseDiConciliazione getClasseDiConciliazione() {
		return classeDiConciliazione;
	}
	/**
	 * @param classeDiConciliazione the classeDiConciliazione to set
	 */
	public void setClasseDiConciliazione(ClasseDiConciliazione classeDiConciliazione) {
		this.classeDiConciliazione = classeDiConciliazione;
	}
	/**
	 * @return the capitolo
	 */
	@XmlTransient
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
	 * @return the conto
	 */
	public Conto getConto() {
		return conto;
	}
	/**
	 * @param conto the conto to set
	 */
	public void setConto(Conto conto) {
		this.conto = conto;
	}
	
	
	
	
	
	
	
}
