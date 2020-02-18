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
import it.csi.siac.siacbilser.model.CapitoloEntrataGestione;
import it.csi.siac.siacfin2ser.model.CapitoloEntrataGestioneModelDetail;

/**
 * Richiesta al metodo
 * BIL.CapitoloEntrataGestioneService.ricercaDettaglioCapitoloEntrataGestione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioModulareCapitoloEntrataGestione extends RicercaDettaglioModulareCapitolo {

	private CapitoloEntrataGestione capitoloEntrataGestione;
	@XmlElementWrapper(name="modelDetails")
	@XmlElement(name="modelDetail")
	private CapitoloEntrataGestioneModelDetail[] modelDetails;

	/**
	 * @return the capitoloEntrataGestione
	 */
	public CapitoloEntrataGestione getCapitoloEntrataGestione() {
		return capitoloEntrataGestione;
	}

	/**
	 * @param capitoloEntrataGestione the capitoloEntrataGestione to set
	 */
	public void setCapitoloEntrataGestione(CapitoloEntrataGestione capitoloEntrataGestione) {
		this.capitoloEntrataGestione = capitoloEntrataGestione;
	}

	/**
	 * @return the CapitoloEntrataGestioneModelDetail[] 
	 */
	@XmlTransient
	public CapitoloEntrataGestioneModelDetail[] getModelDetails() {
		return modelDetails;
	}

	/**
	 * @param modelDetails the modelDetails to set
	 */
	public void setModelDetails(CapitoloEntrataGestioneModelDetail... modelDetails) {
		this.modelDetails = modelDetails;
	}
	
	
	/**
	 * Controla se il model detail è richiesto.
	 *
	 * @param m il model detail da controllare
	 * @return true, if m is richiesto
	 */
	public boolean isRichiestoModelDetail(CapitoloEntrataGestioneModelDetail m){
		
		for(CapitoloEntrataGestioneModelDetail model : modelDetails){
			if(model.equals(m)){
				return true;
			}
		}
		return false;
	}
	
	
}
