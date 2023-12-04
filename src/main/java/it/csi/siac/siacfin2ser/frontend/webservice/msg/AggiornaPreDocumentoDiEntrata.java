/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaPreDocumentoDiEntrata extends ServiceRequest {
	
	private PreDocumentoEntrata preDocumentoEntrata;
	private Bilancio bilancio;
	
	private boolean gestisciModificaImportoAccertamento = false; 
	
	//SIAC-6780
	private boolean saltaCheckDisponibilita = false; 
	
	/**
	 * @return the preDocumentoEntrata
	 */
	public PreDocumentoEntrata getPreDocumentoEntrata() {
		return preDocumentoEntrata;
	}

	/**
	 * @param preDocumentoEntrata the preDocumentoEntrata to set
	 */
	public void setPreDocumentoEntrata(PreDocumentoEntrata preDocumentoEntrata) {
		this.preDocumentoEntrata = preDocumentoEntrata;
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
	 * @return the gestisciModificaImportoAccertamento
	 */
	public boolean isGestisciModificaImportoAccertamento() {
		return gestisciModificaImportoAccertamento;
	}

	/**
	 * @param gestisciModificaImportoAccertamento the gestisciModificaImportoAccertamento to set
	 */
	public void setGestisciModificaImportoAccertamento(boolean gestisciModificaImportoAccertamento) {
		this.gestisciModificaImportoAccertamento = gestisciModificaImportoAccertamento;
	}

	/**
	 * @return the aggiornaPreDocCollegaDocumento
	 */
	@XmlTransient
	public boolean isSaltaCheckDisponibilita() {
		return saltaCheckDisponibilita;
	}

	/**
	 * Sets the salta check disponibilita.
	 *
	 * @param saltaCheckDisponibilita the new salta check disponibilita
	 */
	public void setSaltaCheckDisponibilita(boolean saltaCheckDisponibilita) {
		this.saltaCheckDisponibilita = saltaCheckDisponibilita;
	}
	
}
