/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;

/**
 * Request alla ricerca dei tipi di classificatore generico
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaTipoClassificatoreGenerico extends RicercaTipoClassificatoreBaseRequest {
	
	// FIXME: convertire in ENUM
	private String tipoElementoBilancio;

	/**
	 * @return the tipoElementoBilancio
	 */
	public String getTipoElementoBilancio() {
		return tipoElementoBilancio;
	}

	/**
	 * @param tipoElementoBilancio the tipoElementoBilancio to set
	 */
	public void setTipoElementoBilancio(String tipoElementoBilancio) {
		this.tipoElementoBilancio = tipoElementoBilancio;
	}

}
