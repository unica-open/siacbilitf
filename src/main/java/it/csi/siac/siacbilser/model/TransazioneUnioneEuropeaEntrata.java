/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

import java.util.Date;

import it.csi.siac.siaccorser.model.ClassificatoreGenerico;
import it.csi.siac.siaccorser.model.TipoClassificatore;

public class TransazioneUnioneEuropeaEntrata extends ClassificatoreGenerico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8448562755756219781L;

	public TransazioneUnioneEuropeaEntrata() {
		super();
		
	}

	public TransazioneUnioneEuropeaEntrata(String codice, String descrizione) {
		super(codice, descrizione);
		
	}

	public TransazioneUnioneEuropeaEntrata(TipoClassificatore tipo, String codice) {
		super(tipo, codice);
		
	}
	
	public Date getDataFineValiditaTransazioneUnioneEuropeaEntrata() {
		return getDataFineValidita();
	}
	
	public void setDataFineValiditaTransazioneUnioneEuropeaEntrata(Date dataFineValidita) {
		setDataFineValidita(dataFineValidita);
	}

	
}
