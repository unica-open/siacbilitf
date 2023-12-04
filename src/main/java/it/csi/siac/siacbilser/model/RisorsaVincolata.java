/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siaccorser.model.Ente;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RisorsaVincolata extends Codifica {

	/** Per la serializzazione */
	private static final long serialVersionUID = -7569110166313715316L;

	private Ente ente;
	private String codice;
	private String descrizione;
	
	public RisorsaVincolata() {}
	
	public RisorsaVincolata(Ente ente, String codice, String descrizione) {
		this.ente = ente;
		this.codice = codice;
		this.descrizione = descrizione;
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
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}
	/**
	 * @param descrizione the descrizione to set
	 */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
