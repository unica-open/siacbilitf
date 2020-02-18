/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

public class RicorrenteSpesa extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4306280184057653190L;

	public RicorrenteSpesa() {
		super();
		
	}

	public RicorrenteSpesa(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public RicorrenteSpesa(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
		
	}
	
	public Date getDataFineValiditaRicorrenteSpesa() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaRicorrenteSpesa(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}
	
	
	

}
