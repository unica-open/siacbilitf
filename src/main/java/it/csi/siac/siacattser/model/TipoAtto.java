/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

import javax.xml.bind.annotation.XmlType;

/**
 * TipoAtto
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = ATTDataDictionary.NAMESPACE)
public class TipoAtto extends ClassificatoreGenerico {

	/** Per la serializzazione */
	private static final long serialVersionUID = 6947818567307940555L;
	
	private Boolean progressivoAutomatico;

	/** Costruttore vuoto di default */
	public TipoAtto() {
		super();
	}

	/**
	 * Costruttore di codifica con codice e descrizione
	 * @param codice il codice della codifica
	 * @param descrizione la descrizione della codifica
	 */
	public TipoAtto(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	/**
	 * @return the progressivoAutomatico
	 */
	public Boolean getProgressivoAutomatico() {
		return progressivoAutomatico;
	}

	/**
	 * @param progressivoAutomatico the progressivoAutomatico to set
	 */
	public void setProgressivoAutomatico(Boolean progressivoAutomatico) {
		this.progressivoAutomatico = progressivoAutomatico;
	}

}
