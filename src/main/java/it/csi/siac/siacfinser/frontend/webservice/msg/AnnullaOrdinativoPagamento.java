/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;
import it.csi.siac.siacfinser.model.ordinativo.OrdinativoPagamento;


/**
 * Richiesta al metodo FIN.OrdinativoService.annullaOrdinativoPagamento()
 * 
 * @author
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class AnnullaOrdinativoPagamento extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private String annoEsercizio; 
	private OrdinativoPagamento ordinativoPagamentoDaAnnullare;
	
	private boolean registraGen = true;
	
	public Ente getEnte() {
		return ente;
	}
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	public OrdinativoPagamento getOrdinativoPagamentoDaAnnullare() {
		return ordinativoPagamentoDaAnnullare;
	}
	public void setOrdinativoPagamentoDaAnnullare(
			OrdinativoPagamento ordinativoPagamentoDaAnnullare) {
		this.ordinativoPagamentoDaAnnullare = ordinativoPagamentoDaAnnullare;
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
	
	public boolean isRegistraGen() {
		return registraGen;
	}

	@XmlTransient
	public void setRegistraGen(boolean registraGen) {
		this.registraGen = registraGen;
	}

}
