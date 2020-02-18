/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoPreDocumentoDiSpesa extends ServiceRequest {

	private PreDocumentoSpesa preDocumentoSpesa;
	
	private boolean ricaricaDettaglioPreDocumento = true;

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
