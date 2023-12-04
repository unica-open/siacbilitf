/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;

/**
 * UnitaPrevisionaleBilancio (UBP)
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class UnitaPrevisionaleBilancio extends EntitaEnte {

	private static final long serialVersionUID = 4051848799760980649L;

	private Date dataAnnullamento;
	private String descrizione;
	private Boolean flagAssegnazione;
	private Integer numero;
	private StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio;

	@XmlSchemaType(name = "dateTime")
	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Boolean isFlagAssegnazione() {
		return flagAssegnazione;
	}

	public void setFlagAssegnazione(Boolean flagAssegnazione) {
		this.flagAssegnazione = flagAssegnazione;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public StatoOperativoElementoDiBilancio getStatoOperativoElementoDiBilancio() {
		return statoOperativoElementoDiBilancio;
	}

	public void setStatoOperativoElementoDiBilancio(
			StatoOperativoElementoDiBilancio statoOperativoElementoDiBilancio) {
		this.statoOperativoElementoDiBilancio = statoOperativoElementoDiBilancio;
	}

}
