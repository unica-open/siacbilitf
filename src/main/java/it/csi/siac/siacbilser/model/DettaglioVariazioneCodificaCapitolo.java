/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;
import it.csi.siac.siaccorser.model.Entita;

/**
 * DettaglioVariazioneCodificaCapitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class DettaglioVariazioneCodificaCapitolo extends Entita {
	
	//deve rimappare un record su tabella : SiacRBilElemClassVar
	private static final long serialVersionUID = -1483697491178364650L;
	
	//Variazione a cui afferisce il dettaglio.
	private VariazioneCodificaCapitolo variazioneCodificaCapitolo;
	
	
	private Capitolo capitolo;
	private Capitolo capitoloPrecedente;	
	
	private List<ClassificatoreGenerico> classificatoriGenerici = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGerarchico> classificatoriGerarchici= new ArrayList<ClassificatoreGerarchico>();
	
	//Nuovi per gestire lo storico dei classificatori associati al capitolo Pre-Variazione.
	private List<ClassificatoreGenerico> classificatoriGenericiPrecedenti = new ArrayList<ClassificatoreGenerico>();
	private List<ClassificatoreGerarchico> classificatoriGerarchiciPrecedenti = new ArrayList<ClassificatoreGerarchico>();
	


	public Capitolo getCapitolo() {
		return capitolo;
	}

	public void setCapitolo(Capitolo capitolo) {
		this.capitolo = capitolo;
	}
	
	@XmlElement(nillable=true, type=Object.class)
	public List<ClassificatoreGenerico> getClassificatoriGenerici() {
		return classificatoriGenerici;
	}

	public void setClassificatoriGenerici(List<ClassificatoreGenerico> classificatoriGenerici) {
		this.classificatoriGenerici = classificatoriGenerici;
	}

	@XmlElement(nillable=true, type=Object.class)
	public List<ClassificatoreGerarchico> getClassificatoriGerarchici() {
		return classificatoriGerarchici;
	}

	public void setClassificatoriGerarchici(List<ClassificatoreGerarchico> classificatoriGerarchici) {
		this.classificatoriGerarchici = classificatoriGerarchici;
	}

	/**
	 * @return the classificatoriGenericiPrecedenti
	 */
	@XmlElement(nillable=true, type=Object.class)
	public List<ClassificatoreGenerico> getClassificatoriGenericiPrecedenti() {
		return classificatoriGenericiPrecedenti;
	}

	/**
	 * @param classificatoriGenericiPrecedenti the classificatoriGenericiPrecedenti to set
	 */
	public void setClassificatoriGenericiPrecedenti(List<ClassificatoreGenerico> classificatoriGenericiPrecedenti) {
		this.classificatoriGenericiPrecedenti = classificatoriGenericiPrecedenti!=null?classificatoriGenericiPrecedenti:new ArrayList<ClassificatoreGenerico>();
	}

	/**
	 * @return the classificatoriGerarchiciPrecedenti
	 */
	@XmlElement(nillable=true, type=Object.class)
	public List<ClassificatoreGerarchico> getClassificatoriGerarchiciPrecedenti() {
		return classificatoriGerarchiciPrecedenti;
	}

	/**
	 * @param classificatoriGerarchiciPrecedenti the classificatoriGerarchiciPrecedenti to set
	 */
	public void setClassificatoriGerarchiciPrecedenti(List<ClassificatoreGerarchico> classificatoriGerarchiciPrecedenti) {
		this.classificatoriGerarchiciPrecedenti = classificatoriGerarchiciPrecedenti!=null?classificatoriGerarchiciPrecedenti:new ArrayList<ClassificatoreGerarchico>();
	}

	/**
	 * Ottiene i dati del capitolo antecedenti alla Variazione.
	 * 
	 * @return the capitoloPrecedente
	 */
	public Capitolo getCapitoloPrecedente() {
		return capitoloPrecedente;
	}

	/**
	 * @param capitoloPrecedente the capitoloPrecedente to set
	 */
	public void setCapitoloPrecedente(Capitolo capitoloPrecedente) {
		this.capitoloPrecedente = capitoloPrecedente;
	}

	/**
	 * Ottiene la Variazione a cui afferisce il dettaglio.
	 * 
	 * @return the variazioneCodificaCapitolo
	 */
	public VariazioneCodificaCapitolo getVariazioneCodificaCapitolo() {
		return variazioneCodificaCapitolo;
	}

	/**
	 * @param variazioneCodificaCapitolo the variazioneCodificaCapitolo to set
	 */
	public void setVariazioneCodificaCapitolo(VariazioneCodificaCapitolo variazioneCodificaCapitolo) {
		this.variazioneCodificaCapitolo = variazioneCodificaCapitolo;
	}

	
}
