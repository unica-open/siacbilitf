/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * Programma
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Programma extends ClassificatoreGerarchico {

	private static final long serialVersionUID = -6589163155885699915L;

	public Programma() {
		super();
	}

	public Programma(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public Date getDataFineValiditaProgramma() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaProgramma(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
