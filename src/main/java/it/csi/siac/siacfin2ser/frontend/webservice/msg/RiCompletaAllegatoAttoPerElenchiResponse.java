/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.AllegatoAtto;
import it.csi.siac.siacfin2ser.model.ElencoDocumentiAllegato;
import it.csi.siac.siacfin2ser.model.Subdocumento;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RiCompletaAllegatoAttoPerElenchiResponse extends ServiceResponse {

	private AllegatoAtto allegatoAtto;
	private List<ElencoDocumentiAllegato> elenchiScartati = new ArrayList<ElencoDocumentiAllegato>();
	
	@XmlElements({
		@XmlElement(name="subdocumentoSpesa", type=SubdocumentoSpesa.class),
		@XmlElement(name="subdocumentoEntrata", type=SubdocumentoEntrata.class)
	})
	private List<Subdocumento<?,?>> subdocumentiScartati = new ArrayList<Subdocumento<?,?>>();
	
	private Long countQuoteRiCompletate = Long.valueOf(0);
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	/**
	 * @return the allegatoAtto
	 */
	public AllegatoAtto getAllegatoAtto() {
		return allegatoAtto;
	}

	/**
	 * @param allegatoAtto the allegatoAtto to set
	 */
	public void setAllegatoAtto(AllegatoAtto allegatoAtto) {
		this.allegatoAtto = allegatoAtto;
	}
	
	public void incCountQuoteRiCompletate() {
		countQuoteRiCompletate++;
	}

	/**
	 * @return the countQuoteRiCompletate
	 */
	public Long getCountQuoteRiCompletate() {
		return countQuoteRiCompletate;
	}

	/**
	 * @param countQuoteRiCompletate the countQuoteRiCompletate to set
	 */
	public void setCountQuoteRiCompletate(Long countQuoteRiCompletate) {
		this.countQuoteRiCompletate = countQuoteRiCompletate;
	}

	/**
	 * @return the elenchiScartati
	 */
	public List<ElencoDocumentiAllegato> getElenchiScartati() {
		return elenchiScartati;
	}

	/**
	 * @param elenchiScartati the elenchiScartati to set
	 */
	public void setElenchiScartati(List<ElencoDocumentiAllegato> elenchiScartati) {
		this.elenchiScartati = elenchiScartati != null ? elenchiScartati : new ArrayList<ElencoDocumentiAllegato>();
	}

	/**
	 * @return the subdocumentiScartati
	 */
	@XmlTransient
	public List<Subdocumento<?, ?>> getSubdocumentiScartati() {
		return subdocumentiScartati;
	}

	/**
	 * @param subdocumentiScartati the subdocumentiScartati to set
	 */
	public void setSubdocumentiScartati(List<Subdocumento<?, ?>> subdocumentiScartati) {
		this.subdocumentiScartati = subdocumentiScartati != null ? subdocumentiScartati : new ArrayList<Subdocumento<?,?>>();
	}

	/**
	 * Adds the messaggio.
	 *
	 * @param messaggio the messaggio
	 */
	public void addMessaggio(Messaggio messaggio) {
		getMessaggi().add(messaggio);
	}
	
	/**
	 * Adds the messaggio.
	 *
	 * @param codice the codice
	 * @param descrizione the descrizione
	 */
	public void addMessaggio(String codice, String descrizione) {
		getMessaggi().add(new Messaggio(codice, descrizione));
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
	 * Adds the messaggi.
	 *
	 * @param messaggi the messaggi
	 */
	public void addMessaggi(List<Messaggio> messaggi){
		getMessaggi().addAll(messaggi);
	}
}
