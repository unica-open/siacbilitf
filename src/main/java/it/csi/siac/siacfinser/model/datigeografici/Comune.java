/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.datigeografici;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Comune extends ElementoGeografico {

	private static final long serialVersionUID = -7494631569027034289L;
	
	private String codiceBelfiore;
	private String codiceIstat;

	private String provinciaDesc;
	private String provinciaCode;

	private String regioneCode;
	private String regioneDesc;

	private String nazioneCode;
	private String nazioneDesc;

	public String getCodiceBelfiore() {
		return codiceBelfiore;
	}

	public void setCodiceBelfiore(String codiceBelfiore) {
		this.codiceBelfiore = codiceBelfiore;
	}

	public String getCodiceIstat() {
		return codiceIstat;
	}

	public void setCodiceIstat(String codiceIstat) {
		this.codiceIstat = codiceIstat;
	}

	public String getProvinciaDesc() {
		return provinciaDesc;
	}

	public void setProvinciaDesc(String provinciaDesc) {
		this.provinciaDesc = provinciaDesc;
	}

	public String getProvinciaCode() {
		return provinciaCode;
	}

	public void setProvinciaCode(String provinciaCode) {
		this.provinciaCode = provinciaCode;
	}

	public String getNazioneCode() {
		return nazioneCode;
	}

	public void setNazioneCode(String nazioneCode) {
		this.nazioneCode = nazioneCode;
	}

	public String getNazioneDesc() {
		return nazioneDesc;
	}

	public void setNazioneDesc(String nazioneDesc) {
		this.nazioneDesc = nazioneDesc;
	}

	public String getRegioneCode() {
		return regioneCode;
	}

	public void setRegioneCode(String regioneCode) {
		this.regioneCode = regioneCode;
	}

	public String getRegioneDesc() {
		return regioneDesc;
	}

	public void setRegioneDesc(String regioneDesc) {
		this.regioneDesc = regioneDesc;
	}

	
}
