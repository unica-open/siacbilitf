/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.liquidazione.Liquidazione;


/**
 * Richiesta al metodo FIN.LiquidazioneService.annullaLiquidazione()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaLiquidazione extends ServiceRequest {

	private Ente ente;
	private Liquidazione liquidazioneDaAnnullare;
	private String annoEsercizio;
	private boolean aggiornaStatoDocumento = true ;
	
	

	/**
	 * @return the aggiornaStatoDocumento
	 */
	public boolean isAggiornaStatoDocumento() {
		return aggiornaStatoDocumento;
	}

	/**
	 * @param aggiornaStatoDocumento the aggiornaStatoDocumento to set
	 */
	public void setAggiornaStatoDocumento(boolean aggiornaStatoDocumento) {
		this.aggiornaStatoDocumento = aggiornaStatoDocumento;
	}

	public Liquidazione getLiquidazioneDaAnnullare() {
		return liquidazioneDaAnnullare;
	}

	public void setLiquidazioneDaAnnullare(Liquidazione liquidazioneDaAnnullare) {
		this.liquidazioneDaAnnullare = liquidazioneDaAnnullare;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public String getAnnoEsercizio() {
		return annoEsercizio;
	}

	public void setAnnoEsercizio(String annoEsercizio) {
		this.annoEsercizio = annoEsercizio;
	}
	
}
