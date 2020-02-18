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
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AttivaRegistrazioniContabiliSpesaResponse extends ServiceResponse {

	private DocumentoSpesa documentoSpesa;
	
	private List<RegistrazioneMovFin> registrazioniMovFinInserite = new ArrayList<RegistrazioneMovFin>();
	
	
	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
	}

	/**
	 * Gets the registrazioni mov fin inserite.
	 *
	 * @return the registrazioniMovFinInserite
	 */
	public List<RegistrazioneMovFin> getRegistrazioniMovFinInserite() {
		return registrazioniMovFinInserite;
	}

	/**
	 * Sets the registrazioni mov fin inserite.
	 *
	 * @param registrazioniMovFinInserite the registrazioniMovFinInserite to set
	 */
	public void setRegistrazioniMovFinInserite(List<RegistrazioneMovFin> registrazioniMovFinInserite) {
		this.registrazioniMovFinInserite = registrazioniMovFinInserite;
	}
	
	
}
