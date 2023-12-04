/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaPreDocumentoEntrataCollegaDocumentoResponse extends ServiceResponse {

	
	private PreDocumentoEntrata preDocumentoEntrataAggiornato;
	private SubdocumentoEntrata subDocumentoEntrata;
	
	
	/**
	 * @return the preDocumentoEntrata
	 */
	public PreDocumentoEntrata getPreDocumentoEntrataAggiornato() {
		return preDocumentoEntrataAggiornato;
	}
	/**
	 * @param preDocumentoEntrata the preDocumentoEntrata to set
	 */
	public void setPreDocumentoEntrataAggiornato(PreDocumentoEntrata preDocumentoEntrataAggiornato) {
		this.preDocumentoEntrataAggiornato = preDocumentoEntrataAggiornato;
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
	
}
