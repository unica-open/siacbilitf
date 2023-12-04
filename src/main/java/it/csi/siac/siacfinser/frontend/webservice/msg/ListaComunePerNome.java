/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class ListaComunePerNome extends ServiceRequest {

	
	private String nomeComune;
	private String codiceNazione;
	private boolean ricercaPuntuale;
	
	public String getNomeComune() {
		return nomeComune;
	}
	public void setNomeComune(String nomeComune) {
		this.nomeComune = nomeComune;
	}
	public String getCodiceNazione() {
		return codiceNazione;
	}
	public void setCodiceNazione(String codiceNazione) {
		this.codiceNazione = codiceNazione;
	}
	public boolean isRicercaPuntuale() {
		return ricercaPuntuale;
	}
	public void setRicercaPuntuale(boolean ricercaPuntuale) {
		this.ricercaPuntuale = ricercaPuntuale;
	}
}
