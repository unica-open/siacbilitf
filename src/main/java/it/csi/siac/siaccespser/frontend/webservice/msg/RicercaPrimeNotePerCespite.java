/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.msg.RicercaSinteticaBaseRequest;
import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccespser.model.Cespite;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class RicercaPrimeNotePerCespite extends RicercaSinteticaBaseRequest {
	
	private Cespite cespite;

	/**
	 * @return the cespite
	 */
	public Cespite getCespite() {
		return this.cespite;
	}

	/**
	 * @param cespite the cespite to set
	 */
	public void setCespite(Cespite cespite) {
		this.cespite = cespite;
	}


	

}
