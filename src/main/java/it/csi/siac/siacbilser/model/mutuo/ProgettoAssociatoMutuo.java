/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.mutuo;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.BILDataDictionary;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.EntitaEnteExt;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ProgettoAssociatoMutuo extends EntitaEnteExt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 398344293280688474L;
	
	protected Progetto progetto;
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

	public Progetto getProgetto() {
		return progetto;
	}

	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}

}
