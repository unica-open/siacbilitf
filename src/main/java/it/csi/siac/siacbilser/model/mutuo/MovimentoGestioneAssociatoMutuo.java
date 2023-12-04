/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;

import it.csi.siac.siaccorser.model.EntitaEnteExt;
import it.csi.siac.siacfinser.model.MovimentoGestione;

public abstract class MovimentoGestioneAssociatoMutuo<MG extends MovimentoGestione> extends EntitaEnteExt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 398344293280688474L;
	
	
	protected MG movimentoGestione;
	private BigDecimal importoIniziale;
	private BigDecimal importoFinale;

	

	public BigDecimal getImportoIniziale() {
		return importoIniziale;
	}

	public void setImportoIniziale(BigDecimal importoIniziale) {
		this.importoIniziale = importoIniziale;
	}

	public BigDecimal getImportoFinale() {
		return importoFinale;
	}

	public void setImportoFinale(BigDecimal importoFinale) {
		this.importoFinale = importoFinale;
	}

	public MG getMovimentoGestione() {
		return movimentoGestione;
	}

	protected void setMovimentoGestione(MG movimentoGestione) {
		this.movimentoGestione = movimentoGestione;
	}

}
