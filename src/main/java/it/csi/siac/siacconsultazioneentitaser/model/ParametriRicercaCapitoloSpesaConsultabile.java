/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacconsultazioneentitaser.model;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.Macroaggregato;
import it.csi.siac.siacbilser.model.TitoloSpesa;

@XmlType(namespace = ConsultazioneEntitaDataDictionary.NAMESPACE)
public class ParametriRicercaCapitoloSpesaConsultabile extends ParametriRicercaCapitoloConsultabile {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1471651417359131768L;

	
	private TitoloSpesa titoloSpesa;
	private Macroaggregato macroaggregato;

	/**
	 * @return the titoloSpesa
	 */
	public TitoloSpesa getTitoloSpesa() {
		return titoloSpesa;
	}
	/**
	 * @param titoloSpesa the titoloSpesa to set
	 */
	public void setTitoloSpesa(TitoloSpesa titoloSpesa) {
		this.titoloSpesa = titoloSpesa;
	}
	/**
	 * @return the macroaggregato
	 */
	public Macroaggregato getMacroaggregato() {
		return macroaggregato;
	}
	/**
	 * @param macroaggregato the macroaggregato to set
	 */
	public void setMacroaggregato(Macroaggregato macroaggregato) {
		this.macroaggregato = macroaggregato;
	}
	
	
	
}
