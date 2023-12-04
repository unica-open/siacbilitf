/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;

/**
 * TipoFondo
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILDataDictionary.NAMESPACE)
public class TipoFondo extends ClassificatoreGenerico {

	private static final long serialVersionUID = 5804764211288989296L;

	public TipoFondo() {
		super();
	}

	public TipoFondo(String codice, String descrizione) {
		super(codice, descrizione);
	}
	
	public Date getDataFineValiditaTipoFondo() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaTipoFondo(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
