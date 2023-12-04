/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.SubdocumentoEntrata;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class EliminaQuotaDocumentoEntrata extends ServiceRequest {
	
	private SubdocumentoEntrata subdocumentoEntrata;
	private Bilancio bilancio;
	private boolean aggiornaStatoDocumento = true;
	private boolean roolbackOnly = true;
	

	/**
	 * @return the subdocumentoEntrata
	 */
	public SubdocumentoEntrata getSubdocumentoEntrata() {
		return subdocumentoEntrata;
	}

	/**
	 * @param subdocumentoEntrata the subdocumentoEntrata to set
	 */
	public void setSubdocumentoEntrata(SubdocumentoEntrata subdocumentoEntrata) {
		this.subdocumentoEntrata = subdocumentoEntrata;
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
	
	@XmlTransient
	public boolean isRoolbackOnly() {
		return roolbackOnly;
	}

	public void setRoolbackOnly(boolean roolbackOnly) {
		this.roolbackOnly = roolbackOnly;
	}

}
