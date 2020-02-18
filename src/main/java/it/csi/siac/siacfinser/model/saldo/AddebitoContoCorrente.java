/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.saldo;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class AddebitoContoCorrente extends Entita {
	private static final long serialVersionUID = 5002073735981397105L;

	private Integer idSaldo;
	private Date data;
	private BigDecimal importoSpesa;
	private BigDecimal importoPrelievo;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getImportoSpesa() {
		return importoSpesa;
	}

	public void setImportoSpesa(BigDecimal importoSpesa) {
		this.importoSpesa = importoSpesa;
	}

	public BigDecimal getImportoPrelievo() {
		return importoPrelievo;
	}

	public void setImportoPrelievo(BigDecimal importoPrelievo) {
		this.importoPrelievo = importoPrelievo;
	}

	public Integer getIdSaldo() {
		return idSaldo;
	}

	public void setIdSaldo(Integer idSaldo) {
		this.idSaldo = idSaldo;
	}
}
