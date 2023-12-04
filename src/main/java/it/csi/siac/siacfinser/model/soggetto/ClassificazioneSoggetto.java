/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.soggetto;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ClassificazioneSoggetto extends EntitaEnte {
	
	private static final long serialVersionUID = 8520704702217704029L;
	
	private String soggettoClasseCode;
	private String soggettoClasseDesc;
	
	private Integer idSoggClasse;
	private Integer idTipoSoggClasse;
	
	private String soggettoTipoClasseCode;
	private String soggettoTipoClasseDesc;
	
	public String getSoggettoClasseCode() {
		return soggettoClasseCode;
	}
	public void setSoggettoClasseCode(String soggettoClasseCode) {
		this.soggettoClasseCode = soggettoClasseCode;
	}
	public String getSoggettoClasseDesc() {
		return soggettoClasseDesc;
	}
	public void setSoggettoClasseDesc(String soggettoClasseDesc) {
		this.soggettoClasseDesc = soggettoClasseDesc;
	}
	public Integer getIdSoggClasse() {
		return idSoggClasse;
	}
	public void setIdSoggClasse(Integer idSoggClasse) {
		this.idSoggClasse = idSoggClasse;
	}
	public Integer getIdTipoSoggClasse() {
		return idTipoSoggClasse;
	}
	public void setIdTipoSoggClasse(Integer idTipoSoggClasse) {
		this.idTipoSoggClasse = idTipoSoggClasse;
	}
	public String getSoggettoTipoClasseCode() {
		return soggettoTipoClasseCode;
	}
	public void setSoggettoTipoClasseCode(String soggettoTipoClasseCode) {
		this.soggettoTipoClasseCode = soggettoTipoClasseCode;
	}
	public String getSoggettoTipoClasseDesc() {
		return soggettoTipoClasseDesc;
	}
	public void setSoggettoTipoClasseDesc(String soggettoTipoClasseDesc) {
		this.soggettoTipoClasseDesc = soggettoTipoClasseDesc;
	}

}
