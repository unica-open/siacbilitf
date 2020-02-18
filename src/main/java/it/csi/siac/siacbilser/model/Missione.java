/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * Missione
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class Missione extends ClassificatoreGerarchico {

	private static final long serialVersionUID = 9087550013595737829L;

	public Missione() {
		super();
	}

	public Missione(String codice, String descrizione) {
		super(codice, descrizione);
	}

	public Missione(ClassificatoreGerarchico cg) {
		super(cg);
	}
	
	public Date getDataFineValiditaMissione() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaMissione(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
