/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
/**
 * 
 */
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.CategoriaCespiti;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author elisa
 * @version 1.0.0 - 30-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class AnnullaCategoriaCespitiResponse extends ServiceResponse {
	
	private CategoriaCespiti categoriaCespiti;

	/**
	 * @return the tipoBeneCespite
	 */
	public CategoriaCespiti getCategoriaCespiti() {
		return categoriaCespiti;
	}

	/**
	 * @param tipoBeneCespite the tipoBeneCespite to set
	 */
	public void setCategoriaCespiti(CategoriaCespiti tipoBeneCespite) {
		this.categoriaCespiti = tipoBeneCespite;
	}

	
	
}
