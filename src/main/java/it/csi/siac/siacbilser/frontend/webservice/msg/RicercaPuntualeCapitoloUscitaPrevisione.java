/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ImportiCapitoloEnum;
import it.csi.siac.siacbilser.model.ric.RicercaPuntualeCapitoloUPrev;
import it.csi.siac.siaccorser.model.Ente;
import it.csi.siac.siaccorser.model.ServiceRequest;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaPrevisioneService.ricercaPuntualeCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaPuntualeCapitoloUscitaPrevisione extends ServiceRequest {

	private Ente ente;

	private RicercaPuntualeCapitoloUPrev ricercaPuntualeCapitoloUPrev;
	
	@XmlElementWrapper(name="importiDerivatiRichiesti")
	@XmlElement(name="tipoImporto")
	private Set<ImportiCapitoloEnum> importiDerivatiRichiesti = null;

	public RicercaPuntualeCapitoloUPrev getRicercaPuntualeCapitoloUPrev() {
		return ricercaPuntualeCapitoloUPrev;
	}

	public void setRicercaPuntualeCapitoloUPrev(
			RicercaPuntualeCapitoloUPrev ricercaPuntualeCapitoloUPrev) {
		this.ricercaPuntualeCapitoloUPrev = ricercaPuntualeCapitoloUPrev;
	}

	public void setEnte(Ente ente) {
		this.ente = ente;
	}

	public Ente getEnte() {
		return ente;
	}

	/**
	 * @return the importiDerivatiRichiesti
	 */
	@XmlTransient
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
