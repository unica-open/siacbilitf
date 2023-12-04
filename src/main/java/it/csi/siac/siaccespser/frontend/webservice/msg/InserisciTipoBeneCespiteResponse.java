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
import it.csi.siac.siaccespser.model.TipoBeneCespite;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * @author Antonino
 * @version 1.0.0 - 31-05-2018
 *
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class InserisciTipoBeneCespiteResponse extends ServiceResponse {
	private TipoBeneCespite tipoBeneCespite;

	/**
	 * @return the tipoBeneCespite
	 */
	public TipoBeneCespite getTipoBeneCespite() {
		return tipoBeneCespite;
	}

	/**
	 * @param tipoBeneCespite the tipoBeneCespite to set
	 */
	public void setTipoBeneCespite(TipoBeneCespite tipoBeneCespite) {
		this.tipoBeneCespite = tipoBeneCespite;
	}
	

}
