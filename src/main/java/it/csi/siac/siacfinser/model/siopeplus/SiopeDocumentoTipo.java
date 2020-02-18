/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.siopeplus;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Codifica;
import it.csi.siac.siacfinser.model.FINDataDictionary;

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SiopeDocumentoTipo extends Codifica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String descrizioneBancaItalia;

	/**
	 * @return the descrizioneBancaItalia
	 */
	public String getDescrizioneBancaItalia() {
		return descrizioneBancaItalia;
	}

	/**
	 * @param descrizioneBancaItalia the descrizioneBancaItalia to set
	 */
	public void setDescrizioneBancaItalia(String descrizioneBancaItalia) {
		this.descrizioneBancaItalia = descrizioneBancaItalia;
	}
	
}
