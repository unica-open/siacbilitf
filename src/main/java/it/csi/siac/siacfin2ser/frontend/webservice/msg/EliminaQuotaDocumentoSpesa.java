/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoSpesa;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EliminaQuotaDocumentoSpesa extends ServiceRequest {
	
	private SubdocumentoSpesa subdocumentoSpesa;
	private Bilancio bilancio;
	private boolean aggiornaStatoDocumento = true;
	private boolean saltaCheckQuotaEliminabile = false;
	private boolean roolbackOnly = true;

	/**
	 * @return the subdocumentoSpesa
	 */
	public SubdocumentoSpesa getSubdocumentoSpesa() {
		return subdocumentoSpesa;
	}

	/**
	 * @param subdocumentoSpesa the subdocumentoSpesa to set
	 */
	public void setSubdocumentoSpesa(SubdocumentoSpesa subdocumentoSpesa) {
		this.subdocumentoSpesa = subdocumentoSpesa;
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
	 * @return the aggiornaStatoDocumento
	 */
	@XmlTransient
	public boolean isAggiornaStatoDocumento() {
		return aggiornaStatoDocumento;
	}

	/**
	 * @param aggiornaStatoDocumento the aggiornaStatoDocumento to set
	 */
	public void setAggiornaStatoDocumento(boolean aggiornaStatoDocumento) {
		this.aggiornaStatoDocumento = aggiornaStatoDocumento;
	}

	/**
	 * @return the saltaCheckQuotaEliminabile
	 */
	@XmlTransient
	public boolean isSaltaCheckQuotaEliminabile() {
		return saltaCheckQuotaEliminabile;
	}

	/**
	 * @param saltaCheckQuotaEliminabile the saltaCheckQuotaEliminabile to set
	 */
	public void setSaltaCheckQuotaEliminabile(boolean saltaCheckQuotaEliminabile) {
		this.saltaCheckQuotaEliminabile = saltaCheckQuotaEliminabile;
	}

	@XmlTransient
	public boolean isRoolbackOnly() {
		return roolbackOnly;
	}

	public void setRoolbackOnly(boolean roolbackOnly) {
		this.roolbackOnly = roolbackOnly;
	}
	

}
