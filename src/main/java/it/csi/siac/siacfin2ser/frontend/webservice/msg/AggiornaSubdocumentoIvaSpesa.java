/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaSubdocumentoIvaSpesa extends ServiceRequest {
	
	private Bilancio bilancio;
	private SubdocumentoIvaSpesa subdocumentoIvaSpesa;
	
	// CR-3791
	private boolean ignoraPermessiUtente = false;
	
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
	 * @return the subdocumentoIvaSpesa
	 */
	public SubdocumentoIvaSpesa getSubdocumentoIvaSpesa() {
		return subdocumentoIvaSpesa;
	}

	/**
	 * @param subdocumentoIvaSpesa the subdocumentoIvaSpesa to set
	 */
	public void setSubdocumentoIvaSpesa(SubdocumentoIvaSpesa subdocumentoIvaSpesa) {
		this.subdocumentoIvaSpesa = subdocumentoIvaSpesa;
	}
	
	/**
	 * @return the ignoraPermessiUtente
	 */
	@XmlTransient
	public boolean isIgnoraPermessiUtente() {
		return ignoraPermessiUtente;
	}

	/**
	 * @param ignoraPermessiUtente the ignoraPermessiUtente to set
	 */
	public void setIgnoraPermessiUtente(boolean ignoraPermessiUtente) {
		this.ignoraPermessiUtente = ignoraPermessiUtente;
	}
}
