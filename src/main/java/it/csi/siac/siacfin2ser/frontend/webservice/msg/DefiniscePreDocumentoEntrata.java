/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class DefiniscePreDocumentoEntrata extends ServiceRequest {
	
	@XmlElementWrapper(name="preDocumentiEntrata")
	@XmlElement(name="preDocumentoEntrata")
	private List<PreDocumentoEntrata> preDocumentiEntrata = new ArrayList<PreDocumentoEntrata>();
	private RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata;
	private Bilancio bilancio;
	
	// SIAC-6090
	private boolean skipCaricamentoDettaglioPredocumento;

	/**
	 * @return the preDocumentiEntrata
	 */
	@XmlTransient
	public List<PreDocumentoEntrata> getPreDocumentiEntrata() {
		return preDocumentiEntrata;
	}

	/**
	 * @param preDocumentiEntrata the preDocumentiEntrata to set
	 */
	public void setPreDocumentiEntrata(List<PreDocumentoEntrata> preDocumentiEntrata) {
		this.preDocumentiEntrata = preDocumentiEntrata != null ? preDocumentiEntrata : new ArrayList<PreDocumentoEntrata>();
	}

	/**
	 * @return the ricercaSinteticaPreDocumentoEntrata
	 */
	public RicercaSinteticaPreDocumentoEntrata getRicercaSinteticaPreDocumentoEntrata() {
		return ricercaSinteticaPreDocumentoEntrata;
	}

	/**
	 * @param ricercaSinteticaPreDocumentoEntrata the ricercaSinteticaPreDocumentoEntrata to set
	 */
	public void setRicercaSinteticaPreDocumentoEntrata(RicercaSinteticaPreDocumentoEntrata ricercaSinteticaPreDocumentoEntrata) {
		this.ricercaSinteticaPreDocumentoEntrata = ricercaSinteticaPreDocumentoEntrata;
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
	 * @return the skipCaricamentoDettaglioPredocumento
	 */
	@XmlTransient
	public boolean isSkipCaricamentoDettaglioPredocumento() {
		return this.skipCaricamentoDettaglioPredocumento;
	}

	/**
	 * @param skipCaricamentoDettaglioPredocumento the skipCaricamentoDettaglioPredocumento to set
	 */
	public void setSkipCaricamentoDettaglioPredocumento(boolean skipCaricamentoDettaglioPredocumento) {
		this.skipCaricamentoDettaglioPredocumento = skipCaricamentoDettaglioPredocumento;
	}

}
