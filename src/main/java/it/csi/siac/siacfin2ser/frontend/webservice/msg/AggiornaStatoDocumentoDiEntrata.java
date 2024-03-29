/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoDocumentoDiEntrata extends ServiceRequest {

	private DocumentoEntrata documentoEntrata;
	private Bilancio bilancio;
	//SIAC-5333
	private Boolean saltaInserimentoPrimaNota;
	/**
	 * @return the documentoEntrata
	 */
	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	/**
	 * @param documentoEntrata the documentoEntrata to set
	 */
	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
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

	/**
	 * @return the saltaInserimentoPrimaNota
	 */
	public Boolean getSaltaInserimentoPrimaNota() {
		return saltaInserimentoPrimaNota;
	}

	/**
	 * @param saltaInserimentoPrimaNota the saltaInserimentoPrimaNota to set
	 */
	public void setSaltaInserimentoPrimaNota(Boolean saltaInserimentoPrimaNota) {
		this.saltaInserimentoPrimaNota = saltaInserimentoPrimaNota;
	}
	
	
}
