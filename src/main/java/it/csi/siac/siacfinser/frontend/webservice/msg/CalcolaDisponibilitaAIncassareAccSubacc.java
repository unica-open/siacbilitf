/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;


/**
 * Richiesta al metodo FIN.MovimentoGestioneService.calcolaDisponibilitaAIncassareAccSubacc
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class CalcolaDisponibilitaAIncassareAccSubacc extends ServiceRequest {
	
	
	Integer uidMovimentoGestione;

	/**
	 * @return the uidMovimentoGestione
	 */
	public Integer getUidMovimentoGestione() {
		return uidMovimentoGestione;
	}

	/**
	 * @param uidMovimentoGestione the uidMovimentoGestione to set
	 */
	public void setUidMovimentoGestione(Integer uidMovimentoGestione) {
		this.uidMovimentoGestione = uidMovimentoGestione;
	}
	
	

}
