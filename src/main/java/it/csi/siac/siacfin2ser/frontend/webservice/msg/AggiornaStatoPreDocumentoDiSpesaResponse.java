/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacfin2ser.frontend.webservice.msg;

import it.csi.siac.siaccorser.model.ServiceResponse;
import it.csi.siac.siacfin2ser.frontend.webservice.FIN2SvcDictionary;
import it.csi.siac.siacfin2ser.model.PreDocumentoSpesa;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = FIN2SvcDictionary.NAMESPACE)
public class AggiornaStatoPreDocumentoDiSpesaResponse extends ServiceResponse {

	private PreDocumentoSpesa preDocumentoSpesa;

	/**
	 * @return the PreDocumentoSpesa
	 */
	public PreDocumentoSpesa getPreDocumentoSpesa() {
		return preDocumentoSpesa;
	}

	/**
	 * @param PreDocumentoSpesa the PreDocumentoSpesa to set
	 */
	public void setPreDocumentoSpesa(PreDocumentoSpesa preDocumentoSpesa) {
		this.preDocumentoSpesa = preDocumentoSpesa;
	}
	
}
