/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

public class PerimetroSanitarioEntrata extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3767261498174996773L;

	public PerimetroSanitarioEntrata() {
		super();
		
	}

	public PerimetroSanitarioEntrata(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public PerimetroSanitarioEntrata(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
		
	}
	
	public Date getDataFineValiditaPerimetroSanitarioEntrata() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaPerimetroSanitarioEntrata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
