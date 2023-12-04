/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.model;

import it.csi.siac.siaccorser.model.EntitaEnte;
import it.csi.siac.siacfinser.model.soggetto.Soggetto;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

/**
 * @author sviluppo1
 * @version 1.0
 * @created 08-set-2014 17.51.43
 */
@XmlType(namespace = FIN2DataDictionary.NAMESPACE)
public class DatiSoggettoAllegato extends EntitaEnte {
	//SiacRAttoAllegatoSog
	
	private static final long serialVersionUID = -4168487571368315629L;
	
	// Obbligatorii
	//attoalSogDataSosp
	private Date dataSospensione;
	//attoalSogCausaleSosp
	private String causaleSospensione;
	// Standard
	//attoalSogDataRiatt
	private Date dataRiattivazione;
	
	//siacRAttoAllegato
	private AllegatoAtto allegatoAtto;
	//siacTSoggetto
	private Soggetto soggetto;
	
	/**
	 * @return the dataSospensione
	 */
	public Date getDataSospensione() {
		return dataSospensione;
	}
	/**
	 * @param dataSospensione the dataSospensione to set
	 */
	public void setDataSospensione(Date dataSospensione) {
		this.dataSospensione = dataSospensione;
	}
	/**
	 * @return the causaleSospensione
	 */
	public String getCausaleSospensione() {
		return causaleSospensione;
	}
	/**
	 * @param causaleSospensione the causaleSospensione to set
	 */
	public void setCausaleSospensione(String causaleSospensione) {
		this.causaleSospensione = causaleSospensione;
	}
	/**
	 * @return the dataRiattivazione
	 */
	public Date getDataRiattivazione() {
		return dataRiattivazione;
	}
	/**
	 * @param dataRiattivazione the dataRiattivazione to set
	 */
	public void setDataRiattivazione(Date dataRiattivazione) {
		this.dataRiattivazione = dataRiattivazione;
	}
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
	/**
	 * @return the soggetto
	 */
	public Soggetto getSoggetto() {
		return soggetto;
	}
	/**
	 * @param soggetto the soggetto to set
	 */
	public void setSoggetto(Soggetto soggetto) {
		this.soggetto = soggetto;
	}
	
	
	
	

}