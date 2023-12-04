/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaSpesa;

public class RicercaDettaglioSubdocumentoIvaSpesaResponse extends ServiceResponse {
	
	private SubdocumentoIvaSpesa subdocumentoIvaSpesa;
	
	/**
	 * @return the subdocumentoIvaSpesa
	 */
	public SubdocumentoIvaSpesa getSubdocumentoIvaSpesa() {
		return subdocumentoIvaSpesa;
	}
	/**
	 * @param subdocumentoIvaSpesa the subdocumentoIvaSpesa to set
	 */
	public void setSubdocumentoIvaSpesa(SubdocumentoIvaSpesa subdocumentoIvaSpesa) {
		this.subdocumentoIvaSpesa = subdocumentoIvaSpesa;
	}
	
}
