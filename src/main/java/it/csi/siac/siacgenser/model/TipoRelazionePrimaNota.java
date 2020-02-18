/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.model;

import it.csi.siac.siaccorser.model.Codifica;

import javax.xml.bind.annotation.XmlType;

/**
 * Codifica per il Tipo di relazione tra prime note
 */
@XmlType(namespace = GENDataDictionary.NAMESPACE)
public class TipoRelazionePrimaNota extends Codifica {
	
	private static final long serialVersionUID = -7120696844519845885L;
	public static final String CODICE_RATEO = "RATEO";
	public static final String CODICE_RISCONTO = "RISCONTO";
	public static final String CODICE_RETTIFFICA = "R";
	public static final String CODICE_SOSTITUITO_DA = "S";
	public static final String CODICE_ALTRO = "A";
	
	private Boolean relazioneUtilizzabile;

	/**
	 * @return the relazioneUtilizzabile
	 */
	public Boolean getRelazioneUtilizzabile() {
		return relazioneUtilizzabile;
	}

	/**
	 * @param relazioneUtilizzabile the relazioneUtilizzabile to set
	 */
	public void setRelazioneUtilizzabile(Boolean relazioneUtilizzabile) {
		this.relazioneUtilizzabile = relazioneUtilizzabile;
	} 
	
	public boolean isRateo(){
		return CODICE_RATEO.equals(getCodice());
	}
	
	public boolean isRisconto(){
		return CODICE_RISCONTO.equals(getCodice());
	}
	
	public boolean isRettifica(){
		return CODICE_RETTIFFICA.equals(getCodice());
	}
	
	public boolean isSostituitoDa(){
		return CODICE_SOSTITUITO_DA.equals(getCodice());
	}
	
	public boolean isAltro(){
		return CODICE_ALTRO.equals(getCodice());
	}
	
	
	
	
}
