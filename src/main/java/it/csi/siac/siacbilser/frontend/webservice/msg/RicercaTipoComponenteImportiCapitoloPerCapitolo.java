/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.Capitolo;
import it.csi.siac.siaccorser.model.ServiceRequest;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoComponenteImportiCapitoloPerCapitolo extends ServiceRequest {

	private Capitolo<?, ?> capitolo;
	// SIAC-7189
	private boolean soloValidiPerBilancio = false;

	/**
	 * @return the capitolo
	 */
	public Capitolo<?, ?> getCapitolo() {
		return capitolo;
	}

	/**
	 * @param capitolo the capitolo to set
	 */
	public void setCapitolo(Capitolo<?, ?> capitolo) {
		this.capitolo = capitolo;
	}

	/**
	 * @return the soloValidiPerBilancio
	 */
	public boolean isSoloValidiPerBilancio() {
		return this.soloValidiPerBilancio;
	}

	/**
	 * @param soloValidiPerBilancio the soloValidiPerBilancio to set
	 */
	public void setSoloValidiPerBilancio(boolean soloValidiPerBilancio) {
		this.soloValidiPerBilancio = soloValidiPerBilancio;
	}

}
