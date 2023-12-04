/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.model;

/**
 * Applicazione della Variazione.
 * 
 */
public enum ApplicazioneVariazione {
	
	PREVISIONE("Previsione"),
	GESTIONE("Gestione"),
	;
//	ASSESTAMENTO("Assestamento"); //SIAC-3666 Assestamento non esiste.
	
	
	private String descrizione;

	private ApplicazioneVariazione(String descrizione){
		this.descrizione = descrizione;
	}

	/**
	 * @return the descrizione
	 */
	public String getDescrizione() {
		return descrizione;
	}

}
