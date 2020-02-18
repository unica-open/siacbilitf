/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

/**
 * Response per l'associazione delle imputazioni contabili variate
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaImputazioniContabiliVariatePreDocumentoEntrataResponse extends ServiceResponse {
	
	private List<PreDocumentoEntrata> preDocumentiEntrataAggiornati = new ArrayList<PreDocumentoEntrata>();
	private List<PreDocumentoEntrata> preDocumentiEntrataSaltati = new ArrayList<PreDocumentoEntrata>();
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	/**
	 * @return the preDocumentiEntrataAggiornati
	 */
	public List<PreDocumentoEntrata> getPreDocumentiEntrataAggiornati() {
		return preDocumentiEntrataAggiornati;
	}
	/**
	 * @param preDocumentiEntrataAggiornati the preDocumentiEntrataAggiornati to set
	 */
	public void setPreDocumentiEntrataAggiornati(List<PreDocumentoEntrata> preDocumentiEntrataAggiornati) {
		this.preDocumentiEntrataAggiornati = preDocumentiEntrataAggiornati != null ? preDocumentiEntrataAggiornati : new ArrayList<PreDocumentoEntrata>();
	}
	/**
	 * @return the preDocumentiEntrataSaltati
	 */
	public List<PreDocumentoEntrata> getPreDocumentiEntrataSaltati() {
		return preDocumentiEntrataSaltati;
	}
	/**
	 * @param preDocumentiEntrataSaltati the preDocumentiEntrataSaltati to set
	 */
	public void setPreDocumentiEntrataSaltati(List<PreDocumentoEntrata> preDocumentiEntrataSaltati) {
		this.preDocumentiEntrataSaltati = preDocumentiEntrataSaltati != null ? preDocumentiEntrataSaltati : new ArrayList<PreDocumentoEntrata>();
	}
	/**
	 * @return the messaggi
	 */
	public List<Messaggio> getMessaggi() {
		return messaggi;
	}
	/**
	 * @param messaggi the messaggi to set
	 */
	public void setMessaggi(List<Messaggio> messaggi) {
		this.messaggi = messaggi != null ? messaggi : new ArrayList<Messaggio>();
	}
	/**
	 * Adds a messaggio
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	public void addMessaggio(String codice, String descrizione) {
		messaggi.add(new Messaggio(codice, descrizione));
	}
	/**
	 * Adds a messaggio
	 * @param errore the errore
	 */
	public void addMessaggio(Errore errore) {
		addMessaggio(errore.getCodice(), errore.getDescrizione());
	}
}
