/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.CapitoloUscitaPrevisioneService.eliminaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class EliminaCapitoloUscitaPrevisione extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private CapitoloUscitaPrevisione capitoloUscitaPrev;

	public CapitoloUscitaPrevisione getCapitoloUscitaPrev() {
		return capitoloUscitaPrev;
	}

	public void setCapitoloUscitaPrev(
			CapitoloUscitaPrevisione capitoloUscitaPrev) {
		this.capitoloUscitaPrev = capitoloUscitaPrev;
	}

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Bilancio getBilancio() {
		return bilancio;
	}

	public void setBilancio(Bilancio bilancio) {
		this.bilancio = bilancio;
	}

}
