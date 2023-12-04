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
 * Response per la definizione del predocumento di spesa
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class DefiniscePreDocumentoEntrataResponse extends ServiceResponse {

	@XmlElementWrapper(name="predocumentiElaborati")
	@XmlElement(name="predocumento")
	private List<PreDocumentoEntrata> predocumentiElaborati = new ArrayList<PreDocumentoEntrata>();
	@XmlElementWrapper(name="predocumentiSaltati")
	@XmlElement(name="predocumento")
	private List<PreDocumentoEntrata> predocumentiSaltati = new ArrayList<PreDocumentoEntrata>();
	
	@XmlElementWrapper(name="messaggi")
	@XmlElement(name="messaggio")
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	/**
	 * @return the predocumentiElaborati
	 */
	@XmlTransient
	public List<PreDocumentoEntrata> getPredocumentiElaborati() {
		return predocumentiElaborati;
	}
	/**
	 * @param predocumentiElaborati the predocumentiElaborati to set
	 */
	public void setPredocumentiElaborati(List<PreDocumentoEntrata> predocumentiElaborati) {
		this.predocumentiElaborati = predocumentiElaborati != null ? predocumentiElaborati : new ArrayList<PreDocumentoEntrata>();
	}
	/**
	 * @return the predocumentiSaltati
	 */
	@XmlTransient
	public List<PreDocumentoEntrata> getPredocumentiSaltati() {
		return predocumentiSaltati;
	}
	/**
	 * @param predocumentiSaltati the predocumentiSaltati to set
	 */
	public void setPredocumentiSaltati(List<PreDocumentoEntrata> predocumentiSaltati) {
		this.predocumentiSaltati = predocumentiSaltati != null ? predocumentiSaltati : new ArrayList<PreDocumentoEntrata>();
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
