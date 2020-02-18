/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceQuotaIvaDifferitaEntrataResponse extends ServiceResponse {
	
	private SubdocumentoIvaEntrata subdocumentoIvaEntrata;

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
