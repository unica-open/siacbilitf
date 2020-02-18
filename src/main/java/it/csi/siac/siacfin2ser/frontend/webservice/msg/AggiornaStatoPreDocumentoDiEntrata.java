/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoEntrata;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoPreDocumentoDiEntrata extends ServiceRequest {

	private PreDocumentoEntrata preDocumentoEntrata;
	
	private boolean ricaricaDettaglioPreDocumento = true;

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
	 * @return the ricaricaDettaglioPreDocumento
	 */
	@XmlTransient
	public boolean isRicaricaDettaglioPreDocumento() {
		//Nel richiamo esterno al servizio viene forzato il ricaricamento del dettaglio.
		return ricaricaDettaglioPreDocumento;
	}

	/**
	 * @param ricaricaDettaglioPreDocumento the ricaricaDettaglioPreDocumento to set
	 */
	public void setRicaricaDettaglioPreDocumento(boolean ricaricaDettaglioPreDocumentoSpesa) {
		this.ricaricaDettaglioPreDocumento = ricaricaDettaglioPreDocumentoSpesa;
	}


}
