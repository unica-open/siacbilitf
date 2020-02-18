/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.Set;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ImportiCapitoloEnum;
import it.csi.siac.siacbilser.model.ric.RicercaDettaglioCapitoloUPrev;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaDettaglioCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioCapitoloUscitaPrevisione extends ServiceRequest {

	private Ente ente;
	private RicercaDettaglioCapitoloUPrev ricercaDettaglioCapitoloUPrev;
	
	private Set<ImportiCapitoloEnum> importiDerivatiRichiesti = null;

	public Ente getEnte() {
		return ente;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public RicercaDettaglioCapitoloUPrev getRicercaDettaglioCapitoloUPrev() {
		return ricercaDettaglioCapitoloUPrev;
	}

	public void setRicercaDettaglioCapitoloUPrev(
			RicercaDettaglioCapitoloUPrev ricercaDettaglioCapitoloUPrev) {
		this.ricercaDettaglioCapitoloUPrev = ricercaDettaglioCapitoloUPrev;
	}

	/**
	 * @return the importiDerivatiRichiesti
	 */
	public Set<ImportiCapitoloEnum> getImportiDerivatiRichiesti() {
		return importiDerivatiRichiesti;
	}

	/**
	 * @param importiDerivatiRichiesti the importiDerivatiRichiesti to set
	 */
	public void setImportiDerivatiRichiesti(Set<ImportiCapitoloEnum> importiDerivatiRichiesti) {
		this.importiDerivatiRichiesti = importiDerivatiRichiesti;
	}
	
	

}
