/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class RiepilogoFondoPluriennaleVincolatoEntrataCronoprogramma extends Entita {

	/**
	 * 
	 */
	private static final long serialVersionUID = 423006403948206446L;

	private Integer anno;

	private BigDecimal importoEntrata = BigDecimal.ZERO;
	private BigDecimal importoTitolo1 = BigDecimal.ZERO;
	private BigDecimal importoTitolo2 = BigDecimal.ZERO;

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public BigDecimal getImportoEntrata() {
		return importoEntrata;
	}

	public void setImportoEntrata(BigDecimal i) {
		this.importoEntrata = i != null ? i : BigDecimal.ZERO;
	}

	public void addImportoEntrata(BigDecimal i) {
		if (i != null) {
			importoEntrata = importoEntrata.add(i);
		}
	}

	public BigDecimal getImportoTitolo1() {
		return importoTitolo1;
	}

	public void setImportoTitolo1(BigDecimal i) {
		this.importoTitolo1 = i != null ? i : BigDecimal.ZERO;
	}

	public void addImportoTitolo1(BigDecimal i) {
		if (i != null) {
			importoTitolo1 = importoTitolo1.add(i);
		}
	}

	public BigDecimal getImportoTitolo2() {
		return importoTitolo2;
	}

	public void setImportoTitolo2(BigDecimal i) {
		this.importoTitolo2 = i != null ? i : BigDecimal.ZERO;
	}

	public void addImportoTitolo2(BigDecimal i) {
		if (i != null) {
			importoTitolo2 = importoTitolo2.add(i);
		}
	}

	public BigDecimal getImportoTotaleEntrata() {
		return importoEntrata.add(importoTitolo1).add(importoTitolo2);
	}

	public BigDecimal getImportoTotaleEntrataFPV() {
		return importoTitolo1.add(importoTitolo2);
	}

}
