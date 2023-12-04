/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siaccorser.model.TipologiaClassificatore;

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeClassificatore extends ServiceRequest {
	
	// Ricerca per chiave fisica
	private Integer uid;
	
	// Ricerca per chiave logica
	private Bilancio bilancio;
	private TipologiaClassificatore tipologiaClassificatore;
	private Ente ente;
	private String codice;
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * @return the bilancio
	 */
	public Bilancio getBilancio() {
		return bilancio;
	}
	/**
	 * @param bilancio the bilancio to set
	 */
	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}
	/**
	 * @return the tipologiaClassificatore
	 */
	public TipologiaClassificatore getTipologiaClassificatore() {
		return tipologiaClassificatore;
	}
	/**
	 * @param tipologiaClassificatore the tipologiaClassificatore to set
	 */
	public void setTipologiaClassificatore(TipologiaClassificatore tipologiaClassificatore) {
		this.tipologiaClassificatore = tipologiaClassificatore;
	}
	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}
	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}
	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}
	/**
	 * @param codice the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}
	
}
