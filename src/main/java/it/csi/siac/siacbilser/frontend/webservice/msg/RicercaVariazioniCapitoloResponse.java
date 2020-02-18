/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.RiepilogoDatiVariazioneImportoCapitoloAnno;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloService.ricercaVariazioniCapitolo()
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaVariazioniCapitoloResponse extends ServiceResponse {
	
	private RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoPositive;
	private RiepilogoDatiVariazioneImportoCapitoloAnno riepilogoDatiVariazioneImportiCapitoloPerAnnoNegative;
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

}
