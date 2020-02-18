/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacgenser.frontend.webservice.msg;

import it.csi.siac.siacbilser.model.CheckOnlyElaborazioneAttiva;
import it.csi.siac.siaccorser.model.ServiceRequest;
import it.csi.siac.siacgenser.frontend.webservice.GENSvcDictionary;
import it.csi.siac.siacgenser.model.RegistrazioneMovFin;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = GENSvcDictionary.NAMESPACE)
public class AggiornaElementoPianoDeiContiRegistrazioneMovFin extends ServiceRequest {

	private RegistrazioneMovFin registrazioneMovFin;
	
	private Boolean checkOnlyElaborazioneAttiva = Boolean.FALSE;

	/**
	 * @return the registrazioneMovFin
	 */
	public RegistrazioneMovFin getRegistrazioneMovFin() {
		return registrazioneMovFin;
	}

	/**
	 * @param registrazioneMovFin the registrazioneMovFin to set
	 */
	public void setRegistrazioneMovFin(RegistrazioneMovFin registrazioneMovFin) {
		this.registrazioneMovFin = registrazioneMovFin;
	}

	/**
	 * @return the checkOnlyElaborazioneAttiva
	 */
	@CheckOnlyElaborazioneAttiva
	public Boolean getCheckOnlyElaborazioneAttiva() {
		return checkOnlyElaborazioneAttiva;
	}

	/**
	 * @param checkOnlyElaborazioneAttiva the checkOnlyElaborazioneAttiva to set
	 */
	public void setCheckOnlyElaborazioneAttiva(Boolean checkOnlyElaborazioneAttiva) {
		this.checkOnlyElaborazioneAttiva = checkOnlyElaborazioneAttiva;
	}
	
	
	
}
