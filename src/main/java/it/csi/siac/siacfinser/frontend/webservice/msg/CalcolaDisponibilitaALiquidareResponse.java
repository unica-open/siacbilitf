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
 *  
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CalcolaDisponibilitaALiquidareResponse extends ServiceResponse {
	
	private BigDecimal disponibilitaALiquidare;
	// SIAC-6695
	private String motivazioneDisponibilitaLiquidare;

	/**
	 * @return the disponibilitaALiquidare
	 */
	public BigDecimal getDisponibilitaALiquidare() {
		return disponibilitaALiquidare;
	}

	/**
	 * @param disponibilitaALiquidare the disponibilitaALiquidare to set
	 */
	public void setDisponibilitaALiquidare(BigDecimal disponibilitaALiquidare) {
		this.disponibilitaALiquidare = disponibilitaALiquidare;
	}

	/**
	 * @return the motivazioneDisponibilitaLiquidare
	 */
	public String getMotivazioneDisponibilitaLiquidare() {
		return this.motivazioneDisponibilitaLiquidare;
	}

	/**
	 * @param motivazioneDisponibilitaLiquidare the motivazioneDisponibilitaLiquidare to set
	 */
	public void setMotivazioneDisponibilitaLiquidare(String motivazioneDisponibilitaLiquidare) {
		this.motivazioneDisponibilitaLiquidare = motivazioneDisponibilitaLiquidare;
	}

	
}