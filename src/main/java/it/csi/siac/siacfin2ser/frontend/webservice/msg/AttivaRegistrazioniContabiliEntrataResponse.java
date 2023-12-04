/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AttivaRegistrazioniContabiliEntrataResponse extends ServiceResponse {

	private DocumentoEntrata documentoEntrata;
	private List<RegistrazioneMovFin> registrazioniMovFinInserite = new ArrayList<RegistrazioneMovFin>();

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
	 * @return the registrazioniMovFinInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinInserite() {
		return registrazioniMovFinInserite;
	}

	/**
	 * @param registrazioniMovFinInserite the registrazioniMovFinInserite to set
	 */
	public void setRegistrazioniMovFinInserite(List<RegistrazioneMovFin> registrazioniMovFinInserite) {
		this.registrazioniMovFinInserite = registrazioniMovFinInserite;
	}

	
}
