/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class TipoSoggetto extends Codifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 952533129980880019L;
	
	private String soggettoTipoCode;
	private String soggettoTipoDesc;
	private Integer soggettoTipoId;
	
	public String getSoggettoTipoCode() {
		return soggettoTipoCode;
	}
	public void setSoggettoTipoCode(String soggettoTipoCode) {
		this.soggettoTipoCode = soggettoTipoCode;
	}
	public String getSoggettoTipoDesc() {
		return soggettoTipoDesc;
	}
	public void setSoggettoTipoDesc(String soggettoTipoDesc) {
		this.soggettoTipoDesc = soggettoTipoDesc;
	}
	public Integer getSoggettoTipoId() {
		return soggettoTipoId;
	}
	public void setSoggettoTipoId(Integer soggettoTipoId) {
		this.soggettoTipoId = soggettoTipoId;
	}

	public static TipoSoggetto newInstanceWithCodice(String codice) {
		TipoSoggetto tipoSoggetto = new TipoSoggetto();
		tipoSoggetto.setCodice(codice);
		
		return tipoSoggetto;
	}
}
