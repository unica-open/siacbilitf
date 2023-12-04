/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacfin2ser.model.ProgressiviIva;

/**
 * @author Alessandro Marchino
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class InserisceProgressiviIva extends ServiceRequest {
	
	private ProgressiviIva progressiviIva;

	/**
	 * @return the progressiviIva
	 */
	public ProgressiviIva getProgressiviIva() {
		return progressiviIva;
	}

	/**
	 * @param progressiviIva the progressiviIva to set
	 */
	public void setProgressiviIva(ProgressiviIva progressiviIva) {
		this.progressiviIva = progressiviIva;
	}

}
