/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacgenser.model.Conto;

/**
 * Cespiti
 * @author 71027
 * @version 1.0
 * @created 31-giu-2018
 */
@XmlType(namespace = CESPDataDictionary.NAMESPACE)
public class ImportiRegistroA implements Serializable {

	/** Per la serializzazione */
	private static final long serialVersionUID = -1974658090884562005L;
	
	private Conto contoCespite;
	private BigDecimal importoDaInventariare;
	private BigDecimal importoInventariato;
	/**
	 * @return the contoCespite
	 */
	public Conto getContoCespite() {
		return contoCespite;
	}
	/**
	 * @param contoCespite the contoCespite to set
	 */
	public void setContoCespite(Conto contoCespite) {
		this.contoCespite = contoCespite;
	}
	/**
	 * @return the importoDaInventariare
	 */
	public BigDecimal getImportoDaInventariare() {
		return importoDaInventariare;
	}
	/**
	 * @param importoDaInventariare the importoDaInventariare to set
	 */
	public void setImportoDaInventariare(BigDecimal importoDaInventariare) {
		this.importoDaInventariare = importoDaInventariare;
	}
	/**
	 * @return the importoInventariato
	 */
	public BigDecimal getImportoInventariato() {
		return importoInventariato;
	}
	/**
	 * @param importoInventariato the importoInventariato to set
	 */
	public void setImportoInventariato(BigDecimal importoInventariato) {
		this.importoInventariato = importoInventariato;
	}
	
	

	
}