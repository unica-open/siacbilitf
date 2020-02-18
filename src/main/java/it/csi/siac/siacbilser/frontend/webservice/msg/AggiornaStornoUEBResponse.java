/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.StornoUEB;
import it.csi.siac.siaccorser.model.ServiceResponse;


/** @deprecated da eliminare con le UEB */
@Deprecated@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaStornoUEBResponse extends ServiceResponse {
	
	private StornoUEB stornoUEB;

	/**
	 * @return the stornoUEB
	 */
	public StornoUEB getStornoUEB() {
		return stornoUEB;
	}

	/**
	 * @param stornoUEB the stornoUEB to set
	 */
	public void setStornoUEB(StornoUEB stornoUEB) {
		this.stornoUEB = stornoUEB;
	}
	
	
	
	

}
