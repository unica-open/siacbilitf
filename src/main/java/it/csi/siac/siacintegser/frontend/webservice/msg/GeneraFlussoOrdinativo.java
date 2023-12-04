/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacintegser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccorser.frontend.webservice.msg.AsyncServiceRequest;
import it.csi.siac.siaccorser.model.file.TipoFile;
import it.csi.siac.siacintegser.frontend.webservice.INTEGSvcDictionary;



/**
 * Messaggio di richiesta per generare il flusso corrispondente all'ordinativo di spesa
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace =INTEGSvcDictionary.NAMESPACE)
public class GeneraFlussoOrdinativo extends AsyncServiceRequest {
	
	private TipoFile tipoFile;

	/**
	 * @return the tipoFile
	 */
	public TipoFile getTipoFile() {
		return tipoFile;
	}

	/**
	 * @param tipoFile the tipoFile to set
	 */
	public void setTipoFile(TipoFile tipoFile) {
		this.tipoFile = tipoFile;
	}
	
	

}