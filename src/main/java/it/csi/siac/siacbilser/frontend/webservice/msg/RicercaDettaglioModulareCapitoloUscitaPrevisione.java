/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.CapitoloUscitaPrevisione;
import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloUscitaPrevisioneModelDetail;

/**
 * Richiesta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaDettaglioModulareCapitoloUscitaPrevisione()
 * 
 * @author Elisa Chiari
 * @version 1.0.0 - 10/11/2016
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioModulareCapitoloUscitaPrevisione extends RicercaDettaglioModulareCapitolo {
	
	private CapitoloUscitaPrevisione capitoloUscitaPrevisione;
	@XmlElementWrapper(name="modelDetails")
	@XmlElement(name="modelDetail")
	private CapitoloUscitaPrevisioneModelDetail[] modelDetails;

	/**
	 * @return the capitoloUscitaPrevisione
	 */
	public CapitoloUscitaPrevisione getCapitoloUscitaPrevisione() {
		return capitoloUscitaPrevisione;
	}

	/**
	 * @param capitoloUscitaPrevisione the capitoloUscitaPrevisione to set
	 */
	public void setCapitoloUscitaPrevisione(CapitoloUscitaPrevisione capitoloUscitaPrevisione) {
		this.capitoloUscitaPrevisione = capitoloUscitaPrevisione;
	}

	/**
	 * @return the model details
	 */
	@XmlTransient
	public CapitoloUscitaPrevisioneModelDetail[] getModelDetails() {
		return modelDetails;
	}

	/**
	 * @param modelDetails the modelDetails to set
	 */
	public void setModelDetails(CapitoloUscitaPrevisioneModelDetail... modelDetails) {
		this.modelDetails = modelDetails;
	}
	
	/**
	 * Controla se il model detail è richiesto.
	 *
	 * @param m il model detail da controllare
	 * @return true, if m is richiesto
	 */
	public boolean isRichiestoModelDetail(CapitoloUscitaPrevisioneModelDetail m){
		
		for(ModelDetail model : modelDetails){
			if(model.equals(m)){
				return true;
			}
		}
		return false;
	}
	

}
