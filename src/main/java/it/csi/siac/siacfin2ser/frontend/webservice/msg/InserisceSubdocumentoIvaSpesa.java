/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoIvaSpesa;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceSubdocumentoIvaSpesa extends ServiceRequest {
	
	private Bilancio bilancio;
	private SubdocumentoIvaSpesa subdocumentoIvaSpesa;
	private boolean senzaProtocollo;
	
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
	 * @return the senzaProtocollo
	 */
	public boolean isSenzaProtocollo() {
		return senzaProtocollo;
	}
	/**
	 * @param senzaProtocollo the senzaProtocollo to set
	 */
	public void setSenzaProtocollo(boolean senzaProtocollo) {
		this.senzaProtocollo = senzaProtocollo;
	}
	
	
}
