/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * SubDocumentoDiSpesa
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class SubDocumentoDiSpesa extends SubDocumento {

	private static final long serialVersionUID = 2731277699206443860L;
	private Date dataScadenza;

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

}
