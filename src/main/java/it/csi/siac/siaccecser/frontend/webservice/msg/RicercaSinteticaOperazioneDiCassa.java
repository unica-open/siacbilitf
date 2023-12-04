/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.OperazioneCassa;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaSinteticaOperazioneDiCassa extends ServiceRequest {

	private OperazioneCassa operazioneCassa;
	private ParametriPaginazione parametriPaginazione;
	
	/**
	 * @return the operazioneCassa
	 */
	public OperazioneCassa getOperazioneCassa() {
		return operazioneCassa;
	}
	/**
	 * @param operazioneCassa the operazioneCassa to set
	 */
	public void setOperazioneCassa(OperazioneCassa operazioneCassa) {
		this.operazioneCassa = operazioneCassa;
	}
	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}
	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
}
