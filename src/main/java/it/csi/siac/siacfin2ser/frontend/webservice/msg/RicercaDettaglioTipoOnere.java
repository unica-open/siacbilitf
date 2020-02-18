/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.TipoOnere;
import it.csi.siac.siacfin2ser.model.TipoOnereModelDetail;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaDettaglioTipoOnere extends ServiceRequest {
	
	private TipoOnereModelDetail[] tipoOnereModelDetails;
	private TipoOnere tipoOnere;

	/**
	 * @return the tipoOnere
	 */
	public TipoOnere getTipoOnere() {
		return tipoOnere;
	}

	/**
	 * @param tipoOnere the tipoOnere to set
	 */
	public void setTipoOnere(TipoOnere tipoOnere) {
		this.tipoOnere = tipoOnere;
	}

	/**
	 * @return the tipoOnereModelDetails
	 */
	public TipoOnereModelDetail[] getTipoOnereModelDetails() {
		return tipoOnereModelDetails;
	}

	/**
	 * @param tipoOnereModelDetails the tipoOnereModelDetails to set
	 */
	public void setTipoOnereModelDetails(TipoOnereModelDetail... tipoOnereModelDetails) {
		this.tipoOnereModelDetails = tipoOnereModelDetails;
	}

	
}
