/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.StampeCassaFile;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.paginazione.ParametriPaginazione;

import java.util.Date;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaStampeCassaEconomale extends ServiceRequest {

	private StampeCassaFile stampa;
	private Date dataUltimaStampaGiornaleDa; 
	private Date dataUltimaStampaGiornaleA;
	private String nomeFile;
	ParametriPaginazione parametriPaginazione;

	/**
	 * @return the stampa
	 */
	public StampeCassaFile getStampa() {
		return stampa;
	}

	/**
	 * @param stampa the stampa to set
	 */
	public void setStampa(StampeCassaFile stampa) {
		this.stampa = stampa;
	}

	/**
	 * @return the dataUltimaStampaGiornaleDa
	 */
	public Date getDataUltimaStampaGiornaleDa() {
		return dataUltimaStampaGiornaleDa;
	}

	/**
	 * @param dataUltimaStampaGiornaleDa the dataUltimaStampaGiornaleDa to set
	 */
	public void setDataUltimaStampaGiornaleDa(Date dataUltimaStampaGiornaleDa) {
		this.dataUltimaStampaGiornaleDa = dataUltimaStampaGiornaleDa;
	}

	/**
	 * @return the dataUltimaStampaGiornaleA
	 */
	public Date getDataUltimaStampaGiornaleA() {
		return dataUltimaStampaGiornaleA;
	}

	/**
	 * @param dataUltimaStampaGiornaleA the dataUltimaStampaGiornaleA to set
	 */
	public void setDataUltimaStampaGiornaleA(Date dataUltimaStampaGiornaleA) {
		this.dataUltimaStampaGiornaleA = dataUltimaStampaGiornaleA;
	}
	
	/**
	 * @return the nomeFile
	 */
	public String getNomeFile() {
		return nomeFile;
	}

	/**
	 * @param nomeFile the nomeFile to set
	 */
	public void setNomeFile(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	/**
	 * @return the parametriPaginazione
	 */
	public ParametriPaginazione getParametriPaginazione() {
		return parametriPaginazione;
	}

	/**
	 * @param parametriPaginazione the parametriPaginazione to set
	 */
	public void setParametriPaginazione(ParametriPaginazione parametriPaginazione) {
		this.parametriPaginazione = parametriPaginazione;
	}
	
	

}
