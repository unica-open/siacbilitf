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
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.RegistroIva;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class StampaRegistriIvaResponse extends ReportServiceResponse {

	@XmlElementWrapper(name = "messaggi")
	@XmlElement(name = "messaggio")
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	
	@XmlElementWrapper(name="listaRegistriIvaConErrori")
	@XmlElement(name="registroIva")
	private List<RegistroIva> registriIvaConErrori = new ArrayList<RegistroIva>();
	
	@XmlElementWrapper(name="listaRegistriIvaSenzaErrori")
	@XmlElement(name="registroIva")
	private List<RegistroIva> registriIvaSenzaErrori = new ArrayList<RegistroIva>();
	
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
	 * @return the registriIvaConErrori
	 */
	@XmlTransient
	public List<RegistroIva> getRegistriIvaConErrori() {
		return registriIvaConErrori;
	}

	/**
	 * @param registriIvaConErrori the registriIvaConErrori to set
	 */
	public void setRegistriIvaConErrori(List<RegistroIva> registriIvaConErrori) {
		this.registriIvaConErrori = registriIvaConErrori != null ? registriIvaConErrori : new ArrayList<RegistroIva>();
	}

	/**
	 * @return the registriIvaSenzaErrori
	 */
	@XmlTransient
	public List<RegistroIva> getRegistriIvaSenzaErrori() {
		return registriIvaSenzaErrori;
	}

	/**
	 * @param registriIvaSenzaErrori the registriIvaSenzaErrori to set
	 */
	public void setRegistriIvaSenzaErrori(List<RegistroIva> registriIvaSenzaErrori) {
		this.registriIvaSenzaErrori = registriIvaSenzaErrori != null ? registriIvaSenzaErrori : new ArrayList<RegistroIva>();
	}

	/**
	 * Aggiunge un errore come messaggio
	 * @param errore l'errore da aggiungere
	 */
	public void addMessaggio(Errore errore) {
		if (errore == null) {
			return;
		}
		messaggi.add(new Messaggio(errore.getCodice(), errore.getDescrizione()));
	}

	/**
	 * Aggiunge un registro iva con errori
	 * @param registroIva il registro con errori da aggiungere
	 */
	public void addRegistroIvaConErrori(RegistroIva registroIva) {
		if (registroIva == null) {
			return;
		}
		registriIvaConErrori.add(registroIva);
	}
	
	/**
	 * Aggiunge un registro iva senza errori
	 * @param registroIva il registro senza errori da aggiungere
	 */
	public void addRegistroIvaSenzaErrori(RegistroIva registroIva) {
		if (registroIva == null) {
			return;
		}
		registriIvaSenzaErrori.add(registroIva);
	}
}
