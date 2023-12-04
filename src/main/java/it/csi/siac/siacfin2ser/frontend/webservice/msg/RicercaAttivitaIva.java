/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AttivitaIva;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaAttivitaIva extends ServiceRequest {
	
	private AttivitaIva attivitaIva;
	private Ente ente;

	/**
	 * @return the attivitaIva
	 */
	public AttivitaIva getAttivitaIva() {
		return attivitaIva;
	}

	/**
	 * @param attivitaIva the attivitaIva to set
	 */
	public void setAttivitaIva(AttivitaIva attivitaIva) {
		this.attivitaIva = attivitaIva;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	
}
