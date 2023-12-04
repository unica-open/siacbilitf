/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * Macroaggregato
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Macroaggregato extends ClassificatoreGerarchico {

	private static final long serialVersionUID = -9056557367586079706L;

	public Macroaggregato() {
		super();
	}

	public Macroaggregato(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public Date getDataFineValiditaMacroaggregato() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaMacroaggregato(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
