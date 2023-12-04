/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Enum per la tipologia dell'operazione di cassa: entrata o spesa
 */
@XmlType(namespace = CECDataDictionary.NAMESPACE)
public enum TipologiaOperazioneCassa {

	ENTRATA("E", "Entrata"),
	SPESA("U", "Spesa");
	
	private String codice;
	private String descrizione;
	
	private TipologiaOperazioneCassa(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
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
	
	public static TipologiaOperazioneCassa byCodice(String codice) {
		for(TipologiaOperazioneCassa toc : values()) {
			if(toc.getCodice().equals(codice)) {
				return toc;
			}
		}
		return null;
	}
	
	public static TipologiaOperazioneCassa byDescrizione(String descrizione) {
		for(TipologiaOperazioneCassa toc : values()) {
			if(toc.getDescrizione().equals(descrizione)) {
				return toc;
			}
		}
		return null;
	}

}