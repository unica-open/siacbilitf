/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import it.csi.siac.siaccorser.model.Informazione;
import it.csi.siac.siaccorser.model.Messaggio;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Controllo sui fondi a dubbia e difficile esazione dell'anno precedente a quello di bilancio per il rendiconto
 * @author Marchino Alessandro
 */
public class ControllaDisponibilitaCassaContoVincolatoCapitoloResponse extends ServiceResponse{
	
	private List<Informazione> informazioni = new ArrayList<Informazione>();
	private List<Messaggio> messaggi = new ArrayList<Messaggio>();
	//xAle: metto tutti i possibili input, dimmi poi tu quali ti viene comodo utilizzare 
		// e ci mettiamo d'accordo
	private BigDecimal disponibilitaContoVincolatoEntrata = BigDecimal.ZERO;
	private BigDecimal disponibilitaContoVincolatoSpesa = BigDecimal.ZERO;
	
	

	public List<Informazione> getInformazioni() {
		return informazioni != null? informazioni : new ArrayList<Informazione>();
	}

	public void setInformazioni(List<Informazione> informazioni) {
		this.informazioni = informazioni != null? informazioni : new ArrayList<Informazione>();
	}
	
	public void addInformazione(Informazione informazione) {
		getInformazioni().add(informazione);
	}

	public BigDecimal getDisponibilitaContoVincolatoEntrata() {
		return disponibilitaContoVincolatoEntrata;
	}

	public void setDisponibilitaContoVincolatoEntrata(BigDecimal disponibilitaContoVincolatoEntrata) {
		this.disponibilitaContoVincolatoEntrata = disponibilitaContoVincolatoEntrata;
	}

	public BigDecimal getDisponibilitaContoVincolatoSpesa() {
		return disponibilitaContoVincolatoSpesa;
	}

	public void setDisponibilitaContoVincolatoSpesa(BigDecimal disponibilitaContoVincolatoSpesa) {
		this.disponibilitaContoVincolatoSpesa = disponibilitaContoVincolatoSpesa;
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
		this.messaggi = messaggi;
	}
	
	public void addMessaggio(Messaggio messaggio) {
		messaggi.add(messaggio);
	}

	public void addMessaggi(List<Messaggio> messaggi) {
		this.messaggi.addAll(messaggi);
	}
	
	
	
}
