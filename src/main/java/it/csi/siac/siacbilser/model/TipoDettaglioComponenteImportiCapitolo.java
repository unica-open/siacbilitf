/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoDettaglioComponenteImportiCapitolo {

	STANZIAMENTO("STANZIAMENTO", "Stanziamento", 1),
	IMPEGNATO("IMPEGNATO", "Impegnato", 2),
	DISPONIBILITAIMPEGNARE("DISPONIBILITA_IMPEGNARE", "Disponibilita Impegnare", 3),
	PRESUNTO("PRESUNTO", "Presunti", 4),
	EFFETTIVO("EFFETTIVO", "Effettivi", 5),
	PAGATO("PAGATO", "Pagato", 6),
	;
	
	private final String codice;
	private final String descrizione;
	private final int ordine;
	
	private TipoDettaglioComponenteImportiCapitolo(String codice, String descrizione, int ordine) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.ordine = ordine;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

	/**
	 * @return the ordine
	 */
	public int getOrdine() {
		return ordine;
	}
	
	
}
