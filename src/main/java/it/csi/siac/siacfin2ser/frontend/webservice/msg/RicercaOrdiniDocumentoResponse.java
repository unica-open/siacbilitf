/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.Ordine;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaOrdiniDocumentoResponse extends ServiceResponse {

	List<Ordine> ordini = new ArrayList<Ordine>();

	/**
	 * @return the ordini
	 */
	public List<Ordine> getOrdini() {
		return ordini;
	}

	/**
	 * @param ordini the ordini to set
	 */
	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}

	
	
}
