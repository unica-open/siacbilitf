/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

public class PoliticheRegionaliUnitarie extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5310148450057566896L;

	public PoliticheRegionaliUnitarie() {
		super();
		
	}

	public PoliticheRegionaliUnitarie(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public PoliticheRegionaliUnitarie(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
		
	}
	
	public Date getDataFineValiditaPoliticheRegionaliUnitarie() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaPoliticheRegionaliUnitarie(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

	
}
