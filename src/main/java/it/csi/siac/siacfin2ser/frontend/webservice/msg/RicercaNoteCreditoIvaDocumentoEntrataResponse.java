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
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaEntrata;

public class RicercaNoteCreditoIvaDocumentoEntrataResponse extends ServiceResponse {
	
	@XmlElementWrapper(name="subdocumentiIvaEntrata")
	@XmlElement(name="subdocumentoIva")
	private List<SubdocumentoIvaEntrata> subdocumentoIvaEntrata = new ArrayList<SubdocumentoIvaEntrata>();

	/**
	 * @return the subdocumentoIvaEntrata
	 */
	@XmlTransient
	public List<SubdocumentoIvaEntrata> getSubdocumentoIvaEntrata() {
		return subdocumentoIvaEntrata;
	}

	/**
	 * @param subdocumentoIvaEntrata the subdocumentoIvaEntrata to set
	 */
	public void setSubdocumentoIvaEntrata(List<SubdocumentoIvaEntrata> subdocumentoIvaEntrata) {
		this.subdocumentoIvaEntrata = subdocumentoIvaEntrata != null ? subdocumentoIvaEntrata : new ArrayList<SubdocumentoIvaEntrata>();
	}
	
	
	
}
