/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.visibilita;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;

/**
 * Tipo di campo
 *
 * @author Alessandro Marchino
 * @version 1.0.0 - 10/05/2021
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public enum TipoCampo {
	NUMERIC("NUMERIC", "Numerico") {
		@Override
		protected BigDecimal innerParse(String value) {
			return new BigDecimal(value);
		}
	},
	INTEGER("INTEGER", "Intero") {
		@Override
		protected Integer innerParse(String value) {
			return Integer.valueOf(value);
		}
	},
	TEXT("TEXT", "Testo") {
		@Override
		protected String innerParse(String value) {
			return value;
		}
	},
	BOOLEAN("BOOLEAN", "Booleano") {
		@Override
		protected Boolean innerParse(String value) {
			return Boolean.parseBoolean(value);
		}
	},
	;
	
	/** The codice. */
	private final String codice;
	
	/** The descrizione. */
	private final String descrizione;
	
	/**
	 * Instantiates a new tipo campo.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	private TipoCampo(String codice, String descrizione) {
		this.codice = codice;
		this.descrizione = descrizione;
	}
	
	/**
	 * Gets the codice.
	 *
	 * @return the codice
	 */
	public String getCodice() {
		return this.codice;
	}
	
	/**
	 * Gets the descrizione.
	 *
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public Object parse(String value) {
		if(value == null) {
			return null;
		}
		try {
			return innerParse(value);
		} catch(RuntimeException re) {
			return null;
		}
	}
	
	protected abstract Object innerParse(String value);
}
