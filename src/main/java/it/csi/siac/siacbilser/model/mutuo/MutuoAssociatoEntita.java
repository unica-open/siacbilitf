/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;

import it.csi.siac.siacbilser.model.mutuo.Mutuo;
import it.csi.siac.siaccorser.model.EntitaEnteExt;

public abstract class MutuoAssociatoEntita extends EntitaEnteExt {

	private static final long serialVersionUID = 8781573682407582146L;
	
	private Mutuo mutuo;
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

	public Mutuo getMutuo() {
		return mutuo;
	}

	public void setMutuo(Mutuo mutuo) {
		this.mutuo = mutuo;
	}


}
