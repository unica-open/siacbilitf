/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.model.errore;

import java.text.MessageFormat;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.errore.TipoErrore;

/**
 * Errori applicativi del modulo ATT
 */
public enum ErroreAtt implements TipoErrore {

	PROVVEDIMENTO_INESISTENTE("ATT_ERR_0001", "Il provvedimento indicato non esiste"),
	PROVVEDIMENTO_ANNULLATO("ATT_ERR_0002", "Il provvedimento indicato non e'' valido"),
	ATTO_DI_LEGGE_INESISTENTE("ATT_ERR_0004", "L'atto di legge non esiste"),
	PROVVEDIMENTO_NON_ANNULLABILE("ATT_ERR_0005", "Provvedimento non annullabile perche'' gia'' annullato"),
	ATTO_LEGGE_NON_ANNULLABILE("ATT_ERR_0006", "Atto di legge non annullabile perche'' gia'' annullato"),
	//TODO AGGIORNARE L'ENUM AGGIUNTI NUOVI CODICI
	PROVVEDIMENTO_CON_MOVIMENTI_NON_ANNULLABILE("ATT_ERR_0006","Il provvedimento {0} non si puo' annullare perche'' ha movimenti collegati validi"),
	PROVVEDIMENTO_E_GIA_IN_STATO_DEFINITIVO("ATT_INF_0004", "Il provvedimento e'' gia'' in stato definitivo {0}"),
	PROVVEDIMENTO_E_GIA_ANNULLATO("ATT_ERR_0002", "Provvedimento  Annullato {0}"),

	PROVVEDIMENTO_NON_INDICATO("ATT_INF_0003", "Provvedimento non indicato"),
	IL_PROVVEDIMENTO_E_GIA_IN_STATO_DEFINITIVO("ATT_INF_0004", "Il provvedimento e'' gia'' in stato definitivo"),
	;
	
	private final String codice;
	private final String messaggio;

	/**
	 * Costruttore
	 * @param codice il codice dell'errore
	 * @param messaggio il messaggio di errore
	 */
	ErroreAtt(String codice, String messaggio) {
		this.codice = codice;
		this.messaggio = messaggio;
	}

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return this.codice;
	}

	/**
	 * @return the messaggio
	 */
	public String getMessaggio() {
		return this.messaggio;
	}

	@Override
	public Errore getErrore(Object... args) {
		return new Errore(this.codice, MessageFormat.format(this.messaggio, args));
	}

}
