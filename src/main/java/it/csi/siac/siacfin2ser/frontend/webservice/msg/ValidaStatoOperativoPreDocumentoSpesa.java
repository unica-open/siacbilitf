/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;
import it.csi.siac.siacfin2ser.model.StatoOperativoPreDocumento;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class ValidaStatoOperativoPreDocumentoSpesa extends ServiceRequest {

	private PreDocumentoSpesa preDocumentoSpesa;
	private StatoOperativoPreDocumento statoOperativoPreDocumento;
	private Ente ente;
	private Bilancio bilancio;

	/**
	 * @return the statoOperativoPreocumento
	 */
	public StatoOperativoPreDocumento getStatoOperativoPreDocumento() {
		return statoOperativoPreDocumento;
	}

	/**
	 * @param statoOperativoPreocumento the statoOperativoPreocumento to set
	 */
	public void setStatoOperativoPreDocumento(
			StatoOperativoPreDocumento statoOperativoPreDocumento) {
		this.statoOperativoPreDocumento = statoOperativoPreDocumento;
	}

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
	 * @return the ente
	 */
	public Ente getEnte() {
		return ente;
	}

	/**
	 * @param ente the ente to set
	 */
	public void setEnte(Ente ente) {
		this.ente = ente;
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
