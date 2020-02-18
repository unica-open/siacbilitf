/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoOperazioneCassa;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class AnnullaTipoOperazioneDiCassa extends ServiceRequest {

	private TipoOperazioneCassa tipoOperazioneCassa;
	private Bilancio bilancio;

	/**
	 * @return the tipoOperazioneCassa
	 */
	public TipoOperazioneCassa getTipoOperazioneCassa() {
		return tipoOperazioneCassa;
	}

	/**
	 * @param tipoOperazioneCassa the tipoOperazioneCassa to set
	 */
	public void setTipoOperazioneCassa(TipoOperazioneCassa tipoOperazioneCassa) {
		this.tipoOperazioneCassa = tipoOperazioneCassa;
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
