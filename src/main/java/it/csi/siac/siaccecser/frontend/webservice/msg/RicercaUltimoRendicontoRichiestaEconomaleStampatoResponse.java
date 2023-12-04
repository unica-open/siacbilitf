/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccecser.frontend.webservice.msg;

import it.csi.siac.siaccecser.frontend.webservice.CECSvcDictionary;
import it.csi.siac.siaccecser.model.StampeCassaFile;
import it.csi.siac.siaccorser.model.ServiceResponse;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = CECSvcDictionary.NAMESPACE)
public class RicercaUltimoRendicontoRichiestaEconomaleStampatoResponse extends ServiceResponse{
	
	private StampeCassaFile stampeCassaFile;

	/**
	 * @return the stampeCassaFile
	 */
	public StampeCassaFile getStampeCassaFile() {
		return stampeCassaFile;
	}

	/**
	 * @param stampeCassaFile the stampeCassaFile to set
	 */
	public void setStampeCassaFile(StampeCassaFile stampeCassaFile) {
		this.stampeCassaFile = stampeCassaFile;
	}

}
