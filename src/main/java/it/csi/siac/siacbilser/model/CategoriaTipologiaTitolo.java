/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGerarchico;

/**
 * CategoriaTipologiaTitolo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class CategoriaTipologiaTitolo extends ClassificatoreGerarchico {

	private static final long serialVersionUID = 4169331035326257109L;

	public CategoriaTipologiaTitolo() {
		super();
	}

	public CategoriaTipologiaTitolo(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public Date getDataFineValiditaCategoriaTipologiaTitolo() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaCategoriaTipologiaTitolo(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
