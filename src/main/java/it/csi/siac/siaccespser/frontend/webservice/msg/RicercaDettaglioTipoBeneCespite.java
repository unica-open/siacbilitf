/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.TipoBeneCespite;
import it.csi.siac.siaccespser.model.TipoBeneCespiteModelDetail;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaDettaglioTipoBeneCespite  extends RicercaSinteticaBaseRequest {
	private TipoBeneCespite tipoBeneCespite;
	private TipoBeneCespiteModelDetail[] tipoBeneCespiteModelDetail;
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
	 * @return the tipoBeneCespiteModelDetail
	 */
	public TipoBeneCespiteModelDetail[] getTipoBeneCespiteModelDetail() {
		return tipoBeneCespiteModelDetail;
	}

	/**
	 * @param tipoBeneCespiteModelDetail the tipoBeneCespiteModelDetail to set
	 */
	public void setTipoBeneCespiteModelDetail(TipoBeneCespiteModelDetail[] tipoBeneCespiteModelDetail) {
		this.tipoBeneCespiteModelDetail = tipoBeneCespiteModelDetail;
	}


}
