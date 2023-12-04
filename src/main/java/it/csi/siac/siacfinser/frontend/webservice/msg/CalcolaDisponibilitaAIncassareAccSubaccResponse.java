/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;



/**
 * Risposta al metodo FIN.MovimentoGestioneService.calcolaDisponibilitaAIncassareAccSubacc
 *  
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CalcolaDisponibilitaAIncassareAccSubaccResponse extends
		ServiceResponse {
	
	
	private BigDecimal disponibilitaAIncassare;
	private String motivazioneDisponibilitaAIncassare;

	/**
	 * @return the disponibilitaAIncassare
	 */
	public BigDecimal getDisponibilitaAIncassare() {
		return disponibilitaAIncassare;
	}

	/**
	 * @param disponibilitaAIncassare the disponibilitaAIncassare to set
	 */
	public void setDisponibilitaAIncassare(BigDecimal disponibilitaAIncassare) {
		this.disponibilitaAIncassare = disponibilitaAIncassare;
	}

	/**
	 * @return the motivazioneDisponibilitaAIncassare
	 */
	public String getMotivazioneDisponibilitaAIncassare() {
		return this.motivazioneDisponibilitaAIncassare;
	}

	/**
	 * @param motivazioneDisponibilitaAIncassare the motivazioneDisponibilitaAIncassare to set
	 */
	public void setMotivazioneDisponibilitaAIncassare(String motivazioneDisponibilitaAIncassare) {
		this.motivazioneDisponibilitaAIncassare = motivazioneDisponibilitaAIncassare;
	}
	
	

}
