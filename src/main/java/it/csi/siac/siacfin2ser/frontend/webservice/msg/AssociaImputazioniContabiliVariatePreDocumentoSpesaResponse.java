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
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

/**
 * Response per l'associazione delle imputazioni contabili variate
 * @author Marchino Alessandro
 *
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaImputazioniContabiliVariatePreDocumentoSpesaResponse extends ServiceResponse {
	
	private List<PreDocumentoSpesa> preDocumentiSpesaAggiornati = new ArrayList<PreDocumentoSpesa>();
	private List<PreDocumentoSpesa> preDocumentiSpesaSaltati = new ArrayList<PreDocumentoSpesa>();
	
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	/**
	 * @return the preDocumentiSpesaAggiornati
	 */
	public List<PreDocumentoSpesa> getPreDocumentiSpesaAggiornati() {
		return preDocumentiSpesaAggiornati;
	}
	/**
	 * @param preDocumentiSpesaAggiornati the preDocumentiSpesaAggiornati to set
	 */
	public void setPreDocumentiSpesaAggiornati(List<PreDocumentoSpesa> preDocumentiSpesaAggiornati) {
		this.preDocumentiSpesaAggiornati = preDocumentiSpesaAggiornati != null ? preDocumentiSpesaAggiornati : new ArrayList<PreDocumentoSpesa>();
	}
	/**
	 * @return the preDocumentiSpesaSaltati
	 */
	public List<PreDocumentoSpesa> getPreDocumentiSpesaSaltati() {
		return preDocumentiSpesaSaltati;
	}
	/**
	 * @param preDocumentiSpesaSaltati the preDocumentiSpesaSaltati to set
	 */
	public void setPreDocumentiSpesaSaltati(List<PreDocumentoSpesa> preDocumentiSpesaSaltati) {
		this.preDocumentiSpesaSaltati = preDocumentiSpesaSaltati != null ? preDocumentiSpesaSaltati : new ArrayList<PreDocumentoSpesa>();
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
