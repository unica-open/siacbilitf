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
import it.csi.siac.siacbilser.model.CapitoloEntrataPrevisione;
import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataPrevisioneModelDetail;

/**
 * Richiesta al metodo BIL.CapitoloEntrataPrevisioneService.
 * ricercaDettaglioModulareCapitoloEntrataPrevisione()
 * 
 * @author Elisa Chiari
 * @version 1.0.0 - 10/11/2016
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioModulareCapitoloEntrataPrevisione extends RicercaDettaglioModulareCapitolo {

	private CapitoloEntrataPrevisione capitoloEntrataPrevisione;
	
	@XmlElementWrapper(name="modelDetails")
	@XmlElement(name="modelDetail")
	private CapitoloEntrataPrevisioneModelDetail[] modelDetails;

	/**
	 * @return the capitoloEntrataPrevisione
	 */
	public CapitoloEntrataPrevisione getCapitoloEntrataPrevisione() {
		return capitoloEntrataPrevisione;
	}

	/**
	 * @param capitoloEntrataPrevisione the capitoloEntrataPrevisione to set
	 */
	public void setCapitoloEntrataPrevisione(CapitoloEntrataPrevisione capitoloEntrataPrevisione) {
		this.capitoloEntrataPrevisione = capitoloEntrataPrevisione;
	}
	
	
	/**
	 * @return the modelDetails
	 */
	@XmlTransient
	public CapitoloEntrataPrevisioneModelDetail[] getModelDetails() {
		return modelDetails;
	}

	/**
	 * @param modelDetails the modelDetails to set
	 */
	public void setModelDetails(CapitoloEntrataPrevisioneModelDetail... modelDetails) {
		this.modelDetails = modelDetails;
	}
	
	/**
	 * Controla se il model detail è richiesto.
	 *
	 * @param m il model detail da controllare
	 * @return true, if m is richiesto
	 */
	public boolean isRichiestoModelDetail(CapitoloEntrataPrevisioneModelDetail m){
		
		for(ModelDetail model : modelDetails){
			if(model.equals(m)){
				return true;
			}
		}
		return false;
	}
	
}
