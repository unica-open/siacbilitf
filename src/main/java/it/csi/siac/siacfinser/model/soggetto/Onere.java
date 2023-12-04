/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class Onere extends EntitaEnte {
	
	private static final long serialVersionUID = 8520704702217704029L;
	
	private String onereDesc;
	private String onereCod;
	private Integer idDOnere;
	
	public String getOnereDesc() {
		return onereDesc;
	}
	public void setOnereDesc(String onereDesc) {
		this.onereDesc = onereDesc;
	}
	public String getOnereCod() {
		return onereCod;
	}
	public void setOnereCod(String onereCod) {
		this.onereCod = onereCod;
	}
	public Integer getIdDOnere() {
		return idDOnere;
	}
	public void setIdDOnere(Integer idDOnere) {
		this.idDOnere = idDOnere;
	}

}
