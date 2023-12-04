/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;

public class ContaDatiCollegatiSubdocumentoIvaSpesaResponse extends ServiceResponse {
	
	private Long ordinativiCollegati;
	private Long liquidazioniCollegate;
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
	/**
	 * @return the liquidazioniCollegate
	 */
	public Long getLiquidazioniCollegate() {
		return liquidazioniCollegate;
	}
	/**
	 * @param liquidazioniCollegate the liquidazioniCollegate to set
	 */
	public void setLiquidazioniCollegate(Long liquidazioniCollegate) {
		this.liquidazioniCollegate = liquidazioniCollegate;
	}
	
}
