/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;



/**
 * 
 * Risposta al metodo FIN.LiquidazioneService.RicercaLiquidazioneConAllegatoAtto
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaLiquidazioneConAllegatoAttoResponse extends
		ServiceResponse {
	
	boolean liquidazioneConAllegatoAtto = false;

	/**
	 * @return the annullabilitaLiquidazioneConAllegatoAtto
	 */
	public boolean isLiquidazioneConAllegatoAtto() {
		return liquidazioneConAllegatoAtto;
	}

	/**
	 * @param annullabilitaLiquidazioneConAllegatoAtto the annullabilitaLiquidazioneConAllegatoAtto to set
	 */
	public void setLiquidazioneConAllegatoAtto(
			boolean liquidazioneConAllegatoAtto) {
		this.liquidazioneConAllegatoAtto = liquidazioneConAllegatoAtto;
	}
	
	

}
