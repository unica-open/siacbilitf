/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di ricerca tipi atto di legge
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class RicercaTipiAttoDiLeggeResponse extends ServiceResponse {

	private List<TipoAtto> elencoTipi = new ArrayList<TipoAtto>();

	/**
	 * @return the elencoTipi
	 */
	public List<TipoAtto> getElencoTipi() {
		return elencoTipi;
	}

	/**
	 * @param elencoTipi the elencoTipi to set
	 */
	public void setElencoTipi(List<TipoAtto> elencoTipi) {
		this.elencoTipi = elencoTipi;
	}

}
