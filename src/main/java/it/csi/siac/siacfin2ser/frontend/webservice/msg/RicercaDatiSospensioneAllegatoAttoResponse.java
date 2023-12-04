/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;


/**
 * The Class RicercaDatiSospensioneAllegatoResponse.
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class RicercaDatiSospensioneAllegatoAttoResponse extends ServiceResponse {

	@XmlElementWrapper(name = "dateSospensioneAllegati")
	@XmlElement(name = "dataSospensioneAllegato")
	private Set<Date> dataSospensione = new HashSet<Date>();
	
	
	@XmlElementWrapper(name = "dateRiattivazioneAllegato")
	@XmlElement(name = "dataSospensioneAllegato")
	private Set<Date> dataRiattivazione= new HashSet<Date>();
	
	@XmlElementWrapper(name = "causaliSospensioneAllegato")
	@XmlElement(name = "causaleSospensioneAllegato")
	private Set<String> causaleSospensioneAllegato= new HashSet<String>();

	/**
	 * @return the dataSospensione
	 */
	@XmlTransient
	public Set<Date> getDataSospensione() {
		return dataSospensione;
	}

	/**
	 * @param dataSospensione the dataSospensione to set
	 */
	public void setDataSospensione(Set<Date> dataSospensione) {
		this.dataSospensione = dataSospensione;
	}

	/**
	 * @return the dataRiattivazione
	 */
	@XmlTransient
	public Set<Date> getDataRiattivazione() {
		return dataRiattivazione;
	}

	/**
	 * @param dataRiattivazione the dataRiattivazione to set
	 */
	public void setDataRiattivazione(Set<Date> dataRiattivazione) {
		this.dataRiattivazione = dataRiattivazione;
	}

	/**
	 * @return the causaleSospensioneAllegato
	 */
	@XmlTransient
	public Set<String> getCausaleSospensioneAllegato() {
		return causaleSospensioneAllegato;
	}

	/**
	 * @param causaleSospensioneAllegato the causaleSospensioneAllegato to set
	 */
	public void setCausaleSospensioneAllegato(Set<String> causaleSospensioneAllegato) {
		this.causaleSospensioneAllegato = causaleSospensioneAllegato;
	}
	
	
}
