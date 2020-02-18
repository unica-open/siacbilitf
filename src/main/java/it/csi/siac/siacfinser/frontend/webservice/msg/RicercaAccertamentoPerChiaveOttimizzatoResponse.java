/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.Accertamento;

/**
 * Risposta al metodo FIN.ImpegnoService.ricercaImpegnoPerChiave()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaAccertamentoPerChiaveOttimizzatoResponse extends RicercaAttributiMovimentoGestioneOttimizzatoResponse {

	private Bilancio bilancio;
	private CapitoloEntrataGestione capitoloEntrataGestione;
	private Accertamento accertamento;
	private Boolean hasStoricizzazioneNellBilancio;
	
	public Bilancio getBilancio() {
		return bilancio;
	}
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}
	public void setCapitoloEntrataGestione(
			CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
	}
	public Accertamento getAccertamento() {
		return accertamento;
	}
	public void setAccertamento(Accertamento accertamento) {
		this.accertamento = accertamento;
	}
	/**
	 * @return the hasStoricizzazioneNellBilancio
	 */
	public Boolean getHasStoricizzazioneNellBilancio() {
		return hasStoricizzazioneNellBilancio;
	}
	/**
	 * @param hasStoricizzazioneNellBilancio the hasStoricizzazioneNellBilancio to set
	 */
	public void setHasStoricizzazioneNellBilancio(Boolean hasStoricizzazioneNellBilancio) {
		this.hasStoricizzazioneNellBilancio = hasStoricizzazioneNellBilancio;
	}
	
	

}
