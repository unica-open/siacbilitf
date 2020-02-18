/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.PrimaNota;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class CollegaPrimeNoteResponse extends ServiceResponse {

	private PrimaNota primaNotaPadre;
	private PrimaNota primaNotaFiglia;
	/**
	 * @return the primaNotaPadre
	 */
	public PrimaNota getPrimaNotaPadre() {
		return primaNotaPadre;
	}
	/**
	 * @param primaNotaPadre the primaNotaPadre to set
	 */
	public void setPrimaNotaPadre(PrimaNota primaNotaPadre) {
		this.primaNotaPadre = primaNotaPadre;
	}
	/**
	 * @return the primaNotaFiglia
	 */
	public PrimaNota getPrimaNotaFiglia() {
		return primaNotaFiglia;
	}
	/**
	 * @param primaNotaFiglia the primaNotaFiglia to set
	 */
	public void setPrimaNotaFiglia(PrimaNota primaNotaFiglia) {
		this.primaNotaFiglia = primaNotaFiglia;
	}


	
}
