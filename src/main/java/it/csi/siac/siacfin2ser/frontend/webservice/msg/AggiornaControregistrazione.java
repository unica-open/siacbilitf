/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaControregistrazione extends ServiceRequest {
	
	private Bilancio bilancio;
	private SubdocumentoIvaEntrata subdocumentoIvaEntrata;
	
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}

	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	/**
	 * @return the subdocumentoIvaEntrata
	 */
	public SubdocumentoIvaEntrata getSubdocumentoIvaEntrata() {
		return subdocumentoIvaEntrata;
	}

	/**
	 * @param subdocumentoIvaEntrata the subdocumentoIvaEntrata to set
	 */
	public void setSubdocumentoIvaEntrata(SubdocumentoIvaEntrata subdocumentoIvaEntrata) {
		this.subdocumentoIvaEntrata = subdocumentoIvaEntrata;
	}
	
}
