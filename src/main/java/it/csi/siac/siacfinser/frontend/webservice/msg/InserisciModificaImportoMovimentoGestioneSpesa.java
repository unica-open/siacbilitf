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
import it.csi.siac.siacfinser.model.movgest.ModificaMovimentoGestioneSpesa;

/**
 * 
 * @author 1513
 * 
 */
@XmlType(namespace = FINSvcDictionary.NAMESPACE)
public class InserisciModificaImportoMovimentoGestioneSpesa extends
		ServiceRequest {

	private Bilancio bilancio;
	private Ente ente;
	private ModificaMovimentoGestioneSpesa modificaMovimentoGestioneSpesa;

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	/**
	 * @return the modificaMovimentoGestioneSpesa
	 */
	public ModificaMovimentoGestioneSpesa getModificaMovimentoGestioneSpesa() {
		return modificaMovimentoGestioneSpesa;
	}

	/**
	 * @param modificaMovimentoGestioneSpesa
	 *            the modificaMovimentoGestioneSpesa to set
	 */
	public void setModificaMovimentoGestioneSpesa(
			ModificaMovimentoGestioneSpesa modificaMovimentoGestioneSpesa) {
		this.modificaMovimentoGestioneSpesa = modificaMovimentoGestioneSpesa;
	}

}
