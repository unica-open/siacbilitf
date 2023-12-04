/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaSpesa;

public class RicercaNoteCreditoIvaDocumentoSpesaResponse extends ServiceResponse {
	
	@XmlElementWrapper(name="subdocumentiIvaSpesa")
	@XmlElement(name="subdocumentoIva")
	private List<SubdocumentoIvaSpesa> subdocumentoIvaSpesa = new ArrayList<SubdocumentoIvaSpesa>();

	/**
	 * @return the subdocumentoIvaSpesa
	 */
	@XmlTransient
	public List<SubdocumentoIvaSpesa> getSubdocumentoIvaSpesa() {
		return subdocumentoIvaSpesa;
	}

	/**
	 * @param subdocumentoIvaSpesa the subdocumentoIvaSpesa to set
	 */
	public void setSubdocumentoIvaSpesa(List<SubdocumentoIvaSpesa> subdocumentoIvaSpesa) {
		this.subdocumentoIvaSpesa = subdocumentoIvaSpesa != null ? subdocumentoIvaSpesa : new ArrayList<SubdocumentoIvaSpesa>();
	}
	
	
	
}
