/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiUPBUscitaGest, rappresenta le voci relative agli importi dell'UPB di
 * uscita gestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiUPBUscitaGest extends ImportiUPB {
	
	private static final long serialVersionUID = 2769886619071090766L;
	
	private BigDecimal stanziamentoAsset;
	private BigDecimal stanziamentoCassaAsset;
	private BigDecimal stanziamentoResAsset;

	public ImportiUPBUscitaGest() {
		super();

	}

	public BigDecimal getStanziamentoAsset() {
		return stanziamentoAsset;
	}

	public void setStanziamentoAsset(BigDecimal stanziamentoAsset) {
		this.stanziamentoAsset = stanziamentoAsset;
	}

	public BigDecimal getStanziamentoCassaAsset() {
		return stanziamentoCassaAsset;
	}

	public void setStanziamentoCassaAsset(BigDecimal stanziamentoCassaAsset) {
		this.stanziamentoCassaAsset = stanziamentoCassaAsset;
	}

	public BigDecimal getStanziamentoResAsset() {
		return stanziamentoResAsset;
	}

	public void setStanziamentoResAsset(BigDecimal stanziamentoResAsset) {
		this.stanziamentoResAsset = stanziamentoResAsset;
	}

}
