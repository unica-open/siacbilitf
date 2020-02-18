/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.TipoOperazioneCassa;
import it.csi.siac.siaccorser.model.ServiceResponse;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class AggiornaTipoOperazioneDiCassaResponse extends ServiceResponse {

	private TipoOperazioneCassa tipoOperazioneCassa;

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
}
