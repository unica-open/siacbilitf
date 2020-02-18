/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacconsultazioneentitaser.frontend.webservice.ConsultazioneEntitaSvcDictionary;
import it.csi.siac.siacconsultazioneentitaser.model.TipoEntitaConsultabile;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Classe di response per la ricerca delle entita selezionabili a partire da una data entita
 * @author Elisa Chiari
 * @version 1.0.0 - 18/02/2016
 *
 */
@XmlType(namespace = ConsultazioneEntitaSvcDictionary.NAMESPACE)
public class OttieniNavigazioneTipoEntitaConsultabileResponse extends ServiceResponse {
	
	private List<TipoEntitaConsultabile> entitaConsultabili = new ArrayList<TipoEntitaConsultabile>();
	
	boolean isParent;

	/**
	 * @return the entitaConsultabili
	 */
	public List<TipoEntitaConsultabile> getEntitaConsultabili() {
		return entitaConsultabili;
	}

	/**
	 * @param entitaConsultabili the entitaConsultabili to set
	 */
	public void setEntitaConsultabili(List<TipoEntitaConsultabile> entitaConsultabili) {
		this.entitaConsultabili = entitaConsultabili;
	}

	/**
	 * @return the isParent
	 */
	public boolean isParent() {
		return isParent;
	}

	/**
	 * @param isParent the isParent to set
	 */
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	
	

	


}
