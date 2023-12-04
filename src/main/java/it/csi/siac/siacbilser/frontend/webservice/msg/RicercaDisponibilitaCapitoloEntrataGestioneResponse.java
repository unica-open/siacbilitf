/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DisponibilitaCapitoloEntrataGestione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloEntrataGestioneService.ricercaDisponibilitaCapitoloEntrataGestione()
 * @author Marchino Alessandro
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDisponibilitaCapitoloEntrataGestioneResponse extends ServiceResponse {
	
	private DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneAnno0;
	private DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneAnno1;
	private DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneAnno2;
	private DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneResiduo;
	/**
	 * @return the disponibilitaCapitoloEntrataGestioneAnno0
	 */
	public DisponibilitaCapitoloEntrataGestione getDisponibilitaCapitoloEntrataGestioneAnno0() {
		return disponibilitaCapitoloEntrataGestioneAnno0;
	}
	/**
	 * @param disponibilitaCapitoloEntrataGestioneAnno0 the disponibilitaCapitoloEntrataGestioneAnno0 to set
	 */
	public void setDisponibilitaCapitoloEntrataGestioneAnno0(DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneAnno0) {
		this.disponibilitaCapitoloEntrataGestioneAnno0 = disponibilitaCapitoloEntrataGestioneAnno0;
	}
	/**
	 * @return the disponibilitaCapitoloEntrataGestioneAnno1
	 */
	public DisponibilitaCapitoloEntrataGestione getDisponibilitaCapitoloEntrataGestioneAnno1() {
		return disponibilitaCapitoloEntrataGestioneAnno1;
	}
	/**
	 * @param disponibilitaCapitoloEntrataGestioneAnno1 the disponibilitaCapitoloEntrataGestioneAnno1 to set
	 */
	public void setDisponibilitaCapitoloEntrataGestioneAnno1(DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneAnno1) {
		this.disponibilitaCapitoloEntrataGestioneAnno1 = disponibilitaCapitoloEntrataGestioneAnno1;
	}
	/**
	 * @return the disponibilitaCapitoloEntrataGestioneAnno2
	 */
	public DisponibilitaCapitoloEntrataGestione getDisponibilitaCapitoloEntrataGestioneAnno2() {
		return disponibilitaCapitoloEntrataGestioneAnno2;
	}
	/**
	 * @param disponibilitaCapitoloEntrataGestioneAnno2 the disponibilitaCapitoloEntrataGestioneAnno2 to set
	 */
	public void setDisponibilitaCapitoloEntrataGestioneAnno2(DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneAnno2) {
		this.disponibilitaCapitoloEntrataGestioneAnno2 = disponibilitaCapitoloEntrataGestioneAnno2;
	}
	/**
	 * @return the disponibilitaCapitoloEntrataGestioneResiduo
	 */
	public DisponibilitaCapitoloEntrataGestione getDisponibilitaCapitoloEntrataGestioneResiduo() {
		return disponibilitaCapitoloEntrataGestioneResiduo;
	}
	/**
	 * @param disponibilitaCapitoloEntrataGestioneResiduo the disponibilitaCapitoloEntrataGestioneResiduo to set
	 */
	public void setDisponibilitaCapitoloEntrataGestioneResiduo(DisponibilitaCapitoloEntrataGestione disponibilitaCapitoloEntrataGestioneResiduo) {
		this.disponibilitaCapitoloEntrataGestioneResiduo = disponibilitaCapitoloEntrataGestioneResiduo;
	}

}
