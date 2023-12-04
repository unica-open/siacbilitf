/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfinser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfinser.frontend.webservice.FINSvcDictionary;

@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class RicercaStrutturaAmministrativa extends ServiceRequest {

	private String codice;
	private String tipoCodice;
	private Ente ente;
	private boolean ricercaCdr = false;

	/**
	 * @return the codice
	 */
	public String getCodice() {
		return codice;
	}

	/**
	 * @param codice
	 *            the codice to set
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}

	/**
	 * @return the tipoCodice
	 */
	public String getTipoCodice() {
		return tipoCodice;
	}

	/**
	 * @param tipoCodice
	 *            the tipoCodice to set
	 */
	public void setTipoCodice(String tipoCodice) {
		this.tipoCodice = tipoCodice;
	}

	/**
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente
	 *            the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the ricercaCdr
	 */
	public boolean isRicercaCdr() {
		return ricercaCdr;
	}

	/**
	 * @param ricercaCdr
	 *            the ricercaCdr to set
	 */
	public void setRicercaCdr(boolean ricercaCdr) {
		this.ricercaCdr = ricercaCdr;
	}

}
