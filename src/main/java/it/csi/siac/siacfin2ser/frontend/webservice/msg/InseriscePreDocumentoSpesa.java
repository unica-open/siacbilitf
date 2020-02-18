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
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class InseriscePreDocumentoSpesa extends ServiceRequest {
	
	private PreDocumentoSpesa preDocumentoSpesa;
	private Bilancio bilancio;
	// SIAC-5001
	private boolean inserisciElenco;
	
	// SIAC-6763
	private boolean skipCheckSoggetto;

	/**
	 * @return the preDocumentoSpesa
	 */
	public PreDocumentoSpesa getPreDocumentoSpesa() {
		return preDocumentoSpesa;
	}

	/**
	 * @param preDocumentoSpesa the preDocumentoSpesa to set
	 */
	public void setPreDocumentoSpesa(PreDocumentoSpesa preDocumentoSpesa) {
		this.preDocumentoSpesa = preDocumentoSpesa;
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
	 * @return the inserisciElenco
	 */
	@XmlTransient
	public boolean isInserisciElenco() {
		return inserisciElenco;
	}

	/**
	 * @param inserisciElenco the inserisciElenco to set
	 */
	public void setInserisciElenco(boolean inserisciElenco) {
		this.inserisciElenco = inserisciElenco;
	}

	/**
	 * @param skipCheckSoggetto salta i controlli sul soggetto 
	 */
	@XmlTransient
	public boolean isSkipCheckSoggetto() {
		return skipCheckSoggetto;
	}

	public void setSkipCheckSoggetto(boolean skipCheckSoggetto) {
		this.skipCheckSoggetto = skipCheckSoggetto;
	}
	
	
	

}
