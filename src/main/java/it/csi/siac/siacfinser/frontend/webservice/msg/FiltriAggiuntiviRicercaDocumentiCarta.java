/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class FiltriAggiuntiviRicercaDocumentiCarta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> tipiDocDaEscludere;
	
	private BigDecimal importoLiquidabileEsatto;

	public List<String> getTipiDocDaEscludere() {
		return tipiDocDaEscludere;
	}

	public void setTipiDocDaEscludere(List<String> tipiDocDaEscludere) {
		this.tipiDocDaEscludere = tipiDocDaEscludere;
	}

	public BigDecimal getImportoLiquidabileEsatto() {
		return importoLiquidabileEsatto;
	}

	public void setImportoLiquidabileEsatto(BigDecimal importoLiquidabileEsatto) {
		this.importoLiquidabileEsatto = importoLiquidabileEsatto;
	}
	
}
