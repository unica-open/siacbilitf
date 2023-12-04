/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.ElenchiDocumentiAllegato;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceElenchiDocumenti extends ServiceRequest {
	
	//serve?
	private Bilancio bilancio;
	private ElenchiDocumentiAllegato elenchiDocumentiAllegato;
	
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
	 * @return the elenchiDocumentiAllegato
	 */
	public ElenchiDocumentiAllegato getElenchiDocumentiAllegato() {
		return elenchiDocumentiAllegato;
	}
	/**
	 * @param elenchiDocumentiAllegato the elenchiDocumentiAllegato to set
	 */
	public void setElenchiDocumentiAllegato(ElenchiDocumentiAllegato elenchiDocumentiAllegato) {
		this.elenchiDocumentiAllegato = elenchiDocumentiAllegato;
	}
	
	

}
