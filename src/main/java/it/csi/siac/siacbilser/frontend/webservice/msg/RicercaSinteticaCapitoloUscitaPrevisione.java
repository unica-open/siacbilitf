/*
*SPDX-FileCopyrightText: Copyright 2020 | CSI Piemonte
*SPDX-License-Identifier: EUPL-1.2
*/
package it.csi.siac.siacbilser.frontend.webservice.msg;

import javax.xml.bind.annotation.XmlType;

import it.csi.siac.siacbilser.frontend.webservice.BILSvcDictionary;
import it.csi.siac.siacbilser.model.ric.RicercaSinteticaCapitoloUPrev;

/**
 * Richiesta al metodo BIL.CapitoloUscitaPrevisioneService.
 * ricercaSinteticaCapitoloUscitaPrevisione()
 * 
 * @author rmontuori
 * 
 */
@XmlType(namespace = BILSvcDictionary.NAMESPACE)
public class RicercaSinteticaCapitoloUscitaPrevisione extends RicercaSinteticaCapitolo {

	private RicercaSinteticaCapitoloUPrev ricercaSinteticaCapitoloUPrev;
	private Boolean calcolaTotaleImporti;
	
	public RicercaSinteticaCapitoloUPrev getRicercaSinteticaCapitoloUPrev() {
		return ricercaSinteticaCapitoloUPrev;
	}

	public void setRicercaSinteticaCapitoloUPrev(
			RicercaSinteticaCapitoloUPrev ricercaSinteticaCapitoloUPrev) {
		this.ricercaSinteticaCapitoloUPrev = ricercaSinteticaCapitoloUPrev;
	}

	/**
	 * @return the calcolaTotaleImporti
	 */
	public Boolean getCalcolaTotaleImporti() {
		return calcolaTotaleImporti;
	}

	/**
	 * @param calcolaTotaleImporti the calcolaTotaleImporti to set
	 */
	public void setCalcolaTotaleImporti(Boolean calcolaTotaleImporti) {
		this.calcolaTotaleImporti = calcolaTotaleImporti;
	}

	
}
