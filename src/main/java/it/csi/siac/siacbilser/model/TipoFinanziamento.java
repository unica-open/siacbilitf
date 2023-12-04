/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

/**
 * TipoFinanziamento
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipoFinanziamento extends ClassificatoreGenerico {

	private static final long serialVersionUID = 7000692866502311289L;

	public TipoFinanziamento() {
		super();

	}

	public TipoFinanziamento(String codice, String descrizione) {
		super(codice, descrizione);

	}

	public TipoFinanziamento(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
	}
	
	public Date getDataFineValiditaTipoFinanziamento() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaTipoFinanziamento(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
