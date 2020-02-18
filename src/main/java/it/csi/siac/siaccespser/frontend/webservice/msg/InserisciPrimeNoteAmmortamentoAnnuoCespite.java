/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siaccespser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siaccespser.frontend.webservice.CESPSvcDictionary;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * The Class GenericRequest.
 */
@XmlType(namespace = CESPSvcDictionary.NAMESPACE)
public class InserisciPrimeNoteAmmortamentoAnnuoCespite extends ServiceRequest {

	private Integer annoAmmortamentoAnnuo;
	private boolean annullaPrimeNoteDefinitivePrecedenti;

	/**
	 * @return the annoAmmortamentoAnnuo
	 */
	public Integer getAnnoAmmortamentoAnnuo() {
		return annoAmmortamentoAnnuo;
	}

	/**
	 * @param annoAmmortamentoAnnuo the annoAmmortamentoAnnuo to set
	 */
	public void setAnnoAmmortamentoAnnuo(Integer annoAmmortamentoAnnuo) {
		this.annoAmmortamentoAnnuo = annoAmmortamentoAnnuo;
	}

	/**
	 * @return the annullaPrimeNoteDefinitivePrecedenti
	 */
	public boolean isAnnullaPrimeNoteDefinitivePrecedenti() {
		return annullaPrimeNoteDefinitivePrecedenti;
	}

	/**
	 * @param annullaPrimeNoteDefinitivePrecedenti the annullaPrimeNoteDefinitivePrecedenti to set
	 */
	public void setAnnullaPrimeNoteDefinitivePrecedenti(boolean annullaPrimeNoteDefinitivePrecedenti) {
		this.annullaPrimeNoteDefinitivePrecedenti = annullaPrimeNoteDefinitivePrecedenti;
	}
	
}
