/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Progetto;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Ricerca i cronoprogrammi associati al progetto e filtrati per bilancio di appartenenza
 * @author Marchino Alessandro
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDeiCronoprogrammiCollegatiAlProgettoPerBilancio extends ServiceRequest {

	private Progetto progetto;
	private Bilancio bilancio;
	
	/**
	 * @return the progetto
	 */
	public Progetto getProgetto() {
		return progetto;
	}
	/**
	 * @param progetto the progetto to set
	 */
	public void setProgetto(Progetto progetto) {
		this.progetto = progetto;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

}
