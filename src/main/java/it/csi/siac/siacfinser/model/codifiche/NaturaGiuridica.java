/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.codifiche;


import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Entita;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class NaturaGiuridica extends Entita {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4369582009266851845L;
	
	private String soggettoTipoCode;
	private String soggettoTipoDesc;
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

	
	
	

	
}
