/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

/**
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ConciliazionePerCapitolo extends Entita {
	
	private static final long serialVersionUID = -1386189871354809357L;
	
	@XmlElements({
		@XmlElement(name="capitoloEntrataGestione", type=CapitoloEntrataGestione.class),
		@XmlElement(name="capitoloUscitaGestione", type=CapitoloUscitaGestione.class),
		@XmlElement(name="capitolo", type=Capitolo.class)
	})
	private Capitolo<?, ?> capitolo;
	private Conto conto;
	
	private Ente ente;
	/**
	 * La classe di conciliazione non &eacute; un vero e proprio campo della conciliazione per capitolo. Serve tuttavia a determinare a quale delle possibili
	 * classi il conto &eacute; collegato (via l'entit&agrave; {@link ConciliazionePerTitolo}).
	 */
	private ClasseDiConciliazione classeDiConciliazione;
	
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
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
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
	 * Getter di utilit&agrave; per i capitoli di entrata gestione.
	 * @return il capitolo castato a entrata gestione
	 */
	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitolo instanceof CapitoloEntrataGestione ? (CapitoloEntrataGestione) capitolo : null;
	}
	
	/**
	 * Getter di utilit&agrave; per i capitoli di uscita gestione.
	 * @return il capitolo castato a uscita gestione
	 */
	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitolo instanceof CapitoloUscitaGestione ? (CapitoloUscitaGestione) capitolo : null;
	}
}
