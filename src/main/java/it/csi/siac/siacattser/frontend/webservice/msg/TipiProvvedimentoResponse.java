/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacattser.frontend.webservice.msg;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacattser.frontend.webservice.ATTSvcDictionary;
import it.csi.siac.siacattser.model.TipoAtto;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Response del servizio di ricerca tipi provvedimento
 */
@XmlType(namespace = ATTSvcDictionary.NAMESPACE)
public class TipiProvvedimentoResponse extends ServiceResponse {
	
	private List<TipoAtto> elencoTipi = null;

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
