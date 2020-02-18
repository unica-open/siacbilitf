/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * TitoloEntrata
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TitoloEntrata extends Titolo {

	private static final long serialVersionUID = -1658442976422789654L;

	public TitoloEntrata() {
		super();
	}

	public TitoloEntrata(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public Date getDataFineValiditaTitoloEntrata() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaTitoloEntrata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
