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
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Errore;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

/**
 * Response per la definizione del predocumento di entrata
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class CompletaDefiniscePreDocumentoEntrataResponse extends ServiceResponse {

	@XmlElementWrapper(name="predocumentiCompletati")
	@XmlElement(name="predocumento")
	private List<PreDocumentoEntrata> predocumentiCompletati = new ArrayList<PreDocumentoEntrata>();
	
	@XmlElementWrapper(name="messaggi")
	@XmlElement(name="messaggio")
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	/**
	 * @return the predocumentiCompletati
	 */
	@XmlTransient
	public List<PreDocumentoEntrata> getPredocumentiCompletati() {
		return predocumentiCompletati;
	}
	/**
	 * @param predocumentiCompletati the predocumentiCompletati to set
	 */
	public void setPredocumentiCompletati(List<PreDocumentoEntrata> predocumentiCompletati) {
		this.predocumentiCompletati = predocumentiCompletati;
	}
	/**
	 * @return the messaggi
	 */
	@XmlTransient
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
