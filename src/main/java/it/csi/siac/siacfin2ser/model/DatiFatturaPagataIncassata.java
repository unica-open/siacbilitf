/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DatiFatturaPagataIncassata extends Entita {

	private static final long serialVersionUID = -7048920830211551800L;
	
	private Boolean flagPagataIncassata;
	private String notePagamentoIncasso;
	private Date dataOperazione;
	
	/**
	 * @return the flagPagataIncassata
	 */
	public Boolean getFlagPagataIncassata() {
		return flagPagataIncassata;
	}
	/**
	 * @param flagPagataIncassata the flagPagataIncassata to set
	 */
	public void setFlagPagataIncassata(Boolean flagPagataIncassata) {
		this.flagPagataIncassata = flagPagataIncassata;
	}
	/**
	 * @return the notePagamentoIncasso
	 */
	public String getNotePagamentoIncasso() {
		return notePagamentoIncasso;
	}
	/**
	 * @param notePagamentoIncasso the notePagamentoIncasso to set
	 */
	public void setNotePagamentoIncasso(String notePagamentoIncasso) {
		this.notePagamentoIncasso = notePagamentoIncasso;
	}
	/**
	 * @return the dataOperazione
	 */
	public Date getDataOperazione() {
		return dataOperazione;
	}
	/**
	 * @param dataOperazione the dataOperazione to set
	 */
	public void setDataOperazione(Date dataOperazione) {
		this.dataOperazione = dataOperazione;
	}
	
}
