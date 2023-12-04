/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfin2ser.model.FIN2DataDictionary;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * Periodo Attivit&agrave;.
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class PeriodoAttivita extends EntitaEnte {
	
	private static final long serialVersionUID = 6541440636970969879L;
	
	private Date dataInizio;
	private Date dataFine;
	
	private AttivitaOnere attivitaOnere;

	/**
	 * @return the dataInizio
	 */
	public Date getDataInizio() {
		return dataInizio;
	}

	/**
	 * @param dataInizio the dataInizio to set
	 */
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	/**
	 * @return the dataFine
	 */
	public Date getDataFine() {
		return dataFine;
	}

	/**
	 * @param dataFine the dataFine to set
	 */
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}

	/**
	 * @return the attivitaOnere
	 */
	public AttivitaOnere getAttivitaOnere() {
		return attivitaOnere;
	}

	/**
	 * @param attivitaOnere the attivitaOnere to set
	 */
	public void setAttivitaOnere(AttivitaOnere attivitaOnere) {
		this.attivitaOnere = attivitaOnere;
	}
	
}
