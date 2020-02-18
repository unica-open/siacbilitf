/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * TitoloSpesa
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TitoloSpesa extends Titolo {

	private static final long serialVersionUID = -7733906761921312354L;

	public TitoloSpesa() {
		super();

	}

	public TitoloSpesa(String codice, String descrizione) {
		super(codice, descrizione);

	}
	
	public Date getDataFineValiditaTitoloSpesa() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaTitoloSpesa(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
