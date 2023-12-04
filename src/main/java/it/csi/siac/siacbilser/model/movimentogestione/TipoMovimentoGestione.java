/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.movimentogestione;

public enum TipoMovimentoGestione {
	IMPEGNO("I"),
	ACCERTAMENTO("A"),

	;
	
	private String codice;

	TipoMovimentoGestione(String codice) {
		this.codice = codice;
	}

	public String getCodice() {
		return codice;
	}
}