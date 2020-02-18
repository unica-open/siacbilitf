/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;



import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;

/**
 *  
 * @author 
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AggiornaLiquidazioneModulare extends ServiceRequest {
	
	private Ente ente;
	private Liquidazione liquidazione;
	private Bilancio bilancio;
	
	private boolean flagAggiornaContoTesoreria;
	private boolean flagAggiornaStato;
	private boolean flagAggiornaModalitaPagamento;
	private boolean flagAggiornaFlagManuale;
	
	
	
	
	/**
	 * @return the flagAggiornaContoTesoreria
	 */
	public boolean isFlagAggiornaContoTesoreria() {
		return flagAggiornaContoTesoreria;
	}

	/**
	 * @param flagAggiornaContoTesoreria the flagAggiornaContoTesoreria to set
	 */
	public void setFlagAggiornaContoTesoreria(boolean flagAggiornaContoTesoreria) {
		this.flagAggiornaContoTesoreria = flagAggiornaContoTesoreria;
	}

	/**
	 * @return the flagAggiornaStato
	 */
	public boolean isFlagAggiornaStato() {
		return flagAggiornaStato;
	}

	/**
	 * @param flagAggiornaStato the flagAggiornaStato to set
	 */
	public void setFlagAggiornaStato(boolean flagAggiornaStato) {
		this.flagAggiornaStato = flagAggiornaStato;
	}

	/**
	 * @return the flagAggiornaModalitaPagamento
	 */
	public boolean isFlagAggiornaModalitaPagamento() {
		return flagAggiornaModalitaPagamento;
	}

	/**
	 * @param flagAggiornaModalitaPagamento the flagAggiornaModalitaPagamento to set
	 */
	public void setFlagAggiornaModalitaPagamento(
			boolean flagAggiornaModalitaPagamento) {
		this.flagAggiornaModalitaPagamento = flagAggiornaModalitaPagamento;
	}

	/**
	 * @return the flagAggiornaFlagManuale
	 */
	public boolean isFlagAggiornaFlagManuale() {
		return flagAggiornaFlagManuale;
	}

	/**
	 * @param flagAggiornaFlagManuale the flagAggiornaFlagManuale to set
	 */
	public void setFlagAggiornaFlagManuale(boolean flagAggiornaFlagManuale) {
		this.flagAggiornaFlagManuale = flagAggiornaFlagManuale;
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


}