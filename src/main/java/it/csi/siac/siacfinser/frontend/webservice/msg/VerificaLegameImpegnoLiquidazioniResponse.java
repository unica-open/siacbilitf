/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


/**
 * Risposta 
 * 
 * @author rnontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class VerificaLegameImpegnoLiquidazioniResponse extends ServiceResponse {

	Boolean liquidazioniCollegateAlMovimento;

	/**
	 * @return the liquidazioniCollegateAlMovimento
	 */
	public Boolean getLiquidazioniCollegateAlMovimento() {
		return liquidazioniCollegateAlMovimento;
	}

	/**
	 * @param liquidazioniCollegateAlMovimento the liquidazioniCollegateAlMovimento to set
	 */
	public void setLiquidazioniCollegateAlMovimento(
			Boolean liquidazioniCollegateAlMovimento) {
		this.liquidazioniCollegateAlMovimento = liquidazioniCollegateAlMovimento;
	}
	
		
}
