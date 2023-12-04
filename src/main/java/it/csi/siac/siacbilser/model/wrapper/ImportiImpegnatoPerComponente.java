/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model.wrapper;

import java.io.Serializable;
import java.math.BigDecimal;

//SIAC-7349  - START - MR - SR200 - 09/04/2020 Oggetto di mapping
public class ImportiImpegnatoPerComponente implements Serializable {
	
	public ImportiImpegnatoPerComponente() {

	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -4593988640432740271L;
	private Integer indiceAnnualita;
	private Integer elemDetCompId;
	private BigDecimal impegnatoDefinitivo;
	public Integer getIndiceAnnualita() {
		return indiceAnnualita;
	}
	public void setIndiceAnnualita(Integer indiceAnnualita) {
		this.indiceAnnualita = indiceAnnualita;
	}
	public Integer getElemDetCompId() {
		return elemDetCompId;
	}
	public void setElemDetCompId(Integer elemDetCompId) {
		this.elemDetCompId = elemDetCompId;
	}
	public BigDecimal getImpegnatoDefinitivo() {
		return impegnatoDefinitivo;
	}
	public void setImpegnatoDefinitivo(BigDecimal impegnatoDefinitivo) {
		this.impegnatoDefinitivo = impegnatoDefinitivo;
	}

}
