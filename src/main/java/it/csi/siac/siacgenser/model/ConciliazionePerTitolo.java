/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siacbilser.model.CategoriaTipologiaTitolo;
import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.TipologiaTitolo;
import it.csi.siac.siacbilser.model.TitoloEntrata;
import it.csi.siac.siacbilser.model.TitoloSpesa;
import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.Entita;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 * @version 1.0.0 - 26/10/2015
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class ConciliazionePerTitolo extends Entita {
	
	private static final long serialVersionUID = -8546760990964267686L;
	
	private ClasseDiConciliazione classeDiConciliazione;
	@XmlElements({
		@XmlElement(name="macroaggregato", type=Macroaggregato.class),
		@XmlElement(name="categoriaTipologiaTitolo", type=CategoriaTipologiaTitolo.class)
	})
	private ClassificatoreGerarchico classificatoreGerarchico;
	private Conto conto;
	private Ente ente;
	
	// In sola consultazione
	private TitoloSpesa titoloSpesa;
	private TitoloEntrata titoloEntrata;
	private TipologiaTitolo tipologiaTitolo;
	
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
	 * @return the classificatoreGerarchico
	 */
	@XmlTransient
	public ClassificatoreGerarchico getClassificatoreGerarchico() {
		return classificatoreGerarchico;
	}
	/**
	 * @param classificatoreGerarchico the classificatoreGerarchico to set
	 */
	public void setClassificatoreGerarchico(ClassificatoreGerarchico classificatoreGerarchico) {
		this.classificatoreGerarchico = classificatoreGerarchico;
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
	 * @return the macroaggregato to set
	 */
	public void setMacroaggregato(Macroaggregato macroaggregato) {
		setClassificatoreGerarchico(macroaggregato);
	}
	/**
	 * @return the macroaggregato
	 */
	@XmlTransient
	public Macroaggregato getMacroaggregato() {
		return classificatoreGerarchico instanceof Macroaggregato ? (Macroaggregato)classificatoreGerarchico : null;
	}
	/**
	 * @return the categoriaTipologiaTitolo to set
	 */
	public void setCategoriaTipologiaTitolo(CategoriaTipologiaTitolo categoriaTipologiaTitolo) {
		setClassificatoreGerarchico(categoriaTipologiaTitolo);
	}
	/**
	 * @return the categoriaTipologiaTitolo
	 */
	public CategoriaTipologiaTitolo getCategoriaTipologiaTitolo() {
		return classificatoreGerarchico instanceof CategoriaTipologiaTitolo ? (CategoriaTipologiaTitolo)classificatoreGerarchico : null;
	}
	/**
	 * @return the titoloSpesa
	 */
	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}
	/**
	 * @param titoloSpesa the titoloSpesa to set
	 */
	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}
	/**
	 * @return the titoloEntrata
	 */
	public TitoloEntrata getTitoloEntrata() {
		return titoloEntrata;
	}
	/**
	 * @param titoloEntrata the titoloEntrata to set
	 */
	public void setTitoloEntrata(TitoloEntrata titoloEntrata) {
		this.titoloEntrata = titoloEntrata;
	}
	/**
	 * @return the tipologiaTitolo
	 */
	public TipologiaTitolo getTipologiaTitolo() {
		return tipologiaTitolo;
	}
	/**
	 * @param tipologiaTitolo the tipologiaTitolo to set
	 */
	public void setTipologiaTitolo(TipologiaTitolo tipologiaTitolo) {
		this.tipologiaTitolo = tipologiaTitolo;
	}
	
}
