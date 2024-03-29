/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.TipoBeneCespite;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class AnnullaTipoBeneCespite extends ServiceRequest {
	private TipoBeneCespite tipoBeneCespite;
	private Integer annoAnnullamento;

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

	/**
	 * @return the annoAnnullamento
	 */
	public Integer getAnnoAnnullamento() {
		return this.annoAnnullamento;
	}

	/**
	 * @param annoAnnullamento the annoAnnullamento to set
	 */
	public void setAnnoAnnullamento(Integer annoAnnullamento) {
		this.annoAnnullamento = annoAnnullamento;
	}

}
