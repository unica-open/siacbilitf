/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.model.ric;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.model.FINDataDictionary;
import it.csi.siac.siacfinser.model.StoricoImpegnoAccertamento;

/**
 * 
 * Tutti i parametri presenti sono opzionali. Nel caso in cui la ricerca
 * presenti un numero di risultati maggiore di 50 l'applicativo restituira l
 * errore : Ricerca Troppo Ampia, consigliando all utente di rendere piu
 * specifica la propria ricerca
 * 
 * @author Marco
 *
 */

@XmlType(namespace = FINDataDictionary.NAMESPACE)
public class ParametroRicercaStoricoImpegnoAccertamento implements Serializable {

	private static final long serialVersionUID = -1L;

	private StoricoImpegnoAccertamento storicoImpegnoAccertamento;
	private Bilancio bilancio;
	private Boolean escludiSubImpegni;
	/**
	 * @return the storicoImpegnoAccertamento
	 */
	public StoricoImpegnoAccertamento getStoricoImpegnoAccertamento() {
		return storicoImpegnoAccertamento;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param storicoImpegnoAccertamento the storicoImpegnoAccertamento to set
	 */
	public void setStoricoImpegnoAccertamento(StoricoImpegnoAccertamento storicoImpegnoAccertamento) {
		this.storicoImpegnoAccertamento = storicoImpegnoAccertamento;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the escludiSubImpegni
	 */
	public Boolean getEscludiSubImpegni() {
		return escludiSubImpegni;
	}
	/**
	 * @param escludiSubImpegni the escludiSubImpegni to set
	 */
	public void setEscludiSubImpegni(Boolean escludiSubImpegni) {
		this.escludiSubImpegni = escludiSubImpegni;
	}
	
	
	
	
	
}
