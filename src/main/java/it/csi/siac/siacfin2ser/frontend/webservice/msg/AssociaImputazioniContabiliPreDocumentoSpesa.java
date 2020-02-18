/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AssociaImputazioniContabiliPreDocumentoSpesa extends AsyncServiceRequest {
	
	private List<PreDocumentoSpesa> preDocumentiSpesa = new ArrayList<PreDocumentoSpesa>();
	
	private RicercaSinteticaPreDocumentoSpesa ricercaSinteticaPreDocumentoSpesa;
	
	private Bilancio bilancio;

	/**
	 * @return the preDocumentiSpesa
	 */
	public List<PreDocumentoSpesa> getPreDocumentiSpesa() {
		return preDocumentiSpesa;
	}

	/**
	 * @param preDocumentiSpesa the preDocumentiSpesa to set
	 */
	public void setPreDocumentiSpesa(List<PreDocumentoSpesa> preDocumentiSpesa) {
		this.preDocumentiSpesa = preDocumentiSpesa;
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
	
	
	

	

}
