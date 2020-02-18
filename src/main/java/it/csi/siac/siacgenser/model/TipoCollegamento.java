/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import javax.xml.bind.annotation.XmlType;


@XmlType(namespace = GENDataDictionary.NAMESPACE)
public enum TipoCollegamento {
	
	IMPEGNO("I", "Impegno"),
	ACCERTAMENTO("A", "Accertamento"),
	LIQUIDAZIONE("L", "Liquidazione"),
	DOCUMENTO_ENTRATA("DE", "Documento Entrata"),
	DOCUMENTO_SPESA("DS", "Documento Spesa"),
	SUBDOCUMENTO_ENTRATA("SE", "Subdocumento Entrata"),
	SUBDOCUMENTO_SPESA("SS", "Subdocumento Spesa"),
	ORDINATIVO_PAGAMENTO("OP", "Ordinativo Pagamento"),
	ORDINATIVO_INCASSO("OI", "Ordinativo Incasso"),
	PRIMA_NOTA("P", "Prima Nota"),
	EPILOGATIVO("EP", "Epilogativo"),
	CONTO_ORDINE("CO", "Conto d'Ordine"),
	SUBIMPEGNO("SI", "SubImpegno"),
	SUBACCERTAMENTO("SA", "SubAccertamento"),
	MODIFICA_MOVIMENTO_GESTIONE_SPESA("MMGS", "ModificaMovimentoGestioneSpesa"),
	MODIFICA_MOVIMENTO_GESTIONE_ENTRATA("MMGE", "ModificaMovimentoGestioneEntrata"),
	
	RICHIESTA_ECONOMALE("RE", "Richiesta Economale"),
	RENDICONTO_RICHIESTA("RR", "Rendiconto Richiesta"),
	
	RATEO("RT", "Rateo"),
	RISCONTO("RS", "Risconto"),
	;
	
	private String codice;
	private String descrizione;
	
	private TipoCollegamento(String codice, String descrizione) {
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
}