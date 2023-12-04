/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.RiepilogoDatiVariazioneImportoCapitoloAnno;
import it.csi.siac.siacbilser.model.RiepilogoDatiVariazioneStatoIdVariazione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloService.ricercaVariazioniCapitolo()
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioniCapitoloResponse extends ServiceResponse {
	
	private RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive;
	private RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative;
	// CONTABILIA-285
	private RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre;
	
	//SIAC-7735
	private List<RiepilogoDatiVariazioneStatoIdVariazione> riepilogoDatiVariazioneStatoIdVariazioneList = new ArrayList<RiepilogoDatiVariazioneStatoIdVariazione>();
	
	
	
	
	
	/**
	 * @return the riepilogoDatiVariazioneStatoIdVariazioneList
	 */
	public List<RiepilogoDatiVariazioneStatoIdVariazione> getRiepilogoDatiVariazioneStatoIdVariazioneList() {
		return riepilogoDatiVariazioneStatoIdVariazioneList;
	}
	/**
	 * @param riepilogoDatiVariazioneStatoIdVariazioneList the riepilogoDatiVariazioneStatoIdVariazioneList to set
	 */
	public void setRiepilogoDatiVariazioneStatoIdVariazioneList(
			List<RiepilogoDatiVariazioneStatoIdVariazione> riepilogoDatiVariazioneStatoIdVariazioneList) {
		this.riepilogoDatiVariazioneStatoIdVariazioneList = riepilogoDatiVariazioneStatoIdVariazioneList;
	}
	/**
	 * @return the riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive
	 */
	public RiepilogoDatiVariazioneImportoCapitoloAnno getRiepilogoDatiVariazioneImportiCapitoloPerAnnoPositive() {
		return riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive;
	}
	/**
	 * @param riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive the riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive to set
	 */
	public void setRiepilogoDatiVariazioneImportiCapitoloPerAnnoPositive(RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive) {
		this.riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive = riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive;
	}
	/**
	 * @return the riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative
	 */
	public RiepilogoDatiVariazioneImportoCapitoloAnno getRiepilogoDatiVariazioneImportiCapitoloPerAnnoNegative() {
		return riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative;
	}
	/**
	 * @param riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative the riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative to set
	 */
	public void setRiepilogoDatiVariazioneImportiCapitoloPerAnnoNegative(RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative) {
		this.riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative = riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative;
	}
	
	// CONTABILIA-285 INIZIO
	public RiepilogoDatiVariazioneImportoCapitoloAnno getRiepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre() {
		return riepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre;
	}
	public void setRiepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre(
			RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre) {
		this.riepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre = riepilogoDatiVariazioneImportiCapitoloPerAnnoNeutre;
	}
	// CONTABILIA-285 FINE

}
