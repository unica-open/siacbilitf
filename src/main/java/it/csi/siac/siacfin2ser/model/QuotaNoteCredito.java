/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * Quota Nota Credito.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class QuotaNoteCredito extends EntitaEnte {
	
	private static final long serialVersionUID = -109500303880203429L;
	
	private BigDecimal importoDaDedurre = BigDecimal.ZERO;

	/**
	 * @return the importoDaDedurre
	 */
	public BigDecimal getImportoDaDedurre() {
		return importoDaDedurre;
	}

	/**
	 * @param importoDaDedurre the importoDaDedurre to set
	 */
	public void setImportoDaDedurre(BigDecimal importoDaDedurre) {
		this.importoDaDedurre = importoDaDedurre;
	}
	
}
