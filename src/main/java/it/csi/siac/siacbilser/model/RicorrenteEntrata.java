/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

public class RicorrenteEntrata extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4306280184057653190L;

	public RicorrenteEntrata() {
		super();
		
	}

	public RicorrenteEntrata(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public RicorrenteEntrata(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
		
	}
	
	public Date getDataFineValiditaRicorrenteEntrata() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaRicorrenteEntrata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}
	

}
