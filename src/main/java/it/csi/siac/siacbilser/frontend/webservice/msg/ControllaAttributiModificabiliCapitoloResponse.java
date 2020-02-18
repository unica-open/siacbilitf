/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.csi.siac.siacbilser.model.TipologiaAttributo;

/**
 * 
 * @author Domenico
 *
 */
public class ControllaAttributiModificabiliCapitoloResponse extends ControllaModificabilitaCapitoloResponse {
	
//	private Map<TipologiaClassificatore, Integer> classificatoriNonModificabili = new HashMap<TipologiaClassificatore, Integer>();
	
	private Map<TipologiaAttributo, Object> attributiNonModificabili = new HashMap<TipologiaAttributo, Object>();
	
//	private Long stessoNumCap = new Long(0);
//	private Long stessoNumCapArt = new Long(0);

	/**
	 * @return Elenco dei tipi di classificatori Modificabili.
	 */
	public List<TipologiaAttributo> getAttributiModificabili() {
		final List<TipologiaAttributo> result = new ArrayList<TipologiaAttributo>();
		
		for(TipologiaAttributo tc : TipologiaAttributo.values()){
			if(isModificabile(tc)){				
				result.add(tc);
			}
		}
		
		return result;
		
	}

	/**
	 * 
	 * @param tipo
	 * @return true se il tipo di attributo &eacute; modificabile.
	 */
	public boolean isModificabile(TipologiaAttributo tipo){
		//se non è presente nella mappa o è presente con valore nullo è modificabile
		
		return !attributiNonModificabili.containsKey(tipo);
		
		
	}
	
	
	/**
	 * 
	 * @param tipo
	 * @return true se il tipo di classificatore &eacute; modificabile per l'inserimento/aggiornamento massivo.
	 */
	public boolean isModificabileMassivo(TipologiaAttributo tipo){
		return !isModificabile(tipo);
	}

	

	
	public Map<TipologiaAttributo, Object> getAttributiNonModificabili() {
		return attributiNonModificabili;
	}

	public void setAttributiNonModificabili(Map<TipologiaAttributo, Object> attributiNonModificabili) {
		this.attributiNonModificabili = attributiNonModificabili!=null? attributiNonModificabili : new HashMap<TipologiaAttributo, Object>();
	}
	
	public void addAttributiNonModificabili(Map<TipologiaAttributo, Object> attributiNonModificabili) {
		getAttributiNonModificabili().putAll(attributiNonModificabili);
	}


	
	
	
	

}
