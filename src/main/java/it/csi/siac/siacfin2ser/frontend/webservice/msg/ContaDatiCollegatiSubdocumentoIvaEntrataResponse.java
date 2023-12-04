/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;

public class ContaDatiCollegatiSubdocumentoIvaEntrataResponse extends ServiceResponse {
	
	private Long ordinativiCollegati;
	/**
	 * @return the ordinativiCollegati
	 */
	public Long getOrdinativiCollegati() {
		return ordinativiCollegati;
	}
	/**
	 * @param ordinativiCollegati the ordinativiCollegati to set
	 */
	public void setOrdinativiCollegati(Long ordinativiCollegati) {
		this.ordinativiCollegati = ordinativiCollegati;
	}
	
}
