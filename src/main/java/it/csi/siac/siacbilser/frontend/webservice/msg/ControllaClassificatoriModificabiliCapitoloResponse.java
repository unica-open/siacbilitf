/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.csi.siac.siaccorser.model.TipologiaClassificatore;

/**
 * 
 * @author Domenico
 *
 */
public class ControllaClassificatoriModificabiliCapitoloResponse extends ControllaModificabilitaCapitoloResponse {
	
		
	private Map<TipologiaClassificatore, Integer> classificatoriNonModificabili = new HashMap<TipologiaClassificatore, Integer>();
	
	private Map<TipologiaClassificatore, Integer> classificatoriNonModificabiliPerMovimentoGestione = new HashMap<TipologiaClassificatore, Integer>();
	
	private boolean presenteMovimentoGestione = false;

	/**
	 * @return Elenco dei tipi di classificatori Modificabili.
	 */
	public List<TipologiaClassificatore> getTipiClassificatoriModificabili() {
		final List<TipologiaClassificatore> result = new ArrayList<TipologiaClassificatore>();
		
		for(TipologiaClassificatore tc : TipologiaClassificatore.values()){
			if(isModificabile(tc)){				
				result.add(tc);
			}
		}
		
		return result;
		
	}
	
	/**
	 * 
	 * @param tipo
	 * @return true se il tipo di classificatore &eacute; modificabile.
	 */
	public boolean isModificabile(TipologiaClassificatore tipo){
		//se non è presente nella mappa o è presente con valore nullo è modificabile
		//return classificatoriNonModificabili.get(tipo)==null;
		return !classificatoriNonModificabili.containsKey(tipo);
		
		
	}
	
	/**
	 * 
	 * @param tipo
	 * @return true se il tipo di classificatore &eacute; modificabile per l'inserimento/aggiornamento massivo.
	 */
	public boolean isModificabileMassivo(TipologiaClassificatore tipo){
		return !isModificabile(tipo);
	}

	/**
	 * @return the classificatoriNonModificabili
	 */
	public Map<TipologiaClassificatore, Integer> getClassificatoriNonModificabili() {
		return classificatoriNonModificabili;
	}

	/**
	 * @param classificatoriNonModificabili the classificatoriNonModificabili to set
	 */
	public void setClassificatoriNonModificabili(Map<TipologiaClassificatore, Integer> classificatori) {
		this.classificatoriNonModificabili = classificatori;
	}
	
	/**
	 * 
	 * @param classificatori
	 */
	public void addClassificatoriNonModificabili(Map<TipologiaClassificatore, Integer> classificatori) {
		getClassificatoriNonModificabili().putAll(classificatori);
	}

	
	
	/**
	 * @return the classificatoriNonModificabiliPerMovimentoGestione
	 */
	public Map<TipologiaClassificatore, Integer> getClassificatoriNonModificabiliPerMovimentoGestione() {
		return classificatoriNonModificabiliPerMovimentoGestione;
	}

	/**
	 * @param classificatoriNonModificabiliPerMovimentoGestione the classificatoriNonModificabiliPerMovimentoGestione to set
	 */
	public void setClassificatoriNonModificabiliPerMovimentoGestione(
			Map<TipologiaClassificatore, Integer> classificatoriNonModificabiliPerMovimentoGestione) {
		this.classificatoriNonModificabiliPerMovimentoGestione = classificatoriNonModificabiliPerMovimentoGestione;
	}
	
	public void addClassificatoriNonModificabiliPerMovimentoGestione(Map<TipologiaClassificatore, Integer> classificatoriNonModificabiliPerMovimentoGestione) {
		getClassificatoriNonModificabiliPerMovimentoGestione().putAll(classificatoriNonModificabiliPerMovimentoGestione);
	}
	
	/**
	 * 
	 * @param tipo
	 * @return true se il tipo di classificatore &eacute; modificabile.
	 */
	public boolean isModificabilePerMovimentoGestione(TipologiaClassificatore tipo){
		//se non e' presente nella mappa o è presente con valore nullo è modificabile
		//return classificatoriNonModificabili.get(tipo)==null;
		return !classificatoriNonModificabiliPerMovimentoGestione.containsKey(tipo);
		
		
	}

	/**
	 * @return the presenteMovimentoGestione
	 */
	public boolean isPresenteMovimentoGestione() {
		return presenteMovimentoGestione;
	}

	/**
	 * @param presenteMovimentoGestione the presenteMovimentoGestione to set
	 */
	public void setPresenteMovimentoGestione(boolean presenteMovimentoGestione) {
		this.presenteMovimentoGestione = presenteMovimentoGestione;
	}

}
