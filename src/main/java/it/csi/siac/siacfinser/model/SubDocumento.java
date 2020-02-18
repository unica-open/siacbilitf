/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;

/**
 * SubDocumento
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public abstract class SubDocumento extends Entita {

	private static final long serialVersionUID = 5564240939940679533L;
	private Date dataScadenza;
	private String descrizione;
	private boolean flagOrdinativoManuale;
	private double importo;
	private String note;
	private int numero;

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isFlagOrdinativoManuale() {
		return flagOrdinativoManuale;
	}

	public void setFlagOrdinativoManuale(boolean flagOrdinativoManuale) {
		this.flagOrdinativoManuale = flagOrdinativoManuale;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
