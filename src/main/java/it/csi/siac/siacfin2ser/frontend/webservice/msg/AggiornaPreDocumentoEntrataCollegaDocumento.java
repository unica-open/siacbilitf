/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaPreDocumentoEntrataCollegaDocumento extends ServiceRequest {

	private PreDocumentoEntrata preDocumentoEntrata;
	private SubdocumentoEntrata subDocumentoEntrata;
	private Bilancio bilancio;
	
	/**
	 * @return the preDocumentoEntrata
	 */
	public PreDocumentoEntrata getPreDocumentoEntrata() {
		return preDocumentoEntrata;
	}
	/**
	 * @param preDocumentoEntrata the preDocumentoEntrata to set
	 */
	public void setPreDocumentoEntrata(PreDocumentoEntrata preDocumentoEntrata) {
		this.preDocumentoEntrata = preDocumentoEntrata;
	}
	/**
	 * @return the subDocumentoEntrata
	 */
	public SubdocumentoEntrata getSubDocumentoEntrata() {
		return subDocumentoEntrata;
	}
	/**
	 * @param subDocumentoEntrata the subDocumentoEntrata to set
	 */
	public void setSubDocumentoEntrata(SubdocumentoEntrata subDocumentoEntrata) {
		this.subDocumentoEntrata = subDocumentoEntrata;
	}
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
	
	
	
}
