/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.sirfelser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.sirfelser.frontend.webservice.FELSvcDictionary;
import it.csi.siac.sirfelser.model.FatturaFEL;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FELSvcDictionary.NAMESPACE)
public class RicercaDettaglioFatturaElettronica extends ServiceRequest {
	
	private FatturaFEL fatturaFEL;

	/**
	 * @return the fatturaFEL
	 */
	public FatturaFEL getFatturaFEL() {
		return fatturaFEL;
	}

	/**
	 * @param fatturaFEL the fatturaFEL to set
	 */
	public void setFatturaFEL(FatturaFEL fatturaFEL) {
		this.fatturaFEL = fatturaFEL;
	}
	
	
	
	
}
