/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

public class ContoCorrentePredocumentoEntrata extends ClassificatoreGenerico {


	/** Per la serializzazione */
	private static final long serialVersionUID = -1365816656080031630L;

	public ContoCorrentePredocumentoEntrata() {
		super();
		
	}

	public ContoCorrentePredocumentoEntrata(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public ContoCorrentePredocumentoEntrata(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
		
	}
	
	public Date getDataFineValiditaContoCorrentePredocumentoEntrata() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaContoCorrentePredocumentoEntrata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

}
