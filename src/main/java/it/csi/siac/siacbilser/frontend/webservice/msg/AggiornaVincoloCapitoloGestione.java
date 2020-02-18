/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.VincoliCapitoloUEGest;
import it.csi.siac.siaccorser.model.Bilancio;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo
 * BIL.VincoloCapitoloService.aggiornaVincoloCapitoloGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class AggiornaVincoloCapitoloGestione extends ServiceRequest {

	private Ente ente;
	private Bilancio bilancio;
	private VincoliCapitoloUEGest vincoloCapitoloUEGest;

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

	public VincoliCapitoloUEGest getVincoloCapitoloUEGest() {
		return vincoloCapitoloUEGest;
	}

	public void setVincoloCapitoloUEGest(
			VincoliCapitoloUEGest vincoloCapitoloUEGest) {
		this.vincoloCapitoloUEGest = vincoloCapitoloUEGest;
	}

}
