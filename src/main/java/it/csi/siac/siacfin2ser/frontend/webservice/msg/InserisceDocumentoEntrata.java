/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoEntrata;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceDocumentoEntrata extends ServiceRequest {
	
	private DocumentoEntrata documentoEntrata;
	private Bilancio bilancio;
	
	private boolean inserisciQuotaContestuale = true;
	private boolean inserisciDocumentoRegolarizzazione = true;

	/**
	 * @return the documentoEntrata
	 */
	public DocumentoEntrata getDocumentoEntrata() {
		return documentoEntrata;
	}

	/**
	 * @param documentoEntrata the documentoEntrata to set
	 */
	public void setDocumentoEntrata(DocumentoEntrata documentoEntrata) {
		this.documentoEntrata = documentoEntrata;
	}

	/**
	 * @return the inserisciQuotaContestuale
	 */
	public boolean isInserisciQuotaContestuale() {
		return inserisciQuotaContestuale;
	}

	/**
	 * @param inserisciQuotaContestuale the inserisciQuotaContestuale to set
	 */
	public void setInserisciQuotaContestuale(boolean inserisciQuotaContestuale) {
		this.inserisciQuotaContestuale = inserisciQuotaContestuale;
	}

	/**
	 * @return the inserisciDocumentoRegolarizzazione
	 */
	public boolean isInserisciDocumentoRegolarizzazione() {
		return inserisciDocumentoRegolarizzazione;
	}

	/**
	 * @param inserisciDocumentoRegolarizzazione the inserisciDocumentoRegolarizzazione to set
	 */
	public void setInserisciDocumentoRegolarizzazione(boolean inserisciDocumentoRegolarizzazione) {
		this.inserisciDocumentoRegolarizzazione = inserisciDocumentoRegolarizzazione;
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
	
	
	
	

}
