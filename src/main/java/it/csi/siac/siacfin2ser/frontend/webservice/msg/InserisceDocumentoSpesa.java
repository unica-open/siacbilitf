/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.DocumentoSpesa;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InserisceDocumentoSpesa extends ServiceRequest {
	
	private DocumentoSpesa documentoSpesa;
	private Bilancio bilancio;
	
	private boolean inserisciQuotaContestuale = true;
	private boolean inserisciDocumentoRegolarizzazione = true;

	/**
	 * @return the documentoSpesa
	 */
	public DocumentoSpesa getDocumentoSpesa() {
		return documentoSpesa;
	}

	/**
	 * @param documentoSpesa the documentoSpesa to set
	 */
	public void setDocumentoSpesa(DocumentoSpesa documentoSpesa) {
		this.documentoSpesa = documentoSpesa;
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

	
	

	
	
	
	

}
