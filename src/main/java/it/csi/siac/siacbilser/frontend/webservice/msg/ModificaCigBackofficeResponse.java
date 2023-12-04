/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceResponse;

//TODO Completare parametri e commenti

@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class ModificaCigBackofficeResponse extends ServiceResponse {
	
	// TODO implememtare parametro di risposta dal database (0 = successo, != 0 fallimento)
	private Integer esitoModifica;

	public Integer getEsitoModifica() {
		return esitoModifica;
	}

	public void setEsitoModifica(Integer esitoModifica) {
		this.esitoModifica = esitoModifica;
	}	
	
}
