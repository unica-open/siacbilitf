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
import it.csi.siac.siacbilser.model.CapitoloUscitaGestione;
import it.csi.siac.siacbilser.model.ModelDetail;
import it.csi.siac.siacfin2ser.model.CapitoloUscitaGestioneModelDetail;

/**
 * Richiesta al metodo
 * BIL.CapitoloUscitaGestioneService.ricercaDettaglioModulareCapitoloUscitaGestione()
 * 
 * @author Elisa Chiari
 * @version 1.0.0-10/11/2016
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDettaglioModulareCapitoloUscitaGestione extends RicercaDettaglioModulareCapitolo {

	private CapitoloUscitaGestione capitoloUscitaGestione;
	@XmlElementWrapper(name="modelDetails")
	@XmlElement(name="modelDetail")
	private CapitoloUscitaGestioneModelDetail[] modelDetails;

	/**
	 * @return the capitoloUscitaGestione
	 */
	public CapitoloUscitaGestione getCapitoloUscitaGestione() {
		return capitoloUscitaGestione;
	}

	/**
	 * @param capitoloUscitaGestione the capitoloUscitaGestione to set
	 */
	public void setCapitoloUscitaGestione(CapitoloUscitaGestione capitoloUscitaGestione) {
		this.capitoloUscitaGestione = capitoloUscitaGestione;
	}

	/**
	 * @return the model details
	 */
	@XmlTransient
	public CapitoloUscitaGestioneModelDetail[] getModelDetails() {
		return modelDetails;
	}

	/**
	 * @param modelDetails the model details to set
	 */
	public void setModelDetails(CapitoloUscitaGestioneModelDetail... modelDetails) {
		this.modelDetails = modelDetails;
	}
	
	/**
	 * Controla se il model detail è richiesto.
	 *
	 * @param m il model detail da controllare
	 * @return true, if m is richiesto
	 */
	public boolean isRichiestoModelDetail(CapitoloUscitaGestioneModelDetail m){
		
		for(ModelDetail model : getModelDetails()){
			if(model.equals(m)){
				return true;
			}
		}
		return false;
	}
	

}
