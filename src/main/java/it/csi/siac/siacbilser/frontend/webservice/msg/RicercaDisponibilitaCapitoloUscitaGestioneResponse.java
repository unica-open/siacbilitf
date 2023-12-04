/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.DisponibilitaCapitoloUscitaGestione;
import it.csi.siac.siaccorser.model.ServiceResponse;

/**
 * Risposta al metodo BIL.CapitoloUscitaGestioneService.ricercaDisponibilitaCapitoloUscitaGestione()
 * @author Marchino Alessandro
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaDisponibilitaCapitoloUscitaGestioneResponse extends ServiceResponse {
	
	private DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneAnno0;
	private DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneAnno1;
	private DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneAnno2;
	private DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneResiduo;
	/**
	 * @return the disponibilitaCapitoloUscitaGestioneAnno0
	 */
	public DisponibilitaCapitoloUscitaGestione getDisponibilitaCapitoloUscitaGestioneAnno0() {
		return disponibilitaCapitoloUscitaGestioneAnno0;
	}
	/**
	 * @param disponibilitaCapitoloUscitaGestioneAnno0 the disponibilitaCapitoloUscitaGestioneAnno0 to set
	 */
	public void setDisponibilitaCapitoloUscitaGestioneAnno0(DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneAnno0) {
		this.disponibilitaCapitoloUscitaGestioneAnno0 = disponibilitaCapitoloUscitaGestioneAnno0;
	}
	/**
	 * @return the disponibilitaCapitoloUscitaGestioneAnno1
	 */
	public DisponibilitaCapitoloUscitaGestione getDisponibilitaCapitoloUscitaGestioneAnno1() {
		return disponibilitaCapitoloUscitaGestioneAnno1;
	}
	/**
	 * @param disponibilitaCapitoloUscitaGestioneAnno1 the disponibilitaCapitoloUscitaGestioneAnno1 to set
	 */
	public void setDisponibilitaCapitoloUscitaGestioneAnno1(DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneAnno1) {
		this.disponibilitaCapitoloUscitaGestioneAnno1 = disponibilitaCapitoloUscitaGestioneAnno1;
	}
	/**
	 * @return the disponibilitaCapitoloUscitaGestioneAnno2
	 */
	public DisponibilitaCapitoloUscitaGestione getDisponibilitaCapitoloUscitaGestioneAnno2() {
		return disponibilitaCapitoloUscitaGestioneAnno2;
	}
	/**
	 * @param disponibilitaCapitoloUscitaGestioneAnno2 the disponibilitaCapitoloUscitaGestioneAnno2 to set
	 */
	public void setDisponibilitaCapitoloUscitaGestioneAnno2(DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneAnno2) {
		this.disponibilitaCapitoloUscitaGestioneAnno2 = disponibilitaCapitoloUscitaGestioneAnno2;
	}
	/**
	 * @return the disponibilitaCapitoloUscitaGestioneResiduo
	 */
	public DisponibilitaCapitoloUscitaGestione getDisponibilitaCapitoloUscitaGestioneResiduo() {
		return disponibilitaCapitoloUscitaGestioneResiduo;
	}
	/**
	 * @param disponibilitaCapitoloUscitaGestioneResiduo the disponibilitaCapitoloUscitaGestioneResiduo to set
	 */
	public void setDisponibilitaCapitoloUscitaGestioneResiduo(DisponibilitaCapitoloUscitaGestione disponibilitaCapitoloUscitaGestioneResiduo) {
		this.disponibilitaCapitoloUscitaGestioneResiduo = disponibilitaCapitoloUscitaGestioneResiduo;
	}

}
