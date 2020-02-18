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
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

/**
 * Request per la definizione del predocumento di spesa
 * @author Marchino Alessandro
 */
@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class DefiniscePreDocumentoSpesa extends ServiceRequest {
	
	@XmlElementWrapper(name="preDocumentiSpesa")
	@XmlElement(name="preDocumentoSpesa")
	private List<PreDocumentoSpesa> preDocumentiSpesa = new ArrayList<PreDocumentoSpesa>();
	private RicercaSinteticaPreDocumentoSpesa ricercaSinteticaPreDocumentoSpesa;
	private Bilancio bilancio;
	
	// SIAC-4996
	private boolean skipCaricamentoDettaglioPredocumento;

	/**
	 * @return the preDocumentiSpesa
	 */
	@XmlTransient
	public List<PreDocumentoSpesa> getPreDocumentiSpesa() {
		return preDocumentiSpesa;
	}

	/**
	 * @param preDocumentiSpesa the preDocumentiSpesa to set
	 */
	public void setPreDocumentiSpesa(List<PreDocumentoSpesa> preDocumentiSpesa) {
		this.preDocumentiSpesa = preDocumentiSpesa != null ? preDocumentiSpesa : new ArrayList<PreDocumentoSpesa>();
	}

	/**
	 * @return the ricercaSinteticaPreDocumentoSpesa
	 */
	public RicercaSinteticaPreDocumentoSpesa getRicercaSinteticaPreDocumentoSpesa() {
		return ricercaSinteticaPreDocumentoSpesa;
	}

	/**
	 * @param ricercaSinteticaPreDocumentoSpesa the ricercaSinteticaPreDocumentoSpesa to set
	 */
	public void setRicercaSinteticaPreDocumentoSpesa(RicercaSinteticaPreDocumentoSpesa ricercaSinteticaPreDocumentoSpesa) {
		this.ricercaSinteticaPreDocumentoSpesa = ricercaSinteticaPreDocumentoSpesa;
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
		return skipCaricamentoDettaglioPredocumento;
	}

	/**
	 * @param skipCaricamentoDettaglioPredocumento the skipCaricamentoDettaglioPredocumento to set
	 */
	public void setSkipCaricamentoDettaglioPredocumento(boolean skipCaricamentoDettaglioPredocumento) {
		this.skipCaricamentoDettaglioPredocumento = skipCaricamentoDettaglioPredocumento;
	}
	
	
}
