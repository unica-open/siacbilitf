/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;



import java.util.List;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;
import it.csi.siac.siacfinser.model.ordinativo.SubOrdinativoPagamento;

/**
 *  
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaLiquidazione extends ServiceRequest {
	
	private Ente ente;
	private Liquidazione liquidazione;
	private Bilancio bilancio;
	
	private String annoEsercizio;
	private List<SubOrdinativoPagamento> elencoSubOrdinativi;
	private Boolean ricaricaLiquidazione = Boolean.TRUE;
	
	

	
	/**
	 * @return the ricaricaLiquidazione
	 */
	public Boolean getRicaricaLiquidazione() {
		return ricaricaLiquidazione;
	}

	/**
	 * @param ricaricaLiquidazione the ricaricaLiquidazione to set
	 */
	public void setRicaricaLiquidazione(Boolean ricaricaLiquidazione) {
		this.ricaricaLiquidazione = ricaricaLiquidazione;
	}

	public List<SubOrdinativoPagamento> getElencoSubOrdinativi() {
		return elencoSubOrdinativi;
	}

	public void setElencoSubOrdinativi(
			List<SubOrdinativoPagamento> elencoSubOrdinativi) {
		this.elencoSubOrdinativi = elencoSubOrdinativi;
	}

	
	
	public Ente getEnte() {
		return ente;
	}
	
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Liquidazione getLiquidazione() {
		return liquidazione;
	}

	public void setLiquidazione(Liquidazione liquidazione) {
		this.liquidazione = liquidazione;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public String getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(String annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	
	
}