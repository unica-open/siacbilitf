/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

/**
 * ImportiUPBEntrataGest, rappresenta le voci relative agli importi dell'UPB di
 * entrata gestione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class ImportiUPBEntrataGest extends ImportiUPB {

	private static final long serialVersionUID = 3881410812913411692L;
	
	private BigDecimal stanziamentoAsset;
	private BigDecimal stanziamentoCassaAsset;
	private BigDecimal stanziamentoResAsset;

	public ImportiUPBEntrataGest() {
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
